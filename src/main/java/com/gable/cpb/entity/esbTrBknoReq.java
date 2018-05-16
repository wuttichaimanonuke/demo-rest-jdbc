package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbTrBknoReq {

	private Long reqId;
	private Long trId;
	private Long ctId;
	private Integer genType;
	private String updateUser;
	private Date updateDatetime;
	private Long toRoleId;
	private Long bknId;

	@JsonIgnore

	public esbTrBknoReq() {
		super();
	}

	public esbTrBknoReq(Long reqId, Long trId, Long ctId, Integer genType, String updateUser, Date updateDatetime, Long toRoleId, Long bknId) {
		super();
		this.reqId = reqId;
		this.trId = trId;
		this.ctId = ctId;
		this.genType = genType;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.toRoleId = toRoleId;
		this.bknId = bknId;
	}

	public Long getReqId() {
		return reqId;
	}

	public Long getTrId() {
		return trId;
	}

	public Long getCtId() {
		return ctId;
	}

	public Integer getGenType() {
		return genType;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public Long getToRoleId() {
		return toRoleId;
	}

	public Long getBknId() {
		return bknId;
	}

	public void setReqId(Long reqId) {
		this.reqId = reqId;
	}

	public void setTrId(Long trId) {
		this.trId = trId;
	}

	public void setCtId(Long ctId) {
		this.ctId = ctId;
	}

	public void setGenType(Integer genType) {
		this.genType = genType;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setToRoleId(Long toRoleId) {
		this.toRoleId = toRoleId;
	}

	public void setBknId(Long bknId) {
		this.bknId = bknId;
	}


	@Override
	public String toString() {
		return "esbTrBknoReq [reqId = " + reqId + ", trId = " + trId + ", ctId = " + ctId + ", genType = " + genType + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", toRoleId = " + toRoleId + ", bknId = " + bknId + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bknId == null) ? 0 : bknId.hashCode());
		result = prime * result + ((ctId == null) ? 0 : ctId.hashCode());
		result = prime * result + ((genType == null) ? 0 : genType.hashCode());
		result = prime * result + ((reqId == null) ? 0 : reqId.hashCode());
		result = prime * result + ((toRoleId == null) ? 0 : toRoleId.hashCode());
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
		esbTrBknoReq other = (esbTrBknoReq) obj;
		if (bknId == null) {
			if (other.bknId != null)
				return false;
		} else if (!bknId.equals(other.bknId))
			return false;
		if (ctId == null) {
			if (other.ctId != null)
				return false;
		} else if (!ctId.equals(other.ctId))
			return false;
		if (genType == null) {
			if (other.genType != null)
				return false;
		} else if (!genType.equals(other.genType))
			return false;
		if (reqId == null) {
			if (other.reqId != null)
				return false;
		} else if (!reqId.equals(other.reqId))
			return false;
		if (toRoleId == null) {
			if (other.toRoleId != null)
				return false;
		} else if (!toRoleId.equals(other.toRoleId))
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