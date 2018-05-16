package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbShelfRowMapper implements RowMapper<CpbShelf> {

	@Override
	public CpbShelf mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbShelf entity = new CpbShelf();
		entity.setShId(row.getLong("SH_ID"));
		entity.setShCabId(row.getLong("SH_CAB_ID"));
		entity.setShWhId(row.getLong("SH_WH_ID"));
		entity.setShNote(row.getString("SH_NOTE"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
