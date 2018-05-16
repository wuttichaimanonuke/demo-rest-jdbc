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

import com.gable.cpb.entity.esbBkCycle;
import com.gable.cpb.entity.esbBkCycleRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class esbBkCycleDAO implements IesbBkCycleDAO {

	private static final Logger log = LoggerFactory.getLogger(esbBkCycleDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<esbBkCycle> getAllesbBkCycles() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_BK_CYCLE";
		RowMapper<esbBkCycle> rowMapper = new esbBkCycleRowMapper();
		List<esbBkCycle> result = new ArrayList<esbBkCycle>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbBkCycles access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbBkCycles RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
