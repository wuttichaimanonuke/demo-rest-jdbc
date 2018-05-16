package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbObjectiveRowMapper implements RowMapper<CpbObjective> {

	@Override
	public CpbObjective mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbObjective entity = new CpbObjective();
		entity.setObjId(row.getLong("OBJ_ID"));
		entity.setObjCode(row.getString("OBJ_CODE"));
		entity.setObjName(row.getString("OBJ_NAME"));
		entity.setObjtId(row.getLong("OBJT_ID"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
