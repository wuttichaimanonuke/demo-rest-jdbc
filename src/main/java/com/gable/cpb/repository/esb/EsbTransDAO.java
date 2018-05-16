package com.gable.cpb.repository.esb;

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

import com.gable.cpb.entity.esb.EsbTrans;
import com.gable.cpb.entity.esb.EsbTransRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EsbTransDAO implements IEsbTransDAO {

	private static final Logger log = LoggerFactory.getLogger(EsbTransDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EsbTrans> getAllesbTranss() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_TRANS";
		RowMapper<EsbTrans> rowMapper = new EsbTransRowMapper();
		List<EsbTrans> result = new ArrayList<EsbTrans>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbTranss access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbTranss RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
