package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbOrgHist {

	private Long ohId;
	private Long ohOrgId;
	private Integer ohType;
	private String createUser;
	private Date createDatetime;

	@JsonIgnore

	public CpbOrgHist() {
		super();
	}

	public CpbOrgHist(Long ohId, Long ohOrgId, Integer ohType, String createUser, Date createDatetime) {
		super();
		this.ohId = ohId;
		this.ohOrgId = ohOrgId;
		this.ohType = ohType;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
	}

	public Long getOhId() {
		return ohId;
	}

	public Long getOhOrgId() {
		return ohOrgId;
	}

	public Integer getOhType() {
		return ohType;
	}

	public String getCreateUser() {
		return createUser;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public void setOhId(Long ohId) {
		this.ohId = ohId;
	}

	public void setOhOrgId(Long ohOrgId) {
		this.ohOrgId = ohOrgId;
	}

	public void setOhType(Integer ohType) {
		this.ohType = ohType;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}


	@Override
	public String toString() {
		return "CpbOrgHist [ohId = " + ohId + ", ohOrgId = " + ohOrgId + ", ohType = " + ohType + ", createUser = " + createUser + ", createDatetime = " + createDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createDatetime == null) ? 0 : createDatetime.hashCode());
		result = prime * result + ((createUser == null) ? 0 : createUser.hashCode());
		result = prime * result + ((ohId == null) ? 0 : ohId.hashCode());
		result = prime * result + ((ohOrgId == null) ? 0 : ohOrgId.hashCode());
		result = prime * result + ((ohType == null) ? 0 : ohType.hashCode());
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
		CpbOrgHist other = (CpbOrgHist) obj;
		if (createDatetime == null) {
			if (other.createDatetime != null)
				return false;
		} else if (!createDatetime.equals(other.createDatetime))
			return false;
		if (createUser == null) {
			if (other.createUser != null)
				return false;
		} else if (!createUser.equals(other.createUser))
			return false;
		if (ohId == null) {
			if (other.ohId != null)
				return false;
		} else if (!ohId.equals(other.ohId))
			return false;
		if (ohOrgId == null) {
			if (other.ohOrgId != null)
				return false;
		} else if (!ohOrgId.equals(other.ohOrgId))
			return false;
		if (ohType == null) {
			if (other.ohType != null)
				return false;
		} else if (!ohType.equals(other.ohType))
			return false;
		return true;
	}

}