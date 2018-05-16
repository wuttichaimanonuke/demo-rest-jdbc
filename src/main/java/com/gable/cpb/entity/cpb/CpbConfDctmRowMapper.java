package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbConfDctmRowMapper implements RowMapper<CpbConfDctm> {

	@Override
	public CpbConfDctm mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbConfDctm entity = new CpbConfDctm();
		entity.setDcKey(row.getString("DC_KEY"));
		entity.setDcValue(row.getString("DC_VALUE"));
		entity.setDcModifyDate(row.getDate("DC_MODIFY_DATE"));
		entity.setDcIsActive(row.getString("DC_IS_ACTIVE"));
		return entity;
	}

}
