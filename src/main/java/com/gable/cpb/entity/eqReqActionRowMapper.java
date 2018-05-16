package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class eqReqActionRowMapper implements RowMapper<eqReqAction> {

	@Override
	public eqReqAction mapRow(ResultSet row, int rowNum) throws SQLException {
		eqReqAction entity = new eqReqAction();
		entity.setRaId(row.getLong("RA_ID"));
		entity.setRaReqNo(row.getString("RA_REQ_NO"));
		entity.setRaType(row.getInt("RA_TYPE"));
		entity.setRaDetail(row.getString("RA_DETAIL"));
		entity.setRaSendFrom(row.getString("RA_SEND_FROM"));
		entity.setRaSendFromRole(row.getLong("RA_SEND_FROM_ROLE"));
		entity.setRaSendFromOrg(row.getLong("RA_SEND_FROM_ORG"));
		entity.setRaSendDate(row.getDate("RA_SEND_DATE"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setRaSendTo(row.getString("RA_SEND_TO"));
		return entity;
	}

}
