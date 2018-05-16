package com.gable.cpb.entity.esb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbBkFlow {

	private Long bkId;
	private Long stepId;
	private Long toOrgId;
	private Long toRoleId;
	private Long toUserId;
	private Long sendTrId;
	private Integer status;
	private String updateUser;
	private Date updateDatetime;
	private Long stepOrder;
	private Long stampOutTrId;
	private Long stampInTrId;

	@JsonIgnore

	public EsbBkFlow() {
		super();
	}

	public EsbBkFlow(Long bkId, Long stepId, Long toOrgId, Long toRoleId, Long toUserId, Long sendTrId, Integer status, String updateUser, Date updateDatetime, Long stepOrder, Long stampOutTrId, Long stampInTrId) {
		super();
		this.bkId = bkId;
		this.stepId = stepId;
		this.toOrgId = toOrgId;
		this.toRoleId = toRoleId;
		this.toUserId = toUserId;
		this.sendTrId = sendTrId;
		this.status = status;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.stepOrder = stepOrder;
		this.stampOutTrId = stampOutTrId;
		this.stampInTrId = stampInTrId;
	}

	public Long getBkId() {
		return bkId;
	}

	public Long getStepId() {
		return stepId;
	}

	public Long getToOrgId() {
		return toOrgId;
	}

	public Long getToRoleId() {
		return toRoleId;
	}

	public Long getToUserId() {
		return toUserId;
	}

	public Long getSendTrId() {
		return sendTrId;
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

	public Long getStepOrder() {
		return stepOrder;
	}

	public Long getStampOutTrId() {
		return stampOutTrId;
	}

	public Long getStampInTrId() {
		return stampInTrId;
	}

	public void setBkId(Long bkId) {
		this.bkId = bkId;
	}

	public void setStepId(Long stepId) {
		this.stepId = stepId;
	}

	public void setToOrgId(Long toOrgId) {
		this.toOrgId = toOrgId;
	}

	public void setToRoleId(Long toRoleId) {
		this.toRoleId = toRoleId;
	}

	public void setToUserId(Long toUserId) {
		this.toUserId = toUserId;
	}

	public void setSendTrId(Long sendTrId) {
		this.sendTrId = sendTrId;
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

	public void setStepOrder(Long stepOrder) {
		this.stepOrder = stepOrder;
	}

	public void setStampOutTrId(Long stampOutTrId) {
		this.stampOutTrId = stampOutTrId;
	}

	public void setStampInTrId(Long stampInTrId) {
		this.stampInTrId = stampInTrId;
	}


	@Override
	public String toString() {
		return "esbBkFlow [bkId = " + bkId + ", stepId = " + stepId + ", toOrgId = " + toOrgId + ", toRoleId = " + toRoleId + ", toUserId = " + toUserId + ", sendTrId = " + sendTrId + ", status = " + status + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", stepOrder = " + stepOrder + ", stampOutTrId = " + stampOutTrId + ", stampInTrId = " + stampInTrId + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bkId == null) ? 0 : bkId.hashCode());
		result = prime * result + ((sendTrId == null) ? 0 : sendTrId.hashCode());
		result = prime * result + ((stampInTrId == null) ? 0 : stampInTrId.hashCode());
		result = prime * result + ((stampOutTrId == null) ? 0 : stampOutTrId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((stepId == null) ? 0 : stepId.hashCode());
		result = prime * result + ((stepOrder == null) ? 0 : stepOrder.hashCode());
		result = prime * result + ((toOrgId == null) ? 0 : toOrgId.hashCode());
		result = prime * result + ((toRoleId == null) ? 0 : toRoleId.hashCode());
		result = prime * result + ((toUserId == null) ? 0 : toUserId.hashCode());
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
		EsbBkFlow other = (EsbBkFlow) obj;
		if (bkId == null) {
			if (other.bkId != null)
				return false;
		} else if (!bkId.equals(other.bkId))
			return false;
		if (sendTrId == null) {
			if (other.sendTrId != null)
				return false;
		} else if (!sendTrId.equals(other.sendTrId))
			return false;
		if (stampInTrId == null) {
			if (other.stampInTrId != null)
				return false;
		} else if (!stampInTrId.equals(other.stampInTrId))
			return false;
		if (stampOutTrId == null) {
			if (other.stampOutTrId != null)
				return false;
		} else if (!stampOutTrId.equals(other.stampOutTrId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (stepId == null) {
			if (other.stepId != null)
				return false;
		} else if (!stepId.equals(other.stepId))
			return false;
		if (stepOrder == null) {
			if (other.stepOrder != null)
				return false;
		} else if (!stepOrder.equals(other.stepOrder))
			return false;
		if (toOrgId == null) {
			if (other.toOrgId != null)
				return false;
		} else if (!toOrgId.equals(other.toOrgId))
			return false;
		if (toRoleId == null) {
			if (other.toRoleId != null)
				return false;
		} else if (!toRoleId.equals(other.toRoleId))
			return false;
		if (toUserId == null) {
			if (other.toUserId != null)
				return false;
		} else if (!toUserId.equals(other.toUserId))
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