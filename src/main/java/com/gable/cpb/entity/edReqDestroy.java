package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class edReqDestroy {

	private String rdReqNo;
	private String rdDocId;
	private Integer rdDesStatus;
	private Date rdDesConfirmDate;
	private String rdDesConfirmUser;
	private String rdDesBkNo;
	private Integer rdDesType;
	private Date createDatetime;
	private String createUser;
	private Date updateDatetime;
	private String updateUser;
	private Integer rdDocHasPhy;
	private Integer rdDesElectronic;

	@JsonIgnore

	public edReqDestroy() {
		super();
	}

	public edReqDestroy(String rdReqNo, String rdDocId, Integer rdDesStatus, Date rdDesConfirmDate, String rdDesConfirmUser, String rdDesBkNo, Integer rdDesType, Date createDatetime, String createUser, Date updateDatetime, String updateUser, Integer rdDocHasPhy, Integer rdDesElectronic) {
		super();
		this.rdReqNo = rdReqNo;
		this.rdDocId = rdDocId;
		this.rdDesStatus = rdDesStatus;
		this.rdDesConfirmDate = rdDesConfirmDate;
		this.rdDesConfirmUser = rdDesConfirmUser;
		this.rdDesBkNo = rdDesBkNo;
		this.rdDesType = rdDesType;
		this.createDatetime = createDatetime;
		this.createUser = createUser;
		this.updateDatetime = updateDatetime;
		this.updateUser = updateUser;
		this.rdDocHasPhy = rdDocHasPhy;
		this.rdDesElectronic = rdDesElectronic;
	}

	public String getRdReqNo() {
		return rdReqNo;
	}

	public String getRdDocId() {
		return rdDocId;
	}

	public Integer getRdDesStatus() {
		return rdDesStatus;
	}

	public Date getRdDesConfirmDate() {
		return rdDesConfirmDate;
	}

	public String getRdDesConfirmUser() {
		return rdDesConfirmUser;
	}

	public String getRdDesBkNo() {
		return rdDesBkNo;
	}

	public Integer getRdDesType() {
		return rdDesType;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Integer getRdDocHasPhy() {
		return rdDocHasPhy;
	}

	public Integer getRdDesElectronic() {
		return rdDesElectronic;
	}

	public void setRdReqNo(String rdReqNo) {
		this.rdReqNo = rdReqNo;
	}

	public void setRdDocId(String rdDocId) {
		this.rdDocId = rdDocId;
	}

	public void setRdDesStatus(Integer rdDesStatus) {
		this.rdDesStatus = rdDesStatus;
	}

	public void setRdDesConfirmDate(Date rdDesConfirmDate) {
		this.rdDesConfirmDate = rdDesConfirmDate;
	}

	public void setRdDesConfirmUser(String rdDesConfirmUser) {
		this.rdDesConfirmUser = rdDesConfirmUser;
	}

	public void setRdDesBkNo(String rdDesBkNo) {
		this.rdDesBkNo = rdDesBkNo;
	}

	public void setRdDesType(Integer rdDesType) {
		this.rdDesType = rdDesType;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setRdDocHasPhy(Integer rdDocHasPhy) {
		this.rdDocHasPhy = rdDocHasPhy;
	}

	public void setRdDesElectronic(Integer rdDesElectronic) {
		this.rdDesElectronic = rdDesElectronic;
	}


	@Override
	public String toString() {
		return "edReqDestroy [rdReqNo = " + rdReqNo + ", rdDocId = " + rdDocId + ", rdDesStatus = " + rdDesStatus + ", rdDesConfirmDate = " + rdDesConfirmDate + ", rdDesConfirmUser = " + rdDesConfirmUser + ", rdDesBkNo = " + rdDesBkNo + ", rdDesType = " + rdDesType + ", createDatetime = " + createDatetime + ", createUser = " + createUser + ", updateDatetime = " + updateDatetime + ", updateUser = " + updateUser + ", rdDocHasPhy = " + rdDocHasPhy + ", rdDesElectronic = " + rdDesElectronic + "]";
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
		result = prime * result + ((rdDesBkNo == null) ? 0 : rdDesBkNo.hashCode());
		result = prime * result + ((rdDesConfirmDate == null) ? 0 : rdDesConfirmDate.hashCode());
		result = prime * result + ((rdDesConfirmUser == null) ? 0 : rdDesConfirmUser.hashCode());
		result = prime * result + ((rdDesElectronic == null) ? 0 : rdDesElectronic.hashCode());
		result = prime * result + ((rdDesStatus == null) ? 0 : rdDesStatus.hashCode());
		result = prime * result + ((rdDesType == null) ? 0 : rdDesType.hashCode());
		result = prime * result + ((rdDocHasPhy == null) ? 0 : rdDocHasPhy.hashCode());
		result = prime * result + ((rdDocId == null) ? 0 : rdDocId.hashCode());
		result = prime * result + ((rdReqNo == null) ? 0 : rdReqNo.hashCode());
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
		edReqDestroy other = (edReqDestroy) obj;
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
		if (rdDesBkNo == null) {
			if (other.rdDesBkNo != null)
				return false;
		} else if (!rdDesBkNo.equals(other.rdDesBkNo))
			return false;
		if (rdDesConfirmDate == null) {
			if (other.rdDesConfirmDate != null)
				return false;
		} else if (!rdDesConfirmDate.equals(other.rdDesConfirmDate))
			return false;
		if (rdDesConfirmUser == null) {
			if (other.rdDesConfirmUser != null)
				return false;
		} else if (!rdDesConfirmUser.equals(other.rdDesConfirmUser))
			return false;
		if (rdDesElectronic == null) {
			if (other.rdDesElectronic != null)
				return false;
		} else if (!rdDesElectronic.equals(other.rdDesElectronic))
			return false;
		if (rdDesStatus == null) {
			if (other.rdDesStatus != null)
				return false;
		} else if (!rdDesStatus.equals(other.rdDesStatus))
			return false;
		if (rdDesType == null) {
			if (other.rdDesType != null)
				return false;
		} else if (!rdDesType.equals(other.rdDesType))
			return false;
		if (rdDocHasPhy == null) {
			if (other.rdDocHasPhy != null)
				return false;
		} else if (!rdDocHasPhy.equals(other.rdDocHasPhy))
			return false;
		if (rdDocId == null) {
			if (other.rdDocId != null)
				return false;
		} else if (!rdDocId.equals(other.rdDocId))
			return false;
		if (rdReqNo == null) {
			if (other.rdReqNo != null)
				return false;
		} else if (!rdReqNo.equals(other.rdReqNo))
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