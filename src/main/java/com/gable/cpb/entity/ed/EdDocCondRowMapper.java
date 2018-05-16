package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdDocCondRowMapper implements RowMapper<EdDocCond> {

	@Override
	public EdDocCond mapRow(ResultSet row, int rowNum) throws SQLException {
		EdDocCond entity = new EdDocCond();
		entity.setDcId(row.getLong("DC_ID"));
		entity.setDcDocId(row.getString("DC_DOC_ID"));
		entity.setDcType(row.getInt("DC_TYPE"));
		entity.setDcDesc(row.getString("DC_DESC"));
		entity.setDcPage(row.getInt("DC_PAGE"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setDcReqNo(row.getString("DC_REQ_NO"));
		entity.setDcFormat(row.getInt("DC_FORMAT"));
		return entity;
	}

}
