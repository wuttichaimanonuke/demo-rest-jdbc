package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbBkCycle {

	private Long cycId;
	private Long bkId;
	private Integer sendType;
	private Long sendTrId;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public esbBkCycle() {
		super();
	}

	public esbBkCycle(Long cycId, Long bkId, Integer sendType, Long sendTrId, String updateUser, Date updateDatetime) {
		super();
		this.cycId = cycId;
		this.bkId = bkId;
		this.sendType = sendType;
		this.sendTrId = sendTrId;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getCycId() {
		return cycId;
	}

	public Long getBkId() {
		return bkId;
	}

	public Integer getSendType() {
		return sendType;
	}

	public Long getSendTrId() {
		return sendTrId;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setCycId(Long cycId) {
		this.cycId = cycId;
	}

	public void setBkId(Long bkId) {
		this.bkId = bkId;
	}

	public void setSendType(Integer sendType) {
		this.sendType = sendType;
	}

	public void setSendTrId(Long sendTrId) {
		this.sendTrId = sendTrId;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "esbBkCycle [cycId = " + cycId + ", bkId = " + bkId + ", sendType = " + sendType + ", sendTrId = " + sendTrId + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bkId == null) ? 0 : bkId.hashCode());
		result = prime * result + ((cycId == null) ? 0 : cycId.hashCode());
		result = prime * result + ((sendTrId == null) ? 0 : sendTrId.hashCode());
		result = prime * result + ((sendType == null) ? 0 : sendType.hashCode());
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
		esbBkCycle other = (esbBkCycle) obj;
		if (bkId == null) {
			if (other.bkId != null)
				return false;
		} else if (!bkId.equals(other.bkId))
			return false;
		if (cycId == null) {
			if (other.cycId != null)
				return false;
		} else if (!cycId.equals(other.cycId))
			return false;
		if (sendTrId == null) {
			if (other.sendTrId != null)
				return false;
		} else if (!sendTrId.equals(other.sendTrId))
			return false;
		if (sendType == null) {
			if (other.sendType != null)
				return false;
		} else if (!sendType.equals(other.sendType))
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