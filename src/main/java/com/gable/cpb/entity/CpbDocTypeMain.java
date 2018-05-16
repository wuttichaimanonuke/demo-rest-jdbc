package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbDocTypeMain {

	private Long dtMainId;
	private String dtMainName;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public CpbDocTypeMain() {
		super();
	}

	public CpbDocTypeMain(Long dtMainId, String dtMainName, String createUser, Date createDatetime, String updateUser, Date updateDatetime) {
		super();
		this.dtMainId = dtMainId;
		this.dtMainName = dtMainName;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getDtMainId() {
		return dtMainId;
	}

	public String getDtMainName() {
		return dtMainName;
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

	public void setDtMainId(Long dtMainId) {
		this.dtMainId = dtMainId;
	}

	public void setDtMainName(String dtMainName) {
		this.dtMainName = dtMainName;
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
		return "CpbDocTypeMain [dtMainId = " + dtMainId + ", dtMainName = " + dtMainName + ", createUser = " + createUser + ", createDatetime = " + createDatetime + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
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
		result = prime * result + ((dtMainId == null) ? 0 : dtMainId.hashCode());
		result = prime * result + ((dtMainName == null) ? 0 : dtMainName.hashCode());
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
		CpbDocTypeMain other = (CpbDocTypeMain) obj;
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
		if (dtMainId == null) {
			if (other.dtMainId != null)
				return false;
		} else if (!dtMainId.equals(other.dtMainId))
			return false;
		if (dtMainName == null) {
			if (other.dtMainName != null)
				return false;
		} else if (!dtMainName.equals(other.dtMainName))
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