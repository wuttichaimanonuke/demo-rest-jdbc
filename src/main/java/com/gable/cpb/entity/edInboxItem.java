package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class edInboxItem {

	private Long itId;
	private Integer itYear;
	private Long itRoleId;
	private String itReqNo;
	private String itName;
	private Integer itStatus;
	private Long itSendUser;
	private Long itSendRole;
	private Long itSendOrg;
	private Date itSendDatetime;
	private Long itSendToRole;
	private Date createDatetime;
	private String createUser;
	private Date updateDatetime;
	private String updateUser;

	@JsonIgnore

	public edInboxItem() {
		super();
	}

	public edInboxItem(Long itId, Integer itYear, Long itRoleId, String itReqNo, String itName, Integer itStatus, Long itSendUser, Long itSendRole, Long itSendOrg, Date itSendDatetime, Long itSendToRole, Date createDatetime, String createUser, Date updateDatetime, String updateUser) {
		super();
		this.itId = itId;
		this.itYear = itYear;
		this.itRoleId = itRoleId;
		this.itReqNo = itReqNo;
		this.itName = itName;
		this.itStatus = itStatus;
		this.itSendUser = itSendUser;
		this.itSendRole = itSendRole;
		this.itSendOrg = itSendOrg;
		this.itSendDatetime = itSendDatetime;
		this.itSendToRole = itSendToRole;
		this.createDatetime = createDatetime;
		this.createUser = createUser;
		this.updateDatetime = updateDatetime;
		this.updateUser = updateUser;
	}

	public Long getItId() {
		return itId;
	}

	public Integer getItYear() {
		return itYear;
	}

	public Long getItRoleId() {
		return itRoleId;
	}

	public String getItReqNo() {
		return itReqNo;
	}

	public String getItName() {
		return itName;
	}

	public Integer getItStatus() {
		return itStatus;
	}

	public Long getItSendUser() {
		return itSendUser;
	}

	public Long getItSendRole() {
		return itSendRole;
	}

	public Long getItSendOrg() {
		return itSendOrg;
	}

	public Date getItSendDatetime() {
		return itSendDatetime;
	}

	public Long getItSendToRole() {
		return itSendToRole;
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

	public void setItId(Long itId) {
		this.itId = itId;
	}

	public void setItYear(Integer itYear) {
		this.itYear = itYear;
	}

	public void setItRoleId(Long itRoleId) {
		this.itRoleId = itRoleId;
	}

	public void setItReqNo(String itReqNo) {
		this.itReqNo = itReqNo;
	}

	public void setItName(String itName) {
		this.itName = itName;
	}

	public void setItStatus(Integer itStatus) {
		this.itStatus = itStatus;
	}

	public void setItSendUser(Long itSendUser) {
		this.itSendUser = itSendUser;
	}

	public void setItSendRole(Long itSendRole) {
		this.itSendRole = itSendRole;
	}

	public void setItSendOrg(Long itSendOrg) {
		this.itSendOrg = itSendOrg;
	}

	public void setItSendDatetime(Date itSendDatetime) {
		this.itSendDatetime = itSendDatetime;
	}

	public void setItSendToRole(Long itSendToRole) {
		this.itSendToRole = itSendToRole;
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
		return "edInboxItem [itId = " + itId + ", itYear = " + itYear + ", itRoleId = " + itRoleId + ", itReqNo = " + itReqNo + ", itName = " + itName + ", itStatus = " + itStatus + ", itSendUser = " + itSendUser + ", itSendRole = " + itSendRole + ", itSendOrg = " + itSendOrg + ", itSendDatetime = " + itSendDatetime + ", itSendToRole = " + itSendToRole + ", createDatetime = " + createDatetime + ", createUser = " + createUser + ", updateDatetime = " + updateDatetime + ", updateUser = " + updateUser + "]";
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
		result = prime * result + ((itId == null) ? 0 : itId.hashCode());
		result = prime * result + ((itName == null) ? 0 : itName.hashCode());
		result = prime * result + ((itReqNo == null) ? 0 : itReqNo.hashCode());
		result = prime * result + ((itRoleId == null) ? 0 : itRoleId.hashCode());
		result = prime * result + ((itSendDatetime == null) ? 0 : itSendDatetime.hashCode());
		result = prime * result + ((itSendOrg == null) ? 0 : itSendOrg.hashCode());
		result = prime * result + ((itSendRole == null) ? 0 : itSendRole.hashCode());
		result = prime * result + ((itSendToRole == null) ? 0 : itSendToRole.hashCode());
		result = prime * result + ((itSendUser == null) ? 0 : itSendUser.hashCode());
		result = prime * result + ((itStatus == null) ? 0 : itStatus.hashCode());
		result = prime * result + ((itYear == null) ? 0 : itYear.hashCode());
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
		edInboxItem other = (edInboxItem) obj;
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
		if (itId == null) {
			if (other.itId != null)
				return false;
		} else if (!itId.equals(other.itId))
			return false;
		if (itName == null) {
			if (other.itName != null)
				return false;
		} else if (!itName.equals(other.itName))
			return false;
		if (itReqNo == null) {
			if (other.itReqNo != null)
				return false;
		} else if (!itReqNo.equals(other.itReqNo))
			return false;
		if (itRoleId == null) {
			if (other.itRoleId != null)
				return false;
		} else if (!itRoleId.equals(other.itRoleId))
			return false;
		if (itSendDatetime == null) {
			if (other.itSendDatetime != null)
				return false;
		} else if (!itSendDatetime.equals(other.itSendDatetime))
			return false;
		if (itSendOrg == null) {
			if (other.itSendOrg != null)
				return false;
		} else if (!itSendOrg.equals(other.itSendOrg))
			return false;
		if (itSendRole == null) {
			if (other.itSendRole != null)
				return false;
		} else if (!itSendRole.equals(other.itSendRole))
			return false;
		if (itSendToRole == null) {
			if (other.itSendToRole != null)
				return false;
		} else if (!itSendToRole.equals(other.itSendToRole))
			return false;
		if (itSendUser == null) {
			if (other.itSendUser != null)
				return false;
		} else if (!itSendUser.equals(other.itSendUser))
			return false;
		if (itStatus == null) {
			if (other.itStatus != null)
				return false;
		} else if (!itStatus.equals(other.itStatus))
			return false;
		if (itYear == null) {
			if (other.itYear != null)
				return false;
		} else if (!itYear.equals(other.itYear))
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