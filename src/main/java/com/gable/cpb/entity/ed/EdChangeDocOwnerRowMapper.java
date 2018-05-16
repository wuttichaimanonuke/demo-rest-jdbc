package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdChangeDocOwnerRowMapper implements RowMapper<EdChangeDocOwner> {

	@Override
	public EdChangeDocOwner mapRow(ResultSet row, int rowNum) throws SQLException {
		EdChangeDocOwner entity = new EdChangeDocOwner();
		entity.setCdoId(row.getInt("CDO_ID"));
		entity.setCdoOldOwnerOrgId(row.getInt("CDO_OLD_OWNER_ORG_ID"));
		entity.setCdoNewOwnerOrgId(row.getInt("CDO_NEW_OWNER_ORG_ID"));
		entity.setCdoObjectiveId(row.getInt("CDO_OBJECTIVE_ID"));
		entity.setCdoDesc(row.getString("CDO_DESC"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setCdoStatus(row.getInt("CDO_STATUS"));
		entity.setCdoItemCount(row.getInt("CDO_ITEM_COUNT"));
		entity.setCreateRole(row.getInt("CREATE_ROLE"));
		entity.setCdoProcNote(row.getString("CDO_PROC_NOTE"));
		return entity;
	}

}
