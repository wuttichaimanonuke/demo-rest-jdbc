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

import com.gable.cpb.entity.edWaitingDoc;
import com.gable.cpb.entity.edWaitingDocRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class edWaitingDocDAO implements IedWaitingDocDAO {

	private static final Logger log = LoggerFactory.getLogger(edWaitingDocDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<edWaitingDoc> getAlledWaitingDocs() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_WAITING_DOC";
		RowMapper<edWaitingDoc> rowMapper = new edWaitingDocRowMapper();
		List<edWaitingDoc> result = new ArrayList<edWaitingDoc>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlledWaitingDocs access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlledWaitingDocs RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
