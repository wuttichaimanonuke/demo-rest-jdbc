package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdReqMoveDocTranItemRowMapper implements RowMapper<EdReqMoveDocTranItem> {

	@Override
	public EdReqMoveDocTranItem mapRow(ResultSet row, int rowNum) throws SQLException {
		EdReqMoveDocTranItem entity = new EdReqMoveDocTranItem();
		entity.setRmdTranItemId(row.getInt("RMD_TRAN_ITEM_ID"));
		entity.setRmdTranId(row.getInt("RMD_TRAN_ID"));
		entity.setAWhId(row.getInt("A_WH_ID"));
		entity.setACabId(row.getInt("A_CAB_ID"));
		entity.setAShId(row.getInt("A_SH_ID"));
		entity.setAEnvId(row.getInt("A_ENV_ID"));
		entity.setBWhId(row.getInt("B_WH_ID"));
		entity.setBCabId(row.getInt("B_CAB_ID"));
		entity.setBShId(row.getInt("B_SH_ID"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setDocCheckedOutCount(row.getInt("DOC_CHECKED_OUT_COUNT"));
		entity.setDocMoveCount(row.getInt("DOC_MOVED_COUNT"));
		return entity;
	}

}
