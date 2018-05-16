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

import com.gable.cpb.entity.esbTrBknoReq;
import com.gable.cpb.entity.esbTrBknoReqRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class esbTrBknoReqDAO implements IesbTrBknoReqDAO {

	private static final Logger log = LoggerFactory.getLogger(esbTrBknoReqDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<esbTrBknoReq> getAllesbTrBknoReqs() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_TR_BKNO_REQ";
		RowMapper<esbTrBknoReq> rowMapper = new esbTrBknoReqRowMapper();
		List<esbTrBknoReq> result = new ArrayList<esbTrBknoReq>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbTrBknoReqs access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbTrBknoReqs RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
