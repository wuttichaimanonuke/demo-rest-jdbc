package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdReqBorrowExtRowMapper implements RowMapper<EdReqBorrowExt> {

	@Override
	public EdReqBorrowExt mapRow(ResultSet row, int rowNum) throws SQLException {
		EdReqBorrowExt entity = new EdReqBorrowExt();
		entity.setRbExtReqNo(row.getString("RB_EXT_REQ_NO"));
		entity.setRbExtDocId(row.getString("RB_EXT_DOC_ID"));
		entity.setRbExtReqNoRef(row.getString("RB_EXT_REQ_NO_REF"));
		entity.setRbExtAppStatus(row.getInt("RB_EXT_APP_STATUS"));
		entity.setRbExtAppStatusDatetime(row.getDate("RB_EXT_APP_STATUS_DATETIME"));
		entity.setRbExtDateOld(row.getDate("RB_EXT_DATE_OLD"));
		entity.setRbExtDateNew(row.getDate("RB_EXT_DATE_NEW"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		return entity;
	}

}
