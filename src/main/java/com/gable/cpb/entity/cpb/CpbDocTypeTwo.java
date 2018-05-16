package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbDocTypeTwo {

	private Long dtTwoId;
	private Long dtTwoOneId;
	private Long dtTwoMainId;
	private String dtTwoName;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;
	private Integer dtTwoOcr;

	@JsonIgnore

	public CpbDocTypeTwo() {
		super();
	}

	public CpbDocTypeTwo(Long dtTwoId, Long dtTwoOneId, Long dtTwoMainId, String dtTwoName, String createUser, Date createDatetime, String updateUser, Date updateDatetime, Integer dtTwoOcr) {
		super();
		this.dtTwoId = dtTwoId;
		this.dtTwoOneId = dtTwoOneId;
		this.dtTwoMainId = dtTwoMainId;
		this.dtTwoName = dtTwoName;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.dtTwoOcr = dtTwoOcr;
	}

	public Long getDtTwoId() {
		return dtTwoId;
	}

	public Long getDtTwoOneId() {
		return dtTwoOneId;
	}

	public Long getDtTwoMainId() {
		return dtTwoMainId;
	}

	public String getDtTwoName() {
		return dtTwoName;
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

	public Integer getDtTwoOcr() {
		return dtTwoOcr;
	}

	public void setDtTwoId(Long dtTwoId) {
		this.dtTwoId = dtTwoId;
	}

	public void setDtTwoOneId(Long dtTwoOneId) {
		this.dtTwoOneId = dtTwoOneId;
	}

	public void setDtTwoMainId(Long dtTwoMainId) {
		this.dtTwoMainId = dtTwoMainId;
	}

	public void setDtTwoName(String dtTwoName) {
		this.dtTwoName = dtTwoName;
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

	public void setDtTwoOcr(Integer dtTwoOcr) {
		this.dtTwoOcr = dtTwoOcr;
	}


	@Override
	public String toString() {
		return "CpbDocTypeTwo [dtTwoId = " + dtTwoId + ", dtTwoOneId = " + dtTwoOneId + ", dtTwoMainId = " + dtTwoMainId + ", dtTwoName = " + dtTwoName + ", createUser = " + createUser + ", createDatetime = " + createDatetime + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", dtTwoOcr = " + dtTwoOcr + "]";
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
		result = prime * result + ((dtTwoId == null) ? 0 : dtTwoId.hashCode());
		result = prime * result + ((dtTwoMainId == null) ? 0 : dtTwoMainId.hashCode());
		result = prime * result + ((dtTwoName == null) ? 0 : dtTwoName.hashCode());
		result = prime * result + ((dtTwoOcr == null) ? 0 : dtTwoOcr.hashCode());
		result = prime * result + ((dtTwoOneId == null) ? 0 : dtTwoOneId.hashCode());
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
		CpbDocTypeTwo other = (CpbDocTypeTwo) obj;
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
		if (dtTwoId == null) {
			if (other.dtTwoId != null)
				return false;
		} else if (!dtTwoId.equals(other.dtTwoId))
			return false;
		if (dtTwoMainId == null) {
			if (other.dtTwoMainId != null)
				return false;
		} else if (!dtTwoMainId.equals(other.dtTwoMainId))
			return false;
		if (dtTwoName == null) {
			if (other.dtTwoName != null)
				return false;
		} else if (!dtTwoName.equals(other.dtTwoName))
			return false;
		if (dtTwoOcr == null) {
			if (other.dtTwoOcr != null)
				return false;
		} else if (!dtTwoOcr.equals(other.dtTwoOcr))
			return false;
		if (dtTwoOneId == null) {
			if (other.dtTwoOneId != null)
				return false;
		} else if (!dtTwoOneId.equals(other.dtTwoOneId))
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