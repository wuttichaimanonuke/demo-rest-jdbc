package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbCabinet {

	private Long cabId;				//Primary Key
	private Long cabWhId;
	private String cabCode;			//Not null
	private String cabNote;			//Not null
	private String createUser;
	private Date createDateTime;
	private String updateUser;
	private Date updateDateTime;

	public CpbCabinet() {
		super();
	}

	public CpbCabinet(Long cabId, Long cabWhId, String cabCode, String cabNote, String createUser, Date createDateTime,
			String updateUser, Date updateDateTime) {
		super();
		this.cabId = cabId;
		this.cabWhId = cabWhId;
		this.cabCode = cabCode;
		this.cabNote = cabNote;
		this.createUser = createUser;
		this.createDateTime = createDateTime;
		this.updateUser = updateUser;
		this.updateDateTime = updateDateTime;
	}

	public Long getCabId() {
		return cabId;
	}

	public Long getCabWhId() {
		return cabWhId;
	}

	public String getCabCode() {
		return cabCode;
	}

	public String getCabNote() {
		return cabNote;
	}

	public String getCreateUser() {
		return createUser;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDateTime() {
		return updateDateTime;
	}

	public void setCabId(Long cabId) {
		this.cabId = cabId;
	}

	public void setCabWhId(Long cabWhId) {
		this.cabWhId = cabWhId;
	}

	public void setCabCode(String cabCode) {
		this.cabCode = cabCode;
	}

	public void setCabNote(String cabNote) {
		this.cabNote = cabNote;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	@Override
	public String toString() {
		return "CpbCabinet [cabId=" + cabId + ", cabWhId=" + cabWhId + ", cabCode=" + cabCode + ", cabNote=" + cabNote
				+ ", createUser=" + createUser + ", createDateTime=" + createDateTime + ", updateUser=" + updateUser
				+ ", updateDateTime=" + updateDateTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cabCode == null) ? 0 : cabCode.hashCode());
		result = prime * result + ((cabId == null) ? 0 : cabId.hashCode());
		result = prime * result + ((cabNote == null) ? 0 : cabNote.hashCode());
		result = prime * result + ((cabWhId == null) ? 0 : cabWhId.hashCode());
		result = prime * result + ((createDateTime == null) ? 0 : createDateTime.hashCode());
		result = prime * result + ((createUser == null) ? 0 : createUser.hashCode());
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
		CpbCabinet other = (CpbCabinet) obj;
		if (cabCode == null) {
			if (other.cabCode != null)
				return false;
		} else if (!cabCode.equals(other.cabCode))
			return false;
		if (cabId == null) {
			if (other.cabId != null)
				return false;
		} else if (!cabId.equals(other.cabId))
			return false;
		if (cabNote == null) {
			if (other.cabNote != null)
				return false;
		} else if (!cabNote.equals(other.cabNote))
			return false;
		if (cabWhId == null) {
			if (other.cabWhId != null)
				return false;
		} else if (!cabWhId.equals(other.cabWhId))
			return false;
		if (createDateTime == null) {
			if (other.createDateTime != null)
				return false;
		} else if (!createDateTime.equals(other.createDateTime))
			return false;
		if (createUser == null) {
			if (other.createUser != null)
				return false;
		} else if (!createUser.equals(other.createUser))
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
