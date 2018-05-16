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

import com.gable.cpb.entity.cpb.CpbEmailAdmin;
import com.gable.cpb.entity.cpb.CpbEmailAdminRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbEmailAdminDAO implements ICpbEmailAdminDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbEmailAdminDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbEmailAdmin> getAllCpbEmailAdmins() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_EMAIL_ADMIN";
		RowMapper<CpbEmailAdmin> rowMapper = new CpbEmailAdminRowMapper();
		List<CpbEmailAdmin> result = new ArrayList<CpbEmailAdmin>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbEmailAdmins access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbEmailAdmins RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
