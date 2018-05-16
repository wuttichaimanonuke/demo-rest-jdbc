package com.gable.cpb.entity.cpb;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbReqRun {

	private Integer reqType;
	private Integer reqYear;
	private String reqNo;

	@JsonIgnore

	public CpbReqRun() {
		super();
	}

	public CpbReqRun(Integer reqType, Integer reqYear, String reqNo) {
		super();
		this.reqType = reqType;
		this.reqYear = reqYear;
		this.reqNo = reqNo;
	}

	public Integer getReqType() {
		return reqType;
	}

	public Integer getReqYear() {
		return reqYear;
	}

	public String getReqNo() {
		return reqNo;
	}

	public void setReqType(Integer reqType) {
		this.reqType = reqType;
	}

	public void setReqYear(Integer reqYear) {
		this.reqYear = reqYear;
	}

	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}


	@Override
	public String toString() {
		return "CpbReqRun [reqType = " + reqType + ", reqYear = " + reqYear + ", reqNo = " + reqNo + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reqNo == null) ? 0 : reqNo.hashCode());
		result = prime * result + ((reqType == null) ? 0 : reqType.hashCode());
		result = prime * result + ((reqYear == null) ? 0 : reqYear.hashCode());
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
		CpbReqRun other = (CpbReqRun) obj;
		if (reqNo == null) {
			if (other.reqNo != null)
				return false;
		} else if (!reqNo.equals(other.reqNo))
			return false;
		if (reqType == null) {
			if (other.reqType != null)
				return false;
		} else if (!reqType.equals(other.reqType))
			return false;
		if (reqYear == null) {
			if (other.reqYear != null)
				return false;
		} else if (!reqYear.equals(other.reqYear))
			return false;
		return true;
	}

}