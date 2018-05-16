package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class edReqMoveDocTran {

	private Integer rmdTranId;
	private Integer rmdFromOrg;
	private Integer rmdToOrg;
	private Integer rmdObjective;
	private String rmdDetail;
	private String rmdCurrentStatus;
	private String rmdStatusNote;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;
	private String rmdFillDestLoc;
	private Date rmdMoveSuccessDate;

	@JsonIgnore

	public edReqMoveDocTran() {
		super();
	}

	public edReqMoveDocTran(Integer rmdTranId, Integer rmdFromOrg, Integer rmdToOrg, Integer rmdObjective, String rmdDetail, String rmdCurrentStatus, String rmdStatusNote, String createUser, Date createDatetime, String updateUser, Date updateDatetime, String rmdFillDestLoc, Date rmdMoveSuccessDate) {
		super();
		this.rmdTranId = rmdTranId;
		this.rmdFromOrg = rmdFromOrg;
		this.rmdToOrg = rmdToOrg;
		this.rmdObjective = rmdObjective;
		this.rmdDetail = rmdDetail;
		this.rmdCurrentStatus = rmdCurrentStatus;
		this.rmdStatusNote = rmdStatusNote;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.rmdFillDestLoc = rmdFillDestLoc;
		this.rmdMoveSuccessDate = rmdMoveSuccessDate;
	}

	public Integer getRmdTranId() {
		return rmdTranId;
	}

	public Integer getRmdFromOrg() {
		return rmdFromOrg;
	}

	public Integer getRmdToOrg() {
		return rmdToOrg;
	}

	public Integer getRmdObjective() {
		return rmdObjective;
	}

	public String getRmdDetail() {
		return rmdDetail;
	}

	public String getRmdCurrentStatus() {
		return rmdCurrentStatus;
	}

	public String getRmdStatusNote() {
		return rmdStatusNote;
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

	public String getRmdFillDestLoc() {
		return rmdFillDestLoc;
	}

	public Date getRmdMoveSuccessDate() {
		return rmdMoveSuccessDate;
	}

	public void setRmdTranId(Integer rmdTranId) {
		this.rmdTranId = rmdTranId;
	}

	public void setRmdFromOrg(Integer rmdFromOrg) {
		this.rmdFromOrg = rmdFromOrg;
	}

	public void setRmdToOrg(Integer rmdToOrg) {
		this.rmdToOrg = rmdToOrg;
	}

	public void setRmdObjective(Integer rmdObjective) {
		this.rmdObjective = rmdObjective;
	}

	public void setRmdDetail(String rmdDetail) {
		this.rmdDetail = rmdDetail;
	}

	public void setRmdCurrentStatus(String rmdCurrentStatus) {
		this.rmdCurrentStatus = rmdCurrentStatus;
	}

	public void setRmdStatusNote(String rmdStatusNote) {
		this.rmdStatusNote = rmdStatusNote;
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

	public void setRmdFillDestLoc(String rmdFillDestLoc) {
		this.rmdFillDestLoc = rmdFillDestLoc;
	}

	public void setRmdMoveSuccessDate(Date rmdMoveSuccessDate) {
		this.rmdMoveSuccessDate = rmdMoveSuccessDate;
	}


	@Override
	public String toString() {
		return "edReqMoveDocTran [rmdTranId = " + rmdTranId + ", rmdFromOrg = " + rmdFromOrg + ", rmdToOrg = " + rmdToOrg + ", rmdObjective = " + rmdObjective + ", rmdDetail = " + rmdDetail + ", rmdCurrentStatus = " + rmdCurrentStatus + ", rmdStatusNote = " + rmdStatusNote + ", createUser = " + createUser + ", createDatetime = " + createDatetime + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", rmdFillDestLoc = " + rmdFillDestLoc + ", rmdMoveSuccessDate = " + rmdMoveSuccessDate + "]";
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
		result = prime * result + ((rmdCurrentStatus == null) ? 0 : rmdCurrentStatus.hashCode());
		result = prime * result + ((rmdDetail == null) ? 0 : rmdDetail.hashCode());
		result = prime * result + ((rmdFillDestLoc == null) ? 0 : rmdFillDestLoc.hashCode());
		result = prime * result + ((rmdFromOrg == null) ? 0 : rmdFromOrg.hashCode());
		result = prime * result + ((rmdMoveSuccessDate == null) ? 0 : rmdMoveSuccessDate.hashCode());
		result = prime * result + ((rmdObjective == null) ? 0 : rmdObjective.hashCode());
		result = prime * result + ((rmdStatusNote == null) ? 0 : rmdStatusNote.hashCode());
		result = prime * result + ((rmdToOrg == null) ? 0 : rmdToOrg.hashCode());
		result = prime * result + ((rmdTranId == null) ? 0 : rmdTranId.hashCode());
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
		edReqMoveDocTran other = (edReqMoveDocTran) obj;
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
		if (rmdCurrentStatus == null) {
			if (other.rmdCurrentStatus != null)
				return false;
		} else if (!rmdCurrentStatus.equals(other.rmdCurrentStatus))
			return false;
		if (rmdDetail == null) {
			if (other.rmdDetail != null)
				return false;
		} else if (!rmdDetail.equals(other.rmdDetail))
			return false;
		if (rmdFillDestLoc == null) {
			if (other.rmdFillDestLoc != null)
				return false;
		} else if (!rmdFillDestLoc.equals(other.rmdFillDestLoc))
			return false;
		if (rmdFromOrg == null) {
			if (other.rmdFromOrg != null)
				return false;
		} else if (!rmdFromOrg.equals(other.rmdFromOrg))
			return false;
		if (rmdMoveSuccessDate == null) {
			if (other.rmdMoveSuccessDate != null)
				return false;
		} else if (!rmdMoveSuccessDate.equals(other.rmdMoveSuccessDate))
			return false;
		if (rmdObjective == null) {
			if (other.rmdObjective != null)
				return false;
		} else if (!rmdObjective.equals(other.rmdObjective))
			return false;
		if (rmdStatusNote == null) {
			if (other.rmdStatusNote != null)
				return false;
		} else if (!rmdStatusNote.equals(other.rmdStatusNote))
			return false;
		if (rmdToOrg == null) {
			if (other.rmdToOrg != null)
				return false;
		} else if (!rmdToOrg.equals(other.rmdToOrg))
			return false;
		if (rmdTranId == null) {
			if (other.rmdTranId != null)
				return false;
		} else if (!rmdTranId.equals(other.rmdTranId))
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