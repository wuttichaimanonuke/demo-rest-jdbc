package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbBarcodeRunRowMapper implements RowMapper<CpbBarcodeRun> {

	@Override
	public CpbBarcodeRun mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbBarcodeRun cpbBarcodeRun = new CpbBarcodeRun();
		cpbBarcodeRun.setBcType(row.getInt("BC_TYPE"));
		cpbBarcodeRun.setRunYear(row.getInt("RUN_YEAR"));
		cpbBarcodeRun.setRunNo(row.getLong("RUN_NO"));
		cpbBarcodeRun.setUpdateUser(row.getString("UPDATE_USER"));
		cpbBarcodeRun.setUpdateDateTime(row.getDate("UPDATE_DATETIME"));
		return cpbBarcodeRun;
	}

}
