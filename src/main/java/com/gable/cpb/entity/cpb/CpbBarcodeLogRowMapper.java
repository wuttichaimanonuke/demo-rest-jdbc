package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbBarcodeLogRowMapper implements RowMapper<CpbBarcodeLog> {

	@Override
	public CpbBarcodeLog mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbBarcodeLog cpbBarcodeLog = new CpbBarcodeLog();
		cpbBarcodeLog.setBcType(row.getInt("BC_TYPE"));
		cpbBarcodeLog.setBcNo(row.getString("BC_NO"));
		cpbBarcodeLog.setStatus(row.getInt("STATUS"));
		cpbBarcodeLog.setUpdateUser(row.getString("UPDATE_USER"));
		cpbBarcodeLog.setUpdateDateTime(row.getDate("UPDATE_DATETIME"));
		return cpbBarcodeLog;
	}

}
