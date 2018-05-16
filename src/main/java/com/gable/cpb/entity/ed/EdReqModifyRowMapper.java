package com.gable.cpb.entity.ed;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdReqModifyRowMapper implements RowMapper<EdReqModify> {

	@Override
	public EdReqModify mapRow(ResultSet row, int rowNum) throws SQLException {
		EdReqModify entity = new EdReqModify();
		entity.setRmReqNo(row.getString("RM_REQ_NO"));
		entity.setRmDocId(row.getString("RM_DOC_ID"));
		entity.setRmModAppStatus(row.getInt("RM_MOD_APP_STATUS"));
		entity.setRmModAppStatusDatetime(row.getDate("RM_MOD_APP_STATUS_DATETIME"));
		entity.setRmTypePaper(row.getInt("RM_TYPE_PAPER"));
		entity.setRmTypeEditEdoc(row.getInt("RM_TYPE_EDIT_EDOC"));
		entity.setRmTypeAttr(row.getInt("RM_TYPE_ATTR"));
		entity.setRmTypePerm(row.getInt("RM_TYPE_PERM"));
		entity.setRmTypeRel(row.getInt("RM_TYPE_REL"));
		entity.setRmModConfirmDate(row.getDate("RM_MOD_CONFIRM_DATE"));
		entity.setRmModConfirmUser(row.getString("RM_MOD_CONFIRM_USER"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setRmPickUpUserLongname(row.getString("RM_PICK_UP_USER_LONGNAME"));
		entity.setRmPickUpUser(row.getString("RM_PICK_UP_USER"));
		entity.setRmPickUpDatetime(row.getDate("RM_PICK_UP_DATETIME"));
		entity.setRmRetUser(row.getString("RM_RET_USER"));
		entity.setRmRetUserLongname(row.getString("RM_RET_USER_LONGNAME"));
		entity.setRmRetDatetime(row.getDate("RM_RET_DATETIME"));
		entity.setRmRecUser(row.getString("RM_REC_USER"));
		entity.setRmPermission(row.getString("RM_PERMISSION"));
		return entity;
	}

}
