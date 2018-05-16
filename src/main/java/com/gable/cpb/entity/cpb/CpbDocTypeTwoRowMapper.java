package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbDocTypeTwoRowMapper implements RowMapper<CpbDocTypeTwo> {

	@Override
	public CpbDocTypeTwo mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbDocTypeTwo entity = new CpbDocTypeTwo();
		entity.setDtTwoId(row.getLong("DT_TWO_ID"));
		entity.setDtTwoOneId(row.getLong("DT_TWO_ONE_ID"));
		entity.setDtTwoMainId(row.getLong("DT_TWO_MAIN_ID"));
		entity.setDtTwoName(row.getString("DT_TWO_NAME"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setDtTwoOcr(row.getInt("DT_TWO_OCR"));
		return entity;
	}

}
