package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbOrgChangeAffiliaHistRowMapper implements RowMapper<CpbOrgChangeAffiliaHist> {

	@Override
	public CpbOrgChangeAffiliaHist mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbOrgChangeAffiliaHist entity = new CpbOrgChangeAffiliaHist();
		entity.setOhId(row.getLong("OH_ID"));
		entity.setOcahOldRefOrgId(row.getLong("OCAH_OLD_REF_ORG_ID"));
		entity.setOcahNewRefOrgId(row.getLong("OCAH_NEW_REF_ORG_ID"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		return entity;
	}

}
