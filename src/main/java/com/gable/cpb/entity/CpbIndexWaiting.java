package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbIndexWaiting {

	private String indWaitingId;
	private Date indTimestamp;

	@JsonIgnore

	public CpbIndexWaiting() {
		super();
	}

	public CpbIndexWaiting(String indWaitingId, Date indTimestamp) {
		super();
		this.indWaitingId = indWaitingId;
		this.indTimestamp = indTimestamp;
	}

	public String getIndWaitingId() {
		return indWaitingId;
	}

	public Date getIndTimestamp() {
		return indTimestamp;
	}

	public void setIndWaitingId(String indWaitingId) {
		this.indWaitingId = indWaitingId;
	}

	public void setIndTimestamp(Date indTimestamp) {
		this.indTimestamp = indTimestamp;
	}


	@Override
	public String toString() {
		return "CpbIndexWaiting [indWaitingId = " + indWaitingId + ", indTimestamp = " + indTimestamp + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indTimestamp == null) ? 0 : indTimestamp.hashCode());
		result = prime * result + ((indWaitingId == null) ? 0 : indWaitingId.hashCode());
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
		CpbIndexWaiting other = (CpbIndexWaiting) obj;
		if (indTimestamp == null) {
			if (other.indTimestamp != null)
				return false;
		} else if (!indTimestamp.equals(other.indTimestamp))
			return false;
		if (indWaitingId == null) {
			if (other.indWaitingId != null)
				return false;
		} else if (!indWaitingId.equals(other.indWaitingId))
			return false;
		return true;
	}

}