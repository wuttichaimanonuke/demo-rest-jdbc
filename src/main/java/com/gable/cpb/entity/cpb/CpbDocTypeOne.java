package com.gable.cpb.entity.cpb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbDocTypeOne {

	private Long dtOneId;
	private Long dtOneMainId;
	private String dtOneNameEn;
	private String dtOneName;
	private String dtOneFolderName;
	private Integer dtOneAge;
	private Integer dtOneKeepFor;
	private Integer dtOneNeedScan;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public CpbDocTypeOne() {
		super();
	}

	public CpbDocTypeOne(Long dtOneId, Long dtOneMainId, String dtOneNameEn, String dtOneName, String dtOneFolderName, Integer dtOneAge, Integer dtOneKeepFor, Integer dtOneNeedScan, String createUser, Date createDatetime, String updateUser, Date updateDatetime) {
		super();
		this.dtOneId = dtOneId;
		this.dtOneMainId = dtOneMainId;
		this.dtOneNameEn = dtOneNameEn;
		this.dtOneName = dtOneName;
		this.dtOneFolderName = dtOneFolderName;
		this.dtOneAge = dtOneAge;
		this.dtOneKeepFor = dtOneKeepFor;
		this.dtOneNeedScan = dtOneNeedScan;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getDtOneId() {
		return dtOneId;
	}

	public Long getDtOneMainId() {
		return dtOneMainId;
	}

	public String getDtOneNameEn() {
		return dtOneNameEn;
	}

	public String getDtOneName() {
		return dtOneName;
	}

	public String getDtOneFolderName() {
		return dtOneFolderName;
	}

	public Integer getDtOneAge() {
		return dtOneAge;
	}

	public Integer getDtOneKeepFor() {
		return dtOneKeepFor;
	}

	public Integer getDtOneNeedScan() {
		return dtOneNeedScan;
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

	public void setDtOneId(Long dtOneId) {
		this.dtOneId = dtOneId;
	}

	public void setDtOneMainId(Long dtOneMainId) {
		this.dtOneMainId = dtOneMainId;
	}

	public void setDtOneNameEn(String dtOneNameEn) {
		this.dtOneNameEn = dtOneNameEn;
	}

	public void setDtOneName(String dtOneName) {
		this.dtOneName = dtOneName;
	}

	public void setDtOneFolderName(String dtOneFolderName) {
		this.dtOneFolderName = dtOneFolderName;
	}

	public void setDtOneAge(Integer dtOneAge) {
		this.dtOneAge = dtOneAge;
	}

	public void setDtOneKeepFor(Integer dtOneKeepFor) {
		this.dtOneKeepFor = dtOneKeepFor;
	}

	public void setDtOneNeedScan(Integer dtOneNeedScan) {
		this.dtOneNeedScan = dtOneNeedScan;
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


	@Override
	public String toString() {
		return "CpbDocTypeOne [dtOneId = " + dtOneId + ", dtOneMainId = " + dtOneMainId + ", dtOneNameEn = " + dtOneNameEn + ", dtOneName = " + dtOneName + ", dtOneFolderName = " + dtOneFolderName + ", dtOneAge = " + dtOneAge + ", dtOneKeepFor = " + dtOneKeepFor + ", dtOneNeedScan = " + dtOneNeedScan + ", createUser = " + createUser + ", createDatetime = " + createDatetime + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
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
		result = prime * result + ((dtOneAge == null) ? 0 : dtOneAge.hashCode());
		result = prime * result + ((dtOneFolderName == null) ? 0 : dtOneFolderName.hashCode());
		result = prime * result + ((dtOneId == null) ? 0 : dtOneId.hashCode());
		result = prime * result + ((dtOneKeepFor == null) ? 0 : dtOneKeepFor.hashCode());
		result = prime * result + ((dtOneMainId == null) ? 0 : dtOneMainId.hashCode());
		result = prime * result + ((dtOneName == null) ? 0 : dtOneName.hashCode());
		result = prime * result + ((dtOneNameEn == null) ? 0 : dtOneNameEn.hashCode());
		result = prime * result + ((dtOneNeedScan == null) ? 0 : dtOneNeedScan.hashCode());
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
		CpbDocTypeOne other = (CpbDocTypeOne) obj;
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
		if (dtOneAge == null) {
			if (other.dtOneAge != null)
				return false;
		} else if (!dtOneAge.equals(other.dtOneAge))
			return false;
		if (dtOneFolderName == null) {
			if (other.dtOneFolderName != null)
				return false;
		} else if (!dtOneFolderName.equals(other.dtOneFolderName))
			return false;
		if (dtOneId == null) {
			if (other.dtOneId != null)
				return false;
		} else if (!dtOneId.equals(other.dtOneId))
			return false;
		if (dtOneKeepFor == null) {
			if (other.dtOneKeepFor != null)
				return false;
		} else if (!dtOneKeepFor.equals(other.dtOneKeepFor))
			return false;
		if (dtOneMainId == null) {
			if (other.dtOneMainId != null)
				return false;
		} else if (!dtOneMainId.equals(other.dtOneMainId))
			return false;
		if (dtOneName == null) {
			if (other.dtOneName != null)
				return false;
		} else if (!dtOneName.equals(other.dtOneName))
			return false;
		if (dtOneNameEn == null) {
			if (other.dtOneNameEn != null)
				return false;
		} else if (!dtOneNameEn.equals(other.dtOneNameEn))
			return false;
		if (dtOneNeedScan == null) {
			if (other.dtOneNeedScan != null)
				return false;
		} else if (!dtOneNeedScan.equals(other.dtOneNeedScan))
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