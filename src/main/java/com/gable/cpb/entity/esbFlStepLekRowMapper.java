package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbFlStepLekRowMapper implements RowMapper<esbFlStepLek> {

	@Override
	public esbFlStepLek mapRow(ResultSet row, int rowNum) throws SQLException {
		esbFlStepLek entity = new esbFlStepLek();
		entity.setStepId(row.getLong("STEP_ID"));
		entity.setFlowId(row.getLong("FLOW_ID"));
		entity.setStepDesc(row.getString("STEP_DESC"));
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setRoleId(row.getLong("ROLE_ID"));
		entity.setUserId(row.getLong("USER_ID"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setStepOrder(row.getLong("STEP_ORDER"));
		return entity;
	}

}