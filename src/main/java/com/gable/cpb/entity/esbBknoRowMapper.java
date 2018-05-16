package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbBknoRowMapper implements RowMapper<esbBkno> {

	@Override
	public esbBkno mapRow(ResultSet row, int rowNum) throws SQLException {
		esbBkno entity = new esbBkno();
		entity.setBknId(row.getLong("BKN_ID"));
		entity.setCtId(row.getLong("CT_ID"));
		entity.setBkId(row.getLong("BK_ID"));
		entity.setBkNo(row.getString("BK_NO"));
		entity.setBkDate(row.getDate("BK_DATE"));
		entity.setReserveReqUserId(row.getLong("RESERVE_REQ_USER_ID"));
		entity.setReserveRemark(row.getString("RESERVE_REMARK"));
		entity.setReserveUserId(row.getLong("RESERVE_USER_ID"));
		entity.setReserveDatetime(row.getDate("RESERVE_DATETIME"));
		entity.setCancelRemark(row.getString("CANCEL_REMARK"));
		entity.setCancelUserId(row.getLong("CANCEL_USER_ID"));
		entity.setCancelDatetime(row.getDate("CANCEL_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setBkIdReq(row.getLong("BK_ID_REQ"));
		return entity;
	}

}
