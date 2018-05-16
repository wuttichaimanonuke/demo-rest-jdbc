package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbLkAsstTypeCodeRowMapper implements RowMapper<CpbLkAsstTypeCode> {

	@Override
	public CpbLkAsstTypeCode mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbLkAsstTypeCode entity = new CpbLkAsstTypeCode();
		entity.setTypeCode(row.getString("TYPE_CODE"));
		entity.setTypeName(row.getString("TYPE_NAME"));
		entity.setTypeGroup(row.getString("TYPE_GROUP"));
		entity.setUpdUserCode(row.getString("UPD_USER_CODE"));
		entity.setLastUpdDate(row.getDate("LAST_UPD_DATE"));
		entity.setCmesUpdateDatetime(row.getDate("CMES_UPDATE_DATETIME"));
		return entity;
	}

}
