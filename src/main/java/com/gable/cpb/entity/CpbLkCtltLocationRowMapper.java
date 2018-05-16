package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbLkCtltLocationRowMapper implements RowMapper<CpbLkCtltLocation> {

	@Override
	public CpbLkCtltLocation mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbLkCtltLocation entity = new CpbLkCtltLocation();
		entity.setLocCode(row.getString("LOC_CODE"));
		entity.setLocAbbrName(row.getString("LOC_ABBR_NAME"));
		entity.setLocName(row.getString("LOC_NAME"));
		entity.setLocRepName(row.getString("LOC_REP_NAME"));
		entity.setLocPrefixName(row.getString("LOC_PREFIX_NAME"));
		entity.setLocPrefixAbbr(row.getString("LOC_PREFIX_ABBR"));
		entity.setLocRegion(row.getString("LOC_REGION"));
		entity.setUpdUserCode(row.getString("UPD_USER_CODE"));
		entity.setLastUpdDate(row.getDate("LAST_UPD_DATE"));
		entity.setCmesUpdateDatetime(row.getDate("CMES_UPDATE_DATETIME"));
		return entity;
	}

}
