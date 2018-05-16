package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdDocSetRowMapper implements RowMapper<EdDocSet> {

	@Override
	public EdDocSet mapRow(ResultSet row, int rowNum) throws SQLException {
		EdDocSet entity = new EdDocSet();
		entity.setDsId(row.getLong("DS_ID"));
		entity.setDsCoverId(row.getString("DS_COVER_ID"));
		entity.setDsChildId(row.getString("DS_CHILD_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
