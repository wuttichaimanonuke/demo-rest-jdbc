package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbBknoOrgCodeRowMapper implements RowMapper<EsbBknoOrgCode> {

	@Override
	public EsbBknoOrgCode mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbBknoOrgCode entity = new EsbBknoOrgCode();
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setCreateIn(row.getString("CREATE_IN"));
		entity.setRecvIn(row.getString("RECV_IN"));
		entity.setSendOut1(row.getString("SEND_OUT1"));
		entity.setSendOut2(row.getString("SEND_OUT2"));
		entity.setSendOut3(row.getString("SEND_OUT3"));
		entity.setCycle(row.getString("CYCLE"));
		entity.setAnnounce(row.getString("ANNOUNCE"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
