package com.gable.cpb.entity.etc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FcSyncTableRowMapper implements RowMapper<FcSyncTable> {

	@Override
	public FcSyncTable mapRow(ResultSet row, int rowNum) throws SQLException {
		FcSyncTable entity = new FcSyncTable();
		entity.setFcStTableName(row.getString("FC_ST_TABLE_NAME"));
		entity.setFcStVal(row.getInt("FC_ST_VAL"));
		return entity;
	}

}
