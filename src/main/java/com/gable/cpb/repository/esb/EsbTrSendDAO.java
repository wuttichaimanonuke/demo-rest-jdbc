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

import com.gable.cpb.entity.esb.EsbTrSend;
import com.gable.cpb.entity.esb.EsbTrSendRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EsbTrSendDAO implements IEsbTrSendDAO {

	private static final Logger log = LoggerFactory.getLogger(EsbTrSendDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EsbTrSend> getAllesbTrSends() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_TR_SEND";
		RowMapper<EsbTrSend> rowMapper = new EsbTrSendRowMapper();
		List<EsbTrSend> result = new ArrayList<EsbTrSend>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbTrSends access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbTrSends RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
