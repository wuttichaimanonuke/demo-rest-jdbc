package com.gable.cpb.repository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gable.cpb.entity.edReqBorrowExt;
import com.gable.cpb.entity.edReqBorrowExtRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class edReqBorrowExtDAO implements IedReqBorrowExtDAO {

	private static final Logger log = LoggerFactory.getLogger(edReqBorrowExtDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<edReqBorrowExt> getAlledReqBorrowExts() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_REQ_BORROW_EXT";
		RowMapper<edReqBorrowExt> rowMapper = new edReqBorrowExtRowMapper();
		List<edReqBorrowExt> result = new ArrayList<edReqBorrowExt>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlledReqBorrowExts access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlledReqBorrowExts RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
