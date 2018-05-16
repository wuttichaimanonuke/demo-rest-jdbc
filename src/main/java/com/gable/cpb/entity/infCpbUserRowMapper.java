package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class infCpbUserRowMapper implements RowMapper<infCpbUser> {

	@Override
	public infCpbUser mapRow(ResultSet row, int rowNum) throws SQLException {
		infCpbUser entity = new infCpbUser();
		entity.setId(row.getLong("ID"));
		entity.setSource(row.getString("SOURCE"));
		entity.setInfInDatetime(row.getDate("INF_IN_DATETIME"));
		entity.setInfOutDatetime(row.getDate("INF_OUT_DATETIME"));
		entity.setInfOutStatus(row.getInt("INF_OUT_STATUS"));
		entity.setInfOutMsg(row.getString("INF_OUT_MSG"));
		entity.setUserLogin(row.getString("USER_LOGIN"));
		entity.setTitle(row.getString("TITLE"));
		entity.setFullName(row.getString("FULL_NAME"));
		entity.setEMail(row.getString("E_MAIL"));
		entity.setStatus(row.getInt("STATUS"));
		return entity;
	}

}
