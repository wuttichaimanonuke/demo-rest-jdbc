package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbBarcodeRun {

	private Integer bcType;			//KEY
	private Integer runYear;		//Key
	private Long runNo;
	private String updateUser;
	private Date updateDateTime;
	
	public CpbBarcodeRun() {
		super();
	}

	public CpbBarcodeRun(Integer bcType, Integer runYear, Long runNo, String updateUser, Date updateDateTime) {
		super();
		this.bcType = bcType;
		this.runYear = runYear;
		this.runNo = runNo;
		this.updateUser = updateUser;
		this.updateDateTime = updateDateTime;
	}

	public Integer getBcType() {
		return bcType;
	}

	public Integer getRunYear() {
		return runYear;
	}

	public Long getRunNo() {
		return runNo;
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

	public void setRunYear(Integer runYear) {
		this.runYear = runYear;
	}

	public void setRunNo(Long runNo) {
		this.runNo = runNo;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	@Override
	public String toString() {
		return "CpbBarcodeRun [bcType=" + bcType + ", runYear=" + runYear + ", runNo=" + runNo + ", updateUser="
				+ updateUser + ", updateDateTime=" + updateDateTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bcType == null) ? 0 : bcType.hashCode());
		result = prime * result + ((runNo == null) ? 0 : runNo.hashCode());
		result = prime * result + ((runYear == null) ? 0 : runYear.hashCode());
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
		CpbBarcodeRun other = (CpbBarcodeRun) obj;
		if (bcType == null) {
			if (other.bcType != null)
				return false;
		} else if (!bcType.equals(other.bcType))
			return false;
		if (runNo == null) {
			if (other.runNo != null)
				return false;
		} else if (!runNo.equals(other.runNo))
			return false;
		if (runYear == null) {
			if (other.runYear != null)
				return false;
		} else if (!runYear.equals(other.runYear))
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
