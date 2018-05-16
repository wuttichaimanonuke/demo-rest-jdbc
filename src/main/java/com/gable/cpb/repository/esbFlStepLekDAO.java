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

import com.gable.cpb.entity.esbFlStepLek;
import com.gable.cpb.entity.esbFlStepLekRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class esbFlStepLekDAO implements IesbFlStepLekDAO {

	private static final Logger log = LoggerFactory.getLogger(esbFlStepLekDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<esbFlStepLek> getAllesbFlStepLeks() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_FL_STEP_LEK";
		RowMapper<esbFlStepLek> rowMapper = new esbFlStepLekRowMapper();
		List<esbFlStepLek> result = new ArrayList<esbFlStepLek>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbFlStepLeks access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbFlStepLeks RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
