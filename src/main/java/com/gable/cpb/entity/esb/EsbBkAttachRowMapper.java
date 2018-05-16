package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbBkAttachRowMapper implements RowMapper<EsbBkAttach> {

	@Override
	public EsbBkAttach mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbBkAttach entity = new EsbBkAttach();
		entity.setAttId(row.getLong("ATT_ID"));
		entity.setBkId(row.getLong("BK_ID"));
		entity.setAttType(row.getInt("ATT_TYPE"));
		entity.setDocId(row.getString("DOC_ID"));
		entity.setBkIdFrom(row.getLong("BK_ID_FROM"));
		entity.setBkIdTo(row.getLong("BK_ID_TO"));
		entity.setRemark(row.getString("REMARK"));
		entity.setAddUserId(row.getLong("ADD_USER_ID"));
		entity.setAddDatetime(row.getDate("ADD_DATETIME"));
		entity.setStattus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setAddRole(row.getLong("ADD_ROLE"));
		return entity;
	}

}
