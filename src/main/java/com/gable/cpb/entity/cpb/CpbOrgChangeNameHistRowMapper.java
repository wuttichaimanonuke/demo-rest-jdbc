package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbOrgChangeNameHistRowMapper implements RowMapper<CpbOrgChangeNameHist> {

	@Override
	public CpbOrgChangeNameHist mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbOrgChangeNameHist entity = new CpbOrgChangeNameHist();
		entity.setOhId(row.getLong("OH_ID"));
		entity.setOcnhOldName(row.getString("OCNH_OLD_NAME"));
		entity.setOcnhNewName(row.getString("OCNH_NEW_NAME"));
		entity.setOcnhOldSname(row.getString("OCNH_OLD_SNAME"));
		entity.setOcnhNewSname(row.getString("OCNH_NEW_SNAME"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		return entity;
	}

}
