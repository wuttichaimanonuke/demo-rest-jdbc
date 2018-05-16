package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class edReqMoveDocTranItem {

	private Integer rmdTranItemId;
	private Integer rmdTranId;
	private Integer aWhId;
	private Integer aCabId;
	private Integer aShId;
	private Integer aEnvId;
	private Integer bWhId;
	private Integer bCabId;
	private Integer bShId;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;
	private Integer docCheckedOutCount;
	private Integer docMoveCount;

	@JsonIgnore

	public edReqMoveDocTranItem() {
		super();
	}

	public edReqMoveDocTranItem(Integer rmdTranItemId, Integer rmdTranId, Integer aWhId, Integer aCabId, Integer aShId, Integer aEnvId, Integer bWhId, Integer bCabId, Integer bShId, String createUser, Date createDatetime, String updateUser, Date updateDatetime, Integer docCheckedOutCount, Integer docMoveCount) {
		super();
		this.rmdTranItemId = rmdTranItemId;
		this.rmdTranId = rmdTranId;
		this.aWhId = aWhId;
		this.aCabId = aCabId;
		this.aShId = aShId;
		this.aEnvId = aEnvId;
		this.bWhId = bWhId;
		this.bCabId = bCabId;
		this.bShId = bShId;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.docCheckedOutCount = docCheckedOutCount;
		this.docMoveCount = docMoveCount;
	}

	public Integer getRmdTranItemId() {
		return rmdTranItemId;
	}

	public Integer getRmdTranId() {
		return rmdTranId;
	}

	public Integer getAWhId() {
		return aWhId;
	}

	public Integer getACabId() {
		return aCabId;
	}

	public Integer getAShId() {
		return aShId;
	}

	public Integer getAEnvId() {
		return aEnvId;
	}

	public Integer getBWhId() {
		return bWhId;
	}

	public Integer getBCabId() {
		return bCabId;
	}

	public Integer getBShId() {
		return bShId;
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

	public Integer getDocCheckedOutCount() {
		return docCheckedOutCount;
	}

	public Integer getDocMoveCount() {
		return docMoveCount;
	}

	public void setRmdTranItemId(Integer rmdTranItemId) {
		this.rmdTranItemId = rmdTranItemId;
	}

	public void setRmdTranId(Integer rmdTranId) {
		this.rmdTranId = rmdTranId;
	}

	public void setAWhId(Integer aWhId) {
		this.aWhId = aWhId;
	}

	public void setACabId(Integer aCabId) {
		this.aCabId = aCabId;
	}

	public void setAShId(Integer aShId) {
		this.aShId = aShId;
	}

	public void setAEnvId(Integer aEnvId) {
		this.aEnvId = aEnvId;
	}

	public void setBWhId(Integer bWhId) {
		this.bWhId = bWhId;
	}

	public void setBCabId(Integer bCabId) {
		this.bCabId = bCabId;
	}

	public void setBShId(Integer bShId) {
		this.bShId = bShId;
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

	public void setDocCheckedOutCount(Integer docCheckedOutCount) {
		this.docCheckedOutCount = docCheckedOutCount;
	}

	public void setDocMoveCount(Integer docMoveCount) {
		this.docMoveCount = docMoveCount;
	}


	@Override
	public String toString() {
		return "edReqMoveDocTranItem [rmdTranItemId = " + rmdTranItemId + ", rmdTranId = " + rmdTranId + ", aWhId = " + aWhId + ", aCabId = " + aCabId + ", aShId = " + aShId + ", aEnvId = " + aEnvId + ", bWhId = " + bWhId + ", bCabId = " + bCabId + ", bShId = " + bShId + ", createUser = " + createUser + ", createDatetime = " + createDatetime + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", docCheckedOutCount = " + docCheckedOutCount + ", docMoveCount = " + docMoveCount + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aCabId == null) ? 0 : aCabId.hashCode());
		result = prime * result + ((aEnvId == null) ? 0 : aEnvId.hashCode());
		result = prime * result + ((aShId == null) ? 0 : aShId.hashCode());
		result = prime * result + ((aWhId == null) ? 0 : aWhId.hashCode());
		result = prime * result + ((bCabId == null) ? 0 : bCabId.hashCode());
		result = prime * result + ((bShId == null) ? 0 : bShId.hashCode());
		result = prime * result + ((bWhId == null) ? 0 : bWhId.hashCode());
		result = prime * result + ((createDatetime == null) ? 0 : createDatetime.hashCode());
		result = prime * result + ((createUser == null) ? 0 : createUser.hashCode());
		result = prime * result + ((docCheckedOutCount == null) ? 0 : docCheckedOutCount.hashCode());
		result = prime * result + ((docMoveCount == null) ? 0 : docMoveCount.hashCode());
		result = prime * result + ((rmdTranId == null) ? 0 : rmdTranId.hashCode());
		result = prime * result + ((rmdTranItemId == null) ? 0 : rmdTranItemId.hashCode());
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
		edReqMoveDocTranItem other = (edReqMoveDocTranItem) obj;
		if (aCabId == null) {
			if (other.aCabId != null)
				return false;
		} else if (!aCabId.equals(other.aCabId))
			return false;
		if (aEnvId == null) {
			if (other.aEnvId != null)
				return false;
		} else if (!aEnvId.equals(other.aEnvId))
			return false;
		if (aShId == null) {
			if (other.aShId != null)
				return false;
		} else if (!aShId.equals(other.aShId))
			return false;
		if (aWhId == null) {
			if (other.aWhId != null)
				return false;
		} else if (!aWhId.equals(other.aWhId))
			return false;
		if (bCabId == null) {
			if (other.bCabId != null)
				return false;
		} else if (!bCabId.equals(other.bCabId))
			return false;
		if (bShId == null) {
			if (other.bShId != null)
				return false;
		} else if (!bShId.equals(other.bShId))
			return false;
		if (bWhId == null) {
			if (other.bWhId != null)
				return false;
		} else if (!bWhId.equals(other.bWhId))
			return false;
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
		if (docCheckedOutCount == null) {
			if (other.docCheckedOutCount != null)
				return false;
		} else if (!docCheckedOutCount.equals(other.docCheckedOutCount))
			return false;
		if (docMoveCount == null) {
			if (other.docMoveCount != null)
				return false;
		} else if (!docMoveCount.equals(other.docMoveCount))
			return false;
		if (rmdTranId == null) {
			if (other.rmdTranId != null)
				return false;
		} else if (!rmdTranId.equals(other.rmdTranId))
			return false;
		if (rmdTranItemId == null) {
			if (other.rmdTranItemId != null)
				return false;
		} else if (!rmdTranItemId.equals(other.rmdTranItemId))
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