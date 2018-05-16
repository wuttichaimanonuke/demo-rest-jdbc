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

import com.gable.cpb.entity.edReqDestroy;
import com.gable.cpb.entity.edReqDestroyRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class edReqDestroyDAO implements IedReqDestroyDAO {

	private static final Logger log = LoggerFactory.getLogger(edReqDestroyDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<edReqDestroy> getAlledReqDestroys() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_REQ_DESTROY";
		RowMapper<edReqDestroy> rowMapper = new edReqDestroyRowMapper();
		List<edReqDestroy> result = new ArrayList<edReqDestroy>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlledReqDestroys access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlledReqDestroys RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
