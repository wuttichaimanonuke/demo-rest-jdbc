package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbFlStepOff {

	private Long stepId;
	private Long flowId;
	private String stepDesc;
	private Long orgId;
	private Long roleId;
	private Long userId;
	private Integer status;
	private String updateUser;
	private Date updateDatetime;
	private Long stepOrder;

	@JsonIgnore

	public esbFlStepOff() {
		super();
	}

	public esbFlStepOff(Long stepId, Long flowId, String stepDesc, Long orgId, Long roleId, Long userId, Integer status, String updateUser, Date updateDatetime, Long stepOrder) {
		super();
		this.stepId = stepId;
		this.flowId = flowId;
		this.stepDesc = stepDesc;
		this.orgId = orgId;
		this.roleId = roleId;
		this.userId = userId;
		this.status = status;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.stepOrder = stepOrder;
	}

	public Long getStepId() {
		return stepId;
	}

	public Long getFlowId() {
		return flowId;
	}

	public String getStepDesc() {
		return stepDesc;
	}

	public Long getOrgId() {
		return orgId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public Long getUserId() {
		return userId;
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

	public void setStepId(Long stepId) {
		this.stepId = stepId;
	}

	public void setFlowId(Long flowId) {
		this.flowId = flowId;
	}

	public void setStepDesc(String stepDesc) {
		this.stepDesc = stepDesc;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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


	@Override
	public String toString() {
		return "esbFlStepOff [stepId = " + stepId + ", flowId = " + flowId + ", stepDesc = " + stepDesc + ", orgId = " + orgId + ", roleId = " + roleId + ", userId = " + userId + ", status = " + status + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", stepOrder = " + stepOrder + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowId == null) ? 0 : flowId.hashCode());
		result = prime * result + ((orgId == null) ? 0 : orgId.hashCode());
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((stepDesc == null) ? 0 : stepDesc.hashCode());
		result = prime * result + ((stepId == null) ? 0 : stepId.hashCode());
		result = prime * result + ((stepOrder == null) ? 0 : stepOrder.hashCode());
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
		esbFlStepOff other = (esbFlStepOff) obj;
		if (flowId == null) {
			if (other.flowId != null)
				return false;
		} else if (!flowId.equals(other.flowId))
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
		if (stepDesc == null) {
			if (other.stepDesc != null)
				return false;
		} else if (!stepDesc.equals(other.stepDesc))
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