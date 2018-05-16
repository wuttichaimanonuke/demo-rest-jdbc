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

import com.gable.cpb.entity.procEsbBkFlowOrg;
import com.gable.cpb.entity.procEsbBkFlowOrgRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class procEsbBkFlowOrgDAO implements IprocEsbBkFlowOrgDAO {

	private static final Logger log = LoggerFactory.getLogger(procEsbBkFlowOrgDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<procEsbBkFlowOrg> getAllprocEsbBkFlowOrgs() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"PROC_ESB_BK_FLOW_ORG";
		RowMapper<procEsbBkFlowOrg> rowMapper = new procEsbBkFlowOrgRowMapper();
		List<procEsbBkFlowOrg> result = new ArrayList<procEsbBkFlowOrg>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllprocEsbBkFlowOrgs access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllprocEsbBkFlowOrgs RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
