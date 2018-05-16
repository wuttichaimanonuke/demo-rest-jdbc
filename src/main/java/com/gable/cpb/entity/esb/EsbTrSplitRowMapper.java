package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbTrSplitRowMapper implements RowMapper<EsbTrSplit> {

	@Override
	public EsbTrSplit mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbTrSplit entity = new EsbTrSplit();
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
