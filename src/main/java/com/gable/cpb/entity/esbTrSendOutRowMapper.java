package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbTrSendOutRowMapper implements RowMapper<esbTrSendOut> {

	@Override
	public esbTrSendOut mapRow(ResultSet row, int rowNum) throws SQLException {
		esbTrSendOut entity = new esbTrSendOut();
		entity.setTrId(row.getLong("TR_ID"));
		entity.setSendType(row.getInt("SEND_TYPE"));
		entity.setSendDate(row.getDate("SEND_DATE"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
