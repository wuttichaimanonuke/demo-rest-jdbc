package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbOorgRowMapper implements RowMapper<esbOorg> {

	@Override
	public esbOorg mapRow(ResultSet row, int rowNum) throws SQLException {
		esbOorg entity = new esbOorg();
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setOrgCode(row.getString("ORG_CODE"));
		entity.setOrgName(row.getString("ORG_NAME"));
		entity.setOrgSname(row.getString("ORG_SNAME"));
		entity.setOrgIdRef(row.getLong("ORG_ID_REF"));
		entity.setOrgType(row.getInt("ORG_TYPE"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
