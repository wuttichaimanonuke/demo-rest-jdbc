package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbIndexWaitingRowMapper implements RowMapper<CpbIndexWaiting> {

	@Override
	public CpbIndexWaiting mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbIndexWaiting entity = new CpbIndexWaiting();
		entity.setIndWaitingId(row.getString("IND_WAITING_ID"));
		entity.setIndTimestamp(row.getDate("IND_TIMESTAMP"));
		return entity;
	}

}
