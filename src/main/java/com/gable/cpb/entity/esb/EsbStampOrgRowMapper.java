package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbStampOrgRowMapper implements RowMapper<EsbStampOrg> {

	@Override
	public EsbStampOrg mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbStampOrg entity = new EsbStampOrg();
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setMainOrgId(row.getLong("MAIN_ORG_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
