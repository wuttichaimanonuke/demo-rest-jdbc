package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbDocTypeOneRowMapper implements RowMapper<CpbDocTypeOne> {

	@Override
	public CpbDocTypeOne mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbDocTypeOne entity = new CpbDocTypeOne();
		entity.setDtOneId(row.getLong("DT_ONE_ID"));
		entity.setDtOneMainId(row.getLong("DT_ONE_MAIN_ID"));
		entity.setDtOneNameEn(row.getString("DT_ONE_NAME_EN"));
		entity.setDtOneName(row.getString("DT_ONE_NAME"));
		entity.setDtOneFolderName(row.getString("DT_ONE_FOLDER_NAME"));
		entity.setDtOneAge(row.getInt("DT_ONE_AGE"));
		entity.setDtOneKeepFor(row.getInt("DT_ONE_KEEP_FOR"));
		entity.setDtOneNeedScan(row.getInt("DT_ONE_NEED_SCAN"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
