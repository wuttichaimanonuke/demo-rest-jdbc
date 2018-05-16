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

import com.gable.cpb.entity.cpb.CpbConfDctm;
import com.gable.cpb.entity.cpb.CpbConfDctmRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbConfDctmDAO implements ICpbConfDctmDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbConfDctmDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbConfDctm> getAllCpbConfDctms() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_CONF_DCTM";
		RowMapper<CpbConfDctm> rowMapper = new CpbConfDctmRowMapper();
		List<CpbConfDctm> result = new ArrayList<CpbConfDctm>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbConfDctms access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbConfDctms RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
