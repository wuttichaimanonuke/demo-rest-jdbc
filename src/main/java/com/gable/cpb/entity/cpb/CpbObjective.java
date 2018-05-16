package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbObjective {

	private Long objId;
	private String objCode;
	private String objName;
	private Long objtId;
	private Integer status;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public CpbObjective() {
		super();
	}

	public CpbObjective(Long objId, String objCode, String objName, Long objtId, Integer status, String updateUser, Date updateDatetime) {
		super();
		this.objId = objId;
		this.objCode = objCode;
		this.objName = objName;
		this.objtId = objtId;
		this.status = status;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getObjId() {
		return objId;
	}

	public String getObjCode() {
		return objCode;
	}

	public String getObjName() {
		return objName;
	}

	public Long getObjtId() {
		return objtId;
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

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public void setObjCode(String objCode) {
		this.objCode = objCode;
	}

	public void setObjName(String objName) {
		this.objName = objName;
	}

	public void setObjtId(Long objtId) {
		this.objtId = objtId;
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
		return "CpbObjective [objId = " + objId + ", objCode = " + objCode + ", objName = " + objName + ", objtId = " + objtId + ", status = " + status + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((objCode == null) ? 0 : objCode.hashCode());
		result = prime * result + ((objId == null) ? 0 : objId.hashCode());
		result = prime * result + ((objName == null) ? 0 : objName.hashCode());
		result = prime * result + ((objtId == null) ? 0 : objtId.hashCode());
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
		CpbObjective other = (CpbObjective) obj;
		if (objCode == null) {
			if (other.objCode != null)
				return false;
		} else if (!objCode.equals(other.objCode))
			return false;
		if (objId == null) {
			if (other.objId != null)
				return false;
		} else if (!objId.equals(other.objId))
			return false;
		if (objName == null) {
			if (other.objName != null)
				return false;
		} else if (!objName.equals(other.objName))
			return false;
		if (objtId == null) {
			if (other.objtId != null)
				return false;
		} else if (!objtId.equals(other.objtId))
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