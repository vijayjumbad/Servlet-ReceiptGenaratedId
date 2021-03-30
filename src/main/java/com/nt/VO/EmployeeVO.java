package com.nt.VO;

import java.util.Date;

public class EmployeeVO {
	
	private String date;
	private String partnerId;
	private String receiptNo;
	private String branchCode;
	private String gstAmt;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getReceiptNo() {
		return receiptNo;
	}
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getGstAmt() {
		return gstAmt;
	}
	public void setGstAmt(String gstAmt) {
		this.gstAmt = gstAmt;
	}
	@Override
	public String toString() {
		return "EmployeeVO [date=" + date + ", partnerId=" + partnerId + ", receiptNo=" + receiptNo + ", branchCode="
				+ branchCode + ", gstAmt=" + gstAmt + "]";
	}
	
	
	
	
	
}
