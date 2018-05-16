package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbTransTypeRowMapper implements RowMapper<EsbTransType> {

	@Override
	public EsbTransType mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbTransType entity = new EsbTransType();
		entity.setTrTypeId(row.getLong("TR_TYPE_ID"));
		entity.setTrTypeName(row.getString("TR_TYPE_NAME"));
		entity.setTagStart(row.getString("TAG_START"));
		entity.setTagEnd(row.getString("TAG_END"));
		return entity;
	}

}
