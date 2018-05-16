package com.gable.cpb.entity.ed;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EdReqModify {

	private String rmReqNo;
	private String rmDocId;
	private Integer rmModAppStatus;
	private Date rmModAppStatusDatetime;
	private Integer rmTypePaper;
	private Integer rmTypeEditEdoc;
	private Integer rmTypeAttr;
	private Integer rmTypePerm;
	private Integer rmTypeRel;
	private Date rmModConfirmDate;
	private String rmModConfirmUser;
	private Date createDatetime;
	private String createUser;
	private Date updateDatetime;
	private String updateUser;
	private String rmPickUpUserLongname;
	private String rmPickUpUser;
	private Date rmPickUpDatetime;
	private String rmRetUser;
	private String rmRetUserLongname;
	private Date rmRetDatetime;
	private String rmRecUser;
	private String rmPermission;

	@JsonIgnore

	public EdReqModify() {
		super();
	}

	public EdReqModify(String rmReqNo, String rmDocId, Integer rmModAppStatus, Date rmModAppStatusDatetime, Integer rmTypePaper, Integer rmTypeEditEdoc, Integer rmTypeAttr, Integer rmTypePerm, Integer rmTypeRel, Date rmModConfirmDate, String rmModConfirmUser, Date createDatetime, String createUser, Date updateDatetime, String updateUser, String rmPickUpUserLongname, String rmPickUpUser, Date rmPickUpDatetime, String rmRetUser, String rmRetUserLongname, Date rmRetDatetime, String rmRecUser, String rmPermission) {
		super();
		this.rmReqNo = rmReqNo;
		this.rmDocId = rmDocId;
		this.rmModAppStatus = rmModAppStatus;
		this.rmModAppStatusDatetime = rmModAppStatusDatetime;
		this.rmTypePaper = rmTypePaper;
		this.rmTypeEditEdoc = rmTypeEditEdoc;
		this.rmTypeAttr = rmTypeAttr;
		this.rmTypePerm = rmTypePerm;
		this.rmTypeRel = rmTypeRel;
		this.rmModConfirmDate = rmModConfirmDate;
		this.rmModConfirmUser = rmModConfirmUser;
		this.createDatetime = createDatetime;
		this.createUser = createUser;
		this.updateDatetime = updateDatetime;
		this.updateUser = updateUser;
		this.rmPickUpUserLongname = rmPickUpUserLongname;
		this.rmPickUpUser = rmPickUpUser;
		this.rmPickUpDatetime = rmPickUpDatetime;
		this.rmRetUser = rmRetUser;
		this.rmRetUserLongname = rmRetUserLongname;
		this.rmRetDatetime = rmRetDatetime;
		this.rmRecUser = rmRecUser;
		this.rmPermission = rmPermission;
	}

	public String getRmReqNo() {
		return rmReqNo;
	}

	public String getRmDocId() {
		return rmDocId;
	}

	public Integer getRmModAppStatus() {
		return rmModAppStatus;
	}

	public Date getRmModAppStatusDatetime() {
		return rmModAppStatusDatetime;
	}

	public Integer getRmTypePaper() {
		return rmTypePaper;
	}

	public Integer getRmTypeEditEdoc() {
		return rmTypeEditEdoc;
	}

	public Integer getRmTypeAttr() {
		return rmTypeAttr;
	}

	public Integer getRmTypePerm() {
		return rmTypePerm;
	}

	public Integer getRmTypeRel() {
		return rmTypeRel;
	}

	public Date getRmModConfirmDate() {
		return rmModConfirmDate;
	}

	public String getRmModConfirmUser() {
		return rmModConfirmUser;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public String getRmPickUpUserLongname() {
		return rmPickUpUserLongname;
	}

	public String getRmPickUpUser() {
		return rmPickUpUser;
	}

	public Date getRmPickUpDatetime() {
		return rmPickUpDatetime;
	}

	public String getRmRetUser() {
		return rmRetUser;
	}

	public String getRmRetUserLongname() {
		return rmRetUserLongname;
	}

	public Date getRmRetDatetime() {
		return rmRetDatetime;
	}

	public String getRmRecUser() {
		return rmRecUser;
	}

	public String getRmPermission() {
		return rmPermission;
	}

	public void setRmReqNo(String rmReqNo) {
		this.rmReqNo = rmReqNo;
	}

	public void setRmDocId(String rmDocId) {
		this.rmDocId = rmDocId;
	}

	public void setRmModAppStatus(Integer rmModAppStatus) {
		this.rmModAppStatus = rmModAppStatus;
	}

	public void setRmModAppStatusDatetime(Date rmModAppStatusDatetime) {
		this.rmModAppStatusDatetime = rmModAppStatusDatetime;
	}

	public void setRmTypePaper(Integer rmTypePaper) {
		this.rmTypePaper = rmTypePaper;
	}

	public void setRmTypeEditEdoc(Integer rmTypeEditEdoc) {
		this.rmTypeEditEdoc = rmTypeEditEdoc;
	}

	public void setRmTypeAttr(Integer rmTypeAttr) {
		this.rmTypeAttr = rmTypeAttr;
	}

	public void setRmTypePerm(Integer rmTypePerm) {
		this.rmTypePerm = rmTypePerm;
	}

	public void setRmTypeRel(Integer rmTypeRel) {
		this.rmTypeRel = rmTypeRel;
	}

	public void setRmModConfirmDate(Date rmModConfirmDate) {
		this.rmModConfirmDate = rmModConfirmDate;
	}

	public void setRmModConfirmUser(String rmModConfirmUser) {
		this.rmModConfirmUser = rmModConfirmUser;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setRmPickUpUserLongname(String rmPickUpUserLongname) {
		this.rmPickUpUserLongname = rmPickUpUserLongname;
	}

	public void setRmPickUpUser(String rmPickUpUser) {
		this.rmPickUpUser = rmPickUpUser;
	}

	public void setRmPickUpDatetime(Date rmPickUpDatetime) {
		this.rmPickUpDatetime = rmPickUpDatetime;
	}

	public void setRmRetUser(String rmRetUser) {
		this.rmRetUser = rmRetUser;
	}

	public void setRmRetUserLongname(String rmRetUserLongname) {
		this.rmRetUserLongname = rmRetUserLongname;
	}

	public void setRmRetDatetime(Date rmRetDatetime) {
		this.rmRetDatetime = rmRetDatetime;
	}

	public void setRmRecUser(String rmRecUser) {
		this.rmRecUser = rmRecUser;
	}

	public void setRmPermission(String rmPermission) {
		this.rmPermission = rmPermission;
	}


	@Override
	public String toString() {
		return "edReqModify [rmReqNo = " + rmReqNo + ", rmDocId = " + rmDocId + ", rmModAppStatus = " + rmModAppStatus + ", rmModAppStatusDatetime = " + rmModAppStatusDatetime + ", rmTypePaper = " + rmTypePaper + ", rmTypeEditEdoc = " + rmTypeEditEdoc + ", rmTypeAttr = " + rmTypeAttr + ", rmTypePerm = " + rmTypePerm + ", rmTypeRel = " + rmTypeRel + ", rmModConfirmDate = " + rmModConfirmDate + ", rmModConfirmUser = " + rmModConfirmUser + ", createDatetime = " + createDatetime + ", createUser = " + createUser + ", updateDatetime = " + updateDatetime + ", updateUser = " + updateUser + ", rmPickUpUserLongname = " + rmPickUpUserLongname + ", rmPickUpUser = " + rmPickUpUser + ", rmPickUpDatetime = " + rmPickUpDatetime + ", rmRetUser = " + rmRetUser + ", rmRetUserLongname = " + rmRetUserLongname + ", rmRetDatetime = " + rmRetDatetime + ", rmRecUser = " + rmRecUser + ", rmPermission = " + rmPermission + "]";
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
		result = prime * result + ((rmDocId == null) ? 0 : rmDocId.hashCode());
		result = prime * result + ((rmModAppStatus == null) ? 0 : rmModAppStatus.hashCode());
		result = prime * result + ((rmModAppStatusDatetime == null) ? 0 : rmModAppStatusDatetime.hashCode());
		result = prime * result + ((rmModConfirmDate == null) ? 0 : rmModConfirmDate.hashCode());
		result = prime * result + ((rmModConfirmUser == null) ? 0 : rmModConfirmUser.hashCode());
		result = prime * result + ((rmPermission == null) ? 0 : rmPermission.hashCode());
		result = prime * result + ((rmPickUpDatetime == null) ? 0 : rmPickUpDatetime.hashCode());
		result = prime * result + ((rmPickUpUser == null) ? 0 : rmPickUpUser.hashCode());
		result = prime * result + ((rmPickUpUserLongname == null) ? 0 : rmPickUpUserLongname.hashCode());
		result = prime * result + ((rmRecUser == null) ? 0 : rmRecUser.hashCode());
		result = prime * result + ((rmReqNo == null) ? 0 : rmReqNo.hashCode());
		result = prime * result + ((rmRetDatetime == null) ? 0 : rmRetDatetime.hashCode());
		result = prime * result + ((rmRetUser == null) ? 0 : rmRetUser.hashCode());
		result = prime * result + ((rmRetUserLongname == null) ? 0 : rmRetUserLongname.hashCode());
		result = prime * result + ((rmTypeAttr == null) ? 0 : rmTypeAttr.hashCode());
		result = prime * result + ((rmTypeEditEdoc == null) ? 0 : rmTypeEditEdoc.hashCode());
		result = prime * result + ((rmTypePaper == null) ? 0 : rmTypePaper.hashCode());
		result = prime * result + ((rmTypePerm == null) ? 0 : rmTypePerm.hashCode());
		result = prime * result + ((rmTypeRel == null) ? 0 : rmTypeRel.hashCode());
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
		EdReqModify other = (EdReqModify) obj;
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
		if (rmDocId == null) {
			if (other.rmDocId != null)
				return false;
		} else if (!rmDocId.equals(other.rmDocId))
			return false;
		if (rmModAppStatus == null) {
			if (other.rmModAppStatus != null)
				return false;
		} else if (!rmModAppStatus.equals(other.rmModAppStatus))
			return false;
		if (rmModAppStatusDatetime == null) {
			if (other.rmModAppStatusDatetime != null)
				return false;
		} else if (!rmModAppStatusDatetime.equals(other.rmModAppStatusDatetime))
			return false;
		if (rmModConfirmDate == null) {
			if (other.rmModConfirmDate != null)
				return false;
		} else if (!rmModConfirmDate.equals(other.rmModConfirmDate))
			return false;
		if (rmModConfirmUser == null) {
			if (other.rmModConfirmUser != null)
				return false;
		} else if (!rmModConfirmUser.equals(other.rmModConfirmUser))
			return false;
		if (rmPermission == null) {
			if (other.rmPermission != null)
				return false;
		} else if (!rmPermission.equals(other.rmPermission))
			return false;
		if (rmPickUpDatetime == null) {
			if (other.rmPickUpDatetime != null)
				return false;
		} else if (!rmPickUpDatetime.equals(other.rmPickUpDatetime))
			return false;
		if (rmPickUpUser == null) {
			if (other.rmPickUpUser != null)
				return false;
		} else if (!rmPickUpUser.equals(other.rmPickUpUser))
			return false;
		if (rmPickUpUserLongname == null) {
			if (other.rmPickUpUserLongname != null)
				return false;
		} else if (!rmPickUpUserLongname.equals(other.rmPickUpUserLongname))
			return false;
		if (rmRecUser == null) {
			if (other.rmRecUser != null)
				return false;
		} else if (!rmRecUser.equals(other.rmRecUser))
			return false;
		if (rmReqNo == null) {
			if (other.rmReqNo != null)
				return false;
		} else if (!rmReqNo.equals(other.rmReqNo))
			return false;
		if (rmRetDatetime == null) {
			if (other.rmRetDatetime != null)
				return false;
		} else if (!rmRetDatetime.equals(other.rmRetDatetime))
			return false;
		if (rmRetUser == null) {
			if (other.rmRetUser != null)
				return false;
		} else if (!rmRetUser.equals(other.rmRetUser))
			return false;
		if (rmRetUserLongname == null) {
			if (other.rmRetUserLongname != null)
				return false;
		} else if (!rmRetUserLongname.equals(other.rmRetUserLongname))
			return false;
		if (rmTypeAttr == null) {
			if (other.rmTypeAttr != null)
				return false;
		} else if (!rmTypeAttr.equals(other.rmTypeAttr))
			return false;
		if (rmTypeEditEdoc == null) {
			if (other.rmTypeEditEdoc != null)
				return false;
		} else if (!rmTypeEditEdoc.equals(other.rmTypeEditEdoc))
			return false;
		if (rmTypePaper == null) {
			if (other.rmTypePaper != null)
				return false;
		} else if (!rmTypePaper.equals(other.rmTypePaper))
			return false;
		if (rmTypePerm == null) {
			if (other.rmTypePerm != null)
				return false;
		} else if (!rmTypePerm.equals(other.rmTypePerm))
			return false;
		if (rmTypeRel == null) {
			if (other.rmTypeRel != null)
				return false;
		} else if (!rmTypeRel.equals(other.rmTypeRel))
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