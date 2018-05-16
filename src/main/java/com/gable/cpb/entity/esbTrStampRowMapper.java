package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbTrStampRowMapper implements RowMapper<esbTrStamp> {

	@Override
	public esbTrStamp mapRow(ResultSet row, int rowNum) throws SQLException {
		esbTrStamp entity = new esbTrStamp();
		entity.setTrId(row.getLong("TR_ID"));
		entity.setStOrgId(row.getLong("ST_ORG_ID"));
		entity.setStType(row.getInt("ST_TYPE"));
		entity.setStNo(row.getString("ST_NO"));
		entity.setStDatetime(row.getDate("ST_DATETIME"));
		entity.setToOrgId(row.getLong("TO_ORG_ID"));
		entity.setToRoleId(row.getLong("TO_ROLE_ID"));
		entity.setToUserId(row.getLong("TO_USER_ID"));
		entity.setPrintUserId(row.getLong("PRINT_USER_ID"));
		entity.setPrintDatetime(row.getDate("PRINT_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setRecvTrId(row.getLong("RECV_TR_ID"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setRejectTrId(row.getLong("REJECT_TR_ID"));
		entity.setToStampOrgId(row.getLong("TO_STAMP_ORG_ID"));
		entity.setRejectType(row.getInt("REJECT_TYPE"));
		return entity;
	}

}
