package com.gable.cpb.entity;

import java.util.Date;
import java.util.Date;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbDocOperation {

	private String docId;
	private Date createDatetime;
	private Integer rePermisStatus;
	private Date rePermisDatetime;
	private Integer reIndexStatus;
	private Date reIndexDatetime;

	@JsonIgnore

	public CpbDocOperation() {
		super();
	}

	public CpbDocOperation(String docId, Date createDatetime, Integer rePermisStatus, Date rePermisDatetime, Integer reIndexStatus, Date reIndexDatetime) {
		super();
		this.docId = docId;
		this.createDatetime = createDatetime;
		this.rePermisStatus = rePermisStatus;
		this.rePermisDatetime = rePermisDatetime;
		this.reIndexStatus = reIndexStatus;
		this.reIndexDatetime = reIndexDatetime;
	}

	public String getDocId() {
		return docId;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public Integer getRePermisStatus() {
		return rePermisStatus;
	}

	public Date getRePermisDatetime() {
		return rePermisDatetime;
	}

	public Integer getReIndexStatus() {
		return reIndexStatus;
	}

	public Date getReIndexDatetime() {
		return reIndexDatetime;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public void setRePermisStatus(Integer rePermisStatus) {
		this.rePermisStatus = rePermisStatus;
	}

	public void setRePermisDatetime(Date rePermisDatetime) {
		this.rePermisDatetime = rePermisDatetime;
	}

	public void setReIndexStatus(Integer reIndexStatus) {
		this.reIndexStatus = reIndexStatus;
	}

	public void setReIndexDatetime(Date reIndexDatetime) {
		this.reIndexDatetime = reIndexDatetime;
	}


	@Override
	public String toString() {
		return "CpbDocOperation [docId = " + docId + ", createDatetime = " + createDatetime + ", rePermisStatus = " + rePermisStatus + ", rePermisDatetime = " + rePermisDatetime + ", reIndexStatus = " + reIndexStatus + ", reIndexDatetime = " + reIndexDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createDatetime == null) ? 0 : createDatetime.hashCode());
		result = prime * result + ((docId == null) ? 0 : docId.hashCode());
		result = prime * result + ((reIndexDatetime == null) ? 0 : reIndexDatetime.hashCode());
		result = prime * result + ((reIndexStatus == null) ? 0 : reIndexStatus.hashCode());
		result = prime * result + ((rePermisDatetime == null) ? 0 : rePermisDatetime.hashCode());
		result = prime * result + ((rePermisStatus == null) ? 0 : rePermisStatus.hashCode());
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
		CpbDocOperation other = (CpbDocOperation) obj;
		if (createDatetime == null) {
			if (other.createDatetime != null)
				return false;
		} else if (!createDatetime.equals(other.createDatetime))
			return false;
		if (docId == null) {
			if (other.docId != null)
				return false;
		} else if (!docId.equals(other.docId))
			return false;
		if (reIndexDatetime == null) {
			if (other.reIndexDatetime != null)
				return false;
		} else if (!reIndexDatetime.equals(other.reIndexDatetime))
			return false;
		if (reIndexStatus == null) {
			if (other.reIndexStatus != null)
				return false;
		} else if (!reIndexStatus.equals(other.reIndexStatus))
			return false;
		if (rePermisDatetime == null) {
			if (other.rePermisDatetime != null)
				return false;
		} else if (!rePermisDatetime.equals(other.rePermisDatetime))
			return false;
		if (rePermisStatus == null) {
			if (other.rePermisStatus != null)
				return false;
		} else if (!rePermisStatus.equals(other.rePermisStatus))
			return false;
		return true;
	}

}