package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbBkRevokeLogRowMapper implements RowMapper<esbBkRevokeLog> {

	@Override
	public esbBkRevokeLog mapRow(ResultSet row, int rowNum) throws SQLException {
		esbBkRevokeLog entity = new esbBkRevokeLog();
		entity.setLogId(row.getLong("LOG_ID"));
		entity.setBkId(row.getLong("BK_ID"));
		entity.setDocId(row.getLong("DOC_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
