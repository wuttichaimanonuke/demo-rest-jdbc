package com.gable.cpb.repository.ed;

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

import com.gable.cpb.entity.ed.EdEmailReq;
import com.gable.cpb.entity.ed.EdEmailReqRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EdEmailReqDAO implements IEdEmailReqDAO {

	private static final Logger log = LoggerFactory.getLogger(EdEmailReqDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EdEmailReq> getAlledEmailReqs() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_EMAIL_REQ";
		RowMapper<EdEmailReq> rowMapper = new EdEmailReqRowMapper();
		List<EdEmailReq> result = new ArrayList<EdEmailReq>();
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
