package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbBkCycleRowMapper implements RowMapper<EsbBkCycle> {

	@Override
	public EsbBkCycle mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbBkCycle entity = new EsbBkCycle();
		entity.setCycId(row.getLong("CYC_ID"));
		entity.setBkId(row.getLong("BK_ID"));
		entity.setSendType(row.getInt("SEND_TYPE"));
		entity.setSendTrId(row.getLong("SEND_TR_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
