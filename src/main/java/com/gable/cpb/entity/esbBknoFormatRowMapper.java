package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbBknoFormatRowMapper implements RowMapper<esbBknoFormat> {

	@Override
	public esbBknoFormat mapRow(ResultSet row, int rowNum) throws SQLException {
		esbBknoFormat entity = new esbBknoFormat();
		entity.setCtId(row.getLong("CT_ID"));
		entity.setFmSeq(row.getLong("FM_SEQ"));
		entity.setFmType(row.getInt("FM_TYPE"));
		entity.setFmText(row.getString("FM_TEXT"));
		entity.setFmId(row.getLong("FM_ID"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
