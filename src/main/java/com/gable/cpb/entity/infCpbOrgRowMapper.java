package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class infCpbOrgRowMapper implements RowMapper<infCpbOrg> {

	@Override
	public infCpbOrg mapRow(ResultSet row, int rowNum) throws SQLException {
		infCpbOrg entity = new infCpbOrg();
		entity.setId(row.getLong("ID"));
		entity.setSource(row.getString("SOURCE"));
		entity.setInfInDatetime(row.getDate("INF_IN_DATETIME"));
		entity.setInfOutDatetime(row.getDate("INF_OUT_DATETIME"));
		entity.setInfOutStatus(row.getInt("INF_OUT_STATUS"));
		entity.setInfOutMsg(row.getString("INF_OUT_MSG"));
		entity.setOrgCode(row.getString("ORG_CODE"));
		entity.setOrgName(row.getString("ORG_NAME"));
		entity.setOrgSname(row.getString("ORG_SNAME"));
		entity.setOrgCodeRef(row.getString("ORG_CODE_REF"));
		entity.setOrgType(row.getInt("ORG_TYPE"));
		entity.setStatus(row.getInt("STATUS"));
		return entity;
	}

}
