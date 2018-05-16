package com.gable.cpb.repository.esb;

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

import com.gable.cpb.entity.esb.EsbStampOrg;
import com.gable.cpb.entity.esb.EsbStampOrgRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EsbStampOrgDAO implements IEsbStampOrgDAO {

	private static final Logger log = LoggerFactory.getLogger(EsbStampOrgDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EsbStampOrg> getAllesbStampOrgs() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_STAMP_ORG";
		RowMapper<EsbStampOrg> rowMapper = new EsbStampOrgRowMapper();
		List<EsbStampOrg> result = new ArrayList<EsbStampOrg>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbStampOrgs access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbStampOrgs RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
