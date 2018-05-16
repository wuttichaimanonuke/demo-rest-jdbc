package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbVvsMappingRowMapper implements RowMapper<CpbVvsMapping> {

	@Override
	public CpbVvsMapping mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbVvsMapping entity = new CpbVvsMapping();
		entity.setRObjectId(row.getString("R_OBJECT_ID"));
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
