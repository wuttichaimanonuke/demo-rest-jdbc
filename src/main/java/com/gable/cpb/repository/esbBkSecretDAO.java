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

import com.gable.cpb.entity.esbBkSecret;
import com.gable.cpb.entity.esbBkSecretRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class esbBkSecretDAO implements IesbBkSecretDAO {

	private static final Logger log = LoggerFactory.getLogger(esbBkSecretDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<esbBkSecret> getAllesbBkSecrets() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_BK_SECRET";
		RowMapper<esbBkSecret> rowMapper = new esbBkSecretRowMapper();
		List<esbBkSecret> result = new ArrayList<esbBkSecret>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbBkSecrets access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbBkSecrets RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
