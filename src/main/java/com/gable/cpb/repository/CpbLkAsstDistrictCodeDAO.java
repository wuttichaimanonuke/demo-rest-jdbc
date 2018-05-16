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

import com.gable.cpb.entity.CpbLkAsstDistrictCode;
import com.gable.cpb.entity.CpbLkAsstDistrictCodeRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbLkAsstDistrictCodeDAO implements ICpbLkAsstDistrictCodeDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbLkAsstDistrictCodeDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbLkAsstDistrictCode> getAllCpbLkAsstDistrictCodes() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_LK_ASST_DISTRICT_CODE";
		RowMapper<CpbLkAsstDistrictCode> rowMapper = new CpbLkAsstDistrictCodeRowMapper();
		List<CpbLkAsstDistrictCode> result = new ArrayList<CpbLkAsstDistrictCode>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbLkAsstDistrictCodes access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbLkAsstDistrictCodes RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
