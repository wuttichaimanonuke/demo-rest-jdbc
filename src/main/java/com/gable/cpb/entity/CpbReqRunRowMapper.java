package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbReqRunRowMapper implements RowMapper<CpbReqRun> {

	@Override
	public CpbReqRun mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbReqRun entity = new CpbReqRun();
		entity.setReqType(row.getInt("REQ_TYPE"));
		entity.setReqYear(row.getInt("REQ_YEAR"));
		entity.setReqNo(row.getString("REQ_NO"));
		return entity;
	}

}
