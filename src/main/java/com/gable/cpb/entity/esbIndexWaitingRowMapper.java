package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbIndexWaitingRowMapper implements RowMapper<esbIndexWaiting> {

	@Override
	public esbIndexWaiting mapRow(ResultSet row, int rowNum) throws SQLException {
		esbIndexWaiting entity = new esbIndexWaiting();
		entity.setIndWaitingId(row.getString("IND_WAITING_ID"));
		entity.setIndTimestamp(row.getDate("IND_TIMESTAMP"));
		return entity;
	}

}
