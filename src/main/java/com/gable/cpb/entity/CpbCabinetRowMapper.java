package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbCabinetRowMapper implements RowMapper<CpbCabinet> {

	@Override
	public CpbCabinet mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbCabinet cpbCabinet = new CpbCabinet();
		cpbCabinet.setCabId(row.getLong("CAB_ID"));
		cpbCabinet.setCabWhId(row.getLong("CAB_WH_ID"));
		cpbCabinet.setCabCode(row.getString("CAB_CODE"));
		cpbCabinet.setCabNote(row.getString("CAB_NOTE"));
		cpbCabinet.setCreateUser(row.getString("CREATE_USER"));
		cpbCabinet.setCreateDateTime(row.getDate("CREATE_DATETIME"));
		cpbCabinet.setUpdateUser(row.getString("UPDATE_USER"));
		cpbCabinet.setUpdateDateTime(row.getDate("UPDATE_DATETIME"));
		return cpbCabinet;
	}

}
