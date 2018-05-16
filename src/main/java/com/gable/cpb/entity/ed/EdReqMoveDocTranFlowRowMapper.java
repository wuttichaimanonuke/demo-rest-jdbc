package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdReqMoveDocTranFlowRowMapper implements RowMapper<EdReqMoveDocTranFlow> {

	@Override
	public EdReqMoveDocTranFlow mapRow(ResultSet row, int rowNum) throws SQLException {
		EdReqMoveDocTranFlow entity = new EdReqMoveDocTranFlow();
		entity.setRmdTranFlowId(row.getInt("RMD_TRAN_FLOW_ID"));
		entity.setRmdTranId(row.getInt("RMD_TRAN_ID"));
		entity.setRmdTranStatus(row.getString("RMD_TRAN_STATUS"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		return entity;
	}

}
