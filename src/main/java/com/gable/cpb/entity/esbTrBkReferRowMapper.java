package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbTrBkReferRowMapper implements RowMapper<esbTrBkRefer> {

	@Override
	public esbTrBkRefer mapRow(ResultSet row, int rowNum) throws SQLException {
		esbTrBkRefer entity = new esbTrBkRefer();
		entity.setActId(row.getLong("ACT_ID"));
		entity.setTrId(row.getLong("TR_ID"));
		entity.setActType(row.getInt("ACT_TYPE"));
		entity.setRefId(row.getLong("REF_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
