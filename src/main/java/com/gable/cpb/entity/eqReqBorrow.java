package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class eqReqBorrow {

	private String rbReqNo;
	private String rbDocId;
	private Integer rbAppStatus;
	private Date rbAppStatusDatetime;
	private Integer rbFoundStatus;
	private String rbLendUserId;
	private String rbPickUpUserLongname;
	private String rbPickUpUser;
	private Date rbPickUpDatetime;
	private Integer rbBorStatus;
	private String rbRetUser;
	private String rbRetUserLongname;
	private Date rbRetDatetime;
	private Integer rbType;
	private Date createDatetime;
	private String createUser;
	private Date updateDatetime;
	private String updateUser;
	private Date rbExpiredDate;
	private String rbRecUser;

	@JsonIgnore

	public eqReqBorrow() {
		super();
	}

	public eqReqBorrow(String rbReqNo, String rbDocId, Integer rbAppStatus, Date rbAppStatusDatetime, Integer rbFoundStatus, String rbLendUserId, String rbPickUpUserLongname, String rbPickUpUser, Date rbPickUpDatetime, Integer rbBorStatus, String rbRetUser, String rbRetUserLongname, Date rbRetDatetime, Integer rbType, Date createDatetime, String createUser, Date updateDatetime, String updateUser, Date rbExpiredDate, String rbRecUser) {
		super();
		this.rbReqNo = rbReqNo;
		this.rbDocId = rbDocId;
		this.rbAppStatus = rbAppStatus;
		this.rbAppStatusDatetime = rbAppStatusDatetime;
		this.rbFoundStatus = rbFoundStatus;
		this.rbLendUserId = rbLendUserId;
		this.rbPickUpUserLongname = rbPickUpUserLongname;
		this.rbPickUpUser = rbPickUpUser;
		this.rbPickUpDatetime = rbPickUpDatetime;
		this.rbBorStatus = rbBorStatus;
		this.rbRetUser = rbRetUser;
		this.rbRetUserLongname = rbRetUserLongname;
		this.rbRetDatetime = rbRetDatetime;
		this.rbType = rbType;
		this.createDatetime = createDatetime;
		this.createUser = createUser;
		this.updateDatetime = updateDatetime;
		this.updateUser = updateUser;
		this.rbExpiredDate = rbExpiredDate;
		this.rbRecUser = rbRecUser;
	}

	public String getRbReqNo() {
		return rbReqNo;
	}

	public String getRbDocId() {
		return rbDocId;
	}

	public Integer getRbAppStatus() {
		return rbAppStatus;
	}

	public Date getRbAppStatusDatetime() {
		return rbAppStatusDatetime;
	}

	public Integer getRbFoundStatus() {
		return rbFoundStatus;
	}

	public String getRbLendUserId() {
		return rbLendUserId;
	}

	public String getRbPickUpUserLongname() {
		return rbPickUpUserLongname;
	}

	public String getRbPickUpUser() {
		return rbPickUpUser;
	}

	public Date getRbPickUpDatetime() {
		return rbPickUpDatetime;
	}

	public Integer getRbBorStatus() {
		return rbBorStatus;
	}

	public String getRbRetUser() {
		return rbRetUser;
	}

	public String getRbRetUserLongname() {
		return rbRetUserLongname;
	}

	public Date getRbRetDatetime() {
		return rbRetDatetime;
	}

	public Integer getRbType() {
		return rbType;
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

	public Date getRbExpiredDate() {
		return rbExpiredDate;
	}

	public String getRbRecUser() {
		return rbRecUser;
	}

	public void setRbReqNo(String rbReqNo) {
		this.rbReqNo = rbReqNo;
	}

	public void setRbDocId(String rbDocId) {
		this.rbDocId = rbDocId;
	}

	public void setRbAppStatus(Integer rbAppStatus) {
		this.rbAppStatus = rbAppStatus;
	}

	public void setRbAppStatusDatetime(Date rbAppStatusDatetime) {
		this.rbAppStatusDatetime = rbAppStatusDatetime;
	}

	public void setRbFoundStatus(Integer rbFoundStatus) {
		this.rbFoundStatus = rbFoundStatus;
	}

	public void setRbLendUserId(String rbLendUserId) {
		this.rbLendUserId = rbLendUserId;
	}

	public void setRbPickUpUserLongname(String rbPickUpUserLongname) {
		this.rbPickUpUserLongname = rbPickUpUserLongname;
	}

	public void setRbPickUpUser(String rbPickUpUser) {
		this.rbPickUpUser = rbPickUpUser;
	}

	public void setRbPickUpDatetime(Date rbPickUpDatetime) {
		this.rbPickUpDatetime = rbPickUpDatetime;
	}

	public void setRbBorStatus(Integer rbBorStatus) {
		this.rbBorStatus = rbBorStatus;
	}

	public void setRbRetUser(String rbRetUser) {
		this.rbRetUser = rbRetUser;
	}

	public void setRbRetUserLongname(String rbRetUserLongname) {
		this.rbRetUserLongname = rbRetUserLongname;
	}

	public void setRbRetDatetime(Date rbRetDatetime) {
		this.rbRetDatetime = rbRetDatetime;
	}

	public void setRbType(Integer rbType) {
		this.rbType = rbType;
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

	public void setRbExpiredDate(Date rbExpiredDate) {
		this.rbExpiredDate = rbExpiredDate;
	}

	public void setRbRecUser(String rbRecUser) {
		this.rbRecUser = rbRecUser;
	}


	@Override
	public String toString() {
		return "eqReqBorrow [rbReqNo = " + rbReqNo + ", rbDocId = " + rbDocId + ", rbAppStatus = " + rbAppStatus + ", rbAppStatusDatetime = " + rbAppStatusDatetime + ", rbFoundStatus = " + rbFoundStatus + ", rbLendUserId = " + rbLendUserId + ", rbPickUpUserLongname = " + rbPickUpUserLongname + ", rbPickUpUser = " + rbPickUpUser + ", rbPickUpDatetime = " + rbPickUpDatetime + ", rbBorStatus = " + rbBorStatus + ", rbRetUser = " + rbRetUser + ", rbRetUserLongname = " + rbRetUserLongname + ", rbRetDatetime = " + rbRetDatetime + ", rbType = " + rbType + ", createDatetime = " + createDatetime + ", createUser = " + createUser + ", updateDatetime = " + updateDatetime + ", updateUser = " + updateUser + ", rbExpiredDate = " + rbExpiredDate + ", rbRecUser = " + rbRecUser + "]";
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
		result = prime * result + ((rbAppStatus == null) ? 0 : rbAppStatus.hashCode());
		result = prime * result + ((rbAppStatusDatetime == null) ? 0 : rbAppStatusDatetime.hashCode());
		result = prime * result + ((rbBorStatus == null) ? 0 : rbBorStatus.hashCode());
		result = prime * result + ((rbDocId == null) ? 0 : rbDocId.hashCode());
		result = prime * result + ((rbExpiredDate == null) ? 0 : rbExpiredDate.hashCode());
		result = prime * result + ((rbFoundStatus == null) ? 0 : rbFoundStatus.hashCode());
		result = prime * result + ((rbLendUserId == null) ? 0 : rbLendUserId.hashCode());
		result = prime * result + ((rbPickUpDatetime == null) ? 0 : rbPickUpDatetime.hashCode());
		result = prime * result + ((rbPickUpUser == null) ? 0 : rbPickUpUser.hashCode());
		result = prime * result + ((rbPickUpUserLongname == null) ? 0 : rbPickUpUserLongname.hashCode());
		result = prime * result + ((rbRecUser == null) ? 0 : rbRecUser.hashCode());
		result = prime * result + ((rbReqNo == null) ? 0 : rbReqNo.hashCode());
		result = prime * result + ((rbRetDatetime == null) ? 0 : rbRetDatetime.hashCode());
		result = prime * result + ((rbRetUser == null) ? 0 : rbRetUser.hashCode());
		result = prime * result + ((rbRetUserLongname == null) ? 0 : rbRetUserLongname.hashCode());
		result = prime * result + ((rbType == null) ? 0 : rbType.hashCode());
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
		eqReqBorrow other = (eqReqBorrow) obj;
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
		if (rbAppStatus == null) {
			if (other.rbAppStatus != null)
				return false;
		} else if (!rbAppStatus.equals(other.rbAppStatus))
			return false;
		if (rbAppStatusDatetime == null) {
			if (other.rbAppStatusDatetime != null)
				return false;
		} else if (!rbAppStatusDatetime.equals(other.rbAppStatusDatetime))
			return false;
		if (rbBorStatus == null) {
			if (other.rbBorStatus != null)
				return false;
		} else if (!rbBorStatus.equals(other.rbBorStatus))
			return false;
		if (rbDocId == null) {
			if (other.rbDocId != null)
				return false;
		} else if (!rbDocId.equals(other.rbDocId))
			return false;
		if (rbExpiredDate == null) {
			if (other.rbExpiredDate != null)
				return false;
		} else if (!rbExpiredDate.equals(other.rbExpiredDate))
			return false;
		if (rbFoundStatus == null) {
			if (other.rbFoundStatus != null)
				return false;
		} else if (!rbFoundStatus.equals(other.rbFoundStatus))
			return false;
		if (rbLendUserId == null) {
			if (other.rbLendUserId != null)
				return false;
		} else if (!rbLendUserId.equals(other.rbLendUserId))
			return false;
		if (rbPickUpDatetime == null) {
			if (other.rbPickUpDatetime != null)
				return false;
		} else if (!rbPickUpDatetime.equals(other.rbPickUpDatetime))
			return false;
		if (rbPickUpUser == null) {
			if (other.rbPickUpUser != null)
				return false;
		} else if (!rbPickUpUser.equals(other.rbPickUpUser))
			return false;
		if (rbPickUpUserLongname == null) {
			if (other.rbPickUpUserLongname != null)
				return false;
		} else if (!rbPickUpUserLongname.equals(other.rbPickUpUserLongname))
			return false;
		if (rbRecUser == null) {
			if (other.rbRecUser != null)
				return false;
		} else if (!rbRecUser.equals(other.rbRecUser))
			return false;
		if (rbReqNo == null) {
			if (other.rbReqNo != null)
				return false;
		} else if (!rbReqNo.equals(other.rbReqNo))
			return false;
		if (rbRetDatetime == null) {
			if (other.rbRetDatetime != null)
				return false;
		} else if (!rbRetDatetime.equals(other.rbRetDatetime))
			return false;
		if (rbRetUser == null) {
			if (other.rbRetUser != null)
				return false;
		} else if (!rbRetUser.equals(other.rbRetUser))
			return false;
		if (rbRetUserLongname == null) {
			if (other.rbRetUserLongname != null)
				return false;
		} else if (!rbRetUserLongname.equals(other.rbRetUserLongname))
			return false;
		if (rbType == null) {
			if (other.rbType != null)
				return false;
		} else if (!rbType.equals(other.rbType))
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