package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class edPhyLocation {

	private Long dpLocEnvId;
	private String dpLocDocId;
	private Date dpLocStoredDate;
	private String dpLocStoredUser;
	private Date createDatetime;
	private String createUser;
	private Date updateDatetime;
	private String updateUser;

	@JsonIgnore

	public edPhyLocation() {
		super();
	}

	public edPhyLocation(Long dpLocEnvId, String dpLocDocId, Date dpLocStoredDate, String dpLocStoredUser, Date createDatetime, String createUser, Date updateDatetime, String updateUser) {
		super();
		this.dpLocEnvId = dpLocEnvId;
		this.dpLocDocId = dpLocDocId;
		this.dpLocStoredDate = dpLocStoredDate;
		this.dpLocStoredUser = dpLocStoredUser;
		this.createDatetime = createDatetime;
		this.createUser = createUser;
		this.updateDatetime = updateDatetime;
		this.updateUser = updateUser;
	}

	public Long getDpLocEnvId() {
		return dpLocEnvId;
	}

	public String getDpLocDocId() {
		return dpLocDocId;
	}

	public Date getDpLocStoredDate() {
		return dpLocStoredDate;
	}

	public String getDpLocStoredUser() {
		return dpLocStoredUser;
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

	public void setDpLocEnvId(Long dpLocEnvId) {
		this.dpLocEnvId = dpLocEnvId;
	}

	public void setDpLocDocId(String dpLocDocId) {
		this.dpLocDocId = dpLocDocId;
	}

	public void setDpLocStoredDate(Date dpLocStoredDate) {
		this.dpLocStoredDate = dpLocStoredDate;
	}

	public void setDpLocStoredUser(String dpLocStoredUser) {
		this.dpLocStoredUser = dpLocStoredUser;
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
		return "edPhyLocation [dpLocEnvId = " + dpLocEnvId + ", dpLocDocId = " + dpLocDocId + ", dpLocStoredDate = " + dpLocStoredDate + ", dpLocStoredUser = " + dpLocStoredUser + ", createDatetime = " + createDatetime + ", createUser = " + createUser + ", updateDatetime = " + updateDatetime + ", updateUser = " + updateUser + "]";
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
		result = prime * result + ((dpLocDocId == null) ? 0 : dpLocDocId.hashCode());
		result = prime * result + ((dpLocEnvId == null) ? 0 : dpLocEnvId.hashCode());
		result = prime * result + ((dpLocStoredDate == null) ? 0 : dpLocStoredDate.hashCode());
		result = prime * result + ((dpLocStoredUser == null) ? 0 : dpLocStoredUser.hashCode());
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
		edPhyLocation other = (edPhyLocation) obj;
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
		if (dpLocDocId == null) {
			if (other.dpLocDocId != null)
				return false;
		} else if (!dpLocDocId.equals(other.dpLocDocId))
			return false;
		if (dpLocEnvId == null) {
			if (other.dpLocEnvId != null)
				return false;
		} else if (!dpLocEnvId.equals(other.dpLocEnvId))
			return false;
		if (dpLocStoredDate == null) {
			if (other.dpLocStoredDate != null)
				return false;
		} else if (!dpLocStoredDate.equals(other.dpLocStoredDate))
			return false;
		if (dpLocStoredUser == null) {
			if (other.dpLocStoredUser != null)
				return false;
		} else if (!dpLocStoredUser.equals(other.dpLocStoredUser))
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