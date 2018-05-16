package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class edEmailReqRowMapper implements RowMapper<edEmailReq> {

	@Override
	public edEmailReq mapRow(ResultSet row, int rowNum) throws SQLException {
		edEmailReq entity = new edEmailReq();
		entity.setMrReqNo(row.getString("MR_REQ_NO"));
		entity.setMrSentDate(row.getDate("MR_SENT_DATE"));
		return entity;
	}

}
