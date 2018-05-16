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

import com.gable.cpb.entity.CpbRoleType;
import com.gable.cpb.entity.CpbRoleTypeRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbRoleTypeDAO implements ICpbRoleTypeDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbRoleTypeDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbRoleType> getAllCpbRoleTypes() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_ROLE_TYPE";
		RowMapper<CpbRoleType> rowMapper = new CpbRoleTypeRowMapper();
		List<CpbRoleType> result = new ArrayList<CpbRoleType>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbRoleTypes access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbRoleTypes RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
