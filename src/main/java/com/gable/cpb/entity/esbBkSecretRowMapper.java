package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbBkSecretRowMapper implements RowMapper<esbBkSecret> {

	@Override
	public esbBkSecret mapRow(ResultSet row, int rowNum) throws SQLException {
		esbBkSecret entity = new esbBkSecret();
		entity.setBkId(row.getLong("BK_ID"));
		entity.setUserId(row.getLong("USER_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
