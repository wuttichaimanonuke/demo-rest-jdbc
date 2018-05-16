package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class edDocSetRowMapper implements RowMapper<edDocSet> {

	@Override
	public edDocSet mapRow(ResultSet row, int rowNum) throws SQLException {
		edDocSet entity = new edDocSet();
		entity.setDsId(row.getLong("DS_ID"));
		entity.setDsCoverId(row.getString("DS_COVER_ID"));
		entity.setDsChildId(row.getString("DS_CHILD_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
