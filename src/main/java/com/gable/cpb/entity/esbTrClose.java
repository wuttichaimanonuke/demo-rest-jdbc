package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbTrClose {

	private Long ctId;
	private Long trId;
	private Integer storeType;
	private Long ownerOrg;
	private String updateUser;
	private Date updateDatetime;
	private String rwReqNo;
	private Long attBkId;

	@JsonIgnore

	public esbTrClose() {
		super();
	}

	public esbTrClose(Long ctId, Long trId, Integer storeType, Long ownerOrg, String updateUser, Date updateDatetime, String rwReqNo, Long attBkId) {
		super();
		this.ctId = ctId;
		this.trId = trId;
		this.storeType = storeType;
		this.ownerOrg = ownerOrg;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.rwReqNo = rwReqNo;
		this.attBkId = attBkId;
	}

	public Long getCtId() {
		return ctId;
	}

	public Long getTrId() {
		return trId;
	}

	public Integer getStoreType() {
		return storeType;
	}

	public Long getOwnerOrg() {
		return ownerOrg;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public String getRwReqNo() {
		return rwReqNo;
	}

	public Long getAttBkId() {
		return attBkId;
	}

	public void setCtId(Long ctId) {
		this.ctId = ctId;
	}

	public void setTrId(Long trId) {
		this.trId = trId;
	}

	public void setStoreType(Integer storeType) {
		this.storeType = storeType;
	}

	public void setOwnerOrg(Long ownerOrg) {
		this.ownerOrg = ownerOrg;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setRwReqNo(String rwReqNo) {
		this.rwReqNo = rwReqNo;
	}

	public void setAttBkId(Long attBkId) {
		this.attBkId = attBkId;
	}


	@Override
	public String toString() {
		return "esbTrClose [ctId = " + ctId + ", trId = " + trId + ", storeType = " + storeType + ", ownerOrg = " + ownerOrg + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", rwReqNo = " + rwReqNo + ", attBkId = " + attBkId + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attBkId == null) ? 0 : attBkId.hashCode());
		result = prime * result + ((ctId == null) ? 0 : ctId.hashCode());
		result = prime * result + ((ownerOrg == null) ? 0 : ownerOrg.hashCode());
		result = prime * result + ((rwReqNo == null) ? 0 : rwReqNo.hashCode());
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
		esbTrClose other = (esbTrClose) obj;
		if (attBkId == null) {
			if (other.attBkId != null)
				return false;
		} else if (!attBkId.equals(other.attBkId))
			return false;
		if (ctId == null) {
			if (other.ctId != null)
				return false;
		} else if (!ctId.equals(other.ctId))
			return false;
		if (ownerOrg == null) {
			if (other.ownerOrg != null)
				return false;
		} else if (!ownerOrg.equals(other.ownerOrg))
			return false;
		if (rwReqNo == null) {
			if (other.rwReqNo != null)
				return false;
		} else if (!rwReqNo.equals(other.rwReqNo))
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