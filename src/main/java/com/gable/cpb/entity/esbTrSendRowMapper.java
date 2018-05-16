package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbTrSendRowMapper implements RowMapper<esbTrSend> {

	@Override
	public esbTrSend mapRow(ResultSet row, int rowNum) throws SQLException {
		esbTrSend entity = new esbTrSend();
		entity.setSendId(row.getLong("SEND_ID"));
		entity.setTrId(row.getLong("TR_ID"));
		entity.setToRoleId(row.getLong("TO_ROLE_ID"));
		entity.setToUserId(row.getLong("TO_USER_ID"));
		entity.setRecvTrId(row.getLong("RECV_TR_ID"));
		entity.setStId(row.getLong("ST_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setFlagCrossOrg(row.getInt("FLAG_CROSS_ORG"));
		entity.setFwTrId(row.getLong("FW_TR_ID"));
		return entity;
	}

}
