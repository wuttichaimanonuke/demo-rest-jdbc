package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class edReqWaitingDoc {

	private String rwReqNo;
	private Long rwReceiveRole;
	private Long rwSendRole;
	private String rwSendUser;
	private Long rwSendOrg;
	private Date rwSendDatetime;
	private Date updateDatetime;
	private String updateUser;
	private Integer rwStatus;
	private String rwDesc;

	@JsonIgnore

	public edReqWaitingDoc() {
		super();
	}

	public edReqWaitingDoc(String rwReqNo, Long rwReceiveRole, Long rwSendRole, String rwSendUser, Long rwSendOrg, Date rwSendDatetime, Date updateDatetime, String updateUser, Integer rwStatus, String rwDesc) {
		super();
		this.rwReqNo = rwReqNo;
		this.rwReceiveRole = rwReceiveRole;
		this.rwSendRole = rwSendRole;
		this.rwSendUser = rwSendUser;
		this.rwSendOrg = rwSendOrg;
		this.rwSendDatetime = rwSendDatetime;
		this.updateDatetime = updateDatetime;
		this.updateUser = updateUser;
		this.rwStatus = rwStatus;
		this.rwDesc = rwDesc;
	}

	public String getRwReqNo() {
		return rwReqNo;
	}

	public Long getRwReceiveRole() {
		return rwReceiveRole;
	}

	public Long getRwSendRole() {
		return rwSendRole;
	}

	public String getRwSendUser() {
		return rwSendUser;
	}

	public Long getRwSendOrg() {
		return rwSendOrg;
	}

	public Date getRwSendDatetime() {
		return rwSendDatetime;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Integer getRwStatus() {
		return rwStatus;
	}

	public String getRwDesc() {
		return rwDesc;
	}

	public void setRwReqNo(String rwReqNo) {
		this.rwReqNo = rwReqNo;
	}

	public void setRwReceiveRole(Long rwReceiveRole) {
		this.rwReceiveRole = rwReceiveRole;
	}

	public void setRwSendRole(Long rwSendRole) {
		this.rwSendRole = rwSendRole;
	}

	public void setRwSendUser(String rwSendUser) {
		this.rwSendUser = rwSendUser;
	}

	public void setRwSendOrg(Long rwSendOrg) {
		this.rwSendOrg = rwSendOrg;
	}

	public void setRwSendDatetime(Date rwSendDatetime) {
		this.rwSendDatetime = rwSendDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setRwStatus(Integer rwStatus) {
		this.rwStatus = rwStatus;
	}

	public void setRwDesc(String rwDesc) {
		this.rwDesc = rwDesc;
	}


	@Override
	public String toString() {
		return "edReqWaitingDoc [rwReqNo = " + rwReqNo + ", rwReceiveRole = " + rwReceiveRole + ", rwSendRole = " + rwSendRole + ", rwSendUser = " + rwSendUser + ", rwSendOrg = " + rwSendOrg + ", rwSendDatetime = " + rwSendDatetime + ", updateDatetime = " + updateDatetime + ", updateUser = " + updateUser + ", rwStatus = " + rwStatus + ", rwDesc = " + rwDesc + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rwDesc == null) ? 0 : rwDesc.hashCode());
		result = prime * result + ((rwReceiveRole == null) ? 0 : rwReceiveRole.hashCode());
		result = prime * result + ((rwReqNo == null) ? 0 : rwReqNo.hashCode());
		result = prime * result + ((rwSendDatetime == null) ? 0 : rwSendDatetime.hashCode());
		result = prime * result + ((rwSendOrg == null) ? 0 : rwSendOrg.hashCode());
		result = prime * result + ((rwSendRole == null) ? 0 : rwSendRole.hashCode());
		result = prime * result + ((rwSendUser == null) ? 0 : rwSendUser.hashCode());
		result = prime * result + ((rwStatus == null) ? 0 : rwStatus.hashCode());
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
		edReqWaitingDoc other = (edReqWaitingDoc) obj;
		if (rwDesc == null) {
			if (other.rwDesc != null)
				return false;
		} else if (!rwDesc.equals(other.rwDesc))
			return false;
		if (rwReceiveRole == null) {
			if (other.rwReceiveRole != null)
				return false;
		} else if (!rwReceiveRole.equals(other.rwReceiveRole))
			return false;
		if (rwReqNo == null) {
			if (other.rwReqNo != null)
				return false;
		} else if (!rwReqNo.equals(other.rwReqNo))
			return false;
		if (rwSendDatetime == null) {
			if (other.rwSendDatetime != null)
				return false;
		} else if (!rwSendDatetime.equals(other.rwSendDatetime))
			return false;
		if (rwSendOrg == null) {
			if (other.rwSendOrg != null)
				return false;
		} else if (!rwSendOrg.equals(other.rwSendOrg))
			return false;
		if (rwSendRole == null) {
			if (other.rwSendRole != null)
				return false;
		} else if (!rwSendRole.equals(other.rwSendRole))
			return false;
		if (rwSendUser == null) {
			if (other.rwSendUser != null)
				return false;
		} else if (!rwSendUser.equals(other.rwSendUser))
			return false;
		if (rwStatus == null) {
			if (other.rwStatus != null)
				return false;
		} else if (!rwStatus.equals(other.rwStatus))
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