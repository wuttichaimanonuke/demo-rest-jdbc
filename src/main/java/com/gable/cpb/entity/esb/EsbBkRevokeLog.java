package com.gable.cpb.entity.esb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbBkRevokeLog {

	private Long logId;
	private Long bkId;
	private Long docId;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public EsbBkRevokeLog() {
		super();
	}

	public EsbBkRevokeLog(Long logId, Long bkId, Long docId, String updateUser, Date updateDatetime) {
		super();
		this.logId = logId;
		this.bkId = bkId;
		this.docId = docId;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getLogId() {
		return logId;
	}

	public Long getBkId() {
		return bkId;
	}

	public Long getDocId() {
		return docId;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public void setBkId(Long bkId) {
		this.bkId = bkId;
	}

	public void setDocId(Long docId) {
		this.docId = docId;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "esbBkRevokeLog [logId = " + logId + ", bkId = " + bkId + ", docId = " + docId + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bkId == null) ? 0 : bkId.hashCode());
		result = prime * result + ((docId == null) ? 0 : docId.hashCode());
		result = prime * result + ((logId == null) ? 0 : logId.hashCode());
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
		EsbBkRevokeLog other = (EsbBkRevokeLog) obj;
		if (bkId == null) {
			if (other.bkId != null)
				return false;
		} else if (!bkId.equals(other.bkId))
			return false;
		if (docId == null) {
			if (other.docId != null)
				return false;
		} else if (!docId.equals(other.docId))
			return false;
		if (logId == null) {
			if (other.logId != null)
				return false;
		} else if (!logId.equals(other.logId))
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