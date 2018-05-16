package com.gable.cpb.entity.etc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TempJoe1RowMapper implements RowMapper<TempJoe1> {

	@Override
	public TempJoe1 mapRow(ResultSet row, int rowNum) throws SQLException {
		TempJoe1 entity = new TempJoe1();
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
