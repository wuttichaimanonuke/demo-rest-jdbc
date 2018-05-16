package com.gable.cpb.entity.cpb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CpbDocOperationRowMapper implements RowMapper<CpbDocOperation> {

	@Override
	public CpbDocOperation mapRow(ResultSet row, int rowNum) throws SQLException {
		CpbDocOperation entity = new CpbDocOperation();
		entity.setDocId(row.getString("DOC_ID"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setRePermisStatus(row.getInt("RE_PERMIS_STATUS"));
		entity.setRePermisDatetime(row.getDate("RE_PERMIS_DATETIME"));
		entity.setReIndexStatus(row.getInt("RE_INDEX_STATUS"));
		entity.setReIndexDatetime(row.getDate("RE_INDEX_DATETIME"));
		return entity;
	}

}
