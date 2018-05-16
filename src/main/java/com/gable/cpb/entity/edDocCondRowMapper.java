package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class edDocCondRowMapper implements RowMapper<edDocCond> {

	@Override
	public edDocCond mapRow(ResultSet row, int rowNum) throws SQLException {
		edDocCond entity = new edDocCond();
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
