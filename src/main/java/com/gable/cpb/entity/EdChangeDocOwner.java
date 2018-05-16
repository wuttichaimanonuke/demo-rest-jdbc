package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EdChangeDocOwner {

	private Integer cdoId;
	private Integer cdoOldOwnerOrgId;
	private Integer cdoNewOwnerOrgId;
	private Integer cdoObjectiveId;
	private String cdoDesc;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;
	private Integer cdoStatus;
	private Integer cdoItemCount;
	private Integer createRole;
	private String cdoProcNote;

	@JsonIgnore

	public EdChangeDocOwner() {
		super();
	}

	public EdChangeDocOwner(Integer cdoId, Integer cdoOldOwnerOrgId, Integer cdoNewOwnerOrgId, Integer cdoObjectiveId, String cdoDesc, String createUser, Date createDatetime, String updateUser, Date updateDatetime, Integer cdoStatus, Integer cdoItemCount, Integer createRole, String cdoProcNote) {
		super();
		this.cdoId = cdoId;
		this.cdoOldOwnerOrgId = cdoOldOwnerOrgId;
		this.cdoNewOwnerOrgId = cdoNewOwnerOrgId;
		this.cdoObjectiveId = cdoObjectiveId;
		this.cdoDesc = cdoDesc;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.cdoStatus = cdoStatus;
		this.cdoItemCount = cdoItemCount;
		this.createRole = createRole;
		this.cdoProcNote = cdoProcNote;
	}

	public Integer getCdoId() {
		return cdoId;
	}

	public Integer getCdoOldOwnerOrgId() {
		return cdoOldOwnerOrgId;
	}

	public Integer getCdoNewOwnerOrgId() {
		return cdoNewOwnerOrgId;
	}

	public Integer getCdoObjectiveId() {
		return cdoObjectiveId;
	}

	public String getCdoDesc() {
		return cdoDesc;
	}

	public String getCreateUser() {
		return createUser;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public Integer getCdoStatus() {
		return cdoStatus;
	}

	public Integer getCdoItemCount() {
		return cdoItemCount;
	}

	public Integer getCreateRole() {
		return createRole;
	}

	public String getCdoProcNote() {
		return cdoProcNote;
	}

	public void setCdoId(Integer cdoId) {
		this.cdoId = cdoId;
	}

	public void setCdoOldOwnerOrgId(Integer cdoOldOwnerOrgId) {
		this.cdoOldOwnerOrgId = cdoOldOwnerOrgId;
	}

	public void setCdoNewOwnerOrgId(Integer cdoNewOwnerOrgId) {
		this.cdoNewOwnerOrgId = cdoNewOwnerOrgId;
	}

	public void setCdoObjectiveId(Integer cdoObjectiveId) {
		this.cdoObjectiveId = cdoObjectiveId;
	}

	public void setCdoDesc(String cdoDesc) {
		this.cdoDesc = cdoDesc;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setCdoStatus(Integer cdoStatus) {
		this.cdoStatus = cdoStatus;
	}

	public void setCdoItemCount(Integer cdoItemCount) {
		this.cdoItemCount = cdoItemCount;
	}

	public void setCreateRole(Integer createRole) {
		this.createRole = createRole;
	}

	public void setCdoProcNote(String cdoProcNote) {
		this.cdoProcNote = cdoProcNote;
	}


	@Override
	public String toString() {
		return "EdChangeDocOwner [cdoId = " + cdoId + ", cdoOldOwnerOrgId = " + cdoOldOwnerOrgId + ", cdoNewOwnerOrgId = " + cdoNewOwnerOrgId + ", cdoObjectiveId = " + cdoObjectiveId + ", cdoDesc = " + cdoDesc + ", createUser = " + createUser + ", createDatetime = " + createDatetime + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", cdoStatus = " + cdoStatus + ", cdoItemCount = " + cdoItemCount + ", createRole = " + createRole + ", cdoProcNote = " + cdoProcNote + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdoDesc == null) ? 0 : cdoDesc.hashCode());
		result = prime * result + ((cdoId == null) ? 0 : cdoId.hashCode());
		result = prime * result + ((cdoItemCount == null) ? 0 : cdoItemCount.hashCode());
		result = prime * result + ((cdoNewOwnerOrgId == null) ? 0 : cdoNewOwnerOrgId.hashCode());
		result = prime * result + ((cdoObjectiveId == null) ? 0 : cdoObjectiveId.hashCode());
		result = prime * result + ((cdoOldOwnerOrgId == null) ? 0 : cdoOldOwnerOrgId.hashCode());
		result = prime * result + ((cdoProcNote == null) ? 0 : cdoProcNote.hashCode());
		result = prime * result + ((cdoStatus == null) ? 0 : cdoStatus.hashCode());
		result = prime * result + ((createDatetime == null) ? 0 : createDatetime.hashCode());
		result = prime * result + ((createRole == null) ? 0 : createRole.hashCode());
		result = prime * result + ((createUser == null) ? 0 : createUser.hashCode());
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
		EdChangeDocOwner other = (EdChangeDocOwner) obj;
		if (cdoDesc == null) {
			if (other.cdoDesc != null)
				return false;
		} else if (!cdoDesc.equals(other.cdoDesc))
			return false;
		if (cdoId == null) {
			if (other.cdoId != null)
				return false;
		} else if (!cdoId.equals(other.cdoId))
			return false;
		if (cdoItemCount == null) {
			if (other.cdoItemCount != null)
				return false;
		} else if (!cdoItemCount.equals(other.cdoItemCount))
			return false;
		if (cdoNewOwnerOrgId == null) {
			if (other.cdoNewOwnerOrgId != null)
				return false;
		} else if (!cdoNewOwnerOrgId.equals(other.cdoNewOwnerOrgId))
			return false;
		if (cdoObjectiveId == null) {
			if (other.cdoObjectiveId != null)
				return false;
		} else if (!cdoObjectiveId.equals(other.cdoObjectiveId))
			return false;
		if (cdoOldOwnerOrgId == null) {
			if (other.cdoOldOwnerOrgId != null)
				return false;
		} else if (!cdoOldOwnerOrgId.equals(other.cdoOldOwnerOrgId))
			return false;
		if (cdoProcNote == null) {
			if (other.cdoProcNote != null)
				return false;
		} else if (!cdoProcNote.equals(other.cdoProcNote))
			return false;
		if (cdoStatus == null) {
			if (other.cdoStatus != null)
				return false;
		} else if (!cdoStatus.equals(other.cdoStatus))
			return false;
		if (createDatetime == null) {
			if (other.createDatetime != null)
				return false;
		} else if (!createDatetime.equals(other.createDatetime))
			return false;
		if (createRole == null) {
			if (other.createRole != null)
				return false;
		} else if (!createRole.equals(other.createRole))
			return false;
		if (createUser == null) {
			if (other.createUser != null)
				return false;
		} else if (!createUser.equals(other.createUser))
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