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

import com.gable.cpb.entity.CpbIndexWaiting;
import com.gable.cpb.entity.CpbIndexWaitingRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class CpbIndexWaitingDAO implements ICpbIndexWaitingDAO {

	private static final Logger log = LoggerFactory.getLogger(CpbIndexWaitingDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<CpbIndexWaiting> getAllCpbIndexWaitings() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"CPB_INDEX_WAITING";
		RowMapper<CpbIndexWaiting> rowMapper = new CpbIndexWaitingRowMapper();
		List<CpbIndexWaiting> result = new ArrayList<CpbIndexWaiting>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllCpbIndexWaitings access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllCpbIndexWaitings RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
