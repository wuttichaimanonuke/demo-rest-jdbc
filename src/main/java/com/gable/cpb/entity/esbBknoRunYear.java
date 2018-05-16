package com.gable.cpb.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class esbBknoRunYear {

	private Long ctId;
	private Integer runYear;
	private Long runNo;

	@JsonIgnore

	public esbBknoRunYear() {
		super();
	}

	public esbBknoRunYear(Long ctId, Integer runYear, Long runNo) {
		super();
		this.ctId = ctId;
		this.runYear = runYear;
		this.runNo = runNo;
	}

	public Long getCtId() {
		return ctId;
	}

	public Integer getRunYear() {
		return runYear;
	}

	public Long getRunNo() {
		return runNo;
	}

	public void setCtId(Long ctId) {
		this.ctId = ctId;
	}

	public void setRunYear(Integer runYear) {
		this.runYear = runYear;
	}

	public void setRunNo(Long runNo) {
		this.runNo = runNo;
	}


	@Override
	public String toString() {
		return "esbBknoRunYear [ctId = " + ctId + ", runYear = " + runYear + ", runNo = " + runNo + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ctId == null) ? 0 : ctId.hashCode());
		result = prime * result + ((runNo == null) ? 0 : runNo.hashCode());
		result = prime * result + ((runYear == null) ? 0 : runYear.hashCode());
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
		esbBknoRunYear other = (esbBknoRunYear) obj;
		if (ctId == null) {
			if (other.ctId != null)
				return false;
		} else if (!ctId.equals(other.ctId))
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
		return true;
	}

}