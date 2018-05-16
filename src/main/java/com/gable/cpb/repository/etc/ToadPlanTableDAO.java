package com.gable.cpb.repository.etc;

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

import com.gable.cpb.entity.etc.ToadPlanTable;
import com.gable.cpb.entity.etc.ToadPlanTableRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class ToadPlanTableDAO implements IToadPlanTableDAO {

	private static final Logger log = LoggerFactory.getLogger(ToadPlanTableDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<ToadPlanTable> getAlltoadPlanTables() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"TOAD_PLAN_TABLE";
		RowMapper<ToadPlanTable> rowMapper = new ToadPlanTableRowMapper();
		List<ToadPlanTable> result = new ArrayList<ToadPlanTable>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlltoadPlanTables access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlltoadPlanTables RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
