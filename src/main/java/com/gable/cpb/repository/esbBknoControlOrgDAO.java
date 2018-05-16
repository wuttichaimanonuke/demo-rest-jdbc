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

import com.gable.cpb.entity.esbBknoControlOrg;
import com.gable.cpb.entity.esbBknoControlOrgRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class esbBknoControlOrgDAO implements IesbBknoControlOrgDAO {

	private static final Logger log = LoggerFactory.getLogger(esbBknoControlOrgDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<esbBknoControlOrg> getAllesbBknoControlOrgs() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_BKNO_CONTROL_ORG";
		RowMapper<esbBknoControlOrg> rowMapper = new esbBknoControlOrgRowMapper();
		List<esbBknoControlOrg> result = new ArrayList<esbBknoControlOrg>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbBknoControlOrgs access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbBknoControlOrgs RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
