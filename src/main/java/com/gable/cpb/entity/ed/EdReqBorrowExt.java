package com.gable.cpb.entity.ed;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EdReqBorrowExt {

	private String rbExtReqNo;
	private String rbExtDocId;
	private String rbExtReqNoRef;
	private Integer rbExtAppStatus;
	private Date rbExtAppStatusDatetime;
	private Date rbExtDateOld;
	private Date rbExtDateNew;
	private Date createDatetime;
	private String createUser;
	private Date updateDatetime;
	private String updateUser;

	@JsonIgnore

	public EdReqBorrowExt() {
		super();
	}

	public EdReqBorrowExt(String rbExtReqNo, String rbExtDocId, String rbExtReqNoRef, Integer rbExtAppStatus, Date rbExtAppStatusDatetime, Date rbExtDateOld, Date rbExtDateNew, Date createDatetime, String createUser, Date updateDatetime, String updateUser) {
		super();
		this.rbExtReqNo = rbExtReqNo;
		this.rbExtDocId = rbExtDocId;
		this.rbExtReqNoRef = rbExtReqNoRef;
		this.rbExtAppStatus = rbExtAppStatus;
		this.rbExtAppStatusDatetime = rbExtAppStatusDatetime;
		this.rbExtDateOld = rbExtDateOld;
		this.rbExtDateNew = rbExtDateNew;
		this.createDatetime = createDatetime;
		this.createUser = createUser;
		this.updateDatetime = updateDatetime;
		this.updateUser = updateUser;
	}

	public String getRbExtReqNo() {
		return rbExtReqNo;
	}

	public String getRbExtDocId() {
		return rbExtDocId;
	}

	public String getRbExtReqNoRef() {
		return rbExtReqNoRef;
	}

	public Integer getRbExtAppStatus() {
		return rbExtAppStatus;
	}

	public Date getRbExtAppStatusDatetime() {
		return rbExtAppStatusDatetime;
	}

	public Date getRbExtDateOld() {
		return rbExtDateOld;
	}

	public Date getRbExtDateNew() {
		return rbExtDateNew;
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

	public void setRbExtReqNo(String rbExtReqNo) {
		this.rbExtReqNo = rbExtReqNo;
	}

	public void setRbExtDocId(String rbExtDocId) {
		this.rbExtDocId = rbExtDocId;
	}

	public void setRbExtReqNoRef(String rbExtReqNoRef) {
		this.rbExtReqNoRef = rbExtReqNoRef;
	}

	public void setRbExtAppStatus(Integer rbExtAppStatus) {
		this.rbExtAppStatus = rbExtAppStatus;
	}

	public void setRbExtAppStatusDatetime(Date rbExtAppStatusDatetime) {
		this.rbExtAppStatusDatetime = rbExtAppStatusDatetime;
	}

	public void setRbExtDateOld(Date rbExtDateOld) {
		this.rbExtDateOld = rbExtDateOld;
	}

	public void setRbExtDateNew(Date rbExtDateNew) {
		this.rbExtDateNew = rbExtDateNew;
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
		return "edReqBorrowExt [rbExtReqNo = " + rbExtReqNo + ", rbExtDocId = " + rbExtDocId + ", rbExtReqNoRef = " + rbExtReqNoRef + ", rbExtAppStatus = " + rbExtAppStatus + ", rbExtAppStatusDatetime = " + rbExtAppStatusDatetime + ", rbExtDateOld = " + rbExtDateOld + ", rbExtDateNew = " + rbExtDateNew + ", createDatetime = " + createDatetime + ", createUser = " + createUser + ", updateDatetime = " + updateDatetime + ", updateUser = " + updateUser + "]";
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
		result = prime * result + ((rbExtAppStatus == null) ? 0 : rbExtAppStatus.hashCode());
		result = prime * result + ((rbExtAppStatusDatetime == null) ? 0 : rbExtAppStatusDatetime.hashCode());
		result = prime * result + ((rbExtDateNew == null) ? 0 : rbExtDateNew.hashCode());
		result = prime * result + ((rbExtDateOld == null) ? 0 : rbExtDateOld.hashCode());
		result = prime * result + ((rbExtDocId == null) ? 0 : rbExtDocId.hashCode());
		result = prime * result + ((rbExtReqNo == null) ? 0 : rbExtReqNo.hashCode());
		result = prime * result + ((rbExtReqNoRef == null) ? 0 : rbExtReqNoRef.hashCode());
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
		EdReqBorrowExt other = (EdReqBorrowExt) obj;
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
		if (rbExtAppStatus == null) {
			if (other.rbExtAppStatus != null)
				return false;
		} else if (!rbExtAppStatus.equals(other.rbExtAppStatus))
			return false;
		if (rbExtAppStatusDatetime == null) {
			if (other.rbExtAppStatusDatetime != null)
				return false;
		} else if (!rbExtAppStatusDatetime.equals(other.rbExtAppStatusDatetime))
			return false;
		if (rbExtDateNew == null) {
			if (other.rbExtDateNew != null)
				return false;
		} else if (!rbExtDateNew.equals(other.rbExtDateNew))
			return false;
		if (rbExtDateOld == null) {
			if (other.rbExtDateOld != null)
				return false;
		} else if (!rbExtDateOld.equals(other.rbExtDateOld))
			return false;
		if (rbExtDocId == null) {
			if (other.rbExtDocId != null)
				return false;
		} else if (!rbExtDocId.equals(other.rbExtDocId))
			return false;
		if (rbExtReqNo == null) {
			if (other.rbExtReqNo != null)
				return false;
		} else if (!rbExtReqNo.equals(other.rbExtReqNo))
			return false;
		if (rbExtReqNoRef == null) {
			if (other.rbExtReqNoRef != null)
				return false;
		} else if (!rbExtReqNoRef.equals(other.rbExtReqNoRef))
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