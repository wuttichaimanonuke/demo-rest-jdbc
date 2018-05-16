package com.gable.cpb.entity.cpb;

import java.util.Date;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbDocAttr {

	private long daId;
	private String daCode;
	private String daNmae;
	private Integer daRequired;
	private Integer daOrder;
	private Integer daType;
	private String daTypeItem;
	private String daTypeLookup;
	private Integer daTypeLen;
	private Integer daEditable;
	private Integer daShowable;
	private String createUser;
	private Date createDatetime;
	private String updateUser;
	private Date updateDatetime;

	@JsonIgnore

	public CpbDocAttr() {
		super();
	}

	public CpbDocAttr(long daId, String daCode, String daNmae, Integer daRequired, Integer daOrder, Integer daType, String daTypeItem, String daTypeLookup, Integer daTypeLen, Integer daEditable, Integer daShowable, String createUser, Date createDatetime, String updateUser, Date updateDatetime) {
		super();
		this.daId = daId;
		this.daCode = daCode;
		this.daNmae = daNmae;
		this.daRequired = daRequired;
		this.daOrder = daOrder;
		this.daType = daType;
		this.daTypeItem = daTypeItem;
		this.daTypeLookup = daTypeLookup;
		this.daTypeLen = daTypeLen;
		this.daEditable = daEditable;
		this.daShowable = daShowable;
		this.createUser = createUser;
		this.createDatetime = createDatetime;
		this.updateUser = updateUser;
		this.updateDatetime = updateDatetime;
	}

	public long getDaId() {
		return daId;
	}

	public String getDaCode() {
		return daCode;
	}

	public String getDaNmae() {
		return daNmae;
	}

	public Integer getDaRequired() {
		return daRequired;
	}

	public Integer getDaOrder() {
		return daOrder;
	}

	public Integer getDaType() {
		return daType;
	}

	public String getDaTypeItem() {
		return daTypeItem;
	}

	public String getDaTypeLookup() {
		return daTypeLookup;
	}

	public Integer getDaTypeLen() {
		return daTypeLen;
	}

	public Integer getDaEditable() {
		return daEditable;
	}

	public Integer getDaShowable() {
		return daShowable;
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

	public void setDaId(long daId) {
		this.daId = daId;
	}

	public void setDaCode(String daCode) {
		this.daCode = daCode;
	}

	public void setDaNmae(String daNmae) {
		this.daNmae = daNmae;
	}

	public void setDaRequired(Integer daRequired) {
		this.daRequired = daRequired;
	}

	public void setDaOrder(Integer daOrder) {
		this.daOrder = daOrder;
	}

	public void setDaType(Integer daType) {
		this.daType = daType;
	}

	public void setDaTypeItem(String daTypeItem) {
		this.daTypeItem = daTypeItem;
	}

	public void setDaTypeLookup(String daTypeLookup) {
		this.daTypeLookup = daTypeLookup;
	}

	public void setDaTypeLen(Integer daTypeLen) {
		this.daTypeLen = daTypeLen;
	}

	public void setDaEditable(Integer daEditable) {
		this.daEditable = daEditable;
	}

	public void setDaShowable(Integer daShowable) {
		this.daShowable = daShowable;
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


	@Override
	public String toString() {
		return "CpbDocAttr [daId = " + daId + ", daCode = " + daCode + ", daNmae = " + daNmae + ", daRequired = " + daRequired + ", daOrder = " + daOrder + ", daType = " + daType + ", daTypeItem = " + daTypeItem + ", daTypeLookup = " + daTypeLookup + ", daTypeLen = " + daTypeLen + ", daEditable = " + daEditable + ", daShowable = " + daShowable + ", createUser = " + createUser + ", createDatetime = " + createDatetime + ", updateUser = " + updateUser + ", updateDatetime = " + updateDatetime + "]";
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
		result = prime * result + ((daCode == null) ? 0 : daCode.hashCode());
		result = prime * result + ((daEditable == null) ? 0 : daEditable.hashCode());
		result = prime * result + (int) (daId ^ (daId >>> 32));
		result = prime * result + ((daNmae == null) ? 0 : daNmae.hashCode());
		result = prime * result + ((daOrder == null) ? 0 : daOrder.hashCode());
		result = prime * result + ((daRequired == null) ? 0 : daRequired.hashCode());
		result = prime * result + ((daShowable == null) ? 0 : daShowable.hashCode());
		result = prime * result + ((daType == null) ? 0 : daType.hashCode());
		result = prime * result + ((daTypeItem == null) ? 0 : daTypeItem.hashCode());
		result = prime * result + ((daTypeLen == null) ? 0 : daTypeLen.hashCode());
		result = prime * result + ((daTypeLookup == null) ? 0 : daTypeLookup.hashCode());
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
		CpbDocAttr other = (CpbDocAttr) obj;
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
		if (daCode == null) {
			if (other.daCode != null)
				return false;
		} else if (!daCode.equals(other.daCode))
			return false;
		if (daEditable == null) {
			if (other.daEditable != null)
				return false;
		} else if (!daEditable.equals(other.daEditable))
			return false;
		if (daId != other.daId)
			return false;
		if (daNmae == null) {
			if (other.daNmae != null)
				return false;
		} else if (!daNmae.equals(other.daNmae))
			return false;
		if (daOrder == null) {
			if (other.daOrder != null)
				return false;
		} else if (!daOrder.equals(other.daOrder))
			return false;
		if (daRequired == null) {
			if (other.daRequired != null)
				return false;
		} else if (!daRequired.equals(other.daRequired))
			return false;
		if (daShowable == null) {
			if (other.daShowable != null)
				return false;
		} else if (!daShowable.equals(other.daShowable))
			return false;
		if (daType == null) {
			if (other.daType != null)
				return false;
		} else if (!daType.equals(other.daType))
			return false;
		if (daTypeItem == null) {
			if (other.daTypeItem != null)
				return false;
		} else if (!daTypeItem.equals(other.daTypeItem))
			return false;
		if (daTypeLen == null) {
			if (other.daTypeLen != null)
				return false;
		} else if (!daTypeLen.equals(other.daTypeLen))
			return false;
		if (daTypeLookup == null) {
			if (other.daTypeLookup != null)
				return false;
		} else if (!daTypeLookup.equals(other.daTypeLookup))
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