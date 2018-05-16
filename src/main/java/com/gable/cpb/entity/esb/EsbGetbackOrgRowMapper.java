package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbGetbackOrgRowMapper implements RowMapper<EsbGetbackOrg> {

	@Override
	public EsbGetbackOrg mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbGetbackOrg entity = new EsbGetbackOrg();
		entity.setGbId(row.getLong("GB_ID"));
		entity.setMainOrgId(row.getLong("MAIN_ORG_ID"));
		entity.setGetBackOrgId(row.getLong("GET_BACK_ORG_ID"));
		entity.setSarabanFlag(row.getInt("SARABAN_FLAG"));
		entity.setUpdateDate(row.getDate("UPDATE_DATE"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		return entity;
	}

}
