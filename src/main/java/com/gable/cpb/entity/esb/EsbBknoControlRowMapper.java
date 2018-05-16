package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbBknoControlRowMapper implements RowMapper<EsbBknoControl> {

	@Override
	public EsbBknoControl mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbBknoControl entity = new EsbBknoControl();
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
