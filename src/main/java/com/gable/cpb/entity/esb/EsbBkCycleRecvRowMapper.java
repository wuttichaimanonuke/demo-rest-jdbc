package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbBkCycleRecvRowMapper implements RowMapper<EsbBkCycleRecv> {

	@Override
	public EsbBkCycleRecv mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbBkCycleRecv entity = new EsbBkCycleRecv();
		entity.setCycdId(row.getLong("CYCD_ID"));
		entity.setUserId(row.getLong("USER_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
