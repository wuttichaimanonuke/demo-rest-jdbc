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

import com.gable.cpb.entity.ed.EdReqModify;
import com.gable.cpb.entity.ed.EdReqModifyRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EdReqModifyDAO implements IEdReqModifyDAO {

	private static final Logger log = LoggerFactory.getLogger(EdReqModifyDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EdReqModify> getAlledReqModifys() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_REQ_MODIFY";
		RowMapper<EdReqModify> rowMapper = new EdReqModifyRowMapper();
		List<EdReqModify> result = new ArrayList<EdReqModify>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlledReqModifys access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlledReqModifys RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}