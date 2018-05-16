package com.gable.cpb.entity.ed;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EdDocRel {

	private String relParentId;
	private String relChildId;
	private Integer relType;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public EdDocRel() {
		super();
	}

	public EdDocRel(String relParentId, String relChildId, Integer relType, String updateUser, Date updateDatetime) {
		super();
		this.relParentId = relParentId;
		this.relChildId = relChildId;
		this.relType = relType;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public String getRelParentId() {
		return relParentId;
	}

	public String getRelChildId() {
		return relChildId;
	}

	public Integer getRelType() {
		return relType;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setRelParentId(String relParentId) {
		this.relParentId = relParentId;
	}

	public void setRelChildId(String relChildId) {
		this.relChildId = relChildId;
	}

	public void setRelType(Integer relType) {
		this.relType = relType;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "edDocRel [relParentId = " + relParentId + ", relChildId = " + relChildId + ", relType = " + relType + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((relChildId == null) ? 0 : relChildId.hashCode());
		result = prime * result + ((relParentId == null) ? 0 : relParentId.hashCode());
		result = prime * result + ((relType == null) ? 0 : relType.hashCode());
		result = prime * result + ((updateDatetime == null) ? 0 : updateDatetime.hashCode());
		result = prime * result + ((updateUser == null) ? 0 : updateUser.hashCode());
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
		EdDocRel other = (EdDocRel) obj;
		if (relChildId == null) {
			if (other.relChildId != null)
				return false;
		} else if (!relChildId.equals(other.relChildId))
			return false;
		if (relParentId == null) {
			if (other.relParentId != null)
				return false;
		} else if (!relParentId.equals(other.relParentId))
			return false;
		if (relType == null) {
			if (other.relType != null)
				return false;
		} else if (!relType.equals(other.relType))
			return false;
		if (updateDatetime == null) {
			if (other.updateDatetime != null)
				return false;
		} else if (!updateDatetime.equals(other.updateDatetime))
			return false;
		if (updateUser == null) {
			if (other.updateUser != null)
				return false;
		} else if (!updateUser.equals(other.updateUser))
			return false;
		return true;
	}

}