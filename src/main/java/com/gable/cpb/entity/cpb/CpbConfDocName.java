package com.gable.cpb.entity.cpb;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbConfDocName {

	private String dnObjType;
	private String dnFirst;
	private String dnSecond;
	private String dnThird;
	private String dnFourth;
	private String dnFifth;
	private String dnSixth;

	@JsonIgnore

	public CpbConfDocName() {
		super();
	}

	public CpbConfDocName(String dnObjType, String dnFirst, String dnSecond, String dnThird, String dnFourth, String dnFifth, String dnSixth) {
		super();
		this.dnObjType = dnObjType;
		this.dnFirst = dnFirst;
		this.dnSecond = dnSecond;
		this.dnThird = dnThird;
		this.dnFourth = dnFourth;
		this.dnFifth = dnFifth;
		this.dnSixth = dnSixth;
	}

	public String getDnObjType() {
		return dnObjType;
	}

	public String getDnFirst() {
		return dnFirst;
	}

	public String getDnSecond() {
		return dnSecond;
	}

	public String getDnThird() {
		return dnThird;
	}

	public String getDnFourth() {
		return dnFourth;
	}

	public String getDnFifth() {
		return dnFifth;
	}

	public String getDnSixth() {
		return dnSixth;
	}

	public void setDnObjType(String dnObjType) {
		this.dnObjType = dnObjType;
	}

	public void setDnFirst(String dnFirst) {
		this.dnFirst = dnFirst;
	}

	public void setDnSecond(String dnSecond) {
		this.dnSecond = dnSecond;
	}

	public void setDnThird(String dnThird) {
		this.dnThird = dnThird;
	}

	public void setDnFourth(String dnFourth) {
		this.dnFourth = dnFourth;
	}

	public void setDnFifth(String dnFifth) {
		this.dnFifth = dnFifth;
	}

	public void setDnSixth(String dnSixth) {
		this.dnSixth = dnSixth;
	}


	@Override
	public String toString() {
		return "CpbConfDocName [dnObjType = " + dnObjType + ", dnFirst = " + dnFirst + ", dnSecond = " + dnSecond + ", dnThird = " + dnThird + ", dnFourth = " + dnFourth + ", dnFifth = " + dnFifth + ", dnSixth = " + dnSixth + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dnFifth == null) ? 0 : dnFifth.hashCode());
		result = prime * result + ((dnFirst == null) ? 0 : dnFirst.hashCode());
		result = prime * result + ((dnFourth == null) ? 0 : dnFourth.hashCode());
		result = prime * result + ((dnObjType == null) ? 0 : dnObjType.hashCode());
		result = prime * result + ((dnSecond == null) ? 0 : dnSecond.hashCode());
		result = prime * result + ((dnSixth == null) ? 0 : dnSixth.hashCode());
		result = prime * result + ((dnThird == null) ? 0 : dnThird.hashCode());
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
		CpbConfDocName other = (CpbConfDocName) obj;
		if (dnFifth == null) {
			if (other.dnFifth != null)
				return false;
		} else if (!dnFifth.equals(other.dnFifth))
			return false;
		if (dnFirst == null) {
			if (other.dnFirst != null)
				return false;
		} else if (!dnFirst.equals(other.dnFirst))
			return false;
		if (dnFourth == null) {
			if (other.dnFourth != null)
				return false;
		} else if (!dnFourth.equals(other.dnFourth))
			return false;
		if (dnObjType == null) {
			if (other.dnObjType != null)
				return false;
		} else if (!dnObjType.equals(other.dnObjType))
			return false;
		if (dnSecond == null) {
			if (other.dnSecond != null)
				return false;
		} else if (!dnSecond.equals(other.dnSecond))
			return false;
		if (dnSixth == null) {
			if (other.dnSixth != null)
				return false;
		} else if (!dnSixth.equals(other.dnSixth))
			return false;
		if (dnThird == null) {
			if (other.dnThird != null)
				return false;
		} else if (!dnThird.equals(other.dnThird))
			return false;
		return true;
	}

}