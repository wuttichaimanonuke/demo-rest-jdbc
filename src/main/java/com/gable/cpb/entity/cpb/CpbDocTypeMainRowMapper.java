package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbDocTypeMainRowMapper implements RowMapper<CpbDocTypeMain> {

	@Override
	public CpbDocTypeMain mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbDocTypeMain entity = new CpbDocTypeMain();
		entity.setDtMainId(row.getLong("DT_MAIN_ID"));
		entity.setDtMainName(row.getString("DT_MAIN_NAME"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
