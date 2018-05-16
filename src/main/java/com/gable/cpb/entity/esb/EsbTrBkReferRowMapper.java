package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbTrBkReferRowMapper implements RowMapper<EsbTrBkRefer> {

	@Override
	public EsbTrBkRefer mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbTrBkRefer entity = new EsbTrBkRefer();
		entity.setActId(row.getLong("ACT_ID"));
		entity.setTrId(row.getLong("TR_ID"));
		entity.setActType(row.getInt("ACT_TYPE"));
		entity.setRefId(row.getLong("REF_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
