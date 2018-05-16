package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbOrgHistRowMapper implements RowMapper<CpbOrgHist> {

	@Override
	public CpbOrgHist mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbOrgHist entity = new CpbOrgHist();
		entity.setOhId(row.getLong("OH_ID"));
		entity.setOhOrgId(row.getLong("OH_ORG_ID"));
		entity.setOhType(row.getInt("OH_TYPE"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		return entity;
	}

}
