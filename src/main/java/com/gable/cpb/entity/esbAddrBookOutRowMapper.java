package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbAddrBookOutRowMapper implements RowMapper<esbAddrBookOut> {

	@Override
	public esbAddrBookOut mapRow(ResultSet row, int rowNum) throws SQLException {
		esbAddrBookOut entity = new esbAddrBookOut();
		entity.setAdId(row.getLong("AD_ID"));
		entity.setUserId(row.getLong("USER_ID"));
		entity.setAdOrder(row.getLong("AD_ORDER"));
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
