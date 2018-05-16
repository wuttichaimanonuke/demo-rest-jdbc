package com.gable.cpb.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class fcSyncTable {

	private String fcStTableName;
	private Integer fcStVal;

	@JsonIgnore

	public fcSyncTable() {
		super();
	}

	public fcSyncTable(String fcStTableName, Integer fcStVal) {
		super();
		this.fcStTableName = fcStTableName;
		this.fcStVal = fcStVal;
	}

	public String getFcStTableName() {
		return fcStTableName;
	}

	public Integer getFcStVal() {
		return fcStVal;
	}

	public void setFcStTableName(String fcStTableName) {
		this.fcStTableName = fcStTableName;
	}

	public void setFcStVal(Integer fcStVal) {
		this.fcStVal = fcStVal;
	}


	@Override
	public String toString() {
		return "fcSyncTable [fcStTableName = " + fcStTableName + ", fcStVal = " + fcStVal + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fcStTableName == null) ? 0 : fcStTableName.hashCode());
		result = prime * result + ((fcStVal == null) ? 0 : fcStVal.hashCode());
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
		fcSyncTable other = (fcSyncTable) obj;
		if (fcStTableName == null) {
			if (other.fcStTableName != null)
				return false;
		} else if (!fcStTableName.equals(other.fcStTableName))
			return false;
		if (fcStVal == null) {
			if (other.fcStVal != null)
				return false;
		} else if (!fcStVal.equals(other.fcStVal))
			return false;
		return true;
	}

}