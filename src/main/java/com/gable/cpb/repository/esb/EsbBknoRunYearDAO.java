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

import com.gable.cpb.entity.esb.EsbBknoRunYear;
import com.gable.cpb.entity.esb.EsbBknoRunYearRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EsbBknoRunYearDAO implements IEsbBknoRunYearDAO {

	private static final Logger log = LoggerFactory.getLogger(EsbBknoRunYearDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EsbBknoRunYear> getAllesbBknoRunYears() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_BKNO_RUN_YEAR";
		RowMapper<EsbBknoRunYear> rowMapper = new EsbBknoRunYearRowMapper();
		List<EsbBknoRunYear> result = new ArrayList<EsbBknoRunYear>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbBknoRunYears access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbBknoRunYears RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
