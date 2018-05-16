package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbTrCloseRowMapper implements RowMapper<EsbTrClose> {

	@Override
	public EsbTrClose mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbTrClose entity = new EsbTrClose();
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
