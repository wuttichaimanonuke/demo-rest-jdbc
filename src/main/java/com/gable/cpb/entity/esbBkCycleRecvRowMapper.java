package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbBkCycleRecvRowMapper implements RowMapper<esbBkCycleRecv> {

	@Override
	public esbBkCycleRecv mapRow(ResultSet row, int rowNum) throws SQLException {
		esbBkCycleRecv entity = new esbBkCycleRecv();
		entity.setCycdId(row.getLong("CYCD_ID"));
		entity.setUserId(row.getLong("USER_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
