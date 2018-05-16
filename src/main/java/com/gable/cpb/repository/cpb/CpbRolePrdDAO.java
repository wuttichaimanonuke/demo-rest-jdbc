package com.gable.cpb.repository.cpb;

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

import com.gable.cpb.entity.cpb.CpbRolePrd;
import com.gable.cpb.entity.cpb.CpbRolePrdRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbRolePrdDAO implements ICpbRolePrdDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbRolePrdDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbRolePrd> getAllCpbRolePrds() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_ROLE_PRD";
		RowMapper<CpbRolePrd> rowMapper = new CpbRolePrdRowMapper();
		List<CpbRolePrd> result = new ArrayList<CpbRolePrd>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbRolePrds access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbRolePrds RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
