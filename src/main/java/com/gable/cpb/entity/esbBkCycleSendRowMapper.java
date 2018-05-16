package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbBkCycleSendRowMapper implements RowMapper<esbBkCycleSend> {

	@Override
	public esbBkCycleSend mapRow(ResultSet row, int rowNum) throws SQLException {
		esbBkCycleSend entity = new esbBkCycleSend();
		entity.setCycdId(row.getLong("CYCD_ID"));
		entity.setCycId(row.getLong("CYC_ID"));
		entity.setToOrgId(row.getLong("TO_ORG_ID"));
		entity.setToRoleId(row.getLong("TO_ROLE_ID"));
		return entity;
	}

}
