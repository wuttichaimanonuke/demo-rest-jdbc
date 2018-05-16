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

import com.gable.cpb.entity.esbBkGroup;
import com.gable.cpb.entity.esbBkGroupRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class esbBkGroupDAO implements IesbBkGroupDAO {

	private static final Logger log = LoggerFactory.getLogger(esbBkGroupDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<esbBkGroup> getAllesbBkGroups() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_BK_GROUP";
		RowMapper<esbBkGroup> rowMapper = new esbBkGroupRowMapper();
		List<esbBkGroup> result = new ArrayList<esbBkGroup>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbBkGroups access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbBkGroups RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
