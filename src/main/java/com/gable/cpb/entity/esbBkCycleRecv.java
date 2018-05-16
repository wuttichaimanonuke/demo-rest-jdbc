package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbBkCycleRecv {

	private Long cycdId;
	private Long userId;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public esbBkCycleRecv() {
		super();
	}

	public esbBkCycleRecv(Long cycdId, Long userId, String updateUser, Date updateDatetime) {
		super();
		this.cycdId = cycdId;
		this.userId = userId;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getCycdId() {
		return cycdId;
	}

	public Long getUserId() {
		return userId;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setCycdId(Long cycdId) {
		this.cycdId = cycdId;
	}

	public void setUserId(Long userId) {
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
		return "esbBkCycleRecv [cycdId = " + cycdId + ", userId = " + userId + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cycdId == null) ? 0 : cycdId.hashCode());
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
		esbBkCycleRecv other = (esbBkCycleRecv) obj;
		if (cycdId == null) {
			if (other.cycdId != null)
				return false;
		} else if (!cycdId.equals(other.cycdId))
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