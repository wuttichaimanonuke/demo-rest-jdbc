package com.gable.cpb.repository.ed;

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

import com.gable.cpb.entity.ed.EdSavedSearch;
import com.gable.cpb.entity.ed.EdSavedSearchRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EdSavedSearchDAO implements IEdSavedSearchDAO {

	private static final Logger log = LoggerFactory.getLogger(EdSavedSearchDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EdSavedSearch> getAlledSavedSearchs() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_SAVED_SEARCH";
		RowMapper<EdSavedSearch> rowMapper = new EdSavedSearchRowMapper();
		List<EdSavedSearch> result = new ArrayList<EdSavedSearch>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlledSavedSearchs access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlledSavedSearchs RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
