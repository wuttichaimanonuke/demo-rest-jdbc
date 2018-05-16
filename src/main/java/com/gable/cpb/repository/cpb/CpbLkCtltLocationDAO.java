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

import com.gable.cpb.entity.cpb.CpbLkCtltLocation;
import com.gable.cpb.entity.cpb.CpbLkCtltLocationRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbLkCtltLocationDAO implements ICpbLkCtltLocationDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbLkCtltLocationDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbLkCtltLocation> getAllCpbLkCtltLocations() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_LK_CTLT_LOCATION";
		RowMapper<CpbLkCtltLocation> rowMapper = new CpbLkCtltLocationRowMapper();
		List<CpbLkCtltLocation> result = new ArrayList<CpbLkCtltLocation>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbLkCtltLocations access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbLkCtltLocations RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
