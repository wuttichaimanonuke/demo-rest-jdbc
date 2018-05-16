package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbWarehouse {

	private Long whId;
	private Long whOrgId;
	private String whNote;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public CpbWarehouse() {
		super();
	}

	public CpbWarehouse(Long whId, Long whOrgId, String whNote, String createUser, Date createDatetime, String updateUser, Date updateDatetime) {
		super();
		this.whId = whId;
		this.whOrgId = whOrgId;
		this.whNote = whNote;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getWhId() {
		return whId;
	}

	public Long getWhOrgId() {
		return whOrgId;
	}

	public String getWhNote() {
		return whNote;
	}

	public String getCreateUser() {
		return createUser;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setWhId(Long whId) {
		this.whId = whId;
	}

	public void setWhOrgId(Long whOrgId) {
		this.whOrgId = whOrgId;
	}

	public void setWhNote(String whNote) {
		this.whNote = whNote;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "CpbWarehouse [whId = " + whId + ", whOrgId = " + whOrgId + ", whNote = " + whNote + ", createUser = " + createUser + ", createDatetime = " + createDatetime + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
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
		result = prime * result + ((whId == null) ? 0 : whId.hashCode());
		result = prime * result + ((whNote == null) ? 0 : whNote.hashCode());
		result = prime * result + ((whOrgId == null) ? 0 : whOrgId.hashCode());
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
		CpbWarehouse other = (CpbWarehouse) obj;
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
		if (whId == null) {
			if (other.whId != null)
				return false;
		} else if (!whId.equals(other.whId))
			return false;
		if (whNote == null) {
			if (other.whNote != null)
				return false;
		} else if (!whNote.equals(other.whNote))
			return false;
		if (whOrgId == null) {
			if (other.whOrgId != null)
				return false;
		} else if (!whOrgId.equals(other.whOrgId))
			return false;
		return true;
	}

}