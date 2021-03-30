package com.nt.Service;

import com.nt.BO.EmployeeBO;
import com.nt.DAO.EmployeeDAO;
import com.nt.DAO.EmployeeDAOImpl;
import com.nt.DTO.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {
	
	EmployeeDAO dao;
	public EmployeeMgmtServiceImpl() {
		dao=new EmployeeDAOImpl();
	}

	public String registration(EmployeeDTO dto) throws Exception {
		
		int count=0;
		EmployeeBO bo=null;
		EmployeeDAOImpl dao=null;
		
		
		//prepare Bo class object having persistable date
		bo=new EmployeeBO();
		bo.setDate(dto.getDate());
		bo.setPartnerId(dto.getPartnerId());
		bo.setReceiptNo(dto.getReceiptNo());
		bo.setBranchCode(dto.getBranchCode());
		bo.setGstAmt(dto.getGstAmt());
		//use Dao
		dao=new EmployeeDAOImpl();
		count=dao.insert(bo);
		if(count==0) {
			return"registration failed";
		}else {
			return"registration succed";
		}
	}

}
