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

import com.gable.cpb.entity.CpbDocOperation;
import com.gable.cpb.entity.CpbDocOperationRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbDocOperationDAO implements ICpbDocOperationDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbDocOperationDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbDocOperation> getAllCpbDocOperations() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_DOC_OPERATION";
		RowMapper<CpbDocOperation> rowMapper = new CpbDocOperationRowMapper();
		List<CpbDocOperation> result = new ArrayList<CpbDocOperation>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbDocOperations access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbDocOperations RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
