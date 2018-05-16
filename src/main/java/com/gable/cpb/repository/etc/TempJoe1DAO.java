package com.gable.cpb.repository.etc;

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

import com.gable.cpb.entity.etc.TempJoe1;
import com.gable.cpb.entity.etc.TempJoe1RowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class TempJoe1DAO implements ITempJoe1DAO {

	private static final Logger log = LoggerFactory.getLogger(TempJoe1DAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<TempJoe1> getAlltempJoe1s() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"TEMP_JOE1";
		RowMapper<TempJoe1> rowMapper = new TempJoe1RowMapper();
		List<TempJoe1> result = new ArrayList<TempJoe1>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlltempJoe1s access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlltempJoe1s RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
