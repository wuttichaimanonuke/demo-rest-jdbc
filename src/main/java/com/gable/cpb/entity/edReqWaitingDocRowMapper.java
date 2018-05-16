package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class edReqWaitingDocRowMapper implements RowMapper<edReqWaitingDoc> {

	@Override
	public edReqWaitingDoc mapRow(ResultSet row, int rowNum) throws SQLException {
		edReqWaitingDoc entity = new edReqWaitingDoc();
		entity.setRwReqNo(row.getString("RW_REQ_NO"));
		entity.setRwReceiveRole(row.getLong("RW_RECEIVE_ROLE"));
		entity.setRwSendRole(row.getLong("RW_SEND_ROLE"));
		entity.setRwSendUser(row.getString("RW_SEND_USER"));
		entity.setRwSendOrg(row.getLong("RW_SEND_ORG"));
		entity.setRwSendDatetime(row.getDate("RW_SEND_DATETIME"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setRwStatus(row.getInt("RW_STATUS"));
		entity.setRwDesc(row.getString("RW_DESC"));
		return entity;
	}

}
