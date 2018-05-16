package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbBknoControlOrgRowMapper implements RowMapper<EsbBknoControlOrg> {

	@Override
	public EsbBknoControlOrg mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbBknoControlOrg entity = new EsbBknoControlOrg();
		entity.setCtId(row.getLong("CT_ID"));
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
