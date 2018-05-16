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

import com.gable.cpb.entity.CpbService;
import com.gable.cpb.entity.CpbServiceRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbServiceDAO implements ICpbServiceDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbServiceDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbService> getAllCpbServices() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_SERVICE";
		RowMapper<CpbService> rowMapper = new CpbServiceRowMapper();
		List<CpbService> result = new ArrayList<CpbService>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbServices access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbServices RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
