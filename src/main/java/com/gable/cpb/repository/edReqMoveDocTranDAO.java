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

import com.gable.cpb.entity.edReqMoveDocTran;
import com.gable.cpb.entity.edReqMoveDocTranRowMapper;

@Transactional
@Repository
@Component
@PropertySource("classpath:application.properties")
public class edReqMoveDocTranDAO implements IedReqMoveDocTranDAO {

	private static final Logger log = LoggerFactory.getLogger(edReqMoveDocTranDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cpb.cmes.schema}")
	private String cmesSchema;

	@Override
	public List<edReqMoveDocTran> getAlledReqMoveDocTrans() throws Exception {
		String sql = "SELECT * FROM "+cmesSchema+"ED_REQ_MOVE_DOC_TRAN";
		RowMapper<edReqMoveDocTran> rowMapper = new edReqMoveDocTranRowMapper();
		List<edReqMoveDocTran> result = new ArrayList<edReqMoveDocTran>();
		try {
			result = jdbcTemplate.query(sql, rowMapper);
			log.info("(SUCCESS) Method getAlledReqMoveDocTrans access database success.");
		} catch (Exception e) {
			log.error("(ERROR) Method getAlledReqMoveDocTrans RowMapper or JDBCTemplate error. : "+e);
			throw new Exception();
		}
		return result;
	}

}
