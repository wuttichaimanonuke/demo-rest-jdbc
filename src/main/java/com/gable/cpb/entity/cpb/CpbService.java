package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbService {

	private Long svId;
	private String svCode;
	private String svName;
	private Integer svType;
	private Long svIdRef;
	private Integer status;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public CpbService() {
		super();
	}

	public CpbService(Long svId, String svCode, String svName, Integer svType, Long svIdRef, Integer status, String updateUser, Date updateDatetime) {
		super();
		this.svId = svId;
		this.svCode = svCode;
		this.svName = svName;
		this.svType = svType;
		this.svIdRef = svIdRef;
		this.status = status;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getSvId() {
		return svId;
	}

	public String getSvCode() {
		return svCode;
	}

	public String getSvName() {
		return svName;
	}

	public Integer getSvType() {
		return svType;
	}

	public Long getSvIdRef() {
		return svIdRef;
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

	public void setSvId(Long svId) {
		this.svId = svId;
	}

	public void setSvCode(String svCode) {
		this.svCode = svCode;
	}

	public void setSvName(String svName) {
		this.svName = svName;
	}

	public void setSvType(Integer svType) {
		this.svType = svType;
	}

	public void setSvIdRef(Long svIdRef) {
		this.svIdRef = svIdRef;
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
		return "CpbService [svId = " + svId + ", svCode = " + svCode + ", svName = " + svName + ", svType = " + svType + ", svIdRef = " + svIdRef + ", status = " + status + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((svCode == null) ? 0 : svCode.hashCode());
		result = prime * result + ((svId == null) ? 0 : svId.hashCode());
		result = prime * result + ((svIdRef == null) ? 0 : svIdRef.hashCode());
		result = prime * result + ((svName == null) ? 0 : svName.hashCode());
		result = prime * result + ((svType == null) ? 0 : svType.hashCode());
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
		CpbService other = (CpbService) obj;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (svCode == null) {
			if (other.svCode != null)
				return false;
		} else if (!svCode.equals(other.svCode))
			return false;
		if (svId == null) {
			if (other.svId != null)
				return false;
		} else if (!svId.equals(other.svId))
			return false;
		if (svIdRef == null) {
			if (other.svIdRef != null)
				return false;
		} else if (!svIdRef.equals(other.svIdRef))
			return false;
		if (svName == null) {
			if (other.svName != null)
				return false;
		} else if (!svName.equals(other.svName))
			return false;
		if (svType == null) {
			if (other.svType != null)
				return false;
		} else if (!svType.equals(other.svType))
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