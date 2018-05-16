package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class eqReqAction {

	private Long raId;
	private String raReqNo;
	private Integer raType;
	private String raDetail;
	private String raSendFrom;
	private Long raSendFromRole;
	private Long raSendFromOrg;
	private Date raSendDate;
	private Date updateDatetime;
	private String updateUser;
	private String raSendTo;

	@JsonIgnore

	public eqReqAction() {
		super();
	}

	public eqReqAction(Long raId, String raReqNo, Integer raType, String raDetail, String raSendFrom, Long raSendFromRole, Long raSendFromOrg, Date raSendDate, Date updateDatetime, String updateUser, String raSendTo) {
		super();
		this.raId = raId;
		this.raReqNo = raReqNo;
		this.raType = raType;
		this.raDetail = raDetail;
		this.raSendFrom = raSendFrom;
		this.raSendFromRole = raSendFromRole;
		this.raSendFromOrg = raSendFromOrg;
		this.raSendDate = raSendDate;
		this.updateDatetime = updateDatetime;
		this.updateUser = updateUser;
		this.raSendTo = raSendTo;
	}

	public Long getRaId() {
		return raId;
	}

	public String getRaReqNo() {
		return raReqNo;
	}

	public Integer getRaType() {
		return raType;
	}

	public String getRaDetail() {
		return raDetail;
	}

	public String getRaSendFrom() {
		return raSendFrom;
	}

	public Long getRaSendFromRole() {
		return raSendFromRole;
	}

	public Long getRaSendFromOrg() {
		return raSendFromOrg;
	}

	public Date getRaSendDate() {
		return raSendDate;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public String getRaSendTo() {
		return raSendTo;
	}

	public void setRaId(Long raId) {
		this.raId = raId;
	}

	public void setRaReqNo(String raReqNo) {
		this.raReqNo = raReqNo;
	}

	public void setRaType(Integer raType) {
		this.raType = raType;
	}

	public void setRaDetail(String raDetail) {
		this.raDetail = raDetail;
	}

	public void setRaSendFrom(String raSendFrom) {
		this.raSendFrom = raSendFrom;
	}

	public void setRaSendFromRole(Long raSendFromRole) {
		this.raSendFromRole = raSendFromRole;
	}

	public void setRaSendFromOrg(Long raSendFromOrg) {
		this.raSendFromOrg = raSendFromOrg;
	}

	public void setRaSendDate(Date raSendDate) {
		this.raSendDate = raSendDate;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setRaSendTo(String raSendTo) {
		this.raSendTo = raSendTo;
	}


	@Override
	public String toString() {
		return "eqReqAction [raId = " + raId + ", raReqNo = " + raReqNo + ", raType = " + raType + ", raDetail = " + raDetail + ", raSendFrom = " + raSendFrom + ", raSendFromRole = " + raSendFromRole + ", raSendFromOrg = " + raSendFromOrg + ", raSendDate = " + raSendDate + ", updateDatetime = " + updateDatetime + ", updateUser = " + updateUser + ", raSendTo = " + raSendTo + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((raDetail == null) ? 0 : raDetail.hashCode());
		result = prime * result + ((raId == null) ? 0 : raId.hashCode());
		result = prime * result + ((raReqNo == null) ? 0 : raReqNo.hashCode());
		result = prime * result + ((raSendDate == null) ? 0 : raSendDate.hashCode());
		result = prime * result + ((raSendFrom == null) ? 0 : raSendFrom.hashCode());
		result = prime * result + ((raSendFromOrg == null) ? 0 : raSendFromOrg.hashCode());
		result = prime * result + ((raSendFromRole == null) ? 0 : raSendFromRole.hashCode());
		result = prime * result + ((raSendTo == null) ? 0 : raSendTo.hashCode());
		result = prime * result + ((raType == null) ? 0 : raType.hashCode());
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
		eqReqAction other = (eqReqAction) obj;
		if (raDetail == null) {
			if (other.raDetail != null)
				return false;
		} else if (!raDetail.equals(other.raDetail))
			return false;
		if (raId == null) {
			if (other.raId != null)
				return false;
		} else if (!raId.equals(other.raId))
			return false;
		if (raReqNo == null) {
			if (other.raReqNo != null)
				return false;
		} else if (!raReqNo.equals(other.raReqNo))
			return false;
		if (raSendDate == null) {
			if (other.raSendDate != null)
				return false;
		} else if (!raSendDate.equals(other.raSendDate))
			return false;
		if (raSendFrom == null) {
			if (other.raSendFrom != null)
				return false;
		} else if (!raSendFrom.equals(other.raSendFrom))
			return false;
		if (raSendFromOrg == null) {
			if (other.raSendFromOrg != null)
				return false;
		} else if (!raSendFromOrg.equals(other.raSendFromOrg))
			return false;
		if (raSendFromRole == null) {
			if (other.raSendFromRole != null)
				return false;
		} else if (!raSendFromRole.equals(other.raSendFromRole))
			return false;
		if (raSendTo == null) {
			if (other.raSendTo != null)
				return false;
		} else if (!raSendTo.equals(other.raSendTo))
			return false;
		if (raType == null) {
			if (other.raType != null)
				return false;
		} else if (!raType.equals(other.raType))
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