package com.gable.cpb.entity.esb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbGetbackOrg {

	private Long gbId;
	private Long mainOrgId;
	private Long getBackOrgId;
	private Integer sarabanFlag;
	private Date updateDate;
	private String updateUser;

	@JsonIgnore

	public EsbGetbackOrg() {
		super();
	}

	public EsbGetbackOrg(Long gbId, Long mainOrgId, Long getBackOrgId, Integer sarabanFlag, Date updateDate, String updateUser) {
		super();
		this.gbId = gbId;
		this.mainOrgId = mainOrgId;
		this.getBackOrgId = getBackOrgId;
		this.sarabanFlag = sarabanFlag;
		this.updateDate = updateDate;
		this.updateUser = updateUser;
	}

	public Long getGbId() {
		return gbId;
	}

	public Long getMainOrgId() {
		return mainOrgId;
	}

	public Long getGetBackOrgId() {
		return getBackOrgId;
	}

	public Integer getSarabanFlag() {
		return sarabanFlag;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setGbId(Long gbId) {
		this.gbId = gbId;
	}

	public void setMainOrgId(Long mainOrgId) {
		this.mainOrgId = mainOrgId;
	}

	public void setGetBackOrgId(Long getBackOrgId) {
		this.getBackOrgId = getBackOrgId;
	}

	public void setSarabanFlag(Integer sarabanFlag) {
		this.sarabanFlag = sarabanFlag;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}


	@Override
	public String toString() {
		return "esbGetbackOrg [gbId = " + gbId + ", mainOrgId = " + mainOrgId + ", getBackOrgId = " + getBackOrgId + ", sarabanFlag = " + sarabanFlag + ", updateDate = " + updateDate + ", updateUser = " + updateUser + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gbId == null) ? 0 : gbId.hashCode());
		result = prime * result + ((getBackOrgId == null) ? 0 : getBackOrgId.hashCode());
		result = prime * result + ((mainOrgId == null) ? 0 : mainOrgId.hashCode());
		result = prime * result + ((sarabanFlag == null) ? 0 : sarabanFlag.hashCode());
		result = prime * result + ((updateDate == null) ? 0 : updateDate.hashCode());
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
		EsbGetbackOrg other = (EsbGetbackOrg) obj;
		if (gbId == null) {
			if (other.gbId != null)
				return false;
		} else if (!gbId.equals(other.gbId))
			return false;
		if (getBackOrgId == null) {
			if (other.getBackOrgId != null)
				return false;
		} else if (!getBackOrgId.equals(other.getBackOrgId))
			return false;
		if (mainOrgId == null) {
			if (other.mainOrgId != null)
				return false;
		} else if (!mainOrgId.equals(other.mainOrgId))
			return false;
		if (sarabanFlag == null) {
			if (other.sarabanFlag != null)
				return false;
		} else if (!sarabanFlag.equals(other.sarabanFlag))
			return false;
		if (updateDate == null) {
			if (other.updateDate != null)
				return false;
		} else if (!updateDate.equals(other.updateDate))
			return false;
		if (updateUser == null) {
			if (other.updateUser != null)
				return false;
		} else if (!updateUser.equals(other.updateUser))
			return false;
		return true;
	}

}