package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbStampRunRowMapper implements RowMapper<EsbStampRun> {

	@Override
	public EsbStampRun mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbStampRun entity = new EsbStampRun();
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setStType(row.getInt("ST_TYPE"));
		entity.setRunYear(row.getInt("RUN_YEAR"));
		entity.setRunNo(row.getLong("RUN_NO"));
		return entity;
	}

}
