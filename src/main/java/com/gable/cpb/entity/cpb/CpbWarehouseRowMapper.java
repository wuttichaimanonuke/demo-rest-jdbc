package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbWarehouseRowMapper implements RowMapper<CpbWarehouse> {

	@Override
	public CpbWarehouse mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbWarehouse entity = new CpbWarehouse();
		entity.setWhId(row.getLong("WH_ID"));
		entity.setWhOrgId(row.getLong("WH_ORG_ID"));
		entity.setWhNote(row.getString("WH_NOTE"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
