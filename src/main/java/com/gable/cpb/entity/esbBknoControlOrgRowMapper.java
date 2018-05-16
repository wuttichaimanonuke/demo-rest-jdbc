package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbBknoControlOrgRowMapper implements RowMapper<esbBknoControlOrg> {

	@Override
	public esbBknoControlOrg mapRow(ResultSet row, int rowNum) throws SQLException {
		esbBknoControlOrg entity = new esbBknoControlOrg();
		entity.setCtId(row.getLong("CT_ID"));
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
