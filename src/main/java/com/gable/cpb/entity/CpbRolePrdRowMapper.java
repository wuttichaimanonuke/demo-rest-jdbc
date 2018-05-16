package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbRolePrdRowMapper implements RowMapper<CpbRolePrd> {

	@Override
	public CpbRolePrd mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbRolePrd entity = new CpbRolePrd();
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
