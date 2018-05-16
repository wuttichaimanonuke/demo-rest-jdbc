package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class edDocCond {

	private Long dcId;
	private String dcDocId;
	private Integer dcType;
	private String dcDesc;
	private Integer dcPage;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;
	private String dcReqNo;
	private Integer dcFormat;

	@JsonIgnore

	public edDocCond() {
		super();
	}

	public edDocCond(Long dcId, String dcDocId, Integer dcType, String dcDesc, Integer dcPage, String createUser, Date createDatetime, String updateUser, Date updateDatetime, String dcReqNo, Integer dcFormat) {
		super();
		this.dcId = dcId;
		this.dcDocId = dcDocId;
		this.dcType = dcType;
		this.dcDesc = dcDesc;
		this.dcPage = dcPage;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
		this.dcReqNo = dcReqNo;
		this.dcFormat = dcFormat;
	}

	public Long getDcId() {
		return dcId;
	}

	public String getDcDocId() {
		return dcDocId;
	}

	public Integer getDcType() {
		return dcType;
	}

	public String getDcDesc() {
		return dcDesc;
	}

	public Integer getDcPage() {
		return dcPage;
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

	public String getDcReqNo() {
		return dcReqNo;
	}

	public Integer getDcFormat() {
		return dcFormat;
	}

	public void setDcId(Long dcId) {
		this.dcId = dcId;
	}

	public void setDcDocId(String dcDocId) {
		this.dcDocId = dcDocId;
	}

	public void setDcType(Integer dcType) {
		this.dcType = dcType;
	}

	public void setDcDesc(String dcDesc) {
		this.dcDesc = dcDesc;
	}

	public void setDcPage(Integer dcPage) {
		this.dcPage = dcPage;
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

	public void setDcReqNo(String dcReqNo) {
		this.dcReqNo = dcReqNo;
	}

	public void setDcFormat(Integer dcFormat) {
		this.dcFormat = dcFormat;
	}


	@Override
	public String toString() {
		return "edDocCond [dcId = " + dcId + ", dcDocId = " + dcDocId + ", dcType = " + dcType + ", dcDesc = " + dcDesc + ", dcPage = " + dcPage + ", createUser = " + createUser + ", createDatetime = " + createDatetime + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + ", dcReqNo = " + dcReqNo + ", dcFormat = " + dcFormat + "]";
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
		result = prime * result + ((dcDesc == null) ? 0 : dcDesc.hashCode());
		result = prime * result + ((dcDocId == null) ? 0 : dcDocId.hashCode());
		result = prime * result + ((dcFormat == null) ? 0 : dcFormat.hashCode());
		result = prime * result + ((dcId == null) ? 0 : dcId.hashCode());
		result = prime * result + ((dcPage == null) ? 0 : dcPage.hashCode());
		result = prime * result + ((dcReqNo == null) ? 0 : dcReqNo.hashCode());
		result = prime * result + ((dcType == null) ? 0 : dcType.hashCode());
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
		edDocCond other = (edDocCond) obj;
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
		if (dcDesc == null) {
			if (other.dcDesc != null)
				return false;
		} else if (!dcDesc.equals(other.dcDesc))
			return false;
		if (dcDocId == null) {
			if (other.dcDocId != null)
				return false;
		} else if (!dcDocId.equals(other.dcDocId))
			return false;
		if (dcFormat == null) {
			if (other.dcFormat != null)
				return false;
		} else if (!dcFormat.equals(other.dcFormat))
			return false;
		if (dcId == null) {
			if (other.dcId != null)
				return false;
		} else if (!dcId.equals(other.dcId))
			return false;
		if (dcPage == null) {
			if (other.dcPage != null)
				return false;
		} else if (!dcPage.equals(other.dcPage))
			return false;
		if (dcReqNo == null) {
			if (other.dcReqNo != null)
				return false;
		} else if (!dcReqNo.equals(other.dcReqNo))
			return false;
		if (dcType == null) {
			if (other.dcType != null)
				return false;
		} else if (!dcType.equals(other.dcType))
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