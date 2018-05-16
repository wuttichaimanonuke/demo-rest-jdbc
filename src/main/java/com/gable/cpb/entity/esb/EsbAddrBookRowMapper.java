package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbAddrBookRowMapper implements RowMapper<EsbAddrBook> {

	@Override
	public EsbAddrBook mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbAddrBook entity = new EsbAddrBook();
		entity.setAdId(row.getLong("AD_ID"));
		entity.setUserId(row.getLong("USER_ID"));
		entity.setAdOrder(row.getLong("AD_ORDER"));
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setRoleId(row.getLong("ROLE_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
