package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class edDocSet {

	private Long dsId;
	private String dsCoverId;
	private String dsChildId;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public edDocSet() {
		super();
	}

	public edDocSet(Long dsId, String dsCoverId, String dsChildId, String updateUser, Date updateDatetime) {
		super();
		this.dsId = dsId;
		this.dsCoverId = dsCoverId;
		this.dsChildId = dsChildId;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getDsId() {
		return dsId;
	}

	public String getDsCoverId() {
		return dsCoverId;
	}

	public String getDsChildId() {
		return dsChildId;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setDsId(Long dsId) {
		this.dsId = dsId;
	}

	public void setDsCoverId(String dsCoverId) {
		this.dsCoverId = dsCoverId;
	}

	public void setDsChildId(String dsChildId) {
		this.dsChildId = dsChildId;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "edDocSet [dsId = " + dsId + ", dsCoverId = " + dsCoverId + ", dsChildId = " + dsChildId + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dsChildId == null) ? 0 : dsChildId.hashCode());
		result = prime * result + ((dsCoverId == null) ? 0 : dsCoverId.hashCode());
		result = prime * result + ((dsId == null) ? 0 : dsId.hashCode());
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
		edDocSet other = (edDocSet) obj;
		if (dsChildId == null) {
			if (other.dsChildId != null)
				return false;
		} else if (!dsChildId.equals(other.dsChildId))
			return false;
		if (dsCoverId == null) {
			if (other.dsCoverId != null)
				return false;
		} else if (!dsCoverId.equals(other.dsCoverId))
			return false;
		if (dsId == null) {
			if (other.dsId != null)
				return false;
		} else if (!dsId.equals(other.dsId))
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