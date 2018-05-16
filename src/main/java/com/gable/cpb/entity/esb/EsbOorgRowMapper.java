package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbOorgRowMapper implements RowMapper<EsbOorg> {

	@Override
	public EsbOorg mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbOorg entity = new EsbOorg();
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
