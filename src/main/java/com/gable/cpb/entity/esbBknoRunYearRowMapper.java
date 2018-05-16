package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbBknoRunYearRowMapper implements RowMapper<esbBknoRunYear> {

	@Override
	public esbBknoRunYear mapRow(ResultSet row, int rowNum) throws SQLException {
		esbBknoRunYear entity = new esbBknoRunYear();
		entity.setCtId(row.getLong("CT_ID"));
		entity.setRunYear(row.getInt("RUN_YEAR"));
		entity.setRunNo(row.getLong("RUN_NO"));
		return entity;
	}

}
