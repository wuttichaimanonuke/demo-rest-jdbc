package com.gable.cpb.entity.etc;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InfCpbUser {

	private Long id;
	private String source;
	private Date infInDatetime;
	private Date infOutDatetime;
	private Integer infOutStatus;
	private String infOutMsg;
	private String userLogin;
	private String title;
	private String fullName;
	private String eMail;
	private Integer status;

	@JsonIgnore

	public InfCpbUser() {
		super();
	}

	public InfCpbUser(Long id, String source, Date infInDatetime, Date infOutDatetime, Integer infOutStatus, String infOutMsg, String userLogin, String title, String fullName, String eMail, Integer status) {
		super();
		this.id = id;
		this.source = source;
		this.infInDatetime = infInDatetime;
		this.infOutDatetime = infOutDatetime;
		this.infOutStatus = infOutStatus;
		this.infOutMsg = infOutMsg;
		this.userLogin = userLogin;
		this.title = title;
		this.fullName = fullName;
		this.eMail = eMail;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public String getSource() {
		return source;
	}

	public Date getInfInDatetime() {
		return infInDatetime;
	}

	public Date getInfOutDatetime() {
		return infOutDatetime;
	}

	public Integer getInfOutStatus() {
		return infOutStatus;
	}

	public String getInfOutMsg() {
		return infOutMsg;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public String getTitle() {
		return title;
	}

	public String getFullName() {
		return fullName;
	}

	public String getEMail() {
		return eMail;
	}

	public Integer getStatus() {
		return status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setInfInDatetime(Date infInDatetime) {
		this.infInDatetime = infInDatetime;
	}

	public void setInfOutDatetime(Date infOutDatetime) {
		this.infOutDatetime = infOutDatetime;
	}

	public void setInfOutStatus(Integer infOutStatus) {
		this.infOutStatus = infOutStatus;
	}

	public void setInfOutMsg(String infOutMsg) {
		this.infOutMsg = infOutMsg;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "infCpbUser [id = " + id + ", source = " + source + ", infInDatetime = " + infInDatetime + ", infOutDatetime = " + infOutDatetime + ", infOutStatus = " + infOutStatus + ", infOutMsg = " + infOutMsg + ", userLogin = " + userLogin + ", title = " + title + ", fullName = " + fullName + ", eMail = " + eMail + ", status = " + status + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((infInDatetime == null) ? 0 : infInDatetime.hashCode());
		result = prime * result + ((infOutDatetime == null) ? 0 : infOutDatetime.hashCode());
		result = prime * result + ((infOutMsg == null) ? 0 : infOutMsg.hashCode());
		result = prime * result + ((infOutStatus == null) ? 0 : infOutStatus.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((userLogin == null) ? 0 : userLogin.hashCode());
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
		InfCpbUser other = (InfCpbUser) obj;
		if (eMail == null) {
			if (other.eMail != null)
				return false;
		} else if (!eMail.equals(other.eMail))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (infInDatetime == null) {
			if (other.infInDatetime != null)
				return false;
		} else if (!infInDatetime.equals(other.infInDatetime))
			return false;
		if (infOutDatetime == null) {
			if (other.infOutDatetime != null)
				return false;
		} else if (!infOutDatetime.equals(other.infOutDatetime))
			return false;
		if (infOutMsg == null) {
			if (other.infOutMsg != null)
				return false;
		} else if (!infOutMsg.equals(other.infOutMsg))
			return false;
		if (infOutStatus == null) {
			if (other.infOutStatus != null)
				return false;
		} else if (!infOutStatus.equals(other.infOutStatus))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (userLogin == null) {
			if (other.userLogin != null)
				return false;
		} else if (!userLogin.equals(other.userLogin))
			return false;
		return true;
	}

}