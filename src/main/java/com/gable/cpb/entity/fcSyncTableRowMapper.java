package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class fcSyncTableRowMapper implements RowMapper<fcSyncTable> {

	@Override
	public fcSyncTable mapRow(ResultSet row, int rowNum) throws SQLException {
		fcSyncTable entity = new fcSyncTable();
		entity.setFcStTableName(row.getString("FC_ST_TABLE_NAME"));
		entity.setFcStVal(row.getInt("FC_ST_VAL"));
		return entity;
	}

}
