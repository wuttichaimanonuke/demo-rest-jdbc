package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbObjectiveTypeRowMapper implements RowMapper<CpbObjectiveType> {

	@Override
	public CpbObjectiveType mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbObjectiveType entity = new CpbObjectiveType();
		entity.setObjtId(row.getLong("OBJT_ID"));
		entity.setObjtName(row.getString("OBJT_NAME"));
		entity.setObjtRemark(row.getString("OBJT_REMARK"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
