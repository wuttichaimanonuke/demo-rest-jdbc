package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EdBrrowUser {

	private String buReqNo;
	private String buUserId;
	private Long buRoleId;
	private Integer buAppStatus;
	private Date createDatetime;
	private String createUser;
	private Date updateDatetime;
	private String updateUser;

	@JsonIgnore

	public EdBrrowUser() {
		super();
	}

	public EdBrrowUser(String buReqNo, String buUserId, Long buRoleId, Integer buAppStatus, Date createDatetime, String createUser, Date updateDatetime, String updateUser) {
		super();
		this.buReqNo = buReqNo;
		this.buUserId = buUserId;
		this.buRoleId = buRoleId;
		this.buAppStatus = buAppStatus;
		this.createDatetime = createDatetime;
		this.createUser = createUser;
		this.updateDatetime = updateDatetime;
		this.updateUser = updateUser;
	}

	public String getBuReqNo() {
		return buReqNo;
	}

	public String getBuUserId() {
		return buUserId;
	}

	public Long getBuRoleId() {
		return buRoleId;
	}

	public Integer getBuAppStatus() {
		return buAppStatus;
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

	public void setBuReqNo(String buReqNo) {
		this.buReqNo = buReqNo;
	}

	public void setBuUserId(String buUserId) {
		this.buUserId = buUserId;
	}

	public void setBuRoleId(Long buRoleId) {
		this.buRoleId = buRoleId;
	}

	public void setBuAppStatus(Integer buAppStatus) {
		this.buAppStatus = buAppStatus;
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
		return "EdBrrowUser [buReqNo = " + buReqNo + ", buUserId = " + buUserId + ", buRoleId = " + buRoleId + ", buAppStatus = " + buAppStatus + ", createDatetime = " + createDatetime + ", createUser = " + createUser + ", updateDatetime = " + updateDatetime + ", updateUser = " + updateUser + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buAppStatus == null) ? 0 : buAppStatus.hashCode());
		result = prime * result + ((buReqNo == null) ? 0 : buReqNo.hashCode());
		result = prime * result + ((buRoleId == null) ? 0 : buRoleId.hashCode());
		result = prime * result + ((buUserId == null) ? 0 : buUserId.hashCode());
		result = prime * result + ((createDatetime == null) ? 0 : createDatetime.hashCode());
		result = prime * result + ((createUser == null) ? 0 : createUser.hashCode());
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
		EdBrrowUser other = (EdBrrowUser) obj;
		if (buAppStatus == null) {
			if (other.buAppStatus != null)
				return false;
		} else if (!buAppStatus.equals(other.buAppStatus))
			return false;
		if (buReqNo == null) {
			if (other.buReqNo != null)
				return false;
		} else if (!buReqNo.equals(other.buReqNo))
			return false;
		if (buRoleId == null) {
			if (other.buRoleId != null)
				return false;
		} else if (!buRoleId.equals(other.buRoleId))
			return false;
		if (buUserId == null) {
			if (other.buUserId != null)
				return false;
		} else if (!buUserId.equals(other.buUserId))
			return false;
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
		return true;
	}

}