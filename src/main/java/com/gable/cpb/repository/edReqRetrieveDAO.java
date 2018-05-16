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

import com.gable.cpb.entity.edReqRetrieve;
import com.gable.cpb.entity.edReqRetrieveRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class edReqRetrieveDAO implements IedReqRetrieveDAO {

	private static final Logger log = LoggerFactory.getLogger(edReqRetrieveDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<edReqRetrieve> getAlledReqRetrieves() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_REQ_RETRIEVE";
		RowMapper<edReqRetrieve> rowMapper = new edReqRetrieveRowMapper();
		List<edReqRetrieve> result = new ArrayList<edReqRetrieve>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlledReqRetrieves access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlledReqRetrieves RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
