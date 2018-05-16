package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbEmailAdminRowMapper implements RowMapper<CpbEmailAdmin> {

	@Override
	public CpbEmailAdmin mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbEmailAdmin entity = new CpbEmailAdmin();
		entity.setEmail(row.getString("EMAIL"));
		return entity;
	}

}
