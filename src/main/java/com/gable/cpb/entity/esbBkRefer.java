package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbBkRefer {

	private Long refId;
	private Long bkId;
	private Integer refType;
	private Long bkIdRef;
	private String docId;
	private String remark;
	private Long addUserId;
	private Date addDatetime;
	private Integer status;
	private String updateUser;
	private Date updateDatetime;
	private Long addRole;

	@JsonIgnore

	public esbBkRefer() {
		super();
	}

	public esbBkRefer(Long refId, Long bkId, Integer refType, Long bkIdRef, String docId, String remark, Long addUserId, Date addDatetime, Integer status, String updateUser, Date updateDatetime, Long addRole) {
		super();
		this.refId = refId;
		this.bkId = bkId;
		this.refType = refType;
		this.bkIdRef = bkIdRef;
		this.docId = docId;
		this.remark = remark;
		this.addUserId = addUserId;
		this.addDatetime = addDatetime;
		this.status = status;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.addRole = addRole;
	}

	public Long getRefId() {
		return refId;
	}

	public Long getBkId() {
		return bkId;
	}

	public Integer getRefType() {
		return refType;
	}

	public Long getBkIdRef() {
		return bkIdRef;
	}

	public String getDocId() {
		return docId;
	}

	public String getRemark() {
		return remark;
	}

	public Long getAddUserId() {
		return addUserId;
	}

	public Date getAddDatetime() {
		return addDatetime;
	}

	public Integer getStatus() {
		return status;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public Long getAddRole() {
		return addRole;
	}

	public void setRefId(Long refId) {
		this.refId = refId;
	}

	public void setBkId(Long bkId) {
		this.bkId = bkId;
	}

	public void setRefType(Integer refType) {
		this.refType = refType;
	}

	public void setBkIdRef(Long bkIdRef) {
		this.bkIdRef = bkIdRef;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setAddUserId(Long addUserId) {
		this.addUserId = addUserId;
	}

	public void setAddDatetime(Date addDatetime) {
		this.addDatetime = addDatetime;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setAddRole(Long addRole) {
		this.addRole = addRole;
	}


	@Override
	public String toString() {
		return "esbBkRefer [refId = " + refId + ", bkId = " + bkId + ", refType = " + refType + ", bkIdRef = " + bkIdRef + ", docId = " + docId + ", remark = " + remark + ", addUserId = " + addUserId + ", addDatetime = " + addDatetime + ", status = " + status + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", addRole = " + addRole + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addDatetime == null) ? 0 : addDatetime.hashCode());
		result = prime * result + ((addRole == null) ? 0 : addRole.hashCode());
		result = prime * result + ((addUserId == null) ? 0 : addUserId.hashCode());
		result = prime * result + ((bkId == null) ? 0 : bkId.hashCode());
		result = prime * result + ((bkIdRef == null) ? 0 : bkIdRef.hashCode());
		result = prime * result + ((docId == null) ? 0 : docId.hashCode());
		result = prime * result + ((refId == null) ? 0 : refId.hashCode());
		result = prime * result + ((refType == null) ? 0 : refType.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((updateDatetime == null) ? 0 : updateDatetime.hashCode());
		result = prime * result + ((updateUser == null) ? 0 : updateUser.hashCode());
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
		esbBkRefer other = (esbBkRefer) obj;
		if (addDatetime == null) {
			if (other.addDatetime != null)
				return false;
		} else if (!addDatetime.equals(other.addDatetime))
			return false;
		if (addRole == null) {
			if (other.addRole != null)
				return false;
		} else if (!addRole.equals(other.addRole))
			return false;
		if (addUserId == null) {
			if (other.addUserId != null)
				return false;
		} else if (!addUserId.equals(other.addUserId))
			return false;
		if (bkId == null) {
			if (other.bkId != null)
				return false;
		} else if (!bkId.equals(other.bkId))
			return false;
		if (bkIdRef == null) {
			if (other.bkIdRef != null)
				return false;
		} else if (!bkIdRef.equals(other.bkIdRef))
			return false;
		if (docId == null) {
			if (other.docId != null)
				return false;
		} else if (!docId.equals(other.docId))
			return false;
		if (refId == null) {
			if (other.refId != null)
				return false;
		} else if (!refId.equals(other.refId))
			return false;
		if (refType == null) {
			if (other.refType != null)
				return false;
		} else if (!refType.equals(other.refType))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
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
		return true;
	}

}