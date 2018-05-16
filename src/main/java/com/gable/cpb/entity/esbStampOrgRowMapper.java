package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbStampOrgRowMapper implements RowMapper<esbStampOrg> {

	@Override
	public esbStampOrg mapRow(ResultSet row, int rowNum) throws SQLException {
		esbStampOrg entity = new esbStampOrg();
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setMainOrgId(row.getLong("MAIN_ORG_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
