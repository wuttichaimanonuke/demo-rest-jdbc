package com.gable.cpb.entity.esb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbTrSend {

	private Long sendId;
	private Long trId;
	private Long toRoleId;
	private Long toUserId;
	private Long recvTrId;
	private Long stId;
	private String updateUser;
	private Date updateDatetime;
	private Integer flagCrossOrg;
	private Long fwTrId;

	@JsonIgnore

	public EsbTrSend() {
		super();
	}

	public EsbTrSend(Long sendId, Long trId, Long toRoleId, Long toUserId, Long recvTrId, Long stId, String updateUser, Date updateDatetime, Integer flagCrossOrg, Long fwTrId) {
		super();
		this.sendId = sendId;
		this.trId = trId;
		this.toRoleId = toRoleId;
		this.toUserId = toUserId;
		this.recvTrId = recvTrId;
		this.stId = stId;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.flagCrossOrg = flagCrossOrg;
		this.fwTrId = fwTrId;
	}

	public Long getSendId() {
		return sendId;
	}

	public Long getTrId() {
		return trId;
	}

	public Long getToRoleId() {
		return toRoleId;
	}

	public Long getToUserId() {
		return toUserId;
	}

	public Long getRecvTrId() {
		return recvTrId;
	}

	public Long getStId() {
		return stId;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public Integer getFlagCrossOrg() {
		return flagCrossOrg;
	}

	public Long getFwTrId() {
		return fwTrId;
	}

	public void setSendId(Long sendId) {
		this.sendId = sendId;
	}

	public void setTrId(Long trId) {
		this.trId = trId;
	}

	public void setToRoleId(Long toRoleId) {
		this.toRoleId = toRoleId;
	}

	public void setToUserId(Long toUserId) {
		this.toUserId = toUserId;
	}

	public void setRecvTrId(Long recvTrId) {
		this.recvTrId = recvTrId;
	}

	public void setStId(Long stId) {
		this.stId = stId;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setFlagCrossOrg(Integer flagCrossOrg) {
		this.flagCrossOrg = flagCrossOrg;
	}

	public void setFwTrId(Long fwTrId) {
		this.fwTrId = fwTrId;
	}


	@Override
	public String toString() {
		return "esbTrSend [sendId = " + sendId + ", trId = " + trId + ", toRoleId = " + toRoleId + ", toUserId = " + toUserId + ", recvTrId = " + recvTrId + ", stId = " + stId + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", flagCrossOrg = " + flagCrossOrg + ", fwTrId = " + fwTrId + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flagCrossOrg == null) ? 0 : flagCrossOrg.hashCode());
		result = prime * result + ((fwTrId == null) ? 0 : fwTrId.hashCode());
		result = prime * result + ((recvTrId == null) ? 0 : recvTrId.hashCode());
		result = prime * result + ((sendId == null) ? 0 : sendId.hashCode());
		result = prime * result + ((stId == null) ? 0 : stId.hashCode());
		result = prime * result + ((toRoleId == null) ? 0 : toRoleId.hashCode());
		result = prime * result + ((toUserId == null) ? 0 : toUserId.hashCode());
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
		EsbTrSend other = (EsbTrSend) obj;
		if (flagCrossOrg == null) {
			if (other.flagCrossOrg != null)
				return false;
		} else if (!flagCrossOrg.equals(other.flagCrossOrg))
			return false;
		if (fwTrId == null) {
			if (other.fwTrId != null)
				return false;
		} else if (!fwTrId.equals(other.fwTrId))
			return false;
		if (recvTrId == null) {
			if (other.recvTrId != null)
				return false;
		} else if (!recvTrId.equals(other.recvTrId))
			return false;
		if (sendId == null) {
			if (other.sendId != null)
				return false;
		} else if (!sendId.equals(other.sendId))
			return false;
		if (stId == null) {
			if (other.stId != null)
				return false;
		} else if (!stId.equals(other.stId))
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