package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbBknoRunYearRowMapper implements RowMapper<EsbBknoRunYear> {

	@Override
	public EsbBknoRunYear mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbBknoRunYear entity = new EsbBknoRunYear();
		entity.setCtId(row.getLong("CT_ID"));
		entity.setRunYear(row.getInt("RUN_YEAR"));
		entity.setRunNo(row.getLong("RUN_NO"));
		return entity;
	}

}
