package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbTrBkRefer {

	private Long actId;
	private Long trId;
	private Integer actType;
	private Long refId;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public esbTrBkRefer() {
		super();
	}

	public esbTrBkRefer(Long actId, Long trId, Integer actType, Long refId, String updateUser, Date updateDatetime) {
		super();
		this.actId = actId;
		this.trId = trId;
		this.actType = actType;
		this.refId = refId;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getActId() {
		return actId;
	}

	public Long getTrId() {
		return trId;
	}

	public Integer getActType() {
		return actType;
	}

	public Long getRefId() {
		return refId;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setActId(Long actId) {
		this.actId = actId;
	}

	public void setTrId(Long trId) {
		this.trId = trId;
	}

	public void setActType(Integer actType) {
		this.actType = actType;
	}

	public void setRefId(Long refId) {
		this.refId = refId;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "esbTrBkRefer [actId = " + actId + ", trId = " + trId + ", actType = " + actType + ", refId = " + refId + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actId == null) ? 0 : actId.hashCode());
		result = prime * result + ((actType == null) ? 0 : actType.hashCode());
		result = prime * result + ((refId == null) ? 0 : refId.hashCode());
		result = prime * result + ((trId == null) ? 0 : trId.hashCode());
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
		esbTrBkRefer other = (esbTrBkRefer) obj;
		if (actId == null) {
			if (other.actId != null)
				return false;
		} else if (!actId.equals(other.actId))
			return false;
		if (actType == null) {
			if (other.actType != null)
				return false;
		} else if (!actType.equals(other.actType))
			return false;
		if (refId == null) {
			if (other.refId != null)
				return false;
		} else if (!refId.equals(other.refId))
			return false;
		if (trId == null) {
			if (other.trId != null)
				return false;
		} else if (!trId.equals(other.trId))
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