package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class infCpbOrg {

	private Long id;
	private String source;
	private Date infInDatetime;
	private Date infOutDatetime;
	private Integer infOutStatus;
	private String infOutMsg;
	private String orgCode;
	private String orgName;
	private String orgSname;
	private String orgCodeRef;
	private Integer orgType;
	private Integer status;

	@JsonIgnore

	public infCpbOrg() {
		super();
	}

	public infCpbOrg(Long id, String source, Date infInDatetime, Date infOutDatetime, Integer infOutStatus, String infOutMsg, String orgCode, String orgName, String orgSname, String orgCodeRef, Integer orgType, Integer status) {
		super();
		this.id = id;
		this.source = source;
		this.infInDatetime = infInDatetime;
		this.infOutDatetime = infOutDatetime;
		this.infOutStatus = infOutStatus;
		this.infOutMsg = infOutMsg;
		this.orgCode = orgCode;
		this.orgName = orgName;
		this.orgSname = orgSname;
		this.orgCodeRef = orgCodeRef;
		this.orgType = orgType;
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

	public String getOrgCode() {
		return orgCode;
	}

	public String getOrgName() {
		return orgName;
	}

	public String getOrgSname() {
		return orgSname;
	}

	public String getOrgCodeRef() {
		return orgCodeRef;
	}

	public Integer getOrgType() {
		return orgType;
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

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public void setOrgSname(String orgSname) {
		this.orgSname = orgSname;
	}

	public void setOrgCodeRef(String orgCodeRef) {
		this.orgCodeRef = orgCodeRef;
	}

	public void setOrgType(Integer orgType) {
		this.orgType = orgType;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "infCpbOrg [id = " + id + ", source = " + source + ", infInDatetime = " + infInDatetime + ", infOutDatetime = " + infOutDatetime + ", infOutStatus = " + infOutStatus + ", infOutMsg = " + infOutMsg + ", orgCode = " + orgCode + ", orgName = " + orgName + ", orgSname = " + orgSname + ", orgCodeRef = " + orgCodeRef + ", orgType = " + orgType + ", status = " + status + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((infInDatetime == null) ? 0 : infInDatetime.hashCode());
		result = prime * result + ((infOutDatetime == null) ? 0 : infOutDatetime.hashCode());
		result = prime * result + ((infOutMsg == null) ? 0 : infOutMsg.hashCode());
		result = prime * result + ((infOutStatus == null) ? 0 : infOutStatus.hashCode());
		result = prime * result + ((orgCode == null) ? 0 : orgCode.hashCode());
		result = prime * result + ((orgCodeRef == null) ? 0 : orgCodeRef.hashCode());
		result = prime * result + ((orgName == null) ? 0 : orgName.hashCode());
		result = prime * result + ((orgSname == null) ? 0 : orgSname.hashCode());
		result = prime * result + ((orgType == null) ? 0 : orgType.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		infCpbOrg other = (infCpbOrg) obj;
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
		if (orgCode == null) {
			if (other.orgCode != null)
				return false;
		} else if (!orgCode.equals(other.orgCode))
			return false;
		if (orgCodeRef == null) {
			if (other.orgCodeRef != null)
				return false;
		} else if (!orgCodeRef.equals(other.orgCodeRef))
			return false;
		if (orgName == null) {
			if (other.orgName != null)
				return false;
		} else if (!orgName.equals(other.orgName))
			return false;
		if (orgSname == null) {
			if (other.orgSname != null)
				return false;
		} else if (!orgSname.equals(other.orgSname))
			return false;
		if (orgType == null) {
			if (other.orgType != null)
				return false;
		} else if (!orgType.equals(other.orgType))
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
		return true;
	}

}