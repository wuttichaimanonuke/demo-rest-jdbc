package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbStampRunRowMapper implements RowMapper<esbStampRun> {

	@Override
	public esbStampRun mapRow(ResultSet row, int rowNum) throws SQLException {
		esbStampRun entity = new esbStampRun();
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setStType(row.getInt("ST_TYPE"));
		entity.setRunYear(row.getInt("RUN_YEAR"));
		entity.setRunNo(row.getLong("RUN_NO"));
		return entity;
	}

}
