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

import com.gable.cpb.entity.esb.EsbTrClose;
import com.gable.cpb.entity.esb.EsbTrCloseRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EsbTrCloseDAO implements IEsbTrCloseDAO {

	private static final Logger log = LoggerFactory.getLogger(EsbTrCloseDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EsbTrClose> getAllesbTrCloses() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ESB_TR_CLOSE";
		RowMapper<EsbTrClose> rowMapper = new EsbTrCloseRowMapper();
		List<EsbTrClose> result = new ArrayList<EsbTrClose>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAllesbTrCloses access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAllesbTrCloses RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
