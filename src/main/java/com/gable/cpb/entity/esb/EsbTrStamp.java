package com.gable.cpb.entity.esb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbTrStamp {

	private Long trId;
	private Long stOrgId;
	private Integer stType;
	private String stNo;
	private Date stDatetime;
	private Long toOrgId;
	private Long toRoleId;
	private Long toUserId;
	private Long printUserId;
	private Date printDatetime;
	private String updateUser;
	private Long recvTrId;
	private Date updateDatetime;
	private Long rejectTrId;
	private Long toStampOrgId;
	private Integer rejectType;

	@JsonIgnore

	public EsbTrStamp() {
		super();
	}

	public EsbTrStamp(Long trId, Long stOrgId, Integer stType, String stNo, Date stDatetime, Long toOrgId, Long toRoleId, Long toUserId, Long printUserId, Date printDatetime, String updateUser, Long recvTrId, Date updateDatetime, Long rejectTrId, Long toStampOrgId, Integer rejectType) {
		super();
		this.trId = trId;
		this.stOrgId = stOrgId;
		this.stType = stType;
		this.stNo = stNo;
		this.stDatetime = stDatetime;
		this.toOrgId = toOrgId;
		this.toRoleId = toRoleId;
		this.toUserId = toUserId;
		this.printUserId = printUserId;
		this.printDatetime = printDatetime;
		this.updateUser = updateUser;
		this.recvTrId = recvTrId;
		this.updateDatetime = updateDatetime;
		this.rejectTrId = rejectTrId;
		this.toStampOrgId = toStampOrgId;
		this.rejectType = rejectType;
	}

	public Long getTrId() {
		return trId;
	}

	public Long getStOrgId() {
		return stOrgId;
	}

	public Integer getStType() {
		return stType;
	}

	public String getStNo() {
		return stNo;
	}

	public Date getStDatetime() {
		return stDatetime;
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

	public Long getPrintUserId() {
		return printUserId;
	}

	public Date getPrintDatetime() {
		return printDatetime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Long getRecvTrId() {
		return recvTrId;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public Long getRejectTrId() {
		return rejectTrId;
	}

	public Long getToStampOrgId() {
		return toStampOrgId;
	}

	public Integer getRejectType() {
		return rejectType;
	}

	public void setTrId(Long trId) {
		this.trId = trId;
	}

	public void setStOrgId(Long stOrgId) {
		this.stOrgId = stOrgId;
	}

	public void setStType(Integer stType) {
		this.stType = stType;
	}

	public void setStNo(String stNo) {
		this.stNo = stNo;
	}

	public void setStDatetime(Date stDatetime) {
		this.stDatetime = stDatetime;
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

	public void setPrintUserId(Long printUserId) {
		this.printUserId = printUserId;
	}

	public void setPrintDatetime(Date printDatetime) {
		this.printDatetime = printDatetime;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setRecvTrId(Long recvTrId) {
		this.recvTrId = recvTrId;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setRejectTrId(Long rejectTrId) {
		this.rejectTrId = rejectTrId;
	}

	public void setToStampOrgId(Long toStampOrgId) {
		this.toStampOrgId = toStampOrgId;
	}

	public void setRejectType(Integer rejectType) {
		this.rejectType = rejectType;
	}


	@Override
	public String toString() {
		return "esbTrStamp [trId = " + trId + ", stOrgId = " + stOrgId + ", stType = " + stType + ", stNo = " + stNo + ", stDatetime = " + stDatetime + ", toOrgId = " + toOrgId + ", toRoleId = " + toRoleId + ", toUserId = " + toUserId + ", printUserId = " + printUserId + ", printDatetime = " + printDatetime + ", updateUser = " + updateUser + ", recvTrId = " + recvTrId + ", updateDatetime = " + updateDatetime + ", rejectTrId = " + rejectTrId + ", toStampOrgId = " + toStampOrgId + ", rejectType = " + rejectType + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((printDatetime == null) ? 0 : printDatetime.hashCode());
		result = prime * result + ((printUserId == null) ? 0 : printUserId.hashCode());
		result = prime * result + ((recvTrId == null) ? 0 : recvTrId.hashCode());
		result = prime * result + ((rejectTrId == null) ? 0 : rejectTrId.hashCode());
		result = prime * result + ((rejectType == null) ? 0 : rejectType.hashCode());
		result = prime * result + ((stDatetime == null) ? 0 : stDatetime.hashCode());
		result = prime * result + ((stNo == null) ? 0 : stNo.hashCode());
		result = prime * result + ((stOrgId == null) ? 0 : stOrgId.hashCode());
		result = prime * result + ((stType == null) ? 0 : stType.hashCode());
		result = prime * result + ((toOrgId == null) ? 0 : toOrgId.hashCode());
		result = prime * result + ((toRoleId == null) ? 0 : toRoleId.hashCode());
		result = prime * result + ((toStampOrgId == null) ? 0 : toStampOrgId.hashCode());
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
		EsbTrStamp other = (EsbTrStamp) obj;
		if (printDatetime == null) {
			if (other.printDatetime != null)
				return false;
		} else if (!printDatetime.equals(other.printDatetime))
			return false;
		if (printUserId == null) {
			if (other.printUserId != null)
				return false;
		} else if (!printUserId.equals(other.printUserId))
			return false;
		if (recvTrId == null) {
			if (other.recvTrId != null)
				return false;
		} else if (!recvTrId.equals(other.recvTrId))
			return false;
		if (rejectTrId == null) {
			if (other.rejectTrId != null)
				return false;
		} else if (!rejectTrId.equals(other.rejectTrId))
			return false;
		if (rejectType == null) {
			if (other.rejectType != null)
				return false;
		} else if (!rejectType.equals(other.rejectType))
			return false;
		if (stDatetime == null) {
			if (other.stDatetime != null)
				return false;
		} else if (!stDatetime.equals(other.stDatetime))
			return false;
		if (stNo == null) {
			if (other.stNo != null)
				return false;
		} else if (!stNo.equals(other.stNo))
			return false;
		if (stOrgId == null) {
			if (other.stOrgId != null)
				return false;
		} else if (!stOrgId.equals(other.stOrgId))
			return false;
		if (stType == null) {
			if (other.stType != null)
				return false;
		} else if (!stType.equals(other.stType))
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
		if (toStampOrgId == null) {
			if (other.toStampOrgId != null)
				return false;
		} else if (!toStampOrgId.equals(other.toStampOrgId))
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