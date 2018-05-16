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

import com.gable.cpb.entity.infCpbOrg;
import com.gable.cpb.entity.infCpbOrgRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class infCpbOrgDAO implements IinfCpbOrgDAO {

	private static final Logger log = LoggerFactory.getLogger(infCpbOrgDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<infCpbOrg> getAllinfCpbOrgs() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"INF_CPB_ORG";
		RowMapper<infCpbOrg> rowMapper = new infCpbOrgRowMapper();
		List<infCpbOrg> result = new ArrayList<infCpbOrg>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllinfCpbOrgs access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllinfCpbOrgs RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}