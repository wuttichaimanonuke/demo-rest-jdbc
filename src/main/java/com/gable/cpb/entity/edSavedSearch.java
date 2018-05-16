package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class edSavedSearch {

	private Long ssId;
	private Long ssUserId;
	private String ssName;
	private String ssDesc;
	private String ssSearch;
	private Integer ssDocName;
	private Integer ssSubject;
	private Integer ssDetail;
	private Integer ssRemark;
	private Integer ssDateType;
	private Date ssDateFrom;
	private Date ssDateTo;
	private Integer ssFormatW;
	private Integer ssFormatE;
	private Integer ssFormatPP;
	private Integer ssFormatPdf;
	private Integer ssFormatPic;
	private Integer ssFormatOther;
	private String ssFormatOtherD;
	private String ssBarcode;
	private Long ssDocTypeMain;
	private Long ssDocTypeOne;
	private Long ssDocTypeTwo;
	private Integer ssDocTypeSearch;
	private Long ssOrgOwner;
	private Long ssOrgHost;
	private Date createDatetime;
	private String createUser;
	private Date updateDatetime;
	private String updateUser;

	@JsonIgnore

	public edSavedSearch() {
		super();
	}

	public edSavedSearch(Long ssId, Long ssUserId, String ssName, String ssDesc, String ssSearch, Integer ssDocName, Integer ssSubject, Integer ssDetail, Integer ssRemark, Integer ssDateType, Date ssDateFrom, Date ssDateTo, Integer ssFormatW, Integer ssFormatE, Integer ssFormatPP, Integer ssFormatPdf, Integer ssFormatPic, Integer ssFormatOther, String ssFormatOtherD, String ssBarcode, Long ssDocTypeMain, Long ssDocTypeOne, Long ssDocTypeTwo, Integer ssDocTypeSearch, Long ssOrgOwner, Long ssOrgHost, Date createDatetime, String createUser, Date updateDatetime, String updateUser) {
		super();
		this.ssId = ssId;
		this.ssUserId = ssUserId;
		this.ssName = ssName;
		this.ssDesc = ssDesc;
		this.ssSearch = ssSearch;
		this.ssDocName = ssDocName;
		this.ssSubject = ssSubject;
		this.ssDetail = ssDetail;
		this.ssRemark = ssRemark;
		this.ssDateType = ssDateType;
		this.ssDateFrom = ssDateFrom;
		this.ssDateTo = ssDateTo;
		this.ssFormatW = ssFormatW;
		this.ssFormatE = ssFormatE;
		this.ssFormatPP = ssFormatPP;
		this.ssFormatPdf = ssFormatPdf;
		this.ssFormatPic = ssFormatPic;
		this.ssFormatOther = ssFormatOther;
		this.ssFormatOtherD = ssFormatOtherD;
		this.ssBarcode = ssBarcode;
		this.ssDocTypeMain = ssDocTypeMain;
		this.ssDocTypeOne = ssDocTypeOne;
		this.ssDocTypeTwo = ssDocTypeTwo;
		this.ssDocTypeSearch = ssDocTypeSearch;
		this.ssOrgOwner = ssOrgOwner;
		this.ssOrgHost = ssOrgHost;
		this.createDatetime = createDatetime;
		this.createUser = createUser;
		this.updateDatetime = updateDatetime;
		this.updateUser = updateUser;
	}

	public Long getSsId() {
		return ssId;
	}

	public Long getSsUserId() {
		return ssUserId;
	}

	public String getSsName() {
		return ssName;
	}

	public String getSsDesc() {
		return ssDesc;
	}

	public String getSsSearch() {
		return ssSearch;
	}

	public Integer getSsDocName() {
		return ssDocName;
	}

	public Integer getSsSubject() {
		return ssSubject;
	}

	public Integer getSsDetail() {
		return ssDetail;
	}

	public Integer getSsRemark() {
		return ssRemark;
	}

	public Integer getSsDateType() {
		return ssDateType;
	}

	public Date getSsDateFrom() {
		return ssDateFrom;
	}

	public Date getSsDateTo() {
		return ssDateTo;
	}

	public Integer getSsFormatW() {
		return ssFormatW;
	}

	public Integer getSsFormatE() {
		return ssFormatE;
	}

	public Integer getSsFormatPP() {
		return ssFormatPP;
	}

	public Integer getSsFormatPdf() {
		return ssFormatPdf;
	}

	public Integer getSsFormatPic() {
		return ssFormatPic;
	}

	public Integer getSsFormatOther() {
		return ssFormatOther;
	}

	public String getSsFormatOtherD() {
		return ssFormatOtherD;
	}

	public String getSsBarcode() {
		return ssBarcode;
	}

	public Long getSsDocTypeMain() {
		return ssDocTypeMain;
	}

	public Long getSsDocTypeOne() {
		return ssDocTypeOne;
	}

	public Long getSsDocTypeTwo() {
		return ssDocTypeTwo;
	}

	public Integer getSsDocTypeSearch() {
		return ssDocTypeSearch;
	}

	public Long getSsOrgOwner() {
		return ssOrgOwner;
	}

	public Long getSsOrgHost() {
		return ssOrgHost;
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

	public void setSsId(Long ssId) {
		this.ssId = ssId;
	}

	public void setSsUserId(Long ssUserId) {
		this.ssUserId = ssUserId;
	}

	public void setSsName(String ssName) {
		this.ssName = ssName;
	}

	public void setSsDesc(String ssDesc) {
		this.ssDesc = ssDesc;
	}

	public void setSsSearch(String ssSearch) {
		this.ssSearch = ssSearch;
	}

	public void setSsDocName(Integer ssDocName) {
		this.ssDocName = ssDocName;
	}

	public void setSsSubject(Integer ssSubject) {
		this.ssSubject = ssSubject;
	}

	public void setSsDetail(Integer ssDetail) {
		this.ssDetail = ssDetail;
	}

	public void setSsRemark(Integer ssRemark) {
		this.ssRemark = ssRemark;
	}

	public void setSsDateType(Integer ssDateType) {
		this.ssDateType = ssDateType;
	}

	public void setSsDateFrom(Date ssDateFrom) {
		this.ssDateFrom = ssDateFrom;
	}

	public void setSsDateTo(Date ssDateTo) {
		this.ssDateTo = ssDateTo;
	}

	public void setSsFormatW(Integer ssFormatW) {
		this.ssFormatW = ssFormatW;
	}

	public void setSsFormatE(Integer ssFormatE) {
		this.ssFormatE = ssFormatE;
	}

	public void setSsFormatPP(Integer ssFormatPP) {
		this.ssFormatPP = ssFormatPP;
	}

	public void setSsFormatPdf(Integer ssFormatPdf) {
		this.ssFormatPdf = ssFormatPdf;
	}

	public void setSsFormatPic(Integer ssFormatPic) {
		this.ssFormatPic = ssFormatPic;
	}

	public void setSsFormatOther(Integer ssFormatOther) {
		this.ssFormatOther = ssFormatOther;
	}

	public void setSsFormatOtherD(String ssFormatOtherD) {
		this.ssFormatOtherD = ssFormatOtherD;
	}

	public void setSsBarcode(String ssBarcode) {
		this.ssBarcode = ssBarcode;
	}

	public void setSsDocTypeMain(Long ssDocTypeMain) {
		this.ssDocTypeMain = ssDocTypeMain;
	}

	public void setSsDocTypeOne(Long ssDocTypeOne) {
		this.ssDocTypeOne = ssDocTypeOne;
	}

	public void setSsDocTypeTwo(Long ssDocTypeTwo) {
		this.ssDocTypeTwo = ssDocTypeTwo;
	}

	public void setSsDocTypeSearch(Integer ssDocTypeSearch) {
		this.ssDocTypeSearch = ssDocTypeSearch;
	}

	public void setSsOrgOwner(Long ssOrgOwner) {
		this.ssOrgOwner = ssOrgOwner;
	}

	public void setSsOrgHost(Long ssOrgHost) {
		this.ssOrgHost = ssOrgHost;
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


	@Override
	public String toString() {
		return "edSavedSearch [ssId = " + ssId + ", ssUserId = " + ssUserId + ", ssName = " + ssName + ", ssDesc = " + ssDesc + ", ssSearch = " + ssSearch + ", ssDocName = " + ssDocName + ", ssSubject = " + ssSubject + ", ssDetail = " + ssDetail + ", ssRemark = " + ssRemark + ", ssDateType = " + ssDateType + ", ssDateFrom = " + ssDateFrom + ", ssDateTo = " + ssDateTo + ", ssFormatW = " + ssFormatW + ", ssFormatE = " + ssFormatE + ", ssFormatPP = " + ssFormatPP + ", ssFormatPdf = " + ssFormatPdf + ", ssFormatPic = " + ssFormatPic + ", ssFormatOther = " + ssFormatOther + ", ssFormatOtherD = " + ssFormatOtherD + ", ssBarcode = " + ssBarcode + ", ssDocTypeMain = " + ssDocTypeMain + ", ssDocTypeOne = " + ssDocTypeOne + ", ssDocTypeTwo = " + ssDocTypeTwo + ", ssDocTypeSearch = " + ssDocTypeSearch + ", ssOrgOwner = " + ssOrgOwner + ", ssOrgHost = " + ssOrgHost + ", createDatetime = " + createDatetime + ", createUser = " + createUser + ", updateDatetime = " + updateDatetime + ", updateUser = " + updateUser + "]";
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
		result = prime * result + ((ssBarcode == null) ? 0 : ssBarcode.hashCode());
		result = prime * result + ((ssDateFrom == null) ? 0 : ssDateFrom.hashCode());
		result = prime * result + ((ssDateTo == null) ? 0 : ssDateTo.hashCode());
		result = prime * result + ((ssDateType == null) ? 0 : ssDateType.hashCode());
		result = prime * result + ((ssDesc == null) ? 0 : ssDesc.hashCode());
		result = prime * result + ((ssDetail == null) ? 0 : ssDetail.hashCode());
		result = prime * result + ((ssDocName == null) ? 0 : ssDocName.hashCode());
		result = prime * result + ((ssDocTypeMain == null) ? 0 : ssDocTypeMain.hashCode());
		result = prime * result + ((ssDocTypeOne == null) ? 0 : ssDocTypeOne.hashCode());
		result = prime * result + ((ssDocTypeSearch == null) ? 0 : ssDocTypeSearch.hashCode());
		result = prime * result + ((ssDocTypeTwo == null) ? 0 : ssDocTypeTwo.hashCode());
		result = prime * result + ((ssFormatE == null) ? 0 : ssFormatE.hashCode());
		result = prime * result + ((ssFormatOther == null) ? 0 : ssFormatOther.hashCode());
		result = prime * result + ((ssFormatOtherD == null) ? 0 : ssFormatOtherD.hashCode());
		result = prime * result + ((ssFormatPP == null) ? 0 : ssFormatPP.hashCode());
		result = prime * result + ((ssFormatPdf == null) ? 0 : ssFormatPdf.hashCode());
		result = prime * result + ((ssFormatPic == null) ? 0 : ssFormatPic.hashCode());
		result = prime * result + ((ssFormatW == null) ? 0 : ssFormatW.hashCode());
		result = prime * result + ((ssId == null) ? 0 : ssId.hashCode());
		result = prime * result + ((ssName == null) ? 0 : ssName.hashCode());
		result = prime * result + ((ssOrgHost == null) ? 0 : ssOrgHost.hashCode());
		result = prime * result + ((ssOrgOwner == null) ? 0 : ssOrgOwner.hashCode());
		result = prime * result + ((ssRemark == null) ? 0 : ssRemark.hashCode());
		result = prime * result + ((ssSearch == null) ? 0 : ssSearch.hashCode());
		result = prime * result + ((ssSubject == null) ? 0 : ssSubject.hashCode());
		result = prime * result + ((ssUserId == null) ? 0 : ssUserId.hashCode());
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
		edSavedSearch other = (edSavedSearch) obj;
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
		if (ssBarcode == null) {
			if (other.ssBarcode != null)
				return false;
		} else if (!ssBarcode.equals(other.ssBarcode))
			return false;
		if (ssDateFrom == null) {
			if (other.ssDateFrom != null)
				return false;
		} else if (!ssDateFrom.equals(other.ssDateFrom))
			return false;
		if (ssDateTo == null) {
			if (other.ssDateTo != null)
				return false;
		} else if (!ssDateTo.equals(other.ssDateTo))
			return false;
		if (ssDateType == null) {
			if (other.ssDateType != null)
				return false;
		} else if (!ssDateType.equals(other.ssDateType))
			return false;
		if (ssDesc == null) {
			if (other.ssDesc != null)
				return false;
		} else if (!ssDesc.equals(other.ssDesc))
			return false;
		if (ssDetail == null) {
			if (other.ssDetail != null)
				return false;
		} else if (!ssDetail.equals(other.ssDetail))
			return false;
		if (ssDocName == null) {
			if (other.ssDocName != null)
				return false;
		} else if (!ssDocName.equals(other.ssDocName))
			return false;
		if (ssDocTypeMain == null) {
			if (other.ssDocTypeMain != null)
				return false;
		} else if (!ssDocTypeMain.equals(other.ssDocTypeMain))
			return false;
		if (ssDocTypeOne == null) {
			if (other.ssDocTypeOne != null)
				return false;
		} else if (!ssDocTypeOne.equals(other.ssDocTypeOne))
			return false;
		if (ssDocTypeSearch == null) {
			if (other.ssDocTypeSearch != null)
				return false;
		} else if (!ssDocTypeSearch.equals(other.ssDocTypeSearch))
			return false;
		if (ssDocTypeTwo == null) {
			if (other.ssDocTypeTwo != null)
				return false;
		} else if (!ssDocTypeTwo.equals(other.ssDocTypeTwo))
			return false;
		if (ssFormatE == null) {
			if (other.ssFormatE != null)
				return false;
		} else if (!ssFormatE.equals(other.ssFormatE))
			return false;
		if (ssFormatOther == null) {
			if (other.ssFormatOther != null)
				return false;
		} else if (!ssFormatOther.equals(other.ssFormatOther))
			return false;
		if (ssFormatOtherD == null) {
			if (other.ssFormatOtherD != null)
				return false;
		} else if (!ssFormatOtherD.equals(other.ssFormatOtherD))
			return false;
		if (ssFormatPP == null) {
			if (other.ssFormatPP != null)
				return false;
		} else if (!ssFormatPP.equals(other.ssFormatPP))
			return false;
		if (ssFormatPdf == null) {
			if (other.ssFormatPdf != null)
				return false;
		} else if (!ssFormatPdf.equals(other.ssFormatPdf))
			return false;
		if (ssFormatPic == null) {
			if (other.ssFormatPic != null)
				return false;
		} else if (!ssFormatPic.equals(other.ssFormatPic))
			return false;
		if (ssFormatW == null) {
			if (other.ssFormatW != null)
				return false;
		} else if (!ssFormatW.equals(other.ssFormatW))
			return false;
		if (ssId == null) {
			if (other.ssId != null)
				return false;
		} else if (!ssId.equals(other.ssId))
			return false;
		if (ssName == null) {
			if (other.ssName != null)
				return false;
		} else if (!ssName.equals(other.ssName))
			return false;
		if (ssOrgHost == null) {
			if (other.ssOrgHost != null)
				return false;
		} else if (!ssOrgHost.equals(other.ssOrgHost))
			return false;
		if (ssOrgOwner == null) {
			if (other.ssOrgOwner != null)
				return false;
		} else if (!ssOrgOwner.equals(other.ssOrgOwner))
			return false;
		if (ssRemark == null) {
			if (other.ssRemark != null)
				return false;
		} else if (!ssRemark.equals(other.ssRemark))
			return false;
		if (ssSearch == null) {
			if (other.ssSearch != null)
				return false;
		} else if (!ssSearch.equals(other.ssSearch))
			return false;
		if (ssSubject == null) {
			if (other.ssSubject != null)
				return false;
		} else if (!ssSubject.equals(other.ssSubject))
			return false;
		if (ssUserId == null) {
			if (other.ssUserId != null)
				return false;
		} else if (!ssUserId.equals(other.ssUserId))
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