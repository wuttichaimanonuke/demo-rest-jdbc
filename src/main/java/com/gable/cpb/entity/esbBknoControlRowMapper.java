package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbBknoControlRowMapper implements RowMapper<esbBknoControl> {

	@Override
	public esbBknoControl mapRow(ResultSet row, int rowNum) throws SQLException {
		esbBknoControl entity = new esbBknoControl();
		entity.setCtId(row.getLong("CT_ID"));
		entity.setCtSecret(row.getInt("CT_SECRET"));
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setRoleId(row.getLong("ROLE_ID"));
		entity.setBkType(row.getInt("BK_TYPE"));
		entity.setCtName(row.getString("CT_NAME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setStatus(row.getInt("STATUS"));
		return entity;
	}

}
