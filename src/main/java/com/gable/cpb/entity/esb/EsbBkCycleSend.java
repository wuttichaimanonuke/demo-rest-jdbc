package com.gable.cpb.entity.esb;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbBkCycleSend {

	private Long cycdId;
	private Long cycId;
	private Long toOrgId;
	private Long toRoleId;

	@JsonIgnore

	public EsbBkCycleSend() {
		super();
	}

	public EsbBkCycleSend(Long cycdId, Long cycId, Long toOrgId, Long toRoleId) {
		super();
		this.cycdId = cycdId;
		this.cycId = cycId;
		this.toOrgId = toOrgId;
		this.toRoleId = toRoleId;
	}

	public Long getCycdId() {
		return cycdId;
	}

	public Long getCycId() {
		return cycId;
	}

	public Long getToOrgId() {
		return toOrgId;
	}

	public Long getToRoleId() {
		return toRoleId;
	}

	public void setCycdId(Long cycdId) {
		this.cycdId = cycdId;
	}

	public void setCycId(Long cycId) {
		this.cycId = cycId;
	}

	public void setToOrgId(Long toOrgId) {
		this.toOrgId = toOrgId;
	}

	public void setToRoleId(Long toRoleId) {
		this.toRoleId = toRoleId;
	}


	@Override
	public String toString() {
		return "esbBkCycleSend [cycdId = " + cycdId + ", cycId = " + cycId + ", toOrgId = " + toOrgId + ", toRoleId = " + toRoleId + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cycId == null) ? 0 : cycId.hashCode());
		result = prime * result + ((cycdId == null) ? 0 : cycdId.hashCode());
		result = prime * result + ((toOrgId == null) ? 0 : toOrgId.hashCode());
		result = prime * result + ((toRoleId == null) ? 0 : toRoleId.hashCode());
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
		EsbBkCycleSend other = (EsbBkCycleSend) obj;
		if (cycId == null) {
			if (other.cycId != null)
				return false;
		} else if (!cycId.equals(other.cycId))
			return false;
		if (cycdId == null) {
			if (other.cycdId != null)
				return false;
		} else if (!cycdId.equals(other.cycdId))
			return false;
		if (toOrgId == null) {
			if (other.toOrgId != null)
				return false;
		} else if (!toOrgId.equals(other.toOrgId))
			return false;
		if (toRoleId == null) {
			if (other.toRoleId != null)
				return false;
		} else if (!toRoleId.equals(other.toRoleId))
			return false;
		return true;
	}

}