package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbTrCloseRowMapper implements RowMapper<esbTrClose> {

	@Override
	public esbTrClose mapRow(ResultSet row, int rowNum) throws SQLException {
		esbTrClose entity = new esbTrClose();
		entity.setCtId(row.getLong("CT_ID"));
		entity.setTrId(row.getLong("TR_ID"));
		entity.setStoreType(row.getInt("STORE_TYPE"));
		entity.setOwnerOrg(row.getLong("OWNER_ORG"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setRwReqNo(row.getString("RW_REQ_NO"));
		entity.setAttBkId(row.getLong("ATT_BK_ID"));
		return entity;
	}

}
