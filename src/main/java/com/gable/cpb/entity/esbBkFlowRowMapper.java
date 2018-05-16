package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbBkFlowRowMapper implements RowMapper<esbBkFlow> {

	@Override
	public esbBkFlow mapRow(ResultSet row, int rowNum) throws SQLException {
		esbBkFlow entity = new esbBkFlow();
		entity.setBkId(row.getLong("BK_ID"));
		entity.setStepId(row.getLong("STEP_ID"));
		entity.setToOrgId(row.getLong("TO_ORG_ID"));
		entity.setToRoleId(row.getLong("TO_ROLE_ID"));
		entity.setToUserId(row.getLong("TO_USER_ID"));
		entity.setSendTrId(row.getLong("SEND_TR_ID"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setStepOrder(row.getLong("STEP_ORDER"));
		entity.setStampOutTrId(row.getLong("STAMP_OUT_TR_ID"));
		entity.setStampInTrId(row.getLong("STAMP_IN_TR_ID"));
		return entity;
	}

}
