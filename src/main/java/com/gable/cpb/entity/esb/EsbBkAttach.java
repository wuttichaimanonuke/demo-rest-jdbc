package com.gable.cpb.entity.esb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbBkAttach {

	private Long attId;
	private Long bkId;
	private Integer attType;
	private String docId;
	private Long bkIdFrom;
	private Long bkIdTo;
	private String remark;
	private Long addUserId;
	private Date addDatetime;
	private Integer stattus;
	private String updateUser;
	private Date updateDatetime;
	private Long addRole;

	@JsonIgnore

	public EsbBkAttach() {
		super();
	}

	public EsbBkAttach(Long attId, Long bkId, Integer attType, String docId, Long bkIdFrom, Long bkIdTo, String remark, Long addUserId, Date addDatetime, Integer stattus, String updateUser, Date updateDatetime, Long addRole) {
		super();
		this.attId = attId;
		this.bkId = bkId;
		this.attType = attType;
		this.docId = docId;
		this.bkIdFrom = bkIdFrom;
		this.bkIdTo = bkIdTo;
		this.remark = remark;
		this.addUserId = addUserId;
		this.addDatetime = addDatetime;
		this.stattus = stattus;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.addRole = addRole;
	}

	public Long getAttId() {
		return attId;
	}

	public Long getBkId() {
		return bkId;
	}

	public Integer getAttType() {
		return attType;
	}

	public String getDocId() {
		return docId;
	}

	public Long getBkIdFrom() {
		return bkIdFrom;
	}

	public Long getBkIdTo() {
		return bkIdTo;
	}

	public String getRemark() {
		return remark;
	}

	public Long getAddUserId() {
		return addUserId;
	}

	public Date getAddDatetime() {
		return addDatetime;
	}

	public Integer getStattus() {
		return stattus;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public Long getAddRole() {
		return addRole;
	}

	public void setAttId(Long attId) {
		this.attId = attId;
	}

	public void setBkId(Long bkId) {
		this.bkId = bkId;
	}

	public void setAttType(Integer attType) {
		this.attType = attType;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public void setBkIdFrom(Long bkIdFrom) {
		this.bkIdFrom = bkIdFrom;
	}

	public void setBkIdTo(Long bkIdTo) {
		this.bkIdTo = bkIdTo;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setAddUserId(Long addUserId) {
		this.addUserId = addUserId;
	}

	public void setAddDatetime(Date addDatetime) {
		this.addDatetime = addDatetime;
	}

	public void setStattus(Integer stattus) {
		this.stattus = stattus;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setAddRole(Long addRole) {
		this.addRole = addRole;
	}


	@Override
	public String toString() {
		return "esbBkAttach [attId = " + attId + ", bkId = " + bkId + ", attType = " + attType + ", docId = " + docId + ", bkIdFrom = " + bkIdFrom + ", bkIdTo = " + bkIdTo + ", remark = " + remark + ", addUserId = " + addUserId + ", addDatetime = " + addDatetime + ", stattus = " + stattus + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", addRole = " + addRole + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addDatetime == null) ? 0 : addDatetime.hashCode());
		result = prime * result + ((addRole == null) ? 0 : addRole.hashCode());
		result = prime * result + ((addUserId == null) ? 0 : addUserId.hashCode());
		result = prime * result + ((attId == null) ? 0 : attId.hashCode());
		result = prime * result + ((attType == null) ? 0 : attType.hashCode());
		result = prime * result + ((bkId == null) ? 0 : bkId.hashCode());
		result = prime * result + ((bkIdFrom == null) ? 0 : bkIdFrom.hashCode());
		result = prime * result + ((bkIdTo == null) ? 0 : bkIdTo.hashCode());
		result = prime * result + ((docId == null) ? 0 : docId.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((stattus == null) ? 0 : stattus.hashCode());
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
		EsbBkAttach other = (EsbBkAttach) obj;
		if (addDatetime == null) {
			if (other.addDatetime != null)
				return false;
		} else if (!addDatetime.equals(other.addDatetime))
			return false;
		if (addRole == null) {
			if (other.addRole != null)
				return false;
		} else if (!addRole.equals(other.addRole))
			return false;
		if (addUserId == null) {
			if (other.addUserId != null)
				return false;
		} else if (!addUserId.equals(other.addUserId))
			return false;
		if (attId == null) {
			if (other.attId != null)
				return false;
		} else if (!attId.equals(other.attId))
			return false;
		if (attType == null) {
			if (other.attType != null)
				return false;
		} else if (!attType.equals(other.attType))
			return false;
		if (bkId == null) {
			if (other.bkId != null)
				return false;
		} else if (!bkId.equals(other.bkId))
			return false;
		if (bkIdFrom == null) {
			if (other.bkIdFrom != null)
				return false;
		} else if (!bkIdFrom.equals(other.bkIdFrom))
			return false;
		if (bkIdTo == null) {
			if (other.bkIdTo != null)
				return false;
		} else if (!bkIdTo.equals(other.bkIdTo))
			return false;
		if (docId == null) {
			if (other.docId != null)
				return false;
		} else if (!docId.equals(other.docId))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (stattus == null) {
			if (other.stattus != null)
				return false;
		} else if (!stattus.equals(other.stattus))
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