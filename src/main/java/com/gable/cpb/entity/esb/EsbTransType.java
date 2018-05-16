package com.gable.cpb.entity.esb;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsbTransType {

	private Long trTypeId;
	private String trTypeName;
	private String tagStart;
	private String tagEnd;

	@JsonIgnore

	public EsbTransType() {
		super();
	}

	public EsbTransType(Long trTypeId, String trTypeName, String tagStart, String tagEnd) {
		super();
		this.trTypeId = trTypeId;
		this.trTypeName = trTypeName;
		this.tagStart = tagStart;
		this.tagEnd = tagEnd;
	}

	public Long getTrTypeId() {
		return trTypeId;
	}

	public String getTrTypeName() {
		return trTypeName;
	}

	public String getTagStart() {
		return tagStart;
	}

	public String getTagEnd() {
		return tagEnd;
	}

	public void setTrTypeId(Long trTypeId) {
		this.trTypeId = trTypeId;
	}

	public void setTrTypeName(String trTypeName) {
		this.trTypeName = trTypeName;
	}

	public void setTagStart(String tagStart) {
		this.tagStart = tagStart;
	}

	public void setTagEnd(String tagEnd) {
		this.tagEnd = tagEnd;
	}


	@Override
	public String toString() {
		return "esbTransType [trTypeId = " + trTypeId + ", trTypeName = " + trTypeName + ", tagStart = " + tagStart + ", tagEnd = " + tagEnd + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tagEnd == null) ? 0 : tagEnd.hashCode());
		result = prime * result + ((tagStart == null) ? 0 : tagStart.hashCode());
		result = prime * result + ((trTypeId == null) ? 0 : trTypeId.hashCode());
		result = prime * result + ((trTypeName == null) ? 0 : trTypeName.hashCode());
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
		EsbTransType other = (EsbTransType) obj;
		if (tagEnd == null) {
			if (other.tagEnd != null)
				return false;
		} else if (!tagEnd.equals(other.tagEnd))
			return false;
		if (tagStart == null) {
			if (other.tagStart != null)
				return false;
		} else if (!tagStart.equals(other.tagStart))
			return false;
		if (trTypeId == null) {
			if (other.trTypeId != null)
				return false;
		} else if (!trTypeId.equals(other.trTypeId))
			return false;
		if (trTypeName == null) {
			if (other.trTypeName != null)
				return false;
		} else if (!trTypeName.equals(other.trTypeName))
			return false;
		return true;
	}

}