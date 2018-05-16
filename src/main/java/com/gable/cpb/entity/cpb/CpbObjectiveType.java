package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbObjectiveType {

	private Long objtId;
	private String objtName;
	private String objtRemark;
	private Integer status;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public CpbObjectiveType() {
		super();
	}

	public CpbObjectiveType(Long objtId, String objtName, String objtRemark, Integer status, String updateUser, Date updateDatetime) {
		super();
		this.objtId = objtId;
		this.objtName = objtName;
		this.objtRemark = objtRemark;
		this.status = status;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getObjtId() {
		return objtId;
	}

	public String getObjtName() {
		return objtName;
	}

	public String getObjtRemark() {
		return objtRemark;
	}

	public Integer getStatus() {
		return status;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setObjtId(Long objtId) {
		this.objtId = objtId;
	}

	public void setObjtName(String objtName) {
		this.objtName = objtName;
	}

	public void setObjtRemark(String objtRemark) {
		this.objtRemark = objtRemark;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "CpbObjectiveType [objtId = " + objtId + ", objtName = " + objtName + ", objtRemark = " + objtRemark + ", status = " + status + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((objtId == null) ? 0 : objtId.hashCode());
		result = prime * result + ((objtName == null) ? 0 : objtName.hashCode());
		result = prime * result + ((objtRemark == null) ? 0 : objtRemark.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		CpbObjectiveType other = (CpbObjectiveType) obj;
		if (objtId == null) {
			if (other.objtId != null)
				return false;
		} else if (!objtId.equals(other.objtId))
			return false;
		if (objtName == null) {
			if (other.objtName != null)
				return false;
		} else if (!objtName.equals(other.objtName))
			return false;
		if (objtRemark == null) {
			if (other.objtRemark != null)
				return false;
		} else if (!objtRemark.equals(other.objtRemark))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
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