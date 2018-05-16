package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbEnvelopRowMapper implements RowMapper<CpbEnvelop> {

	@Override
	public CpbEnvelop mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbEnvelop entity = new CpbEnvelop();
		entity.setEnvId(row.getLong("ENV_ID"));
		entity.setEnvShId(row.getLong("ENV_SH_ID"));
		entity.setEvnCabId(row.getLong("ENV_CAB_ID"));
		entity.setEvnWhID(row.getLong("ENV_WH_ID"));
		entity.setEnvCode(row.getString("ENV_CODE"));
		entity.setEnvNote(row.getString("ENV_NOTE"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
