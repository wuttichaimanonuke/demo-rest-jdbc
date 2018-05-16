package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class procEsbBkFlowOrgRowMapper implements RowMapper<procEsbBkFlowOrg> {

	@Override
	public procEsbBkFlowOrg mapRow(ResultSet row, int rowNum) throws SQLException {
		procEsbBkFlowOrg entity = new procEsbBkFlowOrg();
		entity.setProcId(row.getLong("PROC_ID"));
		entity.setAddDatetime(row.getDate("ADD_DATETIME"));
		entity.setMainGroupName(row.getString("MAIN_GROUP_NAME"));
		entity.setDetailGroupName(row.getString("DETAIL_GROUP_NAME"));
		entity.setProcState(row.getLong("PROC_STATE"));
		entity.setProcPriority(row.getInt("PROC_PRIORITY"));
		entity.setRetryCount(row.getLong("RETRY_COUNT"));
		entity.setBkId(row.getLong("BK_ID"));
		entity.setProcNote(row.getString("PROC_NOTE"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setLastRun(row.getDate("LAST_RUN"));
		return entity;
	}

}
