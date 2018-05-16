package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbLkAsstTypeCode {

	private String typeCode;
	private String typeName;
	private String typeGroup;
	private String updUserCode;
	private Date lastUpdDate;
	private Date cmesUpdateDatetime;

	@JsonIgnore

	public CpbLkAsstTypeCode() {
		super();
	}

	public CpbLkAsstTypeCode(String typeCode, String typeName, String typeGroup, String updUserCode, Date lastUpdDate, Date cmesUpdateDatetime) {
		super();
		this.typeCode = typeCode;
		this.typeName = typeName;
		this.typeGroup = typeGroup;
		this.updUserCode = updUserCode;
		this.lastUpdDate = lastUpdDate;
		this.cmesUpdateDatetime = cmesUpdateDatetime;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public String getTypeGroup() {
		return typeGroup;
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

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public void setTypeGroup(String typeGroup) {
		this.typeGroup = typeGroup;
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
		return "CpbLkAsstTypeCode [typeCode = " + typeCode + ", typeName = " + typeName + ", typeGroup = " + typeGroup + ", updUserCode = " + updUserCode + ", lastUpdDate = " + lastUpdDate + ", cmesUpdateDatetime = " + cmesUpdateDatetime + "]";
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
		result = prime * result + ((typeCode == null) ? 0 : typeCode.hashCode());
		result = prime * result + ((typeGroup == null) ? 0 : typeGroup.hashCode());
		result = prime * result + ((typeName == null) ? 0 : typeName.hashCode());
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
		CpbLkAsstTypeCode other = (CpbLkAsstTypeCode) obj;
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
		if (typeCode == null) {
			if (other.typeCode != null)
				return false;
		} else if (!typeCode.equals(other.typeCode))
			return false;
		if (typeGroup == null) {
			if (other.typeGroup != null)
				return false;
		} else if (!typeGroup.equals(other.typeGroup))
			return false;
		if (typeName == null) {
			if (other.typeName != null)
				return false;
		} else if (!typeName.equals(other.typeName))
			return false;
		if (updUserCode == null) {
			if (other.updUserCode != null)
				return false;
		} else if (!updUserCode.equals(other.updUserCode))
			return false;
		return true;
	}

}