package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbAddrBookOut {

	private Long adId;
	private Long userId;
	private Long adOrder;
	private Long orgId;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public esbAddrBookOut() {
		super();
	}

	public esbAddrBookOut(Long adId, Long userId, Long adOrder, Long orgId, String updateUser, Date updateDatetime) {
		super();
		this.adId = adId;
		this.userId = userId;
		this.adOrder = adOrder;
		this.orgId = orgId;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getAdId() {
		return adId;
	}

	public Long getUserId() {
		return userId;
	}

	public Long getAdOrder() {
		return adOrder;
	}

	public Long getOrgId() {
		return orgId;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setAdId(Long adId) {
		this.adId = adId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setAdOrder(Long adOrder) {
		this.adOrder = adOrder;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "esbAddrBookOut [adId = " + adId + ", userId = " + userId + ", adOrder = " + adOrder + ", orgId = " + orgId + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adId == null) ? 0 : adId.hashCode());
		result = prime * result + ((adOrder == null) ? 0 : adOrder.hashCode());
		result = prime * result + ((orgId == null) ? 0 : orgId.hashCode());
		result = prime * result + ((updateDatetime == null) ? 0 : updateDatetime.hashCode());
		result = prime * result + ((updateUser == null) ? 0 : updateUser.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		esbAddrBookOut other = (esbAddrBookOut) obj;
		if (adId == null) {
			if (other.adId != null)
				return false;
		} else if (!adId.equals(other.adId))
			return false;
		if (adOrder == null) {
			if (other.adOrder != null)
				return false;
		} else if (!adOrder.equals(other.adOrder))
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
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

}