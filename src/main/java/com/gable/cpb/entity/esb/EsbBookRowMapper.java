package com.gable.cpb.entity.esb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EsbBookRowMapper implements RowMapper<EsbBook> {

	@Override
	public EsbBook mapRow(ResultSet row, int rowNum) throws SQLException {
		EsbBook entity = new EsbBook();
		entity.setBkId(row.getLong("BK_ID"));
		entity.setBkType(row.getInt("BK_TYPE"));
		entity.setBkSpeed(row.getString("BK_SPEED"));
		entity.setSpeedDate(row.getDate("SPEED_DATE"));
		entity.setBkSecret(row.getString("BK_SECRET"));
		entity.setBkNo(row.getString("BK_NO"));
		entity.setBkDate(row.getDate("BK_DATE"));
		entity.setBkNoRef(row.getString("BK_NO_REF"));
		entity.setBkDateRef(row.getDate("BK_DATE_REF"));
		entity.setBkBarcode(row.getString("BK_BARCODE"));
		entity.setDocId(row.getString("DOC_ID"));
		entity.setBkFrom(row.getString("BK_FROM"));
		entity.setBkTo(row.getString("BK_TO"));
		entity.setBkSubject(row.getString("BK_SUBJECT"));
		entity.setBkDesc(row.getString("BK_DESC"));
		entity.setBkRefer(row.getString("BK_REFER"));
		entity.setBkAttach(row.getString("BK_ATTACH"));
		entity.setBkRemark(row.getString("BK_REMARK"));
		entity.setGrpId(row.getLong("GRP_ID"));
		entity.setFlowId(row.getLong("FLOW_ID"));
		entity.setCreateOrg(row.getLong("CREATE_ORG"));
		entity.setOwnerOrg(row.getLong("OWNER_ORG"));
		entity.setBkStatus(row.getInt("BK_STATUS"));
		entity.setUpdateUser(row.getString("UPDATE_USER"));
		entity.setUpdateDatetime(row.getDate("UPDATE_DATETIME"));
		entity.setCreateRole(row.getLong("CREATE_ROLE"));
		entity.setCreateUser(row.getLong("CREATE_USER"));
		entity.setHoldOrg(row.getLong("HOLD_ORG"));
		entity.setHoldRole(row.getLong("HOLD_ROLE"));
		entity.setHoldUser(row.getLong("HOLD_USER"));
		entity.setWaitStampOrg(row.getLong("WAIT_STAMP_ORG"));
		entity.setWaitRecallRole(row.getLong("WAIT_RECALL_ROLE"));
		entity.setWaitStampType(row.getInt("WAIT_STAMP_TYPE"));
		entity.setWaitRecallUser(row.getLong("WAIT_RECALL_USER"));
		entity.setCurrentBox(row.getInt("CURRENT_BOX"));
		entity.setCurrentBoxOrg(row.getLong("CURRENT_BOX_ORG"));
		entity.setCurrentBoxRole(row.getLong("CURRENT_BOX_ROLE"));
		entity.setCurrentBoxUser(row.getLong("CURRENT_BOX_USER"));
		entity.setDocBarcode(row.getString("DOC_BARCODE"));
		entity.setCloseFlag(row.getInt("CLOSE_FLAG"));
		entity.setFlowPermitFlag(row.getInt("FLOW_PERMIT_FLAG"));
		entity.setCreateDatetime(row.getDate("CREATE_DATETIME"));
		entity.setLastTrSend(row.getLong("LAST_TR_SEND"));
		entity.setLastTrStamp(row.getLong("LAST_TR_STAMP"));
		entity.setLastTrBknoReq(row.getLong("LAST_TR_BKNO_REQ"));
		entity.setLastTrClose(row.getLong("LAST_TR_CLOSE"));
		entity.setLastTr(row.getLong("LAST_TR"));
		return entity;
	}

}
