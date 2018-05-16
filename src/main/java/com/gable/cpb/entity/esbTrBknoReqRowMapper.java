package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbTrBknoReqRowMapper implements RowMapper<esbTrBknoReq> {

	@Override
	public esbTrBknoReq mapRow(ResultSet row, int rowNum) throws SQLException {
		esbTrBknoReq entity = new esbTrBknoReq();
		entity.setReqId(row.getLong("REQ_ID"));
		entity.setTrId(row.getLong("TR_ID"));
		entity.setCtId(row.getLong("CT_ID"));
		entity.setGenType(row.getInt("GEN_TYPE"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setToRoleId(row.getLong("TO_ROLE_ID"));
		entity.setBknId(row.getLong("BKN_ID"));
		return entity;
	}

}
