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

import com.gable.cpb.entity.esbBkAttach;
import com.gable.cpb.entity.esbBkAttachRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class esbBkAttachDAO implements IesbBkAttachDAO {

	private static final Logger log = LoggerFactory.getLogger(esbBkAttachDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<esbBkAttach> getAllesbBkAttachs() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_BK_ATTACH";
		RowMapper<esbBkAttach> rowMapper = new esbBkAttachRowMapper();
		List<esbBkAttach> result = new ArrayList<esbBkAttach>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbBkAttachs access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbBkAttachs RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
