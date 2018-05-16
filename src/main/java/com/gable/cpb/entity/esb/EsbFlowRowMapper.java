package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbFlowRowMapper implements RowMapper<EsbFlow> {

	@Override
	public EsbFlow mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbFlow entity = new EsbFlow();
		entity.setFlowId(row.getLong("FLOW_ID"));
		entity.setFlowCode(row.getString("FLOW_CODE"));
		entity.setFlowName(row.getString("FLOW_NAME"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
