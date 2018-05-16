package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbBkGroupRowMapper implements RowMapper<EsbBkGroup> {

	@Override
	public EsbBkGroup mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbBkGroup entity = new EsbBkGroup();
		entity.setGrpId(row.getLong("GRP_ID"));
		entity.setGrpCode(row.getString("GRP_CODE"));
		entity.setGrpName(row.getString("GRP_NAME"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
