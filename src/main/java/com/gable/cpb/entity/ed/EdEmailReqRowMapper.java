package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdEmailReqRowMapper implements RowMapper<EdEmailReq> {

	@Override
	public EdEmailReq mapRow(ResultSet row, int rowNum) throws SQLException {
		EdEmailReq entity = new EdEmailReq();
		entity.setMrReqNo(row.getString("MR_REQ_NO"));
		entity.setMrSentDate(row.getDate("MR_SENT_DATE"));
		return entity;
	}

}
