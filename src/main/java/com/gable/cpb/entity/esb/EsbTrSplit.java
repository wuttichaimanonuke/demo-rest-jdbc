package com.gable.cpb.entity.esb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbTrSplit {

	private Long sptId;
	private Long trId;
	private Long frAttId;
	private Integer frAttTypeBf;
	private Integer frAttTypeAfter;
	private Long toAttId;
	private Integer toAttType;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public EsbTrSplit() {
		super();
	}

	public EsbTrSplit(Long sptId, Long trId, Long frAttId, Integer frAttTypeBf, Integer frAttTypeAfter, Long toAttId, Integer toAttType, String updateUser, Date updateDatetime) {
		super();
		this.sptId = sptId;
		this.trId = trId;
		this.frAttId = frAttId;
		this.frAttTypeBf = frAttTypeBf;
		this.frAttTypeAfter = frAttTypeAfter;
		this.toAttId = toAttId;
		this.toAttType = toAttType;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getSptId() {
		return sptId;
	}

	public Long getTrId() {
		return trId;
	}

	public Long getFrAttId() {
		return frAttId;
	}

	public Integer getFrAttTypeBf() {
		return frAttTypeBf;
	}

	public Integer getFrAttTypeAfter() {
		return frAttTypeAfter;
	}

	public Long getToAttId() {
		return toAttId;
	}

	public Integer getToAttType() {
		return toAttType;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setSptId(Long sptId) {
		this.sptId = sptId;
	}

	public void setTrId(Long trId) {
		this.trId = trId;
	}

	public void setFrAttId(Long frAttId) {
		this.frAttId = frAttId;
	}

	public void setFrAttTypeBf(Integer frAttTypeBf) {
		this.frAttTypeBf = frAttTypeBf;
	}

	public void setFrAttTypeAfter(Integer frAttTypeAfter) {
		this.frAttTypeAfter = frAttTypeAfter;
	}

	public void setToAttId(Long toAttId) {
		this.toAttId = toAttId;
	}

	public void setToAttType(Integer toAttType) {
		this.toAttType = toAttType;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "esbTrSplit [sptId = " + sptId + ", trId = " + trId + ", frAttId = " + frAttId + ", frAttTypeBf = " + frAttTypeBf + ", frAttTypeAfter = " + frAttTypeAfter + ", toAttId = " + toAttId + ", toAttType = " + toAttType + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((frAttId == null) ? 0 : frAttId.hashCode());
		result = prime * result + ((frAttTypeAfter == null) ? 0 : frAttTypeAfter.hashCode());
		result = prime * result + ((frAttTypeBf == null) ? 0 : frAttTypeBf.hashCode());
		result = prime * result + ((sptId == null) ? 0 : sptId.hashCode());
		result = prime * result + ((toAttId == null) ? 0 : toAttId.hashCode());
		result = prime * result + ((toAttType == null) ? 0 : toAttType.hashCode());
		result = prime * result + ((trId == null) ? 0 : trId.hashCode());
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
		EsbTrSplit other = (EsbTrSplit) obj;
		if (frAttId == null) {
			if (other.frAttId != null)
				return false;
		} else if (!frAttId.equals(other.frAttId))
			return false;
		if (frAttTypeAfter == null) {
			if (other.frAttTypeAfter != null)
				return false;
		} else if (!frAttTypeAfter.equals(other.frAttTypeAfter))
			return false;
		if (frAttTypeBf == null) {
			if (other.frAttTypeBf != null)
				return false;
		} else if (!frAttTypeBf.equals(other.frAttTypeBf))
			return false;
		if (sptId == null) {
			if (other.sptId != null)
				return false;
		} else if (!sptId.equals(other.sptId))
			return false;
		if (toAttId == null) {
			if (other.toAttId != null)
				return false;
		} else if (!toAttId.equals(other.toAttId))
			return false;
		if (toAttType == null) {
			if (other.toAttType != null)
				return false;
		} else if (!toAttType.equals(other.toAttType))
			return false;
		if (trId == null) {
			if (other.trId != null)
				return false;
		} else if (!trId.equals(other.trId))
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