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

import com.gable.cpb.entity.ed.EdDocRel;
import com.gable.cpb.entity.ed.EdDocRelRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EdDocRelDAO implements IEdDocRelDAO {

	private static final Logger log = LoggerFactory.getLogger(EdDocRelDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EdDocRel> getAlledDocRels() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_DOC_REL";
		RowMapper<EdDocRel> rowMapper = new EdDocRelRowMapper();
		List<EdDocRel> result = new ArrayList<EdDocRel>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlledDocRels access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlledDocRels RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
