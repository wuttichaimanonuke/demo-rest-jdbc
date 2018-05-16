package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class tempJoe1RowMapper implements RowMapper<tempJoe1> {

	@Override
	public tempJoe1 mapRow(ResultSet row, int rowNum) throws SQLException {
		tempJoe1 entity = new tempJoe1();
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
