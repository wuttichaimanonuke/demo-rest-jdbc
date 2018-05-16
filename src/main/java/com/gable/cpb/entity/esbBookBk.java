package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbBookBk {

	private Long bkId;
	private Integer bkType;
	private String bkSpeed;
	private Date speedDate;
	private String bkSecret;
	private String bkNo;
	private Date bkDate;
	private String bkNoRef;
	private Date bkDateRef;
	private String bkBarcode;
	private String docId;
	private String bkFrom;
	private String bkTo;
	private String bkSubject;
	private String bkDesc;
	private String bkRefer;
	private String bkAttach;
	private String bkRemark;
	private Long grpId;
	private Long flowId;
	private Long createOrg;
	private Long ownerOrg;
	private Integer bkStatus;
	private String updateUser;
	private Date updateDatetime;
	private Long createRole;
	private Long createUser;
	private Long holdOrg;
	private Long holdRole;
	private Long holdUser;
	private Long waitStampOrg;
	private Long waitRecallRole;
	private Integer waitStampType;
	private Long waitRecallUser;
	private Integer currentBox;
	private Long currentBoxOrg;
	private Long currentBoxRole;
	private Long currentBoxUser;
	private String docBarcode;
	private Integer closeFlag;
	private Integer flowPermitFlag;
	private Date createDatetime;
	private Long lastTrSend;
	private Long lastTrStamp;
	private Long lastTrBknoReq;
	private Long lastTrClose;
	private Long lastTr;

	@JsonIgnore

	public esbBookBk() {
		super();
	}

	public esbBookBk(Long bkId, Integer bkType, String bkSpeed, Date speedDate, String bkSecret, String bkNo, Date bkDate, String bkNoRef, Date bkDateRef, String bkBarcode, String docId, String bkFrom, String bkTo, String bkSubject, String bkDesc, String bkRefer, String bkAttach, String bkRemark, Long grpId, Long flowId, Long createOrg, Long ownerOrg, Integer bkStatus, String updateUser, Date updateDatetime, Long createRole, Long createUser, Long holdOrg, Long holdRole, Long holdUser, Long waitStampOrg, Long waitRecallRole, Integer waitStampType, Long waitRecallUser, Integer currentBox, Long currentBoxOrg, Long currentBoxRole, Long currentBoxUser, String docBarcode, Integer closeFlag, Integer flowPermitFlag, Date createDatetime, Long lastTrSend, Long lastTrStamp, Long lastTrBknoReq, Long lastTrClose, Long lastTr) {
		super();
		this.bkId = bkId;
		this.bkType = bkType;
		this.bkSpeed = bkSpeed;
		this.speedDate = speedDate;
		this.bkSecret = bkSecret;
		this.bkNo = bkNo;
		this.bkDate = bkDate;
		this.bkNoRef = bkNoRef;
		this.bkDateRef = bkDateRef;
		this.bkBarcode = bkBarcode;
		this.docId = docId;
		this.bkFrom = bkFrom;
		this.bkTo = bkTo;
		this.bkSubject = bkSubject;
		this.bkDesc = bkDesc;
		this.bkRefer = bkRefer;
		this.bkAttach = bkAttach;
		this.bkRemark = bkRemark;
		this.grpId = grpId;
		this.flowId = flowId;
		this.createOrg = createOrg;
		this.ownerOrg = ownerOrg;
		this.bkStatus = bkStatus;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.createRole = createRole;
		this.createUser = createUser;
		this.holdOrg = holdOrg;
		this.holdRole = holdRole;
		this.holdUser = holdUser;
		this.waitStampOrg = waitStampOrg;
		this.waitRecallRole = waitRecallRole;
		this.waitStampType = waitStampType;
		this.waitRecallUser = waitRecallUser;
		this.currentBox = currentBox;
		this.currentBoxOrg = currentBoxOrg;
		this.currentBoxRole = currentBoxRole;
		this.currentBoxUser = currentBoxUser;
		this.docBarcode = docBarcode;
		this.closeFlag = closeFlag;
		this.flowPermitFlag = flowPermitFlag;
		this.createDatetime = createDatetime;
		this.lastTrSend = lastTrSend;
		this.lastTrStamp = lastTrStamp;
		this.lastTrBknoReq = lastTrBknoReq;
		this.lastTrClose = lastTrClose;
		this.lastTr = lastTr;
	}

	public Long getBkId() {
		return bkId;
	}

	public Integer getBkType() {
		return bkType;
	}

	public String getBkSpeed() {
		return bkSpeed;
	}

	public Date getSpeedDate() {
		return speedDate;
	}

	public String getBkSecret() {
		return bkSecret;
	}

	public String getBkNo() {
		return bkNo;
	}

	public Date getBkDate() {
		return bkDate;
	}

	public String getBkNoRef() {
		return bkNoRef;
	}

	public Date getBkDateRef() {
		return bkDateRef;
	}

	public String getBkBarcode() {
		return bkBarcode;
	}

	public String getDocId() {
		return docId;
	}

	public String getBkFrom() {
		return bkFrom;
	}

	public String getBkTo() {
		return bkTo;
	}

	public String getBkSubject() {
		return bkSubject;
	}

	public String getBkDesc() {
		return bkDesc;
	}

	public String getBkRefer() {
		return bkRefer;
	}

	public String getBkAttach() {
		return bkAttach;
	}

	public String getBkRemark() {
		return bkRemark;
	}

	public Long getGrpId() {
		return grpId;
	}

	public Long getFlowId() {
		return flowId;
	}

	public Long getCreateOrg() {
		return createOrg;
	}

	public Long getOwnerOrg() {
		return ownerOrg;
	}

	public Integer getBkStatus() {
		return bkStatus;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public Long getCreateRole() {
		return createRole;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public Long getHoldOrg() {
		return holdOrg;
	}

	public Long getHoldRole() {
		return holdRole;
	}

	public Long getHoldUser() {
		return holdUser;
	}

	public Long getWaitStampOrg() {
		return waitStampOrg;
	}

	public Long getWaitRecallRole() {
		return waitRecallRole;
	}

	public Integer getWaitStampType() {
		return waitStampType;
	}

	public Long getWaitRecallUser() {
		return waitRecallUser;
	}

	public Integer getCurrentBox() {
		return currentBox;
	}

	public Long getCurrentBoxOrg() {
		return currentBoxOrg;
	}

	public Long getCurrentBoxRole() {
		return currentBoxRole;
	}

	public Long getCurrentBoxUser() {
		return currentBoxUser;
	}

	public String getDocBarcode() {
		return docBarcode;
	}

	public Integer getCloseFlag() {
		return closeFlag;
	}

	public Integer getFlowPermitFlag() {
		return flowPermitFlag;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public Long getLastTrSend() {
		return lastTrSend;
	}

	public Long getLastTrStamp() {
		return lastTrStamp;
	}

	public Long getLastTrBknoReq() {
		return lastTrBknoReq;
	}

	public Long getLastTrClose() {
		return lastTrClose;
	}

	public Long getLastTr() {
		return lastTr;
	}

	public void setBkId(Long bkId) {
		this.bkId = bkId;
	}

	public void setBkType(Integer bkType) {
		this.bkType = bkType;
	}

	public void setBkSpeed(String bkSpeed) {
		this.bkSpeed = bkSpeed;
	}

	public void setSpeedDate(Date speedDate) {
		this.speedDate = speedDate;
	}

	public void setBkSecret(String bkSecret) {
		this.bkSecret = bkSecret;
	}

	public void setBkNo(String bkNo) {
		this.bkNo = bkNo;
	}

	public void setBkDate(Date bkDate) {
		this.bkDate = bkDate;
	}

	public void setBkNoRef(String bkNoRef) {
		this.bkNoRef = bkNoRef;
	}

	public void setBkDateRef(Date bkDateRef) {
		this.bkDateRef = bkDateRef;
	}

	public void setBkBarcode(String bkBarcode) {
		this.bkBarcode = bkBarcode;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public void setBkFrom(String bkFrom) {
		this.bkFrom = bkFrom;
	}

	public void setBkTo(String bkTo) {
		this.bkTo = bkTo;
	}

	public void setBkSubject(String bkSubject) {
		this.bkSubject = bkSubject;
	}

	public void setBkDesc(String bkDesc) {
		this.bkDesc = bkDesc;
	}

	public void setBkRefer(String bkRefer) {
		this.bkRefer = bkRefer;
	}

	public void setBkAttach(String bkAttach) {
		this.bkAttach = bkAttach;
	}

	public void setBkRemark(String bkRemark) {
		this.bkRemark = bkRemark;
	}

	public void setGrpId(Long grpId) {
		this.grpId = grpId;
	}

	public void setFlowId(Long flowId) {
		this.flowId = flowId;
	}

	public void setCreateOrg(Long createOrg) {
		this.createOrg = createOrg;
	}

	public void setOwnerOrg(Long ownerOrg) {
		this.ownerOrg = ownerOrg;
	}

	public void setBkStatus(Integer bkStatus) {
		this.bkStatus = bkStatus;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setCreateRole(Long createRole) {
		this.createRole = createRole;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public void setHoldOrg(Long holdOrg) {
		this.holdOrg = holdOrg;
	}

	public void setHoldRole(Long holdRole) {
		this.holdRole = holdRole;
	}

	public void setHoldUser(Long holdUser) {
		this.holdUser = holdUser;
	}

	public void setWaitStampOrg(Long waitStampOrg) {
		this.waitStampOrg = waitStampOrg;
	}

	public void setWaitRecallRole(Long waitRecallRole) {
		this.waitRecallRole = waitRecallRole;
	}

	public void setWaitStampType(Integer waitStampType) {
		this.waitStampType = waitStampType;
	}

	public void setWaitRecallUser(Long waitRecallUser) {
		this.waitRecallUser = waitRecallUser;
	}

	public void setCurrentBox(Integer currentBox) {
		this.currentBox = currentBox;
	}

	public void setCurrentBoxOrg(Long currentBoxOrg) {
		this.currentBoxOrg = currentBoxOrg;
	}

	public void setCurrentBoxRole(Long currentBoxRole) {
		this.currentBoxRole = currentBoxRole;
	}

	public void setCurrentBoxUser(Long currentBoxUser) {
		this.currentBoxUser = currentBoxUser;
	}

	public void setDocBarcode(String docBarcode) {
		this.docBarcode = docBarcode;
	}

	public void setCloseFlag(Integer closeFlag) {
		this.closeFlag = closeFlag;
	}

	public void setFlowPermitFlag(Integer flowPermitFlag) {
		this.flowPermitFlag = flowPermitFlag;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public void setLastTrSend(Long lastTrSend) {
		this.lastTrSend = lastTrSend;
	}

	public void setLastTrStamp(Long lastTrStamp) {
		this.lastTrStamp = lastTrStamp;
	}

	public void setLastTrBknoReq(Long lastTrBknoReq) {
		this.lastTrBknoReq = lastTrBknoReq;
	}

	public void setLastTrClose(Long lastTrClose) {
		this.lastTrClose = lastTrClose;
	}

	public void setLastTr(Long lastTr) {
		this.lastTr = lastTr;
	}


	@Override
	public String toString() {
		return "esbBookBk [bkId = " + bkId + ", bkType = " + bkType + ", bkSpeed = " + bkSpeed + ", speedDate = " + speedDate + ", bkSecret = " + bkSecret + ", bkNo = " + bkNo + ", bkDate = " + bkDate + ", bkNoRef = " + bkNoRef + ", bkDateRef = " + bkDateRef + ", bkBarcode = " + bkBarcode + ", docId = " + docId + ", bkFrom = " + bkFrom + ", bkTo = " + bkTo + ", bkSubject = " + bkSubject + ", bkDesc = " + bkDesc + ", bkRefer = " + bkRefer + ", bkAttach = " + bkAttach + ", bkRemark = " + bkRemark + ", grpId = " + grpId + ", flowId = " + flowId + ", createOrg = " + createOrg + ", ownerOrg = " + ownerOrg + ", bkStatus = " + bkStatus + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", createRole = " + createRole + ", createUser = " + createUser + ", holdOrg = " + holdOrg + ", holdRole = " + holdRole + ", holdUser = " + holdUser + ", waitStampOrg = " + waitStampOrg + ", waitRecallRole = " + waitRecallRole + ", waitStampType = " + waitStampType + ", waitRecallUser = " + waitRecallUser + ", currentBox = " + currentBox + ", currentBoxOrg = " + currentBoxOrg + ", currentBoxRole = " + currentBoxRole + ", currentBoxUser = " + currentBoxUser + ", docBarcode = " + docBarcode + ", closeFlag = " + closeFlag + ", flowPermitFlag = " + flowPermitFlag + ", createDatetime = " + createDatetime + ", lastTrSend = " + lastTrSend + ", lastTrStamp = " + lastTrStamp + ", lastTrBknoReq = " + lastTrBknoReq + ", lastTrClose = " + lastTrClose + ", lastTr = " + lastTr + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bkAttach == null) ? 0 : bkAttach.hashCode());
		result = prime * result + ((bkBarcode == null) ? 0 : bkBarcode.hashCode());
		result = prime * result + ((bkDate == null) ? 0 : bkDate.hashCode());
		result = prime * result + ((bkDateRef == null) ? 0 : bkDateRef.hashCode());
		result = prime * result + ((bkDesc == null) ? 0 : bkDesc.hashCode());
		result = prime * result + ((bkFrom == null) ? 0 : bkFrom.hashCode());
		result = prime * result + ((bkId == null) ? 0 : bkId.hashCode());
		result = prime * result + ((bkNo == null) ? 0 : bkNo.hashCode());
		result = prime * result + ((bkNoRef == null) ? 0 : bkNoRef.hashCode());
		result = prime * result + ((bkRefer == null) ? 0 : bkRefer.hashCode());
		result = prime * result + ((bkRemark == null) ? 0 : bkRemark.hashCode());
		result = prime * result + ((bkSecret == null) ? 0 : bkSecret.hashCode());
		result = prime * result + ((bkSpeed == null) ? 0 : bkSpeed.hashCode());
		result = prime * result + ((bkStatus == null) ? 0 : bkStatus.hashCode());
		result = prime * result + ((bkSubject == null) ? 0 : bkSubject.hashCode());
		result = prime * result + ((bkTo == null) ? 0 : bkTo.hashCode());
		result = prime * result + ((bkType == null) ? 0 : bkType.hashCode());
		result = prime * result + ((closeFlag == null) ? 0 : closeFlag.hashCode());
		result = prime * result + ((createDatetime == null) ? 0 : createDatetime.hashCode());
		result = prime * result + ((createOrg == null) ? 0 : createOrg.hashCode());
		result = prime * result + ((createRole == null) ? 0 : createRole.hashCode());
		result = prime * result + ((createUser == null) ? 0 : createUser.hashCode());
		result = prime * result + ((currentBox == null) ? 0 : currentBox.hashCode());
		result = prime * result + ((currentBoxOrg == null) ? 0 : currentBoxOrg.hashCode());
		result = prime * result + ((currentBoxRole == null) ? 0 : currentBoxRole.hashCode());
		result = prime * result + ((currentBoxUser == null) ? 0 : currentBoxUser.hashCode());
		result = prime * result + ((docBarcode == null) ? 0 : docBarcode.hashCode());
		result = prime * result + ((docId == null) ? 0 : docId.hashCode());
		result = prime * result + ((flowId == null) ? 0 : flowId.hashCode());
		result = prime * result + ((flowPermitFlag == null) ? 0 : flowPermitFlag.hashCode());
		result = prime * result + ((grpId == null) ? 0 : grpId.hashCode());
		result = prime * result + ((holdOrg == null) ? 0 : holdOrg.hashCode());
		result = prime * result + ((holdRole == null) ? 0 : holdRole.hashCode());
		result = prime * result + ((holdUser == null) ? 0 : holdUser.hashCode());
		result = prime * result + ((lastTr == null) ? 0 : lastTr.hashCode());
		result = prime * result + ((lastTrBknoReq == null) ? 0 : lastTrBknoReq.hashCode());
		result = prime * result + ((lastTrClose == null) ? 0 : lastTrClose.hashCode());
		result = prime * result + ((lastTrSend == null) ? 0 : lastTrSend.hashCode());
		result = prime * result + ((lastTrStamp == null) ? 0 : lastTrStamp.hashCode());
		result = prime * result + ((ownerOrg == null) ? 0 : ownerOrg.hashCode());
		result = prime * result + ((speedDate == null) ? 0 : speedDate.hashCode());
		result = prime * result + ((updateDatetime == null) ? 0 : updateDatetime.hashCode());
		result = prime * result + ((updateUser == null) ? 0 : updateUser.hashCode());
		result = prime * result + ((waitRecallRole == null) ? 0 : waitRecallRole.hashCode());
		result = prime * result + ((waitRecallUser == null) ? 0 : waitRecallUser.hashCode());
		result = prime * result + ((waitStampOrg == null) ? 0 : waitStampOrg.hashCode());
		result = prime * result + ((waitStampType == null) ? 0 : waitStampType.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		esbBookBk other = (esbBookBk) obj;
		if (bkAttach == null) {
			if (other.bkAttach != null)
				return false;
		} else if (!bkAttach.equals(other.bkAttach))
			return false;
		if (bkBarcode == null) {
			if (other.bkBarcode != null)
				return false;
		} else if (!bkBarcode.equals(other.bkBarcode))
			return false;
		if (bkDate == null) {
			if (other.bkDate != null)
				return false;
		} else if (!bkDate.equals(other.bkDate))
			return false;
		if (bkDateRef == null) {
			if (other.bkDateRef != null)
				return false;
		} else if (!bkDateRef.equals(other.bkDateRef))
			return false;
		if (bkDesc == null) {
			if (other.bkDesc != null)
				return false;
		} else if (!bkDesc.equals(other.bkDesc))
			return false;
		if (bkFrom == null) {
			if (other.bkFrom != null)
				return false;
		} else if (!bkFrom.equals(other.bkFrom))
			return false;
		if (bkId == null) {
			if (other.bkId != null)
				return false;
		} else if (!bkId.equals(other.bkId))
			return false;
		if (bkNo == null) {
			if (other.bkNo != null)
				return false;
		} else if (!bkNo.equals(other.bkNo))
			return false;
		if (bkNoRef == null) {
			if (other.bkNoRef != null)
				return false;
		} else if (!bkNoRef.equals(other.bkNoRef))
			return false;
		if (bkRefer == null) {
			if (other.bkRefer != null)
				return false;
		} else if (!bkRefer.equals(other.bkRefer))
			return false;
		if (bkRemark == null) {
			if (other.bkRemark != null)
				return false;
		} else if (!bkRemark.equals(other.bkRemark))
			return false;
		if (bkSecret == null) {
			if (other.bkSecret != null)
				return false;
		} else if (!bkSecret.equals(other.bkSecret))
			return false;
		if (bkSpeed == null) {
			if (other.bkSpeed != null)
				return false;
		} else if (!bkSpeed.equals(other.bkSpeed))
			return false;
		if (bkStatus == null) {
			if (other.bkStatus != null)
				return false;
		} else if (!bkStatus.equals(other.bkStatus))
			return false;
		if (bkSubject == null) {
			if (other.bkSubject != null)
				return false;
		} else if (!bkSubject.equals(other.bkSubject))
			return false;
		if (bkTo == null) {
			if (other.bkTo != null)
				return false;
		} else if (!bkTo.equals(other.bkTo))
			return false;
		if (bkType == null) {
			if (other.bkType != null)
				return false;
		} else if (!bkType.equals(other.bkType))
			return false;
		if (closeFlag == null) {
			if (other.closeFlag != null)
				return false;
		} else if (!closeFlag.equals(other.closeFlag))
			return false;
		if (createDatetime == null) {
			if (other.createDatetime != null)
				return false;
		} else if (!createDatetime.equals(other.createDatetime))
			return false;
		if (createOrg == null) {
			if (other.createOrg != null)
				return false;
		} else if (!createOrg.equals(other.createOrg))
			return false;
		if (createRole == null) {
			if (other.createRole != null)
				return false;
		} else if (!createRole.equals(other.createRole))
			return false;
		if (createUser == null) {
			if (other.createUser != null)
				return false;
		} else if (!createUser.equals(other.createUser))
			return false;
		if (currentBox == null) {
			if (other.currentBox != null)
				return false;
		} else if (!currentBox.equals(other.currentBox))
			return false;
		if (currentBoxOrg == null) {
			if (other.currentBoxOrg != null)
				return false;
		} else if (!currentBoxOrg.equals(other.currentBoxOrg))
			return false;
		if (currentBoxRole == null) {
			if (other.currentBoxRole != null)
				return false;
		} else if (!currentBoxRole.equals(other.currentBoxRole))
			return false;
		if (currentBoxUser == null) {
			if (other.currentBoxUser != null)
				return false;
		} else if (!currentBoxUser.equals(other.currentBoxUser))
			return false;
		if (docBarcode == null) {
			if (other.docBarcode != null)
				return false;
		} else if (!docBarcode.equals(other.docBarcode))
			return false;
		if (docId == null) {
			if (other.docId != null)
				return false;
		} else if (!docId.equals(other.docId))
			return false;
		if (flowId == null) {
			if (other.flowId != null)
				return false;
		} else if (!flowId.equals(other.flowId))
			return false;
		if (flowPermitFlag == null) {
			if (other.flowPermitFlag != null)
				return false;
		} else if (!flowPermitFlag.equals(other.flowPermitFlag))
			return false;
		if (grpId == null) {
			if (other.grpId != null)
				return false;
		} else if (!grpId.equals(other.grpId))
			return false;
		if (holdOrg == null) {
			if (other.holdOrg != null)
				return false;
		} else if (!holdOrg.equals(other.holdOrg))
			return false;
		if (holdRole == null) {
			if (other.holdRole != null)
				return false;
		} else if (!holdRole.equals(other.holdRole))
			return false;
		if (holdUser == null) {
			if (other.holdUser != null)
				return false;
		} else if (!holdUser.equals(other.holdUser))
			return false;
		if (lastTr == null) {
			if (other.lastTr != null)
				return false;
		} else if (!lastTr.equals(other.lastTr))
			return false;
		if (lastTrBknoReq == null) {
			if (other.lastTrBknoReq != null)
				return false;
		} else if (!lastTrBknoReq.equals(other.lastTrBknoReq))
			return false;
		if (lastTrClose == null) {
			if (other.lastTrClose != null)
				return false;
		} else if (!lastTrClose.equals(other.lastTrClose))
			return false;
		if (lastTrSend == null) {
			if (other.lastTrSend != null)
				return false;
		} else if (!lastTrSend.equals(other.lastTrSend))
			return false;
		if (lastTrStamp == null) {
			if (other.lastTrStamp != null)
				return false;
		} else if (!lastTrStamp.equals(other.lastTrStamp))
			return false;
		if (ownerOrg == null) {
			if (other.ownerOrg != null)
				return false;
		} else if (!ownerOrg.equals(other.ownerOrg))
			return false;
		if (speedDate == null) {
			if (other.speedDate != null)
				return false;
		} else if (!speedDate.equals(other.speedDate))
			return false;
		if (updateDatetime == null) {
			if (other.updateDatetime != null)
				return false;
		} else if (!updateDatetime.equals(other.updateDatetime))
			return false;
		if (updateUser == null) {
			if (other.updateUser != null)
				return false;
		} else if (!updateUser.equals(other.updateUser))
			return false;
		if (waitRecallRole == null) {
			if (other.waitRecallRole != null)
				return false;
		} else if (!waitRecallRole.equals(other.waitRecallRole))
			return false;
		if (waitRecallUser == null) {
			if (other.waitRecallUser != null)
				return false;
		} else if (!waitRecallUser.equals(other.waitRecallUser))
			return false;
		if (waitStampOrg == null) {
			if (other.waitStampOrg != null)
				return false;
		} else if (!waitStampOrg.equals(other.waitStampOrg))
			return false;
		if (waitStampType == null) {
			if (other.waitStampType != null)
				return false;
		} else if (!waitStampType.equals(other.waitStampType))
			return false;
		return true;
	}

}