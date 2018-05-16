package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class edEmailReq {

	private String mrReqNo;
	private Date mrSentDate;

	@JsonIgnore

	public edEmailReq() {
		super();
	}

	public edEmailReq(String mrReqNo, Date mrSentDate) {
		super();
		this.mrReqNo = mrReqNo;
		this.mrSentDate = mrSentDate;
	}

	public String getMrReqNo() {
		return mrReqNo;
	}

	public Date getMrSentDate() {
		return mrSentDate;
	}

	public void setMrReqNo(String mrReqNo) {
		this.mrReqNo = mrReqNo;
	}

	public void setMrSentDate(Date mrSentDate) {
		this.mrSentDate = mrSentDate;
	}


	@Override
	public String toString() {
		return "edEmailReq [mrReqNo = " + mrReqNo + ", mrSentDate = " + mrSentDate + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mrReqNo == null) ? 0 : mrReqNo.hashCode());
		result = prime * result + ((mrSentDate == null) ? 0 : mrSentDate.hashCode());
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
		edEmailReq other = (edEmailReq) obj;
		if (mrReqNo == null) {
			if (other.mrReqNo != null)
				return false;
		} else if (!mrReqNo.equals(other.mrReqNo))
			return false;
		if (mrSentDate == null) {
			if (other.mrSentDate != null)
				return false;
		} else if (!mrSentDate.equals(other.mrSentDate))
			return false;
		return true;
	}

}