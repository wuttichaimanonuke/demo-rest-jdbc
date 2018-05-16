package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class eqReqBorrowRowMapper implements RowMapper<eqReqBorrow> {

	@Override
	public eqReqBorrow mapRow(ResultSet row, int rowNum) throws SQLException {
		eqReqBorrow entity = new eqReqBorrow();
		entity.setRbReqNo(row.getString("RB_REQ_NO"));
		entity.setRbDocId(row.getString("RB_DOC_ID"));
		entity.setRbAppStatus(row.getInt("RB_APP_STATUS"));
		entity.setRbAppStatusDatetime(row.getDate("RB_APP_STATUS_DATETIME"));
		entity.setRbFoundStatus(row.getInt("RB_FOUND_STATUS"));
		entity.setRbLendUserId(row.getString("RB_LEND_USER_ID"));
		entity.setRbPickUpUserLongname(row.getString("RB_PICK_UP_USER_LONGNAME"));
		entity.setRbPickUpUser(row.getString("RB_PICK_UP_USER"));
		entity.setRbPickUpDatetime(row.getDate("RB_PICK_UP_DATETIME"));
		entity.setRbBorStatus(row.getInt("RB_BOR_STATUS"));
		entity.setRbRetUser(row.getString("RB_RET_USER"));
		entity.setRbRetUserLongname(row.getString("RB_RET_USER_LONGNAME"));
		entity.setRbRetDatetime(row.getDate("RB_RET_DATETIME"));
		entity.setRbType(row.getInt("RB_TYPE"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setRbExpiredDate(row.getDate("RB_EXPIRED_DATE"));
		entity.setRbRecUser(row.getString("RB_REC_USER"));
		return entity;
	}

}
