package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbAssignRoleRowMapper implements RowMapper<CpbAssignRole> {

	@Override
	public CpbAssignRole mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbAssignRole cpbAssignRole = new CpbAssignRole();
		cpbAssignRole.setArId(row.getLong("AR_ID"));
		cpbAssignRole.setFromUserId(row.getLong("FROM_USER_ID"));
		cpbAssignRole.setFromRoleId(row.getLong("FROM_ROLE_ID"));
		cpbAssignRole.setToUserId(row.getLong("TO_USER_ID"));
		cpbAssignRole.setStartDateTime(row.getDate("START_DATETIME"));
		cpbAssignRole.setEndDateTime(row.getDate("END_DATETIME"));
		cpbAssignRole.setStatus(row.getInt("STATUS"));
		cpbAssignRole.setUpdateUser(row.getString("UPDATE_USER"));
		cpbAssignRole.setUpdateDateTime(row.getDate("UPDATE_DATETIME"));
		cpbAssignRole.setTempOrg(row.getLong("TEMP_ORG"));
		cpbAssignRole.setTempRoleType(row.getLong("TEMP_ROLE_TYPE"));
		return cpbAssignRole;
	}

}
