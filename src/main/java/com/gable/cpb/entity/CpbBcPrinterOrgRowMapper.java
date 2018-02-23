package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbBcPrinterOrgRowMapper implements RowMapper<CpbBcPrinterOrg> {

	@Override
	public CpbBcPrinterOrg mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbBcPrinterOrg cpbBcPrinterOrg = new CpbBcPrinterOrg();
		cpbBcPrinterOrg.setPrinterId(row.getLong("PRINTER_ID"));
		cpbBcPrinterOrg.setOrgId(row.getLong("ORG_ID"));
		return cpbBcPrinterOrg;
	}

}
