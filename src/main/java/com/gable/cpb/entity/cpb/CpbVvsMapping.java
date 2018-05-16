package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbVvsMapping {

	private String rObjectId;
	private Long orgId;
	private Date updateDatetime;

	@JsonIgnore

	public CpbVvsMapping() {
		super();
	}

	public CpbVvsMapping(String rObjectId, Long orgId, Date updateDatetime) {
		super();
		this.rObjectId = rObjectId;
		this.orgId = orgId;
		this.updateDatetime = updateDatetime;
	}

	public String getRObjectId() {
		return rObjectId;
	}

	public Long getOrgId() {
		return orgId;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setRObjectId(String rObjectId) {
		this.rObjectId = rObjectId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "CpbVvsMapping [rObjectId = " + rObjectId + ", orgId = " + orgId + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orgId == null) ? 0 : orgId.hashCode());
		result = prime * result + ((rObjectId == null) ? 0 : rObjectId.hashCode());
		result = prime * result + ((updateDatetime == null) ? 0 : updateDatetime.hashCode());
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
		CpbVvsMapping other = (CpbVvsMapping) obj;
		if (orgId == null) {
			if (other.orgId != null)
				return false;
		} else if (!orgId.equals(other.orgId))
			return false;
		if (rObjectId == null) {
			if (other.rObjectId != null)
				return false;
		} else if (!rObjectId.equals(other.rObjectId))
			return false;
		if (updateDatetime == null) {
			if (other.updateDatetime != null)
				return false;
		} else if (!updateDatetime.equals(other.updateDatetime))
			return false;
		return true;
	}

}