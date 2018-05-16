package com.gable.cpb.entity.ed;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EdReqRetrieve {

	private String rrReqNo;
	private String rrDocId;
	private String rrReqNoRef;
	private Integer rrRetAppStatus;
	private Date rrAppStatusDatetime;
	private Date createDatetime;
	private String createUser;
	private Date updateDatetime;
	private String updateUser;

	@JsonIgnore

	public EdReqRetrieve() {
		super();
	}

	public EdReqRetrieve(String rrReqNo, String rrDocId, String rrReqNoRef, Integer rrRetAppStatus, Date rrAppStatusDatetime, Date createDatetime, String createUser, Date updateDatetime, String updateUser) {
		super();
		this.rrReqNo = rrReqNo;
		this.rrDocId = rrDocId;
		this.rrReqNoRef = rrReqNoRef;
		this.rrRetAppStatus = rrRetAppStatus;
		this.rrAppStatusDatetime = rrAppStatusDatetime;
		this.createDatetime = createDatetime;
		this.createUser = createUser;
		this.updateDatetime = updateDatetime;
		this.updateUser = updateUser;
	}

	public String getRrReqNo() {
		return rrReqNo;
	}

	public String getRrDocId() {
		return rrDocId;
	}

	public String getRrReqNoRef() {
		return rrReqNoRef;
	}

	public Integer getRrRetAppStatus() {
		return rrRetAppStatus;
	}

	public Date getRrAppStatusDatetime() {
		return rrAppStatusDatetime;
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

	public void setRrReqNo(String rrReqNo) {
		this.rrReqNo = rrReqNo;
	}

	public void setRrDocId(String rrDocId) {
		this.rrDocId = rrDocId;
	}

	public void setRrReqNoRef(String rrReqNoRef) {
		this.rrReqNoRef = rrReqNoRef;
	}

	public void setRrRetAppStatus(Integer rrRetAppStatus) {
		this.rrRetAppStatus = rrRetAppStatus;
	}

	public void setRrAppStatusDatetime(Date rrAppStatusDatetime) {
		this.rrAppStatusDatetime = rrAppStatusDatetime;
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


	@Override
	public String toString() {
		return "edReqRetrieve [rrReqNo = " + rrReqNo + ", rrDocId = " + rrDocId + ", rrReqNoRef = " + rrReqNoRef + ", rrRetAppStatus = " + rrRetAppStatus + ", rrAppStatusDatetime = " + rrAppStatusDatetime + ", createDatetime = " + createDatetime + ", createUser = " + createUser + ", updateDatetime = " + updateDatetime + ", updateUser = " + updateUser + "]";
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
		result = prime * result + ((rrAppStatusDatetime == null) ? 0 : rrAppStatusDatetime.hashCode());
		result = prime * result + ((rrDocId == null) ? 0 : rrDocId.hashCode());
		result = prime * result + ((rrReqNo == null) ? 0 : rrReqNo.hashCode());
		result = prime * result + ((rrReqNoRef == null) ? 0 : rrReqNoRef.hashCode());
		result = prime * result + ((rrRetAppStatus == null) ? 0 : rrRetAppStatus.hashCode());
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
		EdReqRetrieve other = (EdReqRetrieve) obj;
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
		if (rrAppStatusDatetime == null) {
			if (other.rrAppStatusDatetime != null)
				return false;
		} else if (!rrAppStatusDatetime.equals(other.rrAppStatusDatetime))
			return false;
		if (rrDocId == null) {
			if (other.rrDocId != null)
				return false;
		} else if (!rrDocId.equals(other.rrDocId))
			return false;
		if (rrReqNo == null) {
			if (other.rrReqNo != null)
				return false;
		} else if (!rrReqNo.equals(other.rrReqNo))
			return false;
		if (rrReqNoRef == null) {
			if (other.rrReqNoRef != null)
				return false;
		} else if (!rrReqNoRef.equals(other.rrReqNoRef))
			return false;
		if (rrRetAppStatus == null) {
			if (other.rrRetAppStatus != null)
				return false;
		} else if (!rrRetAppStatus.equals(other.rrRetAppStatus))
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