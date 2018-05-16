package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class edWaitingDocRowMapper implements RowMapper<edWaitingDoc> {

	@Override
	public edWaitingDoc mapRow(ResultSet row, int rowNum) throws SQLException {
		edWaitingDoc entity = new edWaitingDoc();
		entity.setWdReqNo(row.getString("WD_REQ_NO"));
		entity.setWdDocId(row.getString("WD_DOC_ID"));
		entity.setWdDocType(row.getInt("WD_DOC_TYPE"));
		entity.setWdStatus(row.getInt("WD_STATUS"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		return entity;
	}

}
