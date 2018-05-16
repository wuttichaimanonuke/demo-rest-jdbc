package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbTrBkAttachRowMapper implements RowMapper<EsbTrBkAttach> {

	@Override
	public EsbTrBkAttach mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbTrBkAttach entity = new EsbTrBkAttach();
		entity.setActId(row.getLong("ACT_ID"));
		entity.setTrId(row.getLong("TR_ID"));
		entity.setActType(row.getInt("ACT_TYPE"));
		entity.setAttId(row.getLong("ATT_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
