package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbBkReferRowMapper implements RowMapper<EsbBkRefer> {

	@Override
	public EsbBkRefer mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbBkRefer entity = new EsbBkRefer();
		entity.setRefId(row.getLong("REF_ID"));
		entity.setBkId(row.getLong("BK_ID"));
		entity.setRefType(row.getInt("REF_TYPE"));
		entity.setBkIdRef(row.getLong("BK_ID_REF"));
		entity.setDocId(row.getString("DOC_ID"));
		entity.setRemark(row.getString("REMARK"));
		entity.setAddUserId(row.getLong("ADD_USER_ID"));
		entity.setAddDatetime(row.getDate("ADD_DATETIME"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setAddRole(row.getLong("ADD_ROLE"));
		return entity;
	}

}
