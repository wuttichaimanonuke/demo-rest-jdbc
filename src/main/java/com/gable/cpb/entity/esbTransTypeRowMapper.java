package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class esbTransTypeRowMapper implements RowMapper<esbTransType> {

	@Override
	public esbTransType mapRow(ResultSet row, int rowNum) throws SQLException {
		esbTransType entity = new esbTransType();
		entity.setTrTypeId(row.getLong("TR_TYPE_ID"));
		entity.setTrTypeName(row.getString("TR_TYPE_NAME"));
		entity.setTagStart(row.getString("TAG_START"));
		entity.setTagEnd(row.getString("TAG_END"));
		return entity;
	}

}
