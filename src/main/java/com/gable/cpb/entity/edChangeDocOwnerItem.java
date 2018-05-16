package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class edChangeDocOwnerItem {

	private Integer cdoiId;
	private Integer cdoiCdoId;
	private String cdoiDocId;
	private String createUser;
	private Date createDatetime;
	private Integer cdoiStatus;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public edChangeDocOwnerItem() {
		super();
	}

	public edChangeDocOwnerItem(Integer cdoiId, Integer cdoiCdoId, String cdoiDocId, String createUser, Date createDatetime, Integer cdoiStatus, String updateUser, Date updateDatetime) {
		super();
		this.cdoiId = cdoiId;
		this.cdoiCdoId = cdoiCdoId;
		this.cdoiDocId = cdoiDocId;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
		this.cdoiStatus = cdoiStatus;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Integer getCdoiId() {
		return cdoiId;
	}

	public Integer getCdoiCdoId() {
		return cdoiCdoId;
	}

	public String getCdoiDocId() {
		return cdoiDocId;
	}

	public String getCreateUser() {
		return createUser;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public Integer getCdoiStatus() {
		return cdoiStatus;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setCdoiId(Integer cdoiId) {
		this.cdoiId = cdoiId;
	}

	public void setCdoiCdoId(Integer cdoiCdoId) {
		this.cdoiCdoId = cdoiCdoId;
	}

	public void setCdoiDocId(String cdoiDocId) {
		this.cdoiDocId = cdoiDocId;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public void setCdoiStatus(Integer cdoiStatus) {
		this.cdoiStatus = cdoiStatus;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "edChangeDocOwnerItem [cdoiId = " + cdoiId + ", cdoiCdoId = " + cdoiCdoId + ", cdoiDocId = " + cdoiDocId + ", createUser = " + createUser + ", createDatetime = " + createDatetime + ", cdoiStatus = " + cdoiStatus + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdoiCdoId == null) ? 0 : cdoiCdoId.hashCode());
		result = prime * result + ((cdoiDocId == null) ? 0 : cdoiDocId.hashCode());
		result = prime * result + ((cdoiId == null) ? 0 : cdoiId.hashCode());
		result = prime * result + ((cdoiStatus == null) ? 0 : cdoiStatus.hashCode());
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
		edChangeDocOwnerItem other = (edChangeDocOwnerItem) obj;
		if (cdoiCdoId == null) {
			if (other.cdoiCdoId != null)
				return false;
		} else if (!cdoiCdoId.equals(other.cdoiCdoId))
			return false;
		if (cdoiDocId == null) {
			if (other.cdoiDocId != null)
				return false;
		} else if (!cdoiDocId.equals(other.cdoiDocId))
			return false;
		if (cdoiId == null) {
			if (other.cdoiId != null)
				return false;
		} else if (!cdoiId.equals(other.cdoiId))
			return false;
		if (cdoiStatus == null) {
			if (other.cdoiStatus != null)
				return false;
		} else if (!cdoiStatus.equals(other.cdoiStatus))
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