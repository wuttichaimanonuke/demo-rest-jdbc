package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbBkSecretRowMapper implements RowMapper<EsbBkSecret> {

	@Override
	public EsbBkSecret mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbBkSecret entity = new EsbBkSecret();
		entity.setBkId(row.getLong("BK_ID"));
		entity.setUserId(row.getLong("USER_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
