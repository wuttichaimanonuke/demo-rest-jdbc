package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbOrgDev20150625RowMapper implements RowMapper<CpbOrgDev20150625> {

	@Override
	public CpbOrgDev20150625 mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbOrgDev20150625 entity = new CpbOrgDev20150625();
		entity.setOrgId(row.getLong("ORG_ID"));
		entity.setOrgCode(row.getString("ORG_CODE"));
		entity.setOrgName(row.getString("ORG_NAME"));
		entity.setOrgSname(row.getString("ORG_SNAME"));
		entity.setOrgIdRef(row.getLong("ORG_ID_REF"));
		entity.setOrgType(row.getInt("ORG_TYPE"));
		entity.setStatus(row.getInt("STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setDctmGroupRebuildStatus(row.getInt("DCTM_GROUP_REBUILD_STATUS"));
		entity.setDctmGroupRebuildDatetime(row.getDate("DCTM_GROUP_REBUILD_DATETIME"));
		return entity;
	}

}
