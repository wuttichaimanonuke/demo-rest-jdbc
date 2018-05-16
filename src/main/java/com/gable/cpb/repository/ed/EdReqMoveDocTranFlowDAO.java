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

import com.gable.cpb.entity.ed.EdReqMoveDocTranFlow;
import com.gable.cpb.entity.ed.EdReqMoveDocTranFlowRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class EdReqMoveDocTranFlowDAO implements IEdReqMoveDocTranFlowDAO {

	private static final Logger log = LoggerFactory.getLogger(EdReqMoveDocTranFlowDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<EdReqMoveDocTranFlow> getAlledReqMoveDocTranFlows() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_REQ_MOVE_DOC_TRAN_FLOW";
		RowMapper<EdReqMoveDocTranFlow> rowMapper = new EdReqMoveDocTranFlowRowMapper();
		List<EdReqMoveDocTranFlow> result = new ArrayList<EdReqMoveDocTranFlow>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlledReqMoveDocTranFlows access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlledReqMoveDocTranFlows RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
