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

import com.gable.cpb.entity.CpbRoleDev20150629;
import com.gable.cpb.entity.CpbRoleDev20150629RowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbRoleDev20150629DAO implements ICpbRoleDev20150629DAO {

	private static final Logger log = LoggerFactory.getLogger(CpbRoleDev20150629DAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbRoleDev20150629> getAllCpbRoleDev20150629s() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_ROLE_DEV_20150629";
		RowMapper<CpbRoleDev20150629> rowMapper = new CpbRoleDev20150629RowMapper();
		List<CpbRoleDev20150629> result = new ArrayList<CpbRoleDev20150629>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbRoleDev20150629s access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbRoleDev20150629s RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
