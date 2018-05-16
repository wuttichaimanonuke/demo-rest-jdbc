package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbLkAsstDistrictCode {

	private String districtCode;
	private String districtName;
	private String locCode;
	private String flagApp;
	private String updUserCode;
	private Date lastUpdDate;
	private String districtCodeHist;
	private Date cmesUpdateDatetime;

	@JsonIgnore

	public CpbLkAsstDistrictCode() {
		super();
	}

	public CpbLkAsstDistrictCode(String districtCode, String districtName, String locCode, String flagApp, String updUserCode, Date lastUpdDate, String districtCodeHist, Date cmesUpdateDatetime) {
		super();
		this.districtCode = districtCode;
		this.districtName = districtName;
		this.locCode = locCode;
		this.flagApp = flagApp;
		this.updUserCode = updUserCode;
		this.lastUpdDate = lastUpdDate;
		this.districtCodeHist = districtCodeHist;
		this.cmesUpdateDatetime = cmesUpdateDatetime;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public String getLocCode() {
		return locCode;
	}

	public String getFlagApp() {
		return flagApp;
	}

	public String getUpdUserCode() {
		return updUserCode;
	}

	public Date getLastUpdDate() {
		return lastUpdDate;
	}

	public String getDistrictCodeHist() {
		return districtCodeHist;
	}

	public Date getCmesUpdateDatetime() {
		return cmesUpdateDatetime;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}

	public void setFlagApp(String flagApp) {
		this.flagApp = flagApp;
	}

	public void setUpdUserCode(String updUserCode) {
		this.updUserCode = updUserCode;
	}

	public void setLastUpdDate(Date lastUpdDate) {
		this.lastUpdDate = lastUpdDate;
	}

	public void setDistrictCodeHist(String districtCodeHist) {
		this.districtCodeHist = districtCodeHist;
	}

	public void setCmesUpdateDatetime(Date cmesUpdateDatetime) {
		this.cmesUpdateDatetime = cmesUpdateDatetime;
	}


	@Override
	public String toString() {
		return "CpbLkAsstDistrictCode [districtCode = " + districtCode + ", districtName = " + districtName + ", locCode = " + locCode + ", flagApp = " + flagApp + ", updUserCode = " + updUserCode + ", lastUpdDate = " + lastUpdDate + ", districtCodeHist = " + districtCodeHist + ", cmesUpdateDatetime = " + cmesUpdateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cmesUpdateDatetime == null) ? 0 : cmesUpdateDatetime.hashCode());
		result = prime * result + ((districtCode == null) ? 0 : districtCode.hashCode());
		result = prime * result + ((districtCodeHist == null) ? 0 : districtCodeHist.hashCode());
		result = prime * result + ((districtName == null) ? 0 : districtName.hashCode());
		result = prime * result + ((flagApp == null) ? 0 : flagApp.hashCode());
		result = prime * result + ((lastUpdDate == null) ? 0 : lastUpdDate.hashCode());
		result = prime * result + ((locCode == null) ? 0 : locCode.hashCode());
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
		CpbLkAsstDistrictCode other = (CpbLkAsstDistrictCode) obj;
		if (cmesUpdateDatetime == null) {
			if (other.cmesUpdateDatetime != null)
				return false;
		} else if (!cmesUpdateDatetime.equals(other.cmesUpdateDatetime))
			return false;
		if (districtCode == null) {
			if (other.districtCode != null)
				return false;
		} else if (!districtCode.equals(other.districtCode))
			return false;
		if (districtCodeHist == null) {
			if (other.districtCodeHist != null)
				return false;
		} else if (!districtCodeHist.equals(other.districtCodeHist))
			return false;
		if (districtName == null) {
			if (other.districtName != null)
				return false;
		} else if (!districtName.equals(other.districtName))
			return false;
		if (flagApp == null) {
			if (other.flagApp != null)
				return false;
		} else if (!flagApp.equals(other.flagApp))
			return false;
		if (lastUpdDate == null) {
			if (other.lastUpdDate != null)
				return false;
		} else if (!lastUpdDate.equals(other.lastUpdDate))
			return false;
		if (locCode == null) {
			if (other.locCode != null)
				return false;
		} else if (!locCode.equals(other.locCode))
			return false;
		if (updUserCode == null) {
			if (other.updUserCode != null)
				return false;
		} else if (!updUserCode.equals(other.updUserCode))
			return false;
		return true;
	}

}