package com.gable.cpb.repository.esb;

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

import com.gable.cpb.entity.esb.EsbBkCycle;
import com.gable.cpb.entity.esb.EsbBkCycleRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EsbBkCycleDAO implements IEsbBkCycleDAO {

	private static final Logger log = LoggerFactory.getLogger(EsbBkCycleDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EsbBkCycle> getAllesbBkCycles() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_BK_CYCLE";
		RowMapper<EsbBkCycle> rowMapper = new EsbBkCycleRowMapper();
		List<EsbBkCycle> result = new ArrayList<EsbBkCycle>();
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
