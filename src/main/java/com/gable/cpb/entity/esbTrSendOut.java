package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbTrSendOut {

	private Long trId;
	private Integer sendType;
	private Date sendDate;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public esbTrSendOut() {
		super();
	}

	public esbTrSendOut(Long trId, Integer sendType, Date sendDate, String updateUser, Date updateDatetime) {
		super();
		this.trId = trId;
		this.sendType = sendType;
		this.sendDate = sendDate;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getTrId() {
		return trId;
	}

	public Integer getSendType() {
		return sendType;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setTrId(Long trId) {
		this.trId = trId;
	}

	public void setSendType(Integer sendType) {
		this.sendType = sendType;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "esbTrSendOut [trId = " + trId + ", sendType = " + sendType + ", sendDate = " + sendDate + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sendDate == null) ? 0 : sendDate.hashCode());
		result = prime * result + ((sendType == null) ? 0 : sendType.hashCode());
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
		esbTrSendOut other = (esbTrSendOut) obj;
		if (sendDate == null) {
			if (other.sendDate != null)
				return false;
		} else if (!sendDate.equals(other.sendDate))
			return false;
		if (sendType == null) {
			if (other.sendType != null)
				return false;
		} else if (!sendType.equals(other.sendType))
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