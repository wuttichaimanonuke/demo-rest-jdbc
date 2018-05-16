package com.gable.cpb.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbStampRun {

	private Long orgId;
	private Integer stType;
	private Integer runYear;
	private Long runNo;

	@JsonIgnore

	public esbStampRun() {
		super();
	}

	public esbStampRun(Long orgId, Integer stType, Integer runYear, Long runNo) {
		super();
		this.orgId = orgId;
		this.stType = stType;
		this.runYear = runYear;
		this.runNo = runNo;
	}

	public Long getOrgId() {
		return orgId;
	}

	public Integer getStType() {
		return stType;
	}

	public Integer getRunYear() {
		return runYear;
	}

	public Long getRunNo() {
		return runNo;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public void setStType(Integer stType) {
		this.stType = stType;
	}

	public void setRunYear(Integer runYear) {
		this.runYear = runYear;
	}

	public void setRunNo(Long runNo) {
		this.runNo = runNo;
	}


	@Override
	public String toString() {
		return "esbStampRun [orgId = " + orgId + ", stType = " + stType + ", runYear = " + runYear + ", runNo = " + runNo + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orgId == null) ? 0 : orgId.hashCode());
		result = prime * result + ((runNo == null) ? 0 : runNo.hashCode());
		result = prime * result + ((runYear == null) ? 0 : runYear.hashCode());
		result = prime * result + ((stType == null) ? 0 : stType.hashCode());
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
		esbStampRun other = (esbStampRun) obj;
		if (orgId == null) {
			if (other.orgId != null)
				return false;
		} else if (!orgId.equals(other.orgId))
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
		if (stType == null) {
			if (other.stType != null)
				return false;
		} else if (!stType.equals(other.stType))
			return false;
		return true;
	}

}