package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdBrrowUserRowMapper implements RowMapper<EdBrrowUser> {

	@Override
	public EdBrrowUser mapRow(ResultSet row, int rowNum) throws SQLException {
		EdBrrowUser entity = new EdBrrowUser();
		entity.setBuReqNo(row.getString("BU_REQ_NO"));
		entity.setBuUserId(row.getString("BU_USER_ID"));
		entity.setBuRoleId(row.getLong("BU_ROLE_ID"));
		entity.setBuAppStatus(row.getInt("BU_APP_STATUS"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		return entity;
	}

}
