package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbEnvelop {

	private Long envId;
	private Long envShId;
	private Long evnCabId;
	private Long evnWhID;
	private String envCode;
	private String envNote;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public CpbEnvelop() {
		super();
	}

	public CpbEnvelop(Long envId, Long envShId, Long evnCabId, Long evnWhID, String envCode, String envNote, String createUser, Date createDatetime, String updateUser, Date updateDatetime) {
		super();
		this.envId = envId;
		this.envShId = envShId;
		this.evnCabId = evnCabId;
		this.evnWhID = evnWhID;
		this.envCode = envCode;
		this.envNote = envNote;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getEnvId() {
		return envId;
	}

	public Long getEnvShId() {
		return envShId;
	}

	public Long getEvnCabId() {
		return evnCabId;
	}

	public Long getEvnWhID() {
		return evnWhID;
	}

	public String getEnvCode() {
		return envCode;
	}

	public String getEnvNote() {
		return envNote;
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

	public void setEnvId(Long envId) {
		this.envId = envId;
	}

	public void setEnvShId(Long envShId) {
		this.envShId = envShId;
	}

	public void setEvnCabId(Long evnCabId) {
		this.evnCabId = evnCabId;
	}

	public void setEvnWhID(Long evnWhID) {
		this.evnWhID = evnWhID;
	}

	public void setEnvCode(String envCode) {
		this.envCode = envCode;
	}

	public void setEnvNote(String envNote) {
		this.envNote = envNote;
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
		return "CpbEnvelop [envId = " + envId + ", envShId = " + envShId + ", evnCabId = " + evnCabId + ", evnWhID = " + evnWhID + ", envCode = " + envCode + ", envNote = " + envNote + ", createUser = " + createUser + ", createDatetime = " + createDatetime + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
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
		result = prime * result + ((envCode == null) ? 0 : envCode.hashCode());
		result = prime * result + ((envId == null) ? 0 : envId.hashCode());
		result = prime * result + ((envNote == null) ? 0 : envNote.hashCode());
		result = prime * result + ((envShId == null) ? 0 : envShId.hashCode());
		result = prime * result + ((evnCabId == null) ? 0 : evnCabId.hashCode());
		result = prime * result + ((evnWhID == null) ? 0 : evnWhID.hashCode());
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
		CpbEnvelop other = (CpbEnvelop) obj;
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
		if (envCode == null) {
			if (other.envCode != null)
				return false;
		} else if (!envCode.equals(other.envCode))
			return false;
		if (envId == null) {
			if (other.envId != null)
				return false;
		} else if (!envId.equals(other.envId))
			return false;
		if (envNote == null) {
			if (other.envNote != null)
				return false;
		} else if (!envNote.equals(other.envNote))
			return false;
		if (envShId == null) {
			if (other.envShId != null)
				return false;
		} else if (!envShId.equals(other.envShId))
			return false;
		if (evnCabId == null) {
			if (other.evnCabId != null)
				return false;
		} else if (!evnCabId.equals(other.evnCabId))
			return false;
		if (evnWhID == null) {
			if (other.evnWhID != null)
				return false;
		} else if (!evnWhID.equals(other.evnWhID))
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