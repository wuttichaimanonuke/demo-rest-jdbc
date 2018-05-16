package com.gable.cpb.entity.cpb;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbBcPrinterOrg {

	private Long printerId;			//Key
	private Long orgId;				//Key

	public CpbBcPrinterOrg() {
		super();
	}

	public CpbBcPrinterOrg(Long printerId, Long orgId) {
		super();
		this.printerId = printerId;
		this.orgId = orgId;
	}

	public Long getPrinterId() {
		return printerId;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setPrinterId(Long printerId) {
		this.printerId = printerId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	@Override
	public String toString() {
		return "CpbBcPrinterOrg [printerId=" + printerId + ", orgId=" + orgId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orgId == null) ? 0 : orgId.hashCode());
		result = prime * result + ((printerId == null) ? 0 : printerId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CpbBcPrinterOrg other = (CpbBcPrinterOrg) obj;
		if (orgId == null) {
			if (other.orgId != null)
				return false;
		} else if (!orgId.equals(other.orgId))
			return false;
		if (printerId == null) {
			if (other.printerId != null)
				return false;
		} else if (!printerId.equals(other.printerId))
			return false;
		return true;
	}

}
