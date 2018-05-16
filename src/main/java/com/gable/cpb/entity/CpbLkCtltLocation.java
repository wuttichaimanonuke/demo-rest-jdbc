package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbLkCtltLocation {

	private String locCode;
	private String locAbbrName;
	private String locName;
	private String locRepName;
	private String locPrefixName;
	private String locPrefixAbbr;
	private String locRegion;
	private String updUserCode;
	private Date lastUpdDate;
	private Date cmesUpdateDatetime;

	@JsonIgnore

	public CpbLkCtltLocation() {
		super();
	}

	public CpbLkCtltLocation(String locCode, String locAbbrName, String locName, String locRepName, String locPrefixName, String locPrefixAbbr, String locRegion, String updUserCode, Date lastUpdDate, Date cmesUpdateDatetime) {
		super();
		this.locCode = locCode;
		this.locAbbrName = locAbbrName;
		this.locName = locName;
		this.locRepName = locRepName;
		this.locPrefixName = locPrefixName;
		this.locPrefixAbbr = locPrefixAbbr;
		this.locRegion = locRegion;
		this.updUserCode = updUserCode;
		this.lastUpdDate = lastUpdDate;
		this.cmesUpdateDatetime = cmesUpdateDatetime;
	}

	public String getLocCode() {
		return locCode;
	}

	public String getLocAbbrName() {
		return locAbbrName;
	}

	public String getLocName() {
		return locName;
	}

	public String getLocRepName() {
		return locRepName;
	}

	public String getLocPrefixName() {
		return locPrefixName;
	}

	public String getLocPrefixAbbr() {
		return locPrefixAbbr;
	}

	public String getLocRegion() {
		return locRegion;
	}

	public String getUpdUserCode() {
		return updUserCode;
	}

	public Date getLastUpdDate() {
		return lastUpdDate;
	}

	public Date getCmesUpdateDatetime() {
		return cmesUpdateDatetime;
	}

	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}

	public void setLocAbbrName(String locAbbrName) {
		this.locAbbrName = locAbbrName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public void setLocRepName(String locRepName) {
		this.locRepName = locRepName;
	}

	public void setLocPrefixName(String locPrefixName) {
		this.locPrefixName = locPrefixName;
	}

	public void setLocPrefixAbbr(String locPrefixAbbr) {
		this.locPrefixAbbr = locPrefixAbbr;
	}

	public void setLocRegion(String locRegion) {
		this.locRegion = locRegion;
	}

	public void setUpdUserCode(String updUserCode) {
		this.updUserCode = updUserCode;
	}

	public void setLastUpdDate(Date lastUpdDate) {
		this.lastUpdDate = lastUpdDate;
	}

	public void setCmesUpdateDatetime(Date cmesUpdateDatetime) {
		this.cmesUpdateDatetime = cmesUpdateDatetime;
	}


	@Override
	public String toString() {
		return "CpbLkCtltLocation [locCode = " + locCode + ", locAbbrName = " + locAbbrName + ", locName = " + locName + ", locRepName = " + locRepName + ", locPrefixName = " + locPrefixName + ", locPrefixAbbr = " + locPrefixAbbr + ", locRegion = " + locRegion + ", updUserCode = " + updUserCode + ", lastUpdDate = " + lastUpdDate + ", cmesUpdateDatetime = " + cmesUpdateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cmesUpdateDatetime == null) ? 0 : cmesUpdateDatetime.hashCode());
		result = prime * result + ((lastUpdDate == null) ? 0 : lastUpdDate.hashCode());
		result = prime * result + ((locAbbrName == null) ? 0 : locAbbrName.hashCode());
		result = prime * result + ((locCode == null) ? 0 : locCode.hashCode());
		result = prime * result + ((locName == null) ? 0 : locName.hashCode());
		result = prime * result + ((locPrefixAbbr == null) ? 0 : locPrefixAbbr.hashCode());
		result = prime * result + ((locPrefixName == null) ? 0 : locPrefixName.hashCode());
		result = prime * result + ((locRegion == null) ? 0 : locRegion.hashCode());
		result = prime * result + ((locRepName == null) ? 0 : locRepName.hashCode());
		result = prime * result + ((updUserCode == null) ? 0 : updUserCode.hashCode());
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
		CpbLkCtltLocation other = (CpbLkCtltLocation) obj;
		if (cmesUpdateDatetime == null) {
			if (other.cmesUpdateDatetime != null)
				return false;
		} else if (!cmesUpdateDatetime.equals(other.cmesUpdateDatetime))
			return false;
		if (lastUpdDate == null) {
			if (other.lastUpdDate != null)
				return false;
		} else if (!lastUpdDate.equals(other.lastUpdDate))
			return false;
		if (locAbbrName == null) {
			if (other.locAbbrName != null)
				return false;
		} else if (!locAbbrName.equals(other.locAbbrName))
			return false;
		if (locCode == null) {
			if (other.locCode != null)
				return false;
		} else if (!locCode.equals(other.locCode))
			return false;
		if (locName == null) {
			if (other.locName != null)
				return false;
		} else if (!locName.equals(other.locName))
			return false;
		if (locPrefixAbbr == null) {
			if (other.locPrefixAbbr != null)
				return false;
		} else if (!locPrefixAbbr.equals(other.locPrefixAbbr))
			return false;
		if (locPrefixName == null) {
			if (other.locPrefixName != null)
				return false;
		} else if (!locPrefixName.equals(other.locPrefixName))
			return false;
		if (locRegion == null) {
			if (other.locRegion != null)
				return false;
		} else if (!locRegion.equals(other.locRegion))
			return false;
		if (locRepName == null) {
			if (other.locRepName != null)
				return false;
		} else if (!locRepName.equals(other.locRepName))
			return false;
		if (updUserCode == null) {
			if (other.updUserCode != null)
				return false;
		} else if (!updUserCode.equals(other.updUserCode))
			return false;
		return true;
	}

}