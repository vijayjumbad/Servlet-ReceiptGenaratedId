package com.nt.BO;

import java.util.Date;

public class EmployeeBO {
	
	private String date;
	private Integer partnerId;
	private Integer receiptNo;
	private Integer branchCode;
	private Integer gstAmt;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}
	public Integer getReceiptNo() {
		return receiptNo;
	}
	public void setReceiptNo(Integer receiptNo) {
		this.receiptNo = receiptNo;
	}
	public Integer getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(Integer branchCode) {
		this.branchCode = branchCode;
	}
	public Integer getGstAmt() {
		return gstAmt;
	}
	public void setGstAmt(Integer gstAmt) {
		this.gstAmt = gstAmt;
	}
	@Override
	public String toString() {
		return "EmployeeBO [date=" + date + ", partnerId=" + partnerId + ", receiptNo=" + receiptNo + ", branchCode="
				+ branchCode + ", gstAmt=" + gstAmt + "]";
	}
	
	
	
	
}
