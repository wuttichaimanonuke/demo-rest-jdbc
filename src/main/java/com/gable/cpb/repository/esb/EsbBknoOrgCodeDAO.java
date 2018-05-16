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

import com.gable.cpb.entity.esb.EsbBknoOrgCode;
import com.gable.cpb.entity.esb.EsbBknoOrgCodeRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EsbBknoOrgCodeDAO implements IEsbBknoOrgCodeDAO {

	private static final Logger log = LoggerFactory.getLogger(EsbBknoOrgCodeDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EsbBknoOrgCode> getAllesbBknoOrgCodes() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_BKNO_ORG_CODE";
		RowMapper<EsbBknoOrgCode> rowMapper = new EsbBknoOrgCodeRowMapper();
		List<EsbBknoOrgCode> result = new ArrayList<EsbBknoOrgCode>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbBknoOrgCodes access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbBknoOrgCodes RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
