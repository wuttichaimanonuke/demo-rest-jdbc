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

import com.gable.cpb.entity.CpbDocTypeMain;
import com.gable.cpb.entity.CpbDocTypeMainRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbDocTypeMainDAO implements ICpbDocTypeMainDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbDocTypeMainDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbDocTypeMain> getAllCpbDocTypeMains() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_DOC_TYPE_MAIN";
		RowMapper<CpbDocTypeMain> rowMapper = new CpbDocTypeMainRowMapper();
		List<CpbDocTypeMain> result = new ArrayList<CpbDocTypeMain>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbDocTypeMains access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbDocTypeMains RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
