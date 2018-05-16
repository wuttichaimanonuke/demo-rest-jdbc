package com.gable.cpb.entity.esb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbStampOrg {

	private Long orgId;
	private Long mainOrgId;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public EsbStampOrg() {
		super();
	}

	public EsbStampOrg(Long orgId, Long mainOrgId, String updateUser, Date updateDatetime) {
		super();
		this.orgId = orgId;
		this.mainOrgId = mainOrgId;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getOrgId() {
		return orgId;
	}

	public Long getMainOrgId() {
		return mainOrgId;
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

	public void setMainOrgId(Long mainOrgId) {
		this.mainOrgId = mainOrgId;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "esbStampOrg [orgId = " + orgId + ", mainOrgId = " + mainOrgId + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mainOrgId == null) ? 0 : mainOrgId.hashCode());
		result = prime * result + ((orgId == null) ? 0 : orgId.hashCode());
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
		EsbStampOrg other = (EsbStampOrg) obj;
		if (mainOrgId == null) {
			if (other.mainOrgId != null)
				return false;
		} else if (!mainOrgId.equals(other.mainOrgId))
			return false;
		if (orgId == null) {
			if (other.orgId != null)
				return false;
		} else if (!orgId.equals(other.orgId))
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