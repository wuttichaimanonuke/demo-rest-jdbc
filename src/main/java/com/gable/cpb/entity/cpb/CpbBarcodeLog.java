package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbBarcodeLog {

	private Integer bcType;			//Key
	private String bcNo;			//Key
	private Integer status;
	private String updateUser;
	private Date updateDateTime;
	
	public CpbBarcodeLog() {
		super();
	}

	public CpbBarcodeLog(Integer bcType, String bcNo, Integer status, String updateUser, Date updateDateTime) {
		super();
		this.bcType = bcType;
		this.bcNo = bcNo;
		this.status = status;
		this.updateUser = updateUser;
		this.updateDateTime = updateDateTime;
	}

	public Integer getBcType() {
		return bcType;
	}

	public String getBcNo() {
		return bcNo;
	}

	public Integer getStatus() {
		return status;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDateTime() {
		return updateDateTime;
	}

	public void setBcType(Integer bcType) {
		this.bcType = bcType;
	}

	public void setBcNo(String bcNo) {
		this.bcNo = bcNo;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	@Override
	public String toString() {
		return "CpbBarcodeLog [bcType=" + bcType + ", bcNo=" + bcNo + ", status=" + status + ", updateUser="
				+ updateUser + ", updateDateTime=" + updateDateTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bcNo == null) ? 0 : bcNo.hashCode());
		result = prime * result + ((bcType == null) ? 0 : bcType.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((updateDateTime == null) ? 0 : updateDateTime.hashCode());
		result = prime * result + ((updateUser == null) ? 0 : updateUser.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CpbBarcodeLog other = (CpbBarcodeLog) obj;
		if (bcNo == null) {
			if (other.bcNo != null)
				return false;
		} else if (!bcNo.equals(other.bcNo))
			return false;
		if (bcType == null) {
			if (other.bcType != null)
				return false;
		} else if (!bcType.equals(other.bcType))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (updateDateTime == null) {
			if (other.updateDateTime != null)
				return false;
		} else if (!updateDateTime.equals(other.updateDateTime))
			return false;
		if (updateUser == null) {
			if (other.updateUser != null)
				return false;
		} else if (!updateUser.equals(other.updateUser))
			return false;
		return true;
	}

}
