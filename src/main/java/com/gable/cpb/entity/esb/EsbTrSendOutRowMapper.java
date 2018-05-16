package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbTrSendOutRowMapper implements RowMapper<EsbTrSendOut> {

	@Override
	public EsbTrSendOut mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbTrSendOut entity = new EsbTrSendOut();
		entity.setTrId(row.getLong("TR_ID"));
		entity.setSendType(row.getInt("SEND_TYPE"));
		entity.setSendDate(row.getDate("SEND_DATE"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
