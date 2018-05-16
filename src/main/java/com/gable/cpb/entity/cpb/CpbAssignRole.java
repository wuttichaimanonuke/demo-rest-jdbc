package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbAssignRole {
	
	private Long arId;				//Primary key
	private Long fromUserId;		//Not null
	private Long fromRoleId;		//Not null
	private Long toUserId;			//Not null
	private Date startDateTime;		//Not null
	private Date endDateTime;		//Not null
	private Integer status;			//Not null
	private String updateUser;
	private Date updateDateTime;
	private Long tempOrg;			//Not null
	private Long tempRoleType;		//Not null 
	
	public CpbAssignRole() {
		super();
	}

	public CpbAssignRole(Long arId, Long fromUserId, Long fromRoleId, Long toUserId, Date startDateTime,
			Date endDateTime, Integer status, String updateUser, Date updateDateTime, Long tempOrg,
			Long tempRoleType) {
		super();
		this.arId = arId;
		this.fromUserId = fromUserId;
		this.fromRoleId = fromRoleId;
		this.toUserId = toUserId;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.status = status;
		this.updateUser = updateUser;
		this.updateDateTime = updateDateTime;
		this.tempOrg = tempOrg;
		this.tempRoleType = tempRoleType;
	}

	public Long getArId() {
		return arId;
	}

	public Long getFromUserId() {
		return fromUserId;
	}

	public Long getFromRoleId() {
		return fromRoleId;
	}

	public Long getToUserId() {
		return toUserId;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public Integer getStatus() {
		return status;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDateTime() {
		return updateDateTime;
	}

	public Long getTempOrg() {
		return tempOrg;
	}

	public Long getTempRoleType() {
		return tempRoleType;
	}

	public void setArId(Long arId) {
		this.arId = arId;
	}

	public void setFromUserId(Long fromUserId) {
		this.fromUserId = fromUserId;
	}

	public void setFromRoleId(Long fromRoleId) {
		this.fromRoleId = fromRoleId;
	}

	public void setToUserId(Long toUserId) {
		this.toUserId = toUserId;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public void setTempOrg(Long tempOrg) {
		this.tempOrg = tempOrg;
	}

	public void setTempRoleType(Long tempRoleType) {
		this.tempRoleType = tempRoleType;
	}

	@Override
	public String toString() {
		return "CpbAssignRole [arId=" + arId + ", fromUserId=" + fromUserId + ", fromRoleId=" + fromRoleId
				+ ", toUserId=" + toUserId + ", startDateTime=" + startDateTime + ", endDateTime=" + endDateTime
				+ ", status=" + status + ", updateUser=" + updateUser + ", updateDateTime=" + updateDateTime
				+ ", tempOrg=" + tempOrg + ", tempRoleType=" + tempRoleType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arId == null) ? 0 : arId.hashCode());
		result = prime * result + ((endDateTime == null) ? 0 : endDateTime.hashCode());
		result = prime * result + ((fromRoleId == null) ? 0 : fromRoleId.hashCode());
		result = prime * result + ((fromUserId == null) ? 0 : fromUserId.hashCode());
		result = prime * result + ((startDateTime == null) ? 0 : startDateTime.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tempOrg == null) ? 0 : tempOrg.hashCode());
		result = prime * result + ((tempRoleType == null) ? 0 : tempRoleType.hashCode());
		result = prime * result + ((toUserId == null) ? 0 : toUserId.hashCode());
		result = prime * result + ((updateDateTime == null) ? 0 : updateDateTime.hashCode());
		result = prime * result + ((updateUser == null) ? 0 : updateUser.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CpbAssignRole other = (CpbAssignRole) obj;
		if (arId == null) {
			if (other.arId != null)
				return false;
		} else if (!arId.equals(other.arId))
			return false;
		if (endDateTime == null) {
			if (other.endDateTime != null)
				return false;
		} else if (!endDateTime.equals(other.endDateTime))
			return false;
		if (fromRoleId == null) {
			if (other.fromRoleId != null)
				return false;
		} else if (!fromRoleId.equals(other.fromRoleId))
			return false;
		if (fromUserId == null) {
			if (other.fromUserId != null)
				return false;
		} else if (!fromUserId.equals(other.fromUserId))
			return false;
		if (startDateTime == null) {
			if (other.startDateTime != null)
				return false;
		} else if (!startDateTime.equals(other.startDateTime))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (tempOrg == null) {
			if (other.tempOrg != null)
				return false;
		} else if (!tempOrg.equals(other.tempOrg))
			return false;
		if (tempRoleType == null) {
			if (other.tempRoleType != null)
				return false;
		} else if (!tempRoleType.equals(other.tempRoleType))
			return false;
		if (toUserId == null) {
			if (other.toUserId != null)
				return false;
		} else if (!toUserId.equals(other.toUserId))
			return false;
		if (updateDateTime == null) {
			if (other.updateDateTime != null)
				return false;
		} else if (!updateDateTime.equals(other.updateDateTime))
			return false;
		if (updateUser == null) {
			if (other.updateUser != null)
				return false;
		} else if (!updateUser.equals(other.updateUser))
			return false;
		return true;
	}

}
