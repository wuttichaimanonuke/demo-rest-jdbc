package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbTrSendStoreRowMapper implements RowMapper<esbTrSendStore> {

	@Override
	public esbTrSendStore mapRow(ResultSet row, int rowNum) throws SQLException {
		esbTrSendStore entity = new esbTrSendStore();
		entity.setStId(row.getLong("ST_ID"));
		entity.setTrId(row.getLong("TR_ID"));
		entity.setStoreOrg(row.getLong("STORE_ORG"));
		entity.setStoreType(row.getInt("STORE_TYPE"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
