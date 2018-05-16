package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbRoleTypeRowMapper implements RowMapper<CpbRoleType> {

	@Override
	public CpbRoleType mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbRoleType entity = new CpbRoleType();
		entity.setRtId(row.getLong("RT_ID"));
		entity.setRtName(row.getString("RT_NAME"));
		entity.setRtRemark(row.getString("RT_REMARK"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setRtOrder(row.getInt("RT_ORDER"));
		return entity;
	}

}
