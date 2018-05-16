package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdDocRelRowMapper implements RowMapper<EdDocRel> {

	@Override
	public EdDocRel mapRow(ResultSet row, int rowNum) throws SQLException {
		EdDocRel entity = new EdDocRel();
		entity.setRelParentId(row.getString("REL_PARENT_ID"));
		entity.setRelChildId(row.getString("REL_CHILD_ID"));
		entity.setRelType(row.getInt("REL_TYPE"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
