package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbBcPrinterRowMapper implements RowMapper<CpbBcPrinter> {

	@Override
	public CpbBcPrinter mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbBcPrinter cpbBcPrinter = new CpbBcPrinter();
		cpbBcPrinter.setPrinterId(row.getLong("PRINTER_ID"));
		cpbBcPrinter.setPrinterName(row.getString("PRINTER_NAME"));
		cpbBcPrinter.setPrinterDesc(row.getString("PRINTER_DESC"));
		return cpbBcPrinter;
	}

}
