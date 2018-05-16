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

import com.gable.cpb.entity.cpb.CpbOrgPrd20150625;
import com.gable.cpb.entity.cpb.CpbOrgPrd20150625RowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbOrgPrd20150625DAO implements ICpbOrgPrd20150625DAO {

	private static final Logger log = LoggerFactory.getLogger(CpbOrgPrd20150625DAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbOrgPrd20150625> getAllCpbOrgPrd20150625s() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_ORG_PRD_20150625";
		RowMapper<CpbOrgPrd20150625> rowMapper = new CpbOrgPrd20150625RowMapper();
		List<CpbOrgPrd20150625> result = new ArrayList<CpbOrgPrd20150625>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbOrgPrd20150625s access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbOrgPrd20150625s RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
