package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbRoleTypeServRowMapper implements RowMapper<CpbRoleTypeServ> {

	@Override
	public CpbRoleTypeServ mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbRoleTypeServ entity = new CpbRoleTypeServ();
		entity.setRtId(row.getLong("RT_ID"));
		entity.setSvId(row.getLong("SV_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
