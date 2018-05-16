package com.gable.cpb.entity.esb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbTrSendStore {

	private Long stId;
	private Long trId;
	private Long storeOrg;
	private Integer storeType;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public EsbTrSendStore() {
		super();
	}

	public EsbTrSendStore(Long stId, Long trId, Long storeOrg, Integer storeType, String updateUser, Date updateDatetime) {
		super();
		this.stId = stId;
		this.trId = trId;
		this.storeOrg = storeOrg;
		this.storeType = storeType;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getStId() {
		return stId;
	}

	public Long getTrId() {
		return trId;
	}

	public Long getStoreOrg() {
		return storeOrg;
	}

	public Integer getStoreType() {
		return storeType;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setStId(Long stId) {
		this.stId = stId;
	}

	public void setTrId(Long trId) {
		this.trId = trId;
	}

	public void setStoreOrg(Long storeOrg) {
		this.storeOrg = storeOrg;
	}

	public void setStoreType(Integer storeType) {
		this.storeType = storeType;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "esbTrSendStore [stId = " + stId + ", trId = " + trId + ", storeOrg = " + storeOrg + ", storeType = " + storeType + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stId == null) ? 0 : stId.hashCode());
		result = prime * result + ((storeOrg == null) ? 0 : storeOrg.hashCode());
		result = prime * result + ((storeType == null) ? 0 : storeType.hashCode());
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
		EsbTrSendStore other = (EsbTrSendStore) obj;
		if (stId == null) {
			if (other.stId != null)
				return false;
		} else if (!stId.equals(other.stId))
			return false;
		if (storeOrg == null) {
			if (other.storeOrg != null)
				return false;
		} else if (!storeOrg.equals(other.storeOrg))
			return false;
		if (storeType == null) {
			if (other.storeType != null)
				return false;
		} else if (!storeType.equals(other.storeType))
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