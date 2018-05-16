package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbConfDocNameRowMapper implements RowMapper<CpbConfDocName> {

	@Override
	public CpbConfDocName mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbConfDocName entity = new CpbConfDocName();
		entity.setDnObjType(row.getString("DN_OBJ_TYPE"));
		entity.setDnFirst(row.getString("DN_FIRST"));
		entity.setDnSecond(row.getString("DN_SECOND"));
		entity.setDnThird(row.getString("DN_THIRD"));
		entity.setDnFourth(row.getString("DN_FOURTH"));
		entity.setDnFifth(row.getString("DN_FIFTH"));
		entity.setDnSixth(row.getString("DN_SIXTH"));
		return entity;
	}

}
