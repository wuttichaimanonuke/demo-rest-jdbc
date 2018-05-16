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

import com.gable.cpb.entity.etc.FcSyncTable;
import com.gable.cpb.entity.etc.FcSyncTableRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class FcSyncTableDAO implements IFcSyncTableDAO {

	private static final Logger log = LoggerFactory.getLogger(FcSyncTableDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<FcSyncTable> getAllfcSyncTables() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"FC_SYNC_TABLE";
		RowMapper<FcSyncTable> rowMapper = new FcSyncTableRowMapper();
		List<FcSyncTable> result = new ArrayList<FcSyncTable>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllfcSyncTables access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllfcSyncTables RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
