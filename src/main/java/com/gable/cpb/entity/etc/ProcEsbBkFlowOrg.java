package com.gable.cpb.entity.etc;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcEsbBkFlowOrg {

	private Long procId;
	private Date addDatetime;
	private String mainGroupName;
	private String detailGroupName;
	private Long procState;
	private Integer procPriority;
	private Long retryCount;
	private Long bkId;
	private String procNote;
	private String updateUser;
	private Date updateDatetime;
	private Date lastRun;

	@JsonIgnore

	public ProcEsbBkFlowOrg() {
		super();
	}

	public ProcEsbBkFlowOrg(Long procId, Date addDatetime, String mainGroupName, String detailGroupName, Long procState, Integer procPriority, Long retryCount, Long bkId, String procNote, String updateUser, Date updateDatetime, Date lastRun) {
		super();
		this.procId = procId;
		this.addDatetime = addDatetime;
		this.mainGroupName = mainGroupName;
		this.detailGroupName = detailGroupName;
		this.procState = procState;
		this.procPriority = procPriority;
		this.retryCount = retryCount;
		this.bkId = bkId;
		this.procNote = procNote;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.lastRun = lastRun;
	}

	public Long getProcId() {
		return procId;
	}

	public Date getAddDatetime() {
		return addDatetime;
	}

	public String getMainGroupName() {
		return mainGroupName;
	}

	public String getDetailGroupName() {
		return detailGroupName;
	}

	public Long getProcState() {
		return procState;
	}

	public Integer getProcPriority() {
		return procPriority;
	}

	public Long getRetryCount() {
		return retryCount;
	}

	public Long getBkId() {
		return bkId;
	}

	public String getProcNote() {
		return procNote;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public Date getLastRun() {
		return lastRun;
	}

	public void setProcId(Long procId) {
		this.procId = procId;
	}

	public void setAddDatetime(Date addDatetime) {
		this.addDatetime = addDatetime;
	}

	public void setMainGroupName(String mainGroupName) {
		this.mainGroupName = mainGroupName;
	}

	public void setDetailGroupName(String detailGroupName) {
		this.detailGroupName = detailGroupName;
	}

	public void setProcState(Long procState) {
		this.procState = procState;
	}

	public void setProcPriority(Integer procPriority) {
		this.procPriority = procPriority;
	}

	public void setRetryCount(Long retryCount) {
		this.retryCount = retryCount;
	}

	public void setBkId(Long bkId) {
		this.bkId = bkId;
	}

	public void setProcNote(String procNote) {
		this.procNote = procNote;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setLastRun(Date lastRun) {
		this.lastRun = lastRun;
	}


	@Override
	public String toString() {
		return "procEsbBkFlowOrg [procId = " + procId + ", addDatetime = " + addDatetime + ", mainGroupName = " + mainGroupName + ", detailGroupName = " + detailGroupName + ", procState = " + procState + ", procPriority = " + procPriority + ", retryCount = " + retryCount + ", bkId = " + bkId + ", procNote = " + procNote + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", lastRun = " + lastRun + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addDatetime == null) ? 0 : addDatetime.hashCode());
		result = prime * result + ((bkId == null) ? 0 : bkId.hashCode());
		result = prime * result + ((detailGroupName == null) ? 0 : detailGroupName.hashCode());
		result = prime * result + ((lastRun == null) ? 0 : lastRun.hashCode());
		result = prime * result + ((mainGroupName == null) ? 0 : mainGroupName.hashCode());
		result = prime * result + ((procId == null) ? 0 : procId.hashCode());
		result = prime * result + ((procNote == null) ? 0 : procNote.hashCode());
		result = prime * result + ((procPriority == null) ? 0 : procPriority.hashCode());
		result = prime * result + ((procState == null) ? 0 : procState.hashCode());
		result = prime * result + ((retryCount == null) ? 0 : retryCount.hashCode());
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
		ProcEsbBkFlowOrg other = (ProcEsbBkFlowOrg) obj;
		if (addDatetime == null) {
			if (other.addDatetime != null)
				return false;
		} else if (!addDatetime.equals(other.addDatetime))
			return false;
		if (bkId == null) {
			if (other.bkId != null)
				return false;
		} else if (!bkId.equals(other.bkId))
			return false;
		if (detailGroupName == null) {
			if (other.detailGroupName != null)
				return false;
		} else if (!detailGroupName.equals(other.detailGroupName))
			return false;
		if (lastRun == null) {
			if (other.lastRun != null)
				return false;
		} else if (!lastRun.equals(other.lastRun))
			return false;
		if (mainGroupName == null) {
			if (other.mainGroupName != null)
				return false;
		} else if (!mainGroupName.equals(other.mainGroupName))
			return false;
		if (procId == null) {
			if (other.procId != null)
				return false;
		} else if (!procId.equals(other.procId))
			return false;
		if (procNote == null) {
			if (other.procNote != null)
				return false;
		} else if (!procNote.equals(other.procNote))
			return false;
		if (procPriority == null) {
			if (other.procPriority != null)
				return false;
		} else if (!procPriority.equals(other.procPriority))
			return false;
		if (procState == null) {
			if (other.procState != null)
				return false;
		} else if (!procState.equals(other.procState))
			return false;
		if (retryCount == null) {
			if (other.retryCount != null)
				return false;
		} else if (!retryCount.equals(other.retryCount))
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