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

import com.gable.cpb.entity.CpbDocTypeTwo;
import com.gable.cpb.entity.CpbDocTypeTwoRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbDocTypeTwoDAO implements ICpbDocTypeTwoDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbDocTypeTwoDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbDocTypeTwo> getAllCpbDocTypeTwos() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_DOC_TYPE_TWO";
		RowMapper<CpbDocTypeTwo> rowMapper = new CpbDocTypeTwoRowMapper();
		List<CpbDocTypeTwo> result = new ArrayList<CpbDocTypeTwo>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbDocTypeTwos access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbDocTypeTwos RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
