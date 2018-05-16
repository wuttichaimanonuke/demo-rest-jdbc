package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class edPhyLocationRowMapper implements RowMapper<edPhyLocation> {

	@Override
	public edPhyLocation mapRow(ResultSet row, int rowNum) throws SQLException {
		edPhyLocation entity = new edPhyLocation();
		entity.setDpLocEnvId(row.getLong("DP_LOC_ENV_ID"));
		entity.setDpLocDocId(row.getString("DP_LOC_DOC_ID"));
		entity.setDpLocStoredDate(row.getDate("DP_LOC_STORED_DATE"));
		entity.setDpLocStoredUser(row.getString("DP_LOC_STORED_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		return entity;
	}

}
