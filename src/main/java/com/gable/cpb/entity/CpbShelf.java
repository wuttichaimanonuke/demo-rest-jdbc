package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbShelf {

	private Long shId;
	private Long shCabId;
	private Long shWhId;
	private String shNote;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public CpbShelf() {
		super();
	}

	public CpbShelf(Long shId, Long shCabId, Long shWhId, String shNote, String createUser, Date createDatetime, String updateUser, Date updateDatetime) {
		super();
		this.shId = shId;
		this.shCabId = shCabId;
		this.shWhId = shWhId;
		this.shNote = shNote;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getShId() {
		return shId;
	}

	public Long getShCabId() {
		return shCabId;
	}

	public Long getShWhId() {
		return shWhId;
	}

	public String getShNote() {
		return shNote;
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

	public void setShId(Long shId) {
		this.shId = shId;
	}

	public void setShCabId(Long shCabId) {
		this.shCabId = shCabId;
	}

	public void setShWhId(Long shWhId) {
		this.shWhId = shWhId;
	}

	public void setShNote(String shNote) {
		this.shNote = shNote;
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
		return "CpbShelf [shId = " + shId + ", shCabId = " + shCabId + ", shWhId = " + shWhId + ", shNote = " + shNote + ", createUser = " + createUser + ", createDatetime = " + createDatetime + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
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
		result = prime * result + ((shCabId == null) ? 0 : shCabId.hashCode());
		result = prime * result + ((shId == null) ? 0 : shId.hashCode());
		result = prime * result + ((shNote == null) ? 0 : shNote.hashCode());
		result = prime * result + ((shWhId == null) ? 0 : shWhId.hashCode());
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
		CpbShelf other = (CpbShelf) obj;
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
		if (shCabId == null) {
			if (other.shCabId != null)
				return false;
		} else if (!shCabId.equals(other.shCabId))
			return false;
		if (shId == null) {
			if (other.shId != null)
				return false;
		} else if (!shId.equals(other.shId))
			return false;
		if (shNote == null) {
			if (other.shNote != null)
				return false;
		} else if (!shNote.equals(other.shNote))
			return false;
		if (shWhId == null) {
			if (other.shWhId != null)
				return false;
		} else if (!shWhId.equals(other.shWhId))
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