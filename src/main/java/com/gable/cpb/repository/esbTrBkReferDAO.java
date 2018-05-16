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

import com.gable.cpb.entity.esbTrBkRefer;
import com.gable.cpb.entity.esbTrBkReferRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class esbTrBkReferDAO implements IesbTrBkReferDAO {

	private static final Logger log = LoggerFactory.getLogger(esbTrBkReferDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<esbTrBkRefer> getAllesbTrBkRefers() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_TR_BK_REFER";
		RowMapper<esbTrBkRefer> rowMapper = new esbTrBkReferRowMapper();
		List<esbTrBkRefer> result = new ArrayList<esbTrBkRefer>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbTrBkRefers access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbTrBkRefers RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
