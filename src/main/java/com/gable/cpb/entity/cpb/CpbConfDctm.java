package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbConfDctm {

	private String dcKey;
	private String dcValue;
	private Date dcModifyDate;
	private String dcIsActive;

	@JsonIgnore

	public CpbConfDctm() {
		super();
	}

	public CpbConfDctm(String dcKey, String dcValue, Date dcModifyDate, String dcIsActive) {
		super();
		this.dcKey = dcKey;
		this.dcValue = dcValue;
		this.dcModifyDate = dcModifyDate;
		this.dcIsActive = dcIsActive;
	}

	public String getDcKey() {
		return dcKey;
	}

	public String getDcValue() {
		return dcValue;
	}

	public Date getDcModifyDate() {
		return dcModifyDate;
	}

	public String getDcIsActive() {
		return dcIsActive;
	}

	public void setDcKey(String dcKey) {
		this.dcKey = dcKey;
	}

	public void setDcValue(String dcValue) {
		this.dcValue = dcValue;
	}

	public void setDcModifyDate(Date dcModifyDate) {
		this.dcModifyDate = dcModifyDate;
	}

	public void setDcIsActive(String dcIsActive) {
		this.dcIsActive = dcIsActive;
	}


	@Override
	public String toString() {
		return "CpbConfDctm [dcKey = " + dcKey + ", dcValue = " + dcValue + ", dcModifyDate = " + dcModifyDate + ", dcIsActive = " + dcIsActive + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dcIsActive == null) ? 0 : dcIsActive.hashCode());
		result = prime * result + ((dcKey == null) ? 0 : dcKey.hashCode());
		result = prime * result + ((dcModifyDate == null) ? 0 : dcModifyDate.hashCode());
		result = prime * result + ((dcValue == null) ? 0 : dcValue.hashCode());
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
		CpbConfDctm other = (CpbConfDctm) obj;
		if (dcIsActive == null) {
			if (other.dcIsActive != null)
				return false;
		} else if (!dcIsActive.equals(other.dcIsActive))
			return false;
		if (dcKey == null) {
			if (other.dcKey != null)
				return false;
		} else if (!dcKey.equals(other.dcKey))
			return false;
		if (dcModifyDate == null) {
			if (other.dcModifyDate != null)
				return false;
		} else if (!dcModifyDate.equals(other.dcModifyDate))
			return false;
		if (dcValue == null) {
			if (other.dcValue != null)
				return false;
		} else if (!dcValue.equals(other.dcValue))
			return false;
		return true;
	}

}