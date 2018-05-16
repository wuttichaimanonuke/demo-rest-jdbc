package com.gable.cpb.entity.esb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbBkno {

	private Long bknId;
	private Long ctId;
	private Long bkId;
	private String bkNo;
	private Date bkDate;
	private Long reserveReqUserId;
	private String reserveRemark;
	private Long reserveUserId;
	private Date reserveDatetime;
	private String cancelRemark;
	private Long cancelUserId;
	private Date cancelDatetime;
	private String updateUser;
	private Date updateDatetime;
	private Long bkIdReq;

	@JsonIgnore

	public EsbBkno() {
		super();
	}

	public EsbBkno(Long bknId, Long ctId, Long bkId, String bkNo, Date bkDate, Long reserveReqUserId, String reserveRemark, Long reserveUserId, Date reserveDatetime, String cancelRemark, Long cancelUserId, Date cancelDatetime, String updateUser, Date updateDatetime, Long bkIdReq) {
		super();
		this.bknId = bknId;
		this.ctId = ctId;
		this.bkId = bkId;
		this.bkNo = bkNo;
		this.bkDate = bkDate;
		this.reserveReqUserId = reserveReqUserId;
		this.reserveRemark = reserveRemark;
		this.reserveUserId = reserveUserId;
		this.reserveDatetime = reserveDatetime;
		this.cancelRemark = cancelRemark;
		this.cancelUserId = cancelUserId;
		this.cancelDatetime = cancelDatetime;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.bkIdReq = bkIdReq;
	}

	public Long getBknId() {
		return bknId;
	}

	public Long getCtId() {
		return ctId;
	}

	public Long getBkId() {
		return bkId;
	}

	public String getBkNo() {
		return bkNo;
	}

	public Date getBkDate() {
		return bkDate;
	}

	public Long getReserveReqUserId() {
		return reserveReqUserId;
	}

	public String getReserveRemark() {
		return reserveRemark;
	}

	public Long getReserveUserId() {
		return reserveUserId;
	}

	public Date getReserveDatetime() {
		return reserveDatetime;
	}

	public String getCancelRemark() {
		return cancelRemark;
	}

	public Long getCancelUserId() {
		return cancelUserId;
	}

	public Date getCancelDatetime() {
		return cancelDatetime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public Long getBkIdReq() {
		return bkIdReq;
	}

	public void setBknId(Long bknId) {
		this.bknId = bknId;
	}

	public void setCtId(Long ctId) {
		this.ctId = ctId;
	}

	public void setBkId(Long bkId) {
		this.bkId = bkId;
	}

	public void setBkNo(String bkNo) {
		this.bkNo = bkNo;
	}

	public void setBkDate(Date bkDate) {
		this.bkDate = bkDate;
	}

	public void setReserveReqUserId(Long reserveReqUserId) {
		this.reserveReqUserId = reserveReqUserId;
	}

	public void setReserveRemark(String reserveRemark) {
		this.reserveRemark = reserveRemark;
	}

	public void setReserveUserId(Long reserveUserId) {
		this.reserveUserId = reserveUserId;
	}

	public void setReserveDatetime(Date reserveDatetime) {
		this.reserveDatetime = reserveDatetime;
	}

	public void setCancelRemark(String cancelRemark) {
		this.cancelRemark = cancelRemark;
	}

	public void setCancelUserId(Long cancelUserId) {
		this.cancelUserId = cancelUserId;
	}

	public void setCancelDatetime(Date cancelDatetime) {
		this.cancelDatetime = cancelDatetime;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setBkIdReq(Long bkIdReq) {
		this.bkIdReq = bkIdReq;
	}


	@Override
	public String toString() {
		return "esbBkno [bknId = " + bknId + ", ctId = " + ctId + ", bkId = " + bkId + ", bkNo = " + bkNo + ", bkDate = " + bkDate + ", reserveReqUserId = " + reserveReqUserId + ", reserveRemark = " + reserveRemark + ", reserveUserId = " + reserveUserId + ", reserveDatetime = " + reserveDatetime + ", cancelRemark = " + cancelRemark + ", cancelUserId = " + cancelUserId + ", cancelDatetime = " + cancelDatetime + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", bkIdReq = " + bkIdReq + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bkDate == null) ? 0 : bkDate.hashCode());
		result = prime * result + ((bkId == null) ? 0 : bkId.hashCode());
		result = prime * result + ((bkIdReq == null) ? 0 : bkIdReq.hashCode());
		result = prime * result + ((bkNo == null) ? 0 : bkNo.hashCode());
		result = prime * result + ((bknId == null) ? 0 : bknId.hashCode());
		result = prime * result + ((cancelDatetime == null) ? 0 : cancelDatetime.hashCode());
		result = prime * result + ((cancelRemark == null) ? 0 : cancelRemark.hashCode());
		result = prime * result + ((cancelUserId == null) ? 0 : cancelUserId.hashCode());
		result = prime * result + ((ctId == null) ? 0 : ctId.hashCode());
		result = prime * result + ((reserveDatetime == null) ? 0 : reserveDatetime.hashCode());
		result = prime * result + ((reserveRemark == null) ? 0 : reserveRemark.hashCode());
		result = prime * result + ((reserveReqUserId == null) ? 0 : reserveReqUserId.hashCode());
		result = prime * result + ((reserveUserId == null) ? 0 : reserveUserId.hashCode());
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
		EsbBkno other = (EsbBkno) obj;
		if (bkDate == null) {
			if (other.bkDate != null)
				return false;
		} else if (!bkDate.equals(other.bkDate))
			return false;
		if (bkId == null) {
			if (other.bkId != null)
				return false;
		} else if (!bkId.equals(other.bkId))
			return false;
		if (bkIdReq == null) {
			if (other.bkIdReq != null)
				return false;
		} else if (!bkIdReq.equals(other.bkIdReq))
			return false;
		if (bkNo == null) {
			if (other.bkNo != null)
				return false;
		} else if (!bkNo.equals(other.bkNo))
			return false;
		if (bknId == null) {
			if (other.bknId != null)
				return false;
		} else if (!bknId.equals(other.bknId))
			return false;
		if (cancelDatetime == null) {
			if (other.cancelDatetime != null)
				return false;
		} else if (!cancelDatetime.equals(other.cancelDatetime))
			return false;
		if (cancelRemark == null) {
			if (other.cancelRemark != null)
				return false;
		} else if (!cancelRemark.equals(other.cancelRemark))
			return false;
		if (cancelUserId == null) {
			if (other.cancelUserId != null)
				return false;
		} else if (!cancelUserId.equals(other.cancelUserId))
			return false;
		if (ctId == null) {
			if (other.ctId != null)
				return false;
		} else if (!ctId.equals(other.ctId))
			return false;
		if (reserveDatetime == null) {
			if (other.reserveDatetime != null)
				return false;
		} else if (!reserveDatetime.equals(other.reserveDatetime))
			return false;
		if (reserveRemark == null) {
			if (other.reserveRemark != null)
				return false;
		} else if (!reserveRemark.equals(other.reserveRemark))
			return false;
		if (reserveReqUserId == null) {
			if (other.reserveReqUserId != null)
				return false;
		} else if (!reserveReqUserId.equals(other.reserveReqUserId))
			return false;
		if (reserveUserId == null) {
			if (other.reserveUserId != null)
				return false;
		} else if (!reserveUserId.equals(other.reserveUserId))
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