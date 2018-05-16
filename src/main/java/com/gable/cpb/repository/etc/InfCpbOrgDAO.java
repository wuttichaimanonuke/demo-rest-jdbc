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

import com.gable.cpb.entity.etc.InfCpbOrg;
import com.gable.cpb.entity.etc.InfCpbOrgRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class InfCpbOrgDAO implements IInfCpbOrgDAO {

	private static final Logger log = LoggerFactory.getLogger(InfCpbOrgDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<InfCpbOrg> getAllinfCpbOrgs() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"INF_CPB_ORG";
		RowMapper<InfCpbOrg> rowMapper = new InfCpbOrgRowMapper();
		List<InfCpbOrg> result = new ArrayList<InfCpbOrg>();
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
