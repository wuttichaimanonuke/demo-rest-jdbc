package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdChangeDocOwnerItemRowMapper implements RowMapper<EdChangeDocOwnerItem> {

	@Override
	public EdChangeDocOwnerItem mapRow(ResultSet row, int rowNum) throws SQLException {
		EdChangeDocOwnerItem entity = new EdChangeDocOwnerItem();
		entity.setCdoiId(row.getInt("CDOI_ID"));
		entity.setCdoiCdoId(row.getInt("CDOI_CDO_ID"));
		entity.setCdoiDocId(row.getString("CDOI_DOC_ID"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setCdoiStatus(row.getInt("CDOI_STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		return entity;
	}

}
