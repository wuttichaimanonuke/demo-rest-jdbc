package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbBkGroupRowMapper implements RowMapper<esbBkGroup> {

	@Override
	public esbBkGroup mapRow(ResultSet row, int rowNum) throws SQLException {
		esbBkGroup entity = new esbBkGroup();
		entity.setGrpId(row.getLong("GRP_ID"));
		entity.setGrpCode(row.getString("GRP_CODE"));
		entity.setGrpName(row.getString("GRP_NAME"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
