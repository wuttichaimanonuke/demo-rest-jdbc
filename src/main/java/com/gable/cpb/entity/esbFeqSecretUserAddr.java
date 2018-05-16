package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbFeqSecretUserAddr {

	private Integer fsId;
	private Integer fsOwnerUserId;
	private Integer userId;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public esbFeqSecretUserAddr() {
		super();
	}

	public esbFeqSecretUserAddr(Integer fsId, Integer fsOwnerUserId, Integer userId, String updateUser, Date updateDatetime) {
		super();
		this.fsId = fsId;
		this.fsOwnerUserId = fsOwnerUserId;
		this.userId = userId;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Integer getFsId() {
		return fsId;
	}

	public Integer getFsOwnerUserId() {
		return fsOwnerUserId;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setFsId(Integer fsId) {
		this.fsId = fsId;
	}

	public void setFsOwnerUserId(Integer fsOwnerUserId) {
		this.fsOwnerUserId = fsOwnerUserId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "esbFeqSecretUserAddr [fsId = " + fsId + ", fsOwnerUserId = " + fsOwnerUserId + ", userId = " + userId + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fsId == null) ? 0 : fsId.hashCode());
		result = prime * result + ((fsOwnerUserId == null) ? 0 : fsOwnerUserId.hashCode());
		result = prime * result + ((updateDatetime == null) ? 0 : updateDatetime.hashCode());
		result = prime * result + ((updateUser == null) ? 0 : updateUser.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		esbFeqSecretUserAddr other = (esbFeqSecretUserAddr) obj;
		if (fsId == null) {
			if (other.fsId != null)
				return false;
		} else if (!fsId.equals(other.fsId))
			return false;
		if (fsOwnerUserId == null) {
			if (other.fsOwnerUserId != null)
				return false;
		} else if (!fsOwnerUserId.equals(other.fsOwnerUserId))
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
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

}