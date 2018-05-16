package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class edReqRowMapper implements RowMapper<edReq> {

	@Override
	public edReq mapRow(ResultSet row, int rowNum) throws SQLException {
		edReq entity = new edReq();
		entity.setReqNo(row.getString("REQ_NO"));
		entity.setReqType(row.getString("REQ_TYPE"));
		entity.setReqUser(row.getString("REQ_USER"));
		entity.setReqOrg(row.getLong("REQ_ORG"));
		entity.setReqObj(row.getLong("REQ_OBJ"));
		entity.setReqRole(row.getLong("REQ_ROLE"));
		entity.setReqHostOrg(row.getLong("REQ_HOST_ORG"));
		entity.setReqStoreOrg(row.getLong("REQ_STORE_ORG"));
		entity.setReqReason(row.getString("REQ_REASON"));
		entity.setReqSpeed(row.getInt("REQ_SPEED"));
		entity.setReqDate(row.getDate("REQ_DATE"));
		entity.setReqDateActual(row.getDate("REQ_DATE_ACTUAL"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
