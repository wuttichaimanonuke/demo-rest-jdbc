package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbFlow {

	private Long flowId;
	private String flowCode;
	private String flowName;
	private Integer status;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public esbFlow() {
		super();
	}

	public esbFlow(Long flowId, String flowCode, String flowName, Integer status, String updateUser, Date updateDatetime) {
		super();
		this.flowId = flowId;
		this.flowCode = flowCode;
		this.flowName = flowName;
		this.status = status;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getFlowId() {
		return flowId;
	}

	public String getFlowCode() {
		return flowCode;
	}

	public String getFlowName() {
		return flowName;
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

	public void setFlowId(Long flowId) {
		this.flowId = flowId;
	}

	public void setFlowCode(String flowCode) {
		this.flowCode = flowCode;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
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


	@Override
	public String toString() {
		return "esbFlow [flowId = " + flowId + ", flowCode = " + flowCode + ", flowName = " + flowName + ", status = " + status + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowCode == null) ? 0 : flowCode.hashCode());
		result = prime * result + ((flowId == null) ? 0 : flowId.hashCode());
		result = prime * result + ((flowName == null) ? 0 : flowName.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		esbFlow other = (esbFlow) obj;
		if (flowCode == null) {
			if (other.flowCode != null)
				return false;
		} else if (!flowCode.equals(other.flowCode))
			return false;
		if (flowId == null) {
			if (other.flowId != null)
				return false;
		} else if (!flowId.equals(other.flowId))
			return false;
		if (flowName == null) {
			if (other.flowName != null)
				return false;
		} else if (!flowName.equals(other.flowName))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
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