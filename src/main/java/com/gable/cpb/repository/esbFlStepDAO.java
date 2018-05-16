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

import com.gable.cpb.entity.esbFlStep;
import com.gable.cpb.entity.esbFlStepRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class esbFlStepDAO implements IesbFlStepDAO {

	private static final Logger log = LoggerFactory.getLogger(esbFlStepDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<esbFlStep> getAllesbFlSteps() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_FL_STEP";
		RowMapper<esbFlStep> rowMapper = new esbFlStepRowMapper();
		List<esbFlStep> result = new ArrayList<esbFlStep>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbFlSteps access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbFlSteps RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
