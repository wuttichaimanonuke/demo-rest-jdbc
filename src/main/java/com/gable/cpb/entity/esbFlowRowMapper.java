package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbFlowRowMapper implements RowMapper<esbFlow> {

	@Override
	public esbFlow mapRow(ResultSet row, int rowNum) throws SQLException {
		esbFlow entity = new esbFlow();
		entity.setFlowId(row.getLong("FLOW_ID"));
		entity.setFlowCode(row.getString("FLOW_CODE"));
		entity.setFlowName(row.getString("FLOW_NAME"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
