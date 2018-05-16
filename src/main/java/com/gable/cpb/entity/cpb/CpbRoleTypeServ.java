package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbRoleTypeServ {

	private Long rtId;
	private Long svId;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public CpbRoleTypeServ() {
		super();
	}

	public CpbRoleTypeServ(Long rtId, Long svId, String updateUser, Date updateDatetime) {
		super();
		this.rtId = rtId;
		this.svId = svId;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getRtId() {
		return rtId;
	}

	public Long getSvId() {
		return svId;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setRtId(Long rtId) {
		this.rtId = rtId;
	}

	public void setSvId(Long svId) {
		this.svId = svId;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "CpbRoleTypeServ [rtId = " + rtId + ", svId = " + svId + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rtId == null) ? 0 : rtId.hashCode());
		result = prime * result + ((svId == null) ? 0 : svId.hashCode());
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
		CpbRoleTypeServ other = (CpbRoleTypeServ) obj;
		if (rtId == null) {
			if (other.rtId != null)
				return false;
		} else if (!rtId.equals(other.rtId))
			return false;
		if (svId == null) {
			if (other.svId != null)
				return false;
		} else if (!svId.equals(other.svId))
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