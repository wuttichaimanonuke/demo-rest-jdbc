package com.gable.cpb.entity.esb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbTrans {

	private Long trId;
	private Long trGroup;
	private Date trDatetime;
	private Long bkId;
	private Long userId;
	private Integer trType;
	private Long objId;
	private String objDesc;
	private String updateUser;
	private Date updateDatetime;
	private Long roleId;

	@JsonIgnore

	public EsbTrans() {
		super();
	}

	public EsbTrans(Long trId, Long trGroup, Date trDatetime, Long bkId, Long userId, Integer trType, Long objId, String objDesc, String updateUser, Date updateDatetime, Long roleId) {
		super();
		this.trId = trId;
		this.trGroup = trGroup;
		this.trDatetime = trDatetime;
		this.bkId = bkId;
		this.userId = userId;
		this.trType = trType;
		this.objId = objId;
		this.objDesc = objDesc;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.roleId = roleId;
	}

	public Long getTrId() {
		return trId;
	}

	public Long getTrGroup() {
		return trGroup;
	}

	public Date getTrDatetime() {
		return trDatetime;
	}

	public Long getBkId() {
		return bkId;
	}

	public Long getUserId() {
		return userId;
	}

	public Integer getTrType() {
		return trType;
	}

	public Long getObjId() {
		return objId;
	}

	public String getObjDesc() {
		return objDesc;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setTrId(Long trId) {
		this.trId = trId;
	}

	public void setTrGroup(Long trGroup) {
		this.trGroup = trGroup;
	}

	public void setTrDatetime(Date trDatetime) {
		this.trDatetime = trDatetime;
	}

	public void setBkId(Long bkId) {
		this.bkId = bkId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setTrType(Integer trType) {
		this.trType = trType;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public void setObjDesc(String objDesc) {
		this.objDesc = objDesc;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	@Override
	public String toString() {
		return "esbTrans [trId = " + trId + ", trGroup = " + trGroup + ", trDatetime = " + trDatetime + ", bkId = " + bkId + ", userId = " + userId + ", trType = " + trType + ", objId = " + objId + ", objDesc = " + objDesc + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", roleId = " + roleId + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bkId == null) ? 0 : bkId.hashCode());
		result = prime * result + ((objDesc == null) ? 0 : objDesc.hashCode());
		result = prime * result + ((objId == null) ? 0 : objId.hashCode());
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
		result = prime * result + ((trDatetime == null) ? 0 : trDatetime.hashCode());
		result = prime * result + ((trGroup == null) ? 0 : trGroup.hashCode());
		result = prime * result + ((trId == null) ? 0 : trId.hashCode());
		result = prime * result + ((trType == null) ? 0 : trType.hashCode());
		result = prime * result + ((updateDatetime == null) ? 0 : updateDatetime.hashCode());
		result = prime * result + ((updateUser == null) ? 0 : updateUser.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		EsbTrans other = (EsbTrans) obj;
		if (bkId == null) {
			if (other.bkId != null)
				return false;
		} else if (!bkId.equals(other.bkId))
			return false;
		if (objDesc == null) {
			if (other.objDesc != null)
				return false;
		} else if (!objDesc.equals(other.objDesc))
			return false;
		if (objId == null) {
			if (other.objId != null)
				return false;
		} else if (!objId.equals(other.objId))
			return false;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
			return false;
		if (trDatetime == null) {
			if (other.trDatetime != null)
				return false;
		} else if (!trDatetime.equals(other.trDatetime))
			return false;
		if (trGroup == null) {
			if (other.trGroup != null)
				return false;
		} else if (!trGroup.equals(other.trGroup))
			return false;
		if (trId == null) {
			if (other.trId != null)
				return false;
		} else if (!trId.equals(other.trId))
			return false;
		if (trType == null) {
			if (other.trType != null)
				return false;
		} else if (!trType.equals(other.trType))
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
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

}