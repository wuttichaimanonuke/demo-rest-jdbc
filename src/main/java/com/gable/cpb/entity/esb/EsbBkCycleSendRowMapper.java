package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbBkCycleSendRowMapper implements RowMapper<EsbBkCycleSend> {

	@Override
	public EsbBkCycleSend mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbBkCycleSend entity = new EsbBkCycleSend();
		entity.setCycdId(row.getLong("CYCD_ID"));
		entity.setCycId(row.getLong("CYC_ID"));
		entity.setToOrgId(row.getLong("TO_ORG_ID"));
		entity.setToRoleId(row.getLong("TO_ROLE_ID"));
		return entity;
	}

}
