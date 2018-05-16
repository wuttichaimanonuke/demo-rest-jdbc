package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class edInboxItemRowMapper implements RowMapper<edInboxItem> {

	@Override
	public edInboxItem mapRow(ResultSet row, int rowNum) throws SQLException {
		edInboxItem entity = new edInboxItem();
		entity.setItId(row.getLong("IT_ID"));
		entity.setItYear(row.getInt("IT_YEAR"));
		entity.setItRoleId(row.getLong("IT_ROLE_ID"));
		entity.setItReqNo(row.getString("IT_REQ_NO"));
		entity.setItName(row.getString("IT_NAME"));
		entity.setItStatus(row.getInt("IT_STATUS"));
		entity.setItSendUser(row.getLong("IT_SEND_USER"));
		entity.setItSendRole(row.getLong("IT_SEND_ROLE"));
		entity.setItSendOrg(row.getLong("IT_SEND_ORG"));
		entity.setItSendDatetime(row.getDate("IT_SEND_DATETIME"));
		entity.setItSendToRole(row.getLong("IT_SEND_TO_ROLE"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		return entity;
	}

}
