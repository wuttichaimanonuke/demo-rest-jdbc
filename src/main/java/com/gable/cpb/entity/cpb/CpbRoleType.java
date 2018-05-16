package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbRoleType {

	private Long rtId;
	private String rtName;
	private String rtRemark;
	private Integer status;
	private String updateUser;
	private Date updateDatetime;
	private Integer rtOrder;

	@JsonIgnore

	public CpbRoleType() {
		super();
	}

	public CpbRoleType(Long rtId, String rtName, String rtRemark, Integer status, String updateUser, Date updateDatetime, Integer rtOrder) {
		super();
		this.rtId = rtId;
		this.rtName = rtName;
		this.rtRemark = rtRemark;
		this.status = status;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.rtOrder = rtOrder;
	}

	public Long getRtId() {
		return rtId;
	}

	public String getRtName() {
		return rtName;
	}

	public String getRtRemark() {
		return rtRemark;
	}

	public Integer getStatus() {
		return status;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public Integer getRtOrder() {
		return rtOrder;
	}

	public void setRtId(Long rtId) {
		this.rtId = rtId;
	}

	public void setRtName(String rtName) {
		this.rtName = rtName;
	}

	public void setRtRemark(String rtRemark) {
		this.rtRemark = rtRemark;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setRtOrder(Integer rtOrder) {
		this.rtOrder = rtOrder;
	}


	@Override
	public String toString() {
		return "CpbRoleType [rtId = " + rtId + ", rtName = " + rtName + ", rtRemark = " + rtRemark + ", status = " + status + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", rtOrder = " + rtOrder + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rtId == null) ? 0 : rtId.hashCode());
		result = prime * result + ((rtName == null) ? 0 : rtName.hashCode());
		result = prime * result + ((rtOrder == null) ? 0 : rtOrder.hashCode());
		result = prime * result + ((rtRemark == null) ? 0 : rtRemark.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		CpbRoleType other = (CpbRoleType) obj;
		if (rtId == null) {
			if (other.rtId != null)
				return false;
		} else if (!rtId.equals(other.rtId))
			return false;
		if (rtName == null) {
			if (other.rtName != null)
				return false;
		} else if (!rtName.equals(other.rtName))
			return false;
		if (rtOrder == null) {
			if (other.rtOrder != null)
				return false;
		} else if (!rtOrder.equals(other.rtOrder))
			return false;
		if (rtRemark == null) {
			if (other.rtRemark != null)
				return false;
		} else if (!rtRemark.equals(other.rtRemark))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
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