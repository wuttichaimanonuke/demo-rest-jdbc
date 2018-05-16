package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbTrSplitRowMapper implements RowMapper<esbTrSplit> {

	@Override
	public esbTrSplit mapRow(ResultSet row, int rowNum) throws SQLException {
		esbTrSplit entity = new esbTrSplit();
		entity.setSptId(row.getLong("SPT_ID"));
		entity.setTrId(row.getLong("TR_ID"));
		entity.setFrAttId(row.getLong("FR_ATT_ID"));
		entity.setFrAttTypeBf(row.getInt("FR_ATT_TYPE_BF"));
		entity.setFrAttTypeAfter(row.getInt("FR_ATT_TYPE_AFTER"));
		entity.setToAttId(row.getLong("TO_ATT_ID"));
		entity.setToAttType(row.getInt("TO_ATT_TYPE"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
