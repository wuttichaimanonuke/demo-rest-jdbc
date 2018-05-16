package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class edDocRelRowMapper implements RowMapper<edDocRel> {

	@Override
	public edDocRel mapRow(ResultSet row, int rowNum) throws SQLException {
		edDocRel entity = new edDocRel();
		entity.setRelParentId(row.getString("REL_PARENT_ID"));
		entity.setRelChildId(row.getString("REL_CHILD_ID"));
		entity.setRelType(row.getInt("REL_TYPE"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
