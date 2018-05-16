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

import com.gable.cpb.entity.edChangeDocOwnerItem;
import com.gable.cpb.entity.edChangeDocOwnerItemRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class edChangeDocOwnerItemDAO implements IedChangeDocOwnerItemDAO {

	private static final Logger log = LoggerFactory.getLogger(edChangeDocOwnerItemDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<edChangeDocOwnerItem> getAlledChangeDocOwnerItems() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_CHANGE_DOC_OWNER_ITEM";
		RowMapper<edChangeDocOwnerItem> rowMapper = new edChangeDocOwnerItemRowMapper();
		List<edChangeDocOwnerItem> result = new ArrayList<edChangeDocOwnerItem>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlledChangeDocOwnerItems access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlledChangeDocOwnerItems RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
