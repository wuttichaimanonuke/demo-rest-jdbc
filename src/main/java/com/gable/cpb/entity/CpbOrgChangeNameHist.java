package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbOrgChangeNameHist {

	private Long ohId;
	private String ocnhOldName;
	private String ocnhNewName;
	private String ocnhOldSname;
	private String ocnhNewSname;
	private String createUser;
	private Date createDatetime;

	@JsonIgnore

	public CpbOrgChangeNameHist() {
		super();
	}

	public CpbOrgChangeNameHist(Long ohId, String ocnhOldName, String ocnhNewName, String ocnhOldSname, String ocnhNewSname, String createUser, Date createDatetime) {
		super();
		this.ohId = ohId;
		this.ocnhOldName = ocnhOldName;
		this.ocnhNewName = ocnhNewName;
		this.ocnhOldSname = ocnhOldSname;
		this.ocnhNewSname = ocnhNewSname;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
	}

	public Long getOhId() {
		return ohId;
	}

	public String getOcnhOldName() {
		return ocnhOldName;
	}

	public String getOcnhNewName() {
		return ocnhNewName;
	}

	public String getOcnhOldSname() {
		return ocnhOldSname;
	}

	public String getOcnhNewSname() {
		return ocnhNewSname;
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

	public void setOcnhOldName(String ocnhOldName) {
		this.ocnhOldName = ocnhOldName;
	}

	public void setOcnhNewName(String ocnhNewName) {
		this.ocnhNewName = ocnhNewName;
	}

	public void setOcnhOldSname(String ocnhOldSname) {
		this.ocnhOldSname = ocnhOldSname;
	}

	public void setOcnhNewSname(String ocnhNewSname) {
		this.ocnhNewSname = ocnhNewSname;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}


	@Override
	public String toString() {
		return "CpbOrgChangeNameHist [ohId = " + ohId + ", ocnhOldName = " + ocnhOldName + ", ocnhNewName = " + ocnhNewName + ", ocnhOldSname = " + ocnhOldSname + ", ocnhNewSname = " + ocnhNewSname + ", createUser = " + createUser + ", createDatetime = " + createDatetime + "]";
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
		result = prime * result + ((ocnhNewName == null) ? 0 : ocnhNewName.hashCode());
		result = prime * result + ((ocnhNewSname == null) ? 0 : ocnhNewSname.hashCode());
		result = prime * result + ((ocnhOldName == null) ? 0 : ocnhOldName.hashCode());
		result = prime * result + ((ocnhOldSname == null) ? 0 : ocnhOldSname.hashCode());
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
		CpbOrgChangeNameHist other = (CpbOrgChangeNameHist) obj;
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
		if (ocnhNewName == null) {
			if (other.ocnhNewName != null)
				return false;
		} else if (!ocnhNewName.equals(other.ocnhNewName))
			return false;
		if (ocnhNewSname == null) {
			if (other.ocnhNewSname != null)
				return false;
		} else if (!ocnhNewSname.equals(other.ocnhNewSname))
			return false;
		if (ocnhOldName == null) {
			if (other.ocnhOldName != null)
				return false;
		} else if (!ocnhOldName.equals(other.ocnhOldName))
			return false;
		if (ocnhOldSname == null) {
			if (other.ocnhOldSname != null)
				return false;
		} else if (!ocnhOldSname.equals(other.ocnhOldSname))
			return false;
		if (ohId == null) {
			if (other.ohId != null)
				return false;
		} else if (!ohId.equals(other.ohId))
			return false;
		return true;
	}

}