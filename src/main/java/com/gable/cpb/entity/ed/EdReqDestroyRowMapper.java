package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdReqDestroyRowMapper implements RowMapper<EdReqDestroy> {

	@Override
	public EdReqDestroy mapRow(ResultSet row, int rowNum) throws SQLException {
		EdReqDestroy entity = new EdReqDestroy();
		entity.setRdReqNo(row.getString("RD_REQ_NO"));
		entity.setRdDocId(row.getString("RD_DOC_ID"));
		entity.setRdDesStatus(row.getInt("RD_DES_STATUS"));
		entity.setRdDesConfirmDate(row.getDate("RD_DES_CONFIRM_DATE"));
		entity.setRdDesConfirmUser(row.getString("RD_DES_CONFIRM_USER"));
		entity.setRdDesBkNo(row.getString("RD_DES_BK_NO"));
		entity.setRdDesType(row.getInt("RD_DES_TYPE"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setRdDocHasPhy(row.getInt("RD_DOC_HAS_PHY"));
		entity.setRdDesElectronic(row.getInt("RD_DES_ELECTRONIC"));
		return entity;
	}

}
