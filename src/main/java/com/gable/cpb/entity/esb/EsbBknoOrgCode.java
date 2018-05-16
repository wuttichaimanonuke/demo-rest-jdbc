package com.gable.cpb.entity.esb;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbBknoOrgCode {

	private Long orgId;
	private String createIn;
	private String recvIn;
	private String sendOut1;
	private String sendOut2;
	private String sendOut3;
	private String cycle;
	private String announce;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public EsbBknoOrgCode() {
		super();
	}

	public EsbBknoOrgCode(Long orgId, String createIn, String recvIn, String sendOut1, String sendOut2, String sendOut3, String cycle, String announce, String updateUser, Date updateDatetime) {
		super();
		this.orgId = orgId;
		this.createIn = createIn;
		this.recvIn = recvIn;
		this.sendOut1 = sendOut1;
		this.sendOut2 = sendOut2;
		this.sendOut3 = sendOut3;
		this.cycle = cycle;
		this.announce = announce;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public Long getOrgId() {
		return orgId;
	}

	public String getCreateIn() {
		return createIn;
	}

	public String getRecvIn() {
		return recvIn;
	}

	public String getSendOut1() {
		return sendOut1;
	}

	public String getSendOut2() {
		return sendOut2;
	}

	public String getSendOut3() {
		return sendOut3;
	}

	public String getCycle() {
		return cycle;
	}

	public String getAnnounce() {
		return announce;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public void setCreateIn(String createIn) {
		this.createIn = createIn;
	}

	public void setRecvIn(String recvIn) {
		this.recvIn = recvIn;
	}

	public void setSendOut1(String sendOut1) {
		this.sendOut1 = sendOut1;
	}

	public void setSendOut2(String sendOut2) {
		this.sendOut2 = sendOut2;
	}

	public void setSendOut3(String sendOut3) {
		this.sendOut3 = sendOut3;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public void setAnnounce(String announce) {
		this.announce = announce;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}


	@Override
	public String toString() {
		return "esbBknoOrgCode [orgId = " + orgId + ", createIn = " + createIn + ", recvIn = " + recvIn + ", sendOut1 = " + sendOut1 + ", sendOut2 = " + sendOut2 + ", sendOut3 = " + sendOut3 + ", cycle = " + cycle + ", announce = " + announce + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((announce == null) ? 0 : announce.hashCode());
		result = prime * result + ((createIn == null) ? 0 : createIn.hashCode());
		result = prime * result + ((cycle == null) ? 0 : cycle.hashCode());
		result = prime * result + ((orgId == null) ? 0 : orgId.hashCode());
		result = prime * result + ((recvIn == null) ? 0 : recvIn.hashCode());
		result = prime * result + ((sendOut1 == null) ? 0 : sendOut1.hashCode());
		result = prime * result + ((sendOut2 == null) ? 0 : sendOut2.hashCode());
		result = prime * result + ((sendOut3 == null) ? 0 : sendOut3.hashCode());
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
		EsbBknoOrgCode other = (EsbBknoOrgCode) obj;
		if (announce == null) {
			if (other.announce != null)
				return false;
		} else if (!announce.equals(other.announce))
			return false;
		if (createIn == null) {
			if (other.createIn != null)
				return false;
		} else if (!createIn.equals(other.createIn))
			return false;
		if (cycle == null) {
			if (other.cycle != null)
				return false;
		} else if (!cycle.equals(other.cycle))
			return false;
		if (orgId == null) {
			if (other.orgId != null)
				return false;
		} else if (!orgId.equals(other.orgId))
			return false;
		if (recvIn == null) {
			if (other.recvIn != null)
				return false;
		} else if (!recvIn.equals(other.recvIn))
			return false;
		if (sendOut1 == null) {
			if (other.sendOut1 != null)
				return false;
		} else if (!sendOut1.equals(other.sendOut1))
			return false;
		if (sendOut2 == null) {
			if (other.sendOut2 != null)
				return false;
		} else if (!sendOut2.equals(other.sendOut2))
			return false;
		if (sendOut3 == null) {
			if (other.sendOut3 != null)
				return false;
		} else if (!sendOut3.equals(other.sendOut3))
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