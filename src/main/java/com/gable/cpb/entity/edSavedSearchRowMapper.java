package com.gable.cpb.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class edSavedSearchRowMapper implements RowMapper<edSavedSearch> {

	@Override
	public edSavedSearch mapRow(ResultSet row, int rowNum) throws SQLException {
		edSavedSearch entity = new edSavedSearch();
		entity.setSsId(row.getLong("SS_ID"));
		entity.setSsUserId(row.getLong("SS_USER_ID"));
		entity.setSsName(row.getString("SS_NAME"));
		entity.setSsDesc(row.getString("SS_DESC"));
		entity.setSsSearch(row.getString("SS_SEARCH"));
		entity.setSsDocName(row.getInt("SS_DOC_NAME"));
		entity.setSsSubject(row.getInt("SS_SUBJECT"));
		entity.setSsDetail(row.getInt("SS_DETAIL"));
		entity.setSsRemark(row.getInt("SS_REMARK"));
		entity.setSsDateType(row.getInt("SS_DATE_TYPE"));
		entity.setSsDateFrom(row.getDate("SS_DATE_FROM"));
		entity.setSsDateTo(row.getDate("SS_DATE_TO"));
		entity.setSsFormatW(row.getInt("SS_FORMAT_W"));
		entity.setSsFormatE(row.getInt("SS_FORMAT_E"));
		entity.setSsFormatPP(row.getInt("SS_FORMAT_PP"));
		entity.setSsFormatPdf(row.getInt("SS_FORMAT_PDF"));
		entity.setSsFormatPic(row.getInt("SS_FORMAT_PIC"));
		entity.setSsFormatOther(row.getInt("SS_FORMAT_OTHER"));
		entity.setSsFormatOtherD(row.getString("SS_FORMAT_OTHER_D"));
		entity.setSsBarcode(row.getString("SS_BARCODE"));
		entity.setSsDocTypeMain(row.getLong("SS_DOC_TYPE_MAIN"));
		entity.setSsDocTypeOne(row.getLong("SS_DOC_TYPE_ONE"));
		entity.setSsDocTypeTwo(row.getLong("SS_DOC_TYPE_TWO"));
		entity.setSsDocTypeSearch(row.getInt("SS_DOC_TYPE_SEARCH"));
		entity.setSsOrgOwner(row.getLong("SS_ORG_OWNER"));
		entity.setSsOrgHost(row.getLong("SS_ORG_HOST"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setCreateUser(row.getString("CREATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		return entity;
	}

}
