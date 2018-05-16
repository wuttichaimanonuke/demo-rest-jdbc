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

import com.gable.cpb.entity.CpbLkCtltContractCode;
import com.gable.cpb.entity.CpbLkCtltContractCodeRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbLkCtltContractCodeDAO implements ICpbLkCtltContractCodeDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbLkCtltContractCodeDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbLkCtltContractCode> getAllCpbLkCtltContractCodes() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_LK_CTRT_CONTRACT_CODE";
		RowMapper<CpbLkCtltContractCode> rowMapper = new CpbLkCtltContractCodeRowMapper();
		List<CpbLkCtltContractCode> result = new ArrayList<CpbLkCtltContractCode>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbLkCtltContractCodes access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbLkCtltContractCodes RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
