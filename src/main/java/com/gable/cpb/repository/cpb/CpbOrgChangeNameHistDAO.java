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

import com.gable.cpb.entity.cpb.CpbOrgChangeNameHist;
import com.gable.cpb.entity.cpb.CpbOrgChangeNameHistRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbOrgChangeNameHistDAO implements ICpbOrgChangeNameHistDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbOrgChangeNameHistDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbOrgChangeNameHist> getAllCpbOrgChangeNameHists() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_ORG_CHANGE_NAME_HIST";
		RowMapper<CpbOrgChangeNameHist> rowMapper = new CpbOrgChangeNameHistRowMapper();
		List<CpbOrgChangeNameHist> result = new ArrayList<CpbOrgChangeNameHist>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbOrgChangeNameHists access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbOrgChangeNameHists RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
