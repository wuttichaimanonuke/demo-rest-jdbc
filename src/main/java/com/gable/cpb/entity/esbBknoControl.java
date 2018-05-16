package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbBknoControl {

	private Long ctId;
	private Integer ctSecret;
	private Long orgId;
	private Long roleId;
	private Integer bkType;
	private String ctName;
	private String updateUser;
	private Date updateDatetime;
	private Integer status;

	@JsonIgnore

	public esbBknoControl() {
		super();
	}

	public esbBknoControl(Long ctId, Integer ctSecret, Long orgId, Long roleId, Integer bkType, String ctName, String updateUser, Date updateDatetime, Integer status) {
		super();
		this.ctId = ctId;
		this.ctSecret = ctSecret;
		this.orgId = orgId;
		this.roleId = roleId;
		this.bkType = bkType;
		this.ctName = ctName;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.status = status;
	}

	public Long getCtId() {
		return ctId;
	}

	public Integer getCtSecret() {
		return ctSecret;
	}

	public Long getOrgId() {
		return orgId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public Integer getBkType() {
		return bkType;
	}

	public String getCtName() {
		return ctName;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setCtId(Long ctId) {
		this.ctId = ctId;
	}

	public void setCtSecret(Integer ctSecret) {
		this.ctSecret = ctSecret;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public void setBkType(Integer bkType) {
		this.bkType = bkType;
	}

	public void setCtName(String ctName) {
		this.ctName = ctName;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "esbBknoControl [ctId = " + ctId + ", ctSecret = " + ctSecret + ", orgId = " + orgId + ", roleId = " + roleId + ", bkType = " + bkType + ", ctName = " + ctName + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", status = " + status + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bkType == null) ? 0 : bkType.hashCode());
		result = prime * result + ((ctId == null) ? 0 : ctId.hashCode());
		result = prime * result + ((ctName == null) ? 0 : ctName.hashCode());
		result = prime * result + ((ctSecret == null) ? 0 : ctSecret.hashCode());
		result = prime * result + ((orgId == null) ? 0 : orgId.hashCode());
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
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
		esbBknoControl other = (esbBknoControl) obj;
		if (bkType == null) {
			if (other.bkType != null)
				return false;
		} else if (!bkType.equals(other.bkType))
			return false;
		if (ctId == null) {
			if (other.ctId != null)
				return false;
		} else if (!ctId.equals(other.ctId))
			return false;
		if (ctName == null) {
			if (other.ctName != null)
				return false;
		} else if (!ctName.equals(other.ctName))
			return false;
		if (ctSecret == null) {
			if (other.ctSecret != null)
				return false;
		} else if (!ctSecret.equals(other.ctSecret))
			return false;
		if (orgId == null) {
			if (other.orgId != null)
				return false;
		} else if (!orgId.equals(other.orgId))
			return false;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
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