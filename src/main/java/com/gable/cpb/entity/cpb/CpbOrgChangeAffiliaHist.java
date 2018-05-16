package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbOrgChangeAffiliaHist {

	private Long ohId;
	private Long ocahOldRefOrgId;
	private Long ocahNewRefOrgId;
	private String createUser;
	private Date createDatetime;

	@JsonIgnore

	public CpbOrgChangeAffiliaHist() {
		super();
	}

	public CpbOrgChangeAffiliaHist(Long ohId, Long ocahOldRefOrgId, Long ocahNewRefOrgId, String createUser, Date createDatetime) {
		super();
		this.ohId = ohId;
		this.ocahOldRefOrgId = ocahOldRefOrgId;
		this.ocahNewRefOrgId = ocahNewRefOrgId;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
	}

	public Long getOhId() {
		return ohId;
	}

	public Long getOcahOldRefOrgId() {
		return ocahOldRefOrgId;
	}

	public Long getOcahNewRefOrgId() {
		return ocahNewRefOrgId;
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

	public void setOcahOldRefOrgId(Long ocahOldRefOrgId) {
		this.ocahOldRefOrgId = ocahOldRefOrgId;
	}

	public void setOcahNewRefOrgId(Long ocahNewRefOrgId) {
		this.ocahNewRefOrgId = ocahNewRefOrgId;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}


	@Override
	public String toString() {
		return "CpbOrgChangeAffiliaHist [ohId = " + ohId + ", ocahOldRefOrgId = " + ocahOldRefOrgId + ", ocahNewRefOrgId = " + ocahNewRefOrgId + ", createUser = " + createUser + ", createDatetime = " + createDatetime + "]";
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
		result = prime * result + ((ocahNewRefOrgId == null) ? 0 : ocahNewRefOrgId.hashCode());
		result = prime * result + ((ocahOldRefOrgId == null) ? 0 : ocahOldRefOrgId.hashCode());
		result = prime * result + ((ohId == null) ? 0 : ohId.hashCode());
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
		CpbOrgChangeAffiliaHist other = (CpbOrgChangeAffiliaHist) obj;
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
		if (ocahNewRefOrgId == null) {
			if (other.ocahNewRefOrgId != null)
				return false;
		} else if (!ocahNewRefOrgId.equals(other.ocahNewRefOrgId))
			return false;
		if (ocahOldRefOrgId == null) {
			if (other.ocahOldRefOrgId != null)
				return false;
		} else if (!ocahOldRefOrgId.equals(other.ocahOldRefOrgId))
			return false;
		if (ohId == null) {
			if (other.ohId != null)
				return false;
		} else if (!ohId.equals(other.ohId))
			return false;
		return true;
	}

}