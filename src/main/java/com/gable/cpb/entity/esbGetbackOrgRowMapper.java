package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbGetbackOrgRowMapper implements RowMapper<esbGetbackOrg> {

	@Override
	public esbGetbackOrg mapRow(ResultSet row, int rowNum) throws SQLException {
		esbGetbackOrg entity = new esbGetbackOrg();
		entity.setGbId(row.getLong("GB_ID"));
		entity.setMainOrgId(row.getLong("MAIN_ORG_ID"));
		entity.setGetBackOrgId(row.getLong("GET_BACK_ORG_ID"));
		entity.setSarabanFlag(row.getInt("SARABAN_FLAG"));
		entity.setUpdateDate(row.getDate("UPDATE_DATE"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		return entity;
	}

}
