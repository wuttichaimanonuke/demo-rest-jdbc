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

import com.gable.cpb.entity.CpbOrgHist;
import com.gable.cpb.entity.CpbOrgHistRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbOrgHistDAO implements ICpbOrgHistDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbOrgHistDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbOrgHist> getAllCpbOrgHists() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_ORG_HIST";
		RowMapper<CpbOrgHist> rowMapper = new CpbOrgHistRowMapper();
		List<CpbOrgHist> result = new ArrayList<CpbOrgHist>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbOrgHists access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbOrgHists RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
