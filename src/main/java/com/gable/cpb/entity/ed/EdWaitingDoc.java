package com.gable.cpb.entity.ed;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EdWaitingDoc {

	private String wdReqNo;
	private String wdDocId;
	private Integer wdDocType;
	private Integer wdStatus;
	private Date createDatetime;
	private String createUser;
	private Date updateDatetime;
	private String updateUser;

	@JsonIgnore

	public EdWaitingDoc() {
		super();
	}

	public EdWaitingDoc(String wdReqNo, String wdDocId, Integer wdDocType, Integer wdStatus, Date createDatetime, String createUser, Date updateDatetime, String updateUser) {
		super();
		this.wdReqNo = wdReqNo;
		this.wdDocId = wdDocId;
		this.wdDocType = wdDocType;
		this.wdStatus = wdStatus;
		this.createDatetime = createDatetime;
		this.createUser = createUser;
		this.updateDatetime = updateDatetime;
		this.updateUser = updateUser;
	}

	public String getWdReqNo() {
		return wdReqNo;
	}

	public String getWdDocId() {
		return wdDocId;
	}

	public Integer getWdDocType() {
		return wdDocType;
	}

	public Integer getWdStatus() {
		return wdStatus;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setWdReqNo(String wdReqNo) {
		this.wdReqNo = wdReqNo;
	}

	public void setWdDocId(String wdDocId) {
		this.wdDocId = wdDocId;
	}

	public void setWdDocType(Integer wdDocType) {
		this.wdDocType = wdDocType;
	}

	public void setWdStatus(Integer wdStatus) {
		this.wdStatus = wdStatus;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}


	@Override
	public String toString() {
		return "edWaitingDoc [wdReqNo = " + wdReqNo + ", wdDocId = " + wdDocId + ", wdDocType = " + wdDocType + ", wdStatus = " + wdStatus + ", createDatetime = " + createDatetime + ", createUser = " + createUser + ", updateDatetime = " + updateDatetime + ", updateUser = " + updateUser + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createDatetime == null) ? 0 : createDatetime.hashCode());
		result = prime * result + ((createUser == null) ? 0 : createUser.hashCode());
		result = prime * result + ((updateDatetime == null) ? 0 : updateDatetime.hashCode());
		result = prime * result + ((updateUser == null) ? 0 : updateUser.hashCode());
		result = prime * result + ((wdDocId == null) ? 0 : wdDocId.hashCode());
		result = prime * result + ((wdDocType == null) ? 0 : wdDocType.hashCode());
		result = prime * result + ((wdReqNo == null) ? 0 : wdReqNo.hashCode());
		result = prime * result + ((wdStatus == null) ? 0 : wdStatus.hashCode());
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
		EdWaitingDoc other = (EdWaitingDoc) obj;
		if (createDatetime == null) {
			if (other.createDatetime != null)
				return false;
		} else if (!createDatetime.equals(other.createDatetime))
			return false;
		if (createUser == null) {
			if (other.createUser != null)
				return false;
		} else if (!createUser.equals(other.createUser))
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
		if (wdDocId == null) {
			if (other.wdDocId != null)
				return false;
		} else if (!wdDocId.equals(other.wdDocId))
			return false;
		if (wdDocType == null) {
			if (other.wdDocType != null)
				return false;
		} else if (!wdDocType.equals(other.wdDocType))
			return false;
		if (wdReqNo == null) {
			if (other.wdReqNo != null)
				return false;
		} else if (!wdReqNo.equals(other.wdReqNo))
			return false;
		if (wdStatus == null) {
			if (other.wdStatus != null)
				return false;
		} else if (!wdStatus.equals(other.wdStatus))
			return false;
		return true;
	}

}