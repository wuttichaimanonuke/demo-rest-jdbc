package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class edReqMoveDocTranFlow {

	private Integer rmdTranFlowId;
	private Integer rmdTranId;
	private String rmdTranStatus;
	private String createUser;
	private Date createDatetime;

	@JsonIgnore

	public edReqMoveDocTranFlow() {
		super();
	}

	public edReqMoveDocTranFlow(Integer rmdTranFlowId, Integer rmdTranId, String rmdTranStatus, String createUser, Date createDatetime) {
		super();
		this.rmdTranFlowId = rmdTranFlowId;
		this.rmdTranId = rmdTranId;
		this.rmdTranStatus = rmdTranStatus;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
	}

	public Integer getRmdTranFlowId() {
		return rmdTranFlowId;
	}

	public Integer getRmdTranId() {
		return rmdTranId;
	}

	public String getRmdTranStatus() {
		return rmdTranStatus;
	}

	public String getCreateUser() {
		return createUser;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public void setRmdTranFlowId(Integer rmdTranFlowId) {
		this.rmdTranFlowId = rmdTranFlowId;
	}

	public void setRmdTranId(Integer rmdTranId) {
		this.rmdTranId = rmdTranId;
	}

	public void setRmdTranStatus(String rmdTranStatus) {
		this.rmdTranStatus = rmdTranStatus;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}


	@Override
	public String toString() {
		return "edReqMoveDocTranFlow [rmdTranFlowId = " + rmdTranFlowId + ", rmdTranId = " + rmdTranId + ", rmdTranStatus = " + rmdTranStatus + ", createUser = " + createUser + ", createDatetime = " + createDatetime + "]";
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
		result = prime * result + ((rmdTranFlowId == null) ? 0 : rmdTranFlowId.hashCode());
		result = prime * result + ((rmdTranId == null) ? 0 : rmdTranId.hashCode());
		result = prime * result + ((rmdTranStatus == null) ? 0 : rmdTranStatus.hashCode());
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
		edReqMoveDocTranFlow other = (edReqMoveDocTranFlow) obj;
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
		if (rmdTranFlowId == null) {
			if (other.rmdTranFlowId != null)
				return false;
		} else if (!rmdTranFlowId.equals(other.rmdTranFlowId))
			return false;
		if (rmdTranId == null) {
			if (other.rmdTranId != null)
				return false;
		} else if (!rmdTranId.equals(other.rmdTranId))
			return false;
		if (rmdTranStatus == null) {
			if (other.rmdTranStatus != null)
				return false;
		} else if (!rmdTranStatus.equals(other.rmdTranStatus))
			return false;
		return true;
	}

}