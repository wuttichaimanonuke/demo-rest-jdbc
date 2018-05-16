package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdWaitingDocRowMapper implements RowMapper<EdWaitingDoc> {

	@Override
	public EdWaitingDoc mapRow(ResultSet row, int rowNum) throws SQLException {
		EdWaitingDoc entity = new EdWaitingDoc();
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
