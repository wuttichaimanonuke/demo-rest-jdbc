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

import com.gable.cpb.entity.edEmailReq;
import com.gable.cpb.entity.edEmailReqRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class edEmailReqDAO implements IedEmailReqDAO {

	private static final Logger log = LoggerFactory.getLogger(edEmailReqDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<edEmailReq> getAlledEmailReqs() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_EMAIL_REQ";
		RowMapper<edEmailReq> rowMapper = new edEmailReqRowMapper();
		List<edEmailReq> result = new ArrayList<edEmailReq>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlledEmailReqs access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlledEmailReqs RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
