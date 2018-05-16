package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbServiceRowMapper implements RowMapper<CpbService> {

	@Override
	public CpbService mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbService entity = new CpbService();
		entity.setSvId(row.getLong("SV_ID"));
		entity.setSvCode(row.getString("SV_CODE"));
		entity.setSvName(row.getString("SV_NAME"));
		entity.setSvType(row.getInt("SV_TYPE"));
		entity.setSvIdRef(row.getLong("SV_ID_REF"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
