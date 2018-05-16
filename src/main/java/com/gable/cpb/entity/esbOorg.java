package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbOorg {

	private Long orgId;
	private String orgCode;
	private String orgName;
	private String orgSname;
	private Long orgIdRef;
	private Integer orgType;
	private Integer status;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public esbOorg() {
		super();
	}

	public esbOorg(Long orgId, String orgCode, String orgName, String orgSname, Long orgIdRef, Integer orgType, Integer status, String updateUser, Date updateDatetime) {
		super();
		this.orgId = orgId;
		this.orgCode = orgCode;
		this.orgName = orgName;
		this.orgSname = orgSname;
		this.orgIdRef = orgIdRef;
		this.orgType = orgType;
		this.status = status;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getOrgId() {
		return orgId;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public String getOrgName() {
		return orgName;
	}

	public String getOrgSname() {
		return orgSname;
	}

	public Long getOrgIdRef() {
		return orgIdRef;
	}

	public Integer getOrgType() {
		return orgType;
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

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public void setOrgSname(String orgSname) {
		this.orgSname = orgSname;
	}

	public void setOrgIdRef(Long orgIdRef) {
		this.orgIdRef = orgIdRef;
	}

	public void setOrgType(Integer orgType) {
		this.orgType = orgType;
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
		return "esbOorg [orgId = " + orgId + ", orgCode = " + orgCode + ", orgName = " + orgName + ", orgSname = " + orgSname + ", orgIdRef = " + orgIdRef + ", orgType = " + orgType + ", status = " + status + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orgCode == null) ? 0 : orgCode.hashCode());
		result = prime * result + ((orgId == null) ? 0 : orgId.hashCode());
		result = prime * result + ((orgIdRef == null) ? 0 : orgIdRef.hashCode());
		result = prime * result + ((orgName == null) ? 0 : orgName.hashCode());
		result = prime * result + ((orgSname == null) ? 0 : orgSname.hashCode());
		result = prime * result + ((orgType == null) ? 0 : orgType.hashCode());
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
		esbOorg other = (esbOorg) obj;
		if (orgCode == null) {
			if (other.orgCode != null)
				return false;
		} else if (!orgCode.equals(other.orgCode))
			return false;
		if (orgId == null) {
			if (other.orgId != null)
				return false;
		} else if (!orgId.equals(other.orgId))
			return false;
		if (orgIdRef == null) {
			if (other.orgIdRef != null)
				return false;
		} else if (!orgIdRef.equals(other.orgIdRef))
			return false;
		if (orgName == null) {
			if (other.orgName != null)
				return false;
		} else if (!orgName.equals(other.orgName))
			return false;
		if (orgSname == null) {
			if (other.orgSname != null)
				return false;
		} else if (!orgSname.equals(other.orgSname))
			return false;
		if (orgType == null) {
			if (other.orgType != null)
				return false;
		} else if (!orgType.equals(other.orgType))
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