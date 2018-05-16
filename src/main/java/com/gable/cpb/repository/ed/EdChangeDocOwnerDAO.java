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

import com.gable.cpb.entity.ed.EdChangeDocOwner;
import com.gable.cpb.entity.ed.EdChangeDocOwnerRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EdChangeDocOwnerDAO implements IEdChangeDocOwnerDAO {

	private static final Logger log = LoggerFactory.getLogger(EdChangeDocOwnerDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EdChangeDocOwner> getAllEdChangeDocOwners() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_CHANGE_DOC_OWNER";
		RowMapper<EdChangeDocOwner> rowMapper = new EdChangeDocOwnerRowMapper();
		List<EdChangeDocOwner> result = new ArrayList<EdChangeDocOwner>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllEdChangeDocOwners access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllEdChangeDocOwners RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
