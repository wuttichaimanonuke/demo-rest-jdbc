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

import com.gable.cpb.entity.esbAddrBookOut;
import com.gable.cpb.entity.esbAddrBookOutRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class esbAddrBookOutDAO implements IesbAddrBookOutDAO {

	private static final Logger log = LoggerFactory.getLogger(esbAddrBookOutDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<esbAddrBookOut> getAllesbAddrBookOuts() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_ADDR_BOOK_OUT";
		RowMapper<esbAddrBookOut> rowMapper = new esbAddrBookOutRowMapper();
		List<esbAddrBookOut> result = new ArrayList<esbAddrBookOut>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbAddrBookOuts access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbAddrBookOuts RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
