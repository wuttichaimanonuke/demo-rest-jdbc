package com.gable.cpb.entity.esb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbBknoFormat {

	private Long ctId;
	private Long fmSeq;
	private Integer fmType;
	private String fmText;
	private Long fmId;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public EsbBknoFormat() {
		super();
	}

	public EsbBknoFormat(Long ctId, Long fmSeq, Integer fmType, String fmText, Long fmId, String updateUser, Date updateDatetime) {
		super();
		this.ctId = ctId;
		this.fmSeq = fmSeq;
		this.fmType = fmType;
		this.fmText = fmText;
		this.fmId = fmId;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getCtId() {
		return ctId;
	}

	public Long getFmSeq() {
		return fmSeq;
	}

	public Integer getFmType() {
		return fmType;
	}

	public String getFmText() {
		return fmText;
	}

	public Long getFmId() {
		return fmId;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setCtId(Long ctId) {
		this.ctId = ctId;
	}

	public void setFmSeq(Long fmSeq) {
		this.fmSeq = fmSeq;
	}

	public void setFmType(Integer fmType) {
		this.fmType = fmType;
	}

	public void setFmText(String fmText) {
		this.fmText = fmText;
	}

	public void setFmId(Long fmId) {
		this.fmId = fmId;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "esbBknoFormat [ctId = " + ctId + ", fmSeq = " + fmSeq + ", fmType = " + fmType + ", fmText = " + fmText + ", fmId = " + fmId + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ctId == null) ? 0 : ctId.hashCode());
		result = prime * result + ((fmId == null) ? 0 : fmId.hashCode());
		result = prime * result + ((fmSeq == null) ? 0 : fmSeq.hashCode());
		result = prime * result + ((fmText == null) ? 0 : fmText.hashCode());
		result = prime * result + ((fmType == null) ? 0 : fmType.hashCode());
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
		EsbBknoFormat other = (EsbBknoFormat) obj;
		if (ctId == null) {
			if (other.ctId != null)
				return false;
		} else if (!ctId.equals(other.ctId))
			return false;
		if (fmId == null) {
			if (other.fmId != null)
				return false;
		} else if (!fmId.equals(other.fmId))
			return false;
		if (fmSeq == null) {
			if (other.fmSeq != null)
				return false;
		} else if (!fmSeq.equals(other.fmSeq))
			return false;
		if (fmText == null) {
			if (other.fmText != null)
				return false;
		} else if (!fmText.equals(other.fmText))
			return false;
		if (fmType == null) {
			if (other.fmType != null)
				return false;
		} else if (!fmType.equals(other.fmType))
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