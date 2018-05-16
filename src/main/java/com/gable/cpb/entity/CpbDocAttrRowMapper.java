package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbDocAttrRowMapper implements RowMapper<CpbDocAttr> {

	@Override
	public CpbDocAttr mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbDocAttr entity = new CpbDocAttr();
		entity.setDaId(row.getLong("DA_ID"));
		entity.setDaCode(row.getString("DA_CODE"));
		entity.setDaNmae(row.getString("DA_NAME"));
		entity.setDaRequired(row.getInt("DA_REQUIRED"));
		entity.setDaOrder(row.getInt("DA_ORDER"));
		entity.setDaType(row.getInt("DA_TYPE"));
		entity.setDaTypeItem(row.getString("DA_TYPE_ITEM"));
		entity.setDaTypeLookup(row.getString("DA_TYPE_LOOKUP"));
		entity.setDaTypeLen(row.getInt("DA_TYPE_LEN"));
		entity.setDaEditable(row.getInt("DA_EDITABLE"));
		entity.setDaShowable(row.getInt("DA_SHOWABLE"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
