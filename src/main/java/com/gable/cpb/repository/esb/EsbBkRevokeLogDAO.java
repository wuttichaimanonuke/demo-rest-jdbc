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

import com.gable.cpb.entity.esb.EsbBkRevokeLog;
import com.gable.cpb.entity.esb.EsbBkRevokeLogRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EsbBkRevokeLogDAO implements IEsbBkRevokeLogDAO {

	private static final Logger log = LoggerFactory.getLogger(EsbBkRevokeLogDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EsbBkRevokeLog> getAllesbBkRevokeLogs() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_BK_REVOKE_LOG";
		RowMapper<EsbBkRevokeLog> rowMapper = new EsbBkRevokeLogRowMapper();
		List<EsbBkRevokeLog> result = new ArrayList<EsbBkRevokeLog>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbBkRevokeLogs access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbBkRevokeLogs RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
