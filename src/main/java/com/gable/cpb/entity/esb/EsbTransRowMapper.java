package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbTransRowMapper implements RowMapper<EsbTrans> {

	@Override
	public EsbTrans mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbTrans entity = new EsbTrans();
		entity.setTrId(row.getLong("TR_ID"));
		entity.setTrGroup(row.getLong("TR_GROUP"));
		entity.setTrDatetime(row.getDate("TR_DATETIME"));
		entity.setBkId(row.getLong("BK_ID"));
		entity.setUserId(row.getLong("USER_ID"));
		entity.setTrType(row.getInt("TR_TYPE"));
		entity.setObjId(row.getLong("OBJ_ID"));
		entity.setObjDesc(row.getString("OBJ_DESC"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setRoleId(row.getLong("ROLE_ID"));
		return entity;
	}

}
