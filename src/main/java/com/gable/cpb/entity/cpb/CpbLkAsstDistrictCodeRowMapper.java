package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbLkAsstDistrictCodeRowMapper implements RowMapper<CpbLkAsstDistrictCode> {

	@Override
	public CpbLkAsstDistrictCode mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbLkAsstDistrictCode entity = new CpbLkAsstDistrictCode();
		entity.setDistrictCode(row.getString("DISTRICT_CODE"));
		entity.setDistrictName(row.getString("DISTRICT_NAME"));
		entity.setLocCode(row.getString("LOC_CODE"));
		entity.setFlagApp(row.getString("FLAG_APP"));
		entity.setUpdUserCode(row.getString("UPD_USER_CODE"));
		entity.setLastUpdDate(row.getDate("LAST_UPD_DATE"));
		entity.setDistrictCodeHist(row.getString("DISTRICT_CODE_HIST"));
		entity.setCmesUpdateDatetime(row.getDate("CMES_UPDATE_DATETIME"));
		return entity;
	}

}
