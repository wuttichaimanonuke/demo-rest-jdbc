package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbLkCtltContractCode {

	private String contractCode;
	private String contractDesc;
	private String contractAbbr;
	private String form;
	private String updUserCode;
	private Date lastUpdDate;
	private Date cmesUpdateDatetime;

	@JsonIgnore

	public CpbLkCtltContractCode() {
		super();
	}

	public CpbLkCtltContractCode(String contractCode, String contractDesc, String contractAbbr, String form, String updUserCode, Date lastUpdDate, Date cmesUpdateDatetime) {
		super();
		this.contractCode = contractCode;
		this.contractDesc = contractDesc;
		this.contractAbbr = contractAbbr;
		this.form = form;
		this.updUserCode = updUserCode;
		this.lastUpdDate = lastUpdDate;
		this.cmesUpdateDatetime = cmesUpdateDatetime;
	}

	public String getContractCode() {
		return contractCode;
	}

	public String getContractDesc() {
		return contractDesc;
	}

	public String getContractAbbr() {
		return contractAbbr;
	}

	public String getForm() {
		return form;
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

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public void setContractDesc(String contractDesc) {
		this.contractDesc = contractDesc;
	}

	public void setContractAbbr(String contractAbbr) {
		this.contractAbbr = contractAbbr;
	}

	public void setForm(String form) {
		this.form = form;
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
		return "CpbLkCtltContractCode [contractCode = " + contractCode + ", contractDesc = " + contractDesc + ", contractAbbr = " + contractAbbr + ", form = " + form + ", updUserCode = " + updUserCode + ", lastUpdDate = " + lastUpdDate + ", cmesUpdateDatetime = " + cmesUpdateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cmesUpdateDatetime == null) ? 0 : cmesUpdateDatetime.hashCode());
		result = prime * result + ((contractAbbr == null) ? 0 : contractAbbr.hashCode());
		result = prime * result + ((contractCode == null) ? 0 : contractCode.hashCode());
		result = prime * result + ((contractDesc == null) ? 0 : contractDesc.hashCode());
		result = prime * result + ((form == null) ? 0 : form.hashCode());
		result = prime * result + ((lastUpdDate == null) ? 0 : lastUpdDate.hashCode());
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
		CpbLkCtltContractCode other = (CpbLkCtltContractCode) obj;
		if (cmesUpdateDatetime == null) {
			if (other.cmesUpdateDatetime != null)
				return false;
		} else if (!cmesUpdateDatetime.equals(other.cmesUpdateDatetime))
			return false;
		if (contractAbbr == null) {
			if (other.contractAbbr != null)
				return false;
		} else if (!contractAbbr.equals(other.contractAbbr))
			return false;
		if (contractCode == null) {
			if (other.contractCode != null)
				return false;
		} else if (!contractCode.equals(other.contractCode))
			return false;
		if (contractDesc == null) {
			if (other.contractDesc != null)
				return false;
		} else if (!contractDesc.equals(other.contractDesc))
			return false;
		if (form == null) {
			if (other.form != null)
				return false;
		} else if (!form.equals(other.form))
			return false;
		if (lastUpdDate == null) {
			if (other.lastUpdDate != null)
				return false;
		} else if (!lastUpdDate.equals(other.lastUpdDate))
			return false;
		if (updUserCode == null) {
			if (other.updUserCode != null)
				return false;
		} else if (!updUserCode.equals(other.updUserCode))
			return false;
		return true;
	}

}