package com.gable.cpb.entity.ed;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EdReq {

	private String reqNo;
	private String reqType;
	private String reqUser;
	private Long reqOrg;
	private Long reqObj;
	private Long reqRole;
	private Long reqHostOrg;
	private Long reqStoreOrg;
	private String reqReason;
	private Integer reqSpeed;
	private Date reqDate;
	private Date reqDateActual;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public EdReq() {
		super();
	}

	public EdReq(String reqNo, String reqType, String reqUser, Long reqOrg, Long reqObj, Long reqRole, Long reqHostOrg, Long reqStoreOrg, String reqReason, Integer reqSpeed, Date reqDate, Date reqDateActual, String createUser, Date createDatetime, String updateUser, Date updateDatetime) {
		super();
		this.reqNo = reqNo;
		this.reqType = reqType;
		this.reqUser = reqUser;
		this.reqOrg = reqOrg;
		this.reqObj = reqObj;
		this.reqRole = reqRole;
		this.reqHostOrg = reqHostOrg;
		this.reqStoreOrg = reqStoreOrg;
		this.reqReason = reqReason;
		this.reqSpeed = reqSpeed;
		this.reqDate = reqDate;
		this.reqDateActual = reqDateActual;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public String getReqNo() {
		return reqNo;
	}

	public String getReqType() {
		return reqType;
	}

	public String getReqUser() {
		return reqUser;
	}

	public Long getReqOrg() {
		return reqOrg;
	}

	public Long getReqObj() {
		return reqObj;
	}

	public Long getReqRole() {
		return reqRole;
	}

	public Long getReqHostOrg() {
		return reqHostOrg;
	}

	public Long getReqStoreOrg() {
		return reqStoreOrg;
	}

	public String getReqReason() {
		return reqReason;
	}

	public Integer getReqSpeed() {
		return reqSpeed;
	}

	public Date getReqDate() {
		return reqDate;
	}

	public Date getReqDateActual() {
		return reqDateActual;
	}

	public String getCreateUser() {
		return createUser;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}

	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

	public void setReqUser(String reqUser) {
		this.reqUser = reqUser;
	}

	public void setReqOrg(Long reqOrg) {
		this.reqOrg = reqOrg;
	}

	public void setReqObj(Long reqObj) {
		this.reqObj = reqObj;
	}

	public void setReqRole(Long reqRole) {
		this.reqRole = reqRole;
	}

	public void setReqHostOrg(Long reqHostOrg) {
		this.reqHostOrg = reqHostOrg;
	}

	public void setReqStoreOrg(Long reqStoreOrg) {
		this.reqStoreOrg = reqStoreOrg;
	}

	public void setReqReason(String reqReason) {
		this.reqReason = reqReason;
	}

	public void setReqSpeed(Integer reqSpeed) {
		this.reqSpeed = reqSpeed;
	}

	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}

	public void setReqDateActual(Date reqDateActual) {
		this.reqDateActual = reqDateActual;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "edReq [reqNo = " + reqNo + ", reqType = " + reqType + ", reqUser = " + reqUser + ", reqOrg = " + reqOrg + ", reqObj = " + reqObj + ", reqRole = " + reqRole + ", reqHostOrg = " + reqHostOrg + ", reqStoreOrg = " + reqStoreOrg + ", reqReason = " + reqReason + ", reqSpeed = " + reqSpeed + ", reqDate = " + reqDate + ", reqDateActual = " + reqDateActual + ", createUser = " + createUser + ", createDatetime = " + createDatetime + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createDatetime == null) ? 0 : createDatetime.hashCode());
		result = prime * result + ((createUser == null) ? 0 : createUser.hashCode());
		result = prime * result + ((reqDate == null) ? 0 : reqDate.hashCode());
		result = prime * result + ((reqDateActual == null) ? 0 : reqDateActual.hashCode());
		result = prime * result + ((reqHostOrg == null) ? 0 : reqHostOrg.hashCode());
		result = prime * result + ((reqNo == null) ? 0 : reqNo.hashCode());
		result = prime * result + ((reqObj == null) ? 0 : reqObj.hashCode());
		result = prime * result + ((reqOrg == null) ? 0 : reqOrg.hashCode());
		result = prime * result + ((reqReason == null) ? 0 : reqReason.hashCode());
		result = prime * result + ((reqRole == null) ? 0 : reqRole.hashCode());
		result = prime * result + ((reqSpeed == null) ? 0 : reqSpeed.hashCode());
		result = prime * result + ((reqStoreOrg == null) ? 0 : reqStoreOrg.hashCode());
		result = prime * result + ((reqType == null) ? 0 : reqType.hashCode());
		result = prime * result + ((reqUser == null) ? 0 : reqUser.hashCode());
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
		EdReq other = (EdReq) obj;
		if (createDatetime == null) {
			if (other.createDatetime != null)
				return false;
		} else if (!createDatetime.equals(other.createDatetime))
			return false;
		if (createUser == null) {
			if (other.createUser != null)
				return false;
		} else if (!createUser.equals(other.createUser))
			return false;
		if (reqDate == null) {
			if (other.reqDate != null)
				return false;
		} else if (!reqDate.equals(other.reqDate))
			return false;
		if (reqDateActual == null) {
			if (other.reqDateActual != null)
				return false;
		} else if (!reqDateActual.equals(other.reqDateActual))
			return false;
		if (reqHostOrg == null) {
			if (other.reqHostOrg != null)
				return false;
		} else if (!reqHostOrg.equals(other.reqHostOrg))
			return false;
		if (reqNo == null) {
			if (other.reqNo != null)
				return false;
		} else if (!reqNo.equals(other.reqNo))
			return false;
		if (reqObj == null) {
			if (other.reqObj != null)
				return false;
		} else if (!reqObj.equals(other.reqObj))
			return false;
		if (reqOrg == null) {
			if (other.reqOrg != null)
				return false;
		} else if (!reqOrg.equals(other.reqOrg))
			return false;
		if (reqReason == null) {
			if (other.reqReason != null)
				return false;
		} else if (!reqReason.equals(other.reqReason))
			return false;
		if (reqRole == null) {
			if (other.reqRole != null)
				return false;
		} else if (!reqRole.equals(other.reqRole))
			return false;
		if (reqSpeed == null) {
			if (other.reqSpeed != null)
				return false;
		} else if (!reqSpeed.equals(other.reqSpeed))
			return false;
		if (reqStoreOrg == null) {
			if (other.reqStoreOrg != null)
				return false;
		} else if (!reqStoreOrg.equals(other.reqStoreOrg))
			return false;
		if (reqType == null) {
			if (other.reqType != null)
				return false;
		} else if (!reqType.equals(other.reqType))
			return false;
		if (reqUser == null) {
			if (other.reqUser != null)
				return false;
		} else if (!reqUser.equals(other.reqUser))
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