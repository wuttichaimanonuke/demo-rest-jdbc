package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbLkCtltContractCodeRowMapper implements RowMapper<CpbLkCtltContractCode> {

	@Override
	public CpbLkCtltContractCode mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbLkCtltContractCode entity = new CpbLkCtltContractCode();
		entity.setContractCode(row.getString("CONTRACT_CODE"));
		entity.setContractDesc(row.getString("CONTRACT_DESC"));
		entity.setContractAbbr(row.getString("CONTRACT_ABBR"));
		entity.setForm(row.getString("FORM"));
		entity.setUpdUserCode(row.getString("UPD_USER_CODE"));
		entity.setLastUpdDate(row.getDate("LAST_UPD_DATE"));
		entity.setCmesUpdateDatetime(row.getDate("CMES_UPDATE_DATETIME"));
		return entity;
	}

}
