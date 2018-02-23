package com.gable.cpb.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpbBcPrinter {

	private Long printerId;		//Primary Key
	private String printerName;
	private String printerDesc;
	
	public CpbBcPrinter() {
		super();
	}

	public CpbBcPrinter(Long printerId, String printerName, String printerDesc) {
		super();
		this.printerId = printerId;
		this.printerName = printerName;
		this.printerDesc = printerDesc;
	}

	public Long getPrinterId() {
		return printerId;
	}

	public String getPrinterName() {
		return printerName;
	}

	public String getPrinterDesc() {
		return printerDesc;
	}

	public void setPrinterId(Long printerId) {
		this.printerId = printerId;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public void setPrinterDesc(String printerDesc) {
		this.printerDesc = printerDesc;
	}

	@Override
	public String toString() {
		return "CpbBcPrinter [printerId=" + printerId + ", printerName=" + printerName + ", printerDesc=" + printerDesc
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((printerDesc == null) ? 0 : printerDesc.hashCode());
		result = prime * result + ((printerId == null) ? 0 : printerId.hashCode());
		result = prime * result + ((printerName == null) ? 0 : printerName.hashCode());
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
		CpbBcPrinter other = (CpbBcPrinter) obj;
		if (printerDesc == null) {
			if (other.printerDesc != null)
				return false;
		} else if (!printerDesc.equals(other.printerDesc))
			return false;
		if (printerId == null) {
			if (other.printerId != null)
				return false;
		} else if (!printerId.equals(other.printerId))
			return false;
		if (printerName == null) {
			if (other.printerName != null)
				return false;
		} else if (!printerName.equals(other.printerName))
			return false;
		return true;
	}
	
}
