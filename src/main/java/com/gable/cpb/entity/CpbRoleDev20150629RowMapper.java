package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbRoleDev20150629RowMapper implements RowMapper<CpbRoleDev20150629> {

	@Override
	public CpbRoleDev20150629 mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbRoleDev20150629 entity = new CpbRoleDev20150629();
		entity.setRoleId(row.getLong("ROLE_ID"));
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setRtId(row.getInt("RT_ID"));
		entity.setRoleName(row.getString("ROLE_NAME"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
