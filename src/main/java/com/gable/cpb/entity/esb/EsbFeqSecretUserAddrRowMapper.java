package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbFeqSecretUserAddrRowMapper implements RowMapper<EsbFeqSecretUserAddr> {

	@Override
	public EsbFeqSecretUserAddr mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbFeqSecretUserAddr entity = new EsbFeqSecretUserAddr();
		entity.setFsId(row.getInt("FS_ID"));
		entity.setFsOwnerUserId(row.getInt("FS_OWNER_USER_ID"));
		entity.setUserId(row.getInt("FS_USER_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
