package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdReqRetrieveRowMapper implements RowMapper<EdReqRetrieve> {

	@Override
	public EdReqRetrieve mapRow(ResultSet row, int rowNum) throws SQLException {
		EdReqRetrieve entity = new EdReqRetrieve();
		entity.setRrReqNo(row.getString("RR_REQ_NO"));
		entity.setRrDocId(row.getString("RR_DOC_ID"));
		entity.setRrReqNoRef(row.getString("RR_REQ_NO_REF"));
		entity.setRrRetAppStatus(row.getInt("RR_RET_APP_STATUS"));
		entity.setRrAppStatusDatetime(row.getDate("RR_APP_STATUS_DATETIME"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		return entity;
	}

}
