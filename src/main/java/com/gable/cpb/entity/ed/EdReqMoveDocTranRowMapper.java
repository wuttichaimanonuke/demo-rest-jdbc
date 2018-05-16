package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdReqMoveDocTranRowMapper implements RowMapper<EdReqMoveDocTran> {

	@Override
	public EdReqMoveDocTran mapRow(ResultSet row, int rowNum) throws SQLException {
		EdReqMoveDocTran entity = new EdReqMoveDocTran();
		entity.setRmdTranId(row.getInt("RMD_TRAN_ID"));
		entity.setRmdFromOrg(row.getInt("RMD_FROM_ORG"));
		entity.setRmdToOrg(row.getInt("RMD_TO_ORG"));
		entity.setRmdObjective(row.getInt("RMD_OBJECTIVE"));
		entity.setRmdDetail(row.getString("RMD_DETAIL"));
		entity.setRmdCurrentStatus(row.getString("RMD_CURRENT_STATUS"));
		entity.setRmdStatusNote(row.getString("RMD_STATUS_NOTE"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setRmdFillDestLoc(row.getString("RMD_FILL_DEST_LOC"));
		entity.setRmdMoveSuccessDate(row.getDate("RMD_MOVE_SUCCESS_DATE"));
		return entity;
	}

}
