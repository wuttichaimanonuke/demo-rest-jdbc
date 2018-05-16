package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbIndexWaitingRowMapper implements RowMapper<EsbIndexWaiting> {

	@Override
	public EsbIndexWaiting mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbIndexWaiting entity = new EsbIndexWaiting();
		entity.setIndWaitingId(row.getString("IND_WAITING_ID"));
		entity.setIndTimestamp(row.getDate("IND_TIMESTAMP"));
		return entity;
	}

}
