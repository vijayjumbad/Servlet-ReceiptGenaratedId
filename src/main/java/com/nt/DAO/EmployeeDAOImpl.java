package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.nt.BO.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String INSERT_QUERY="INSERT INTO T_RECEIPT_GENARATED VALUES(SQU_EMP.NEXTVAL,?,?,?,?,?)";
	
	private  Connection  getPooledConnection()throws Exception {
		  InitialContext ic=null;
		  DataSource ds=null;
		  Connection con=null;
		  //create InitialContext obj
		  ic=new InitialContext();
		  //get DataSource obj throuhg lookup opeation
		  ds=(DataSource) ic.lookup("java:/comp/env/Dsjndi");
		  //get pooled jdbc con object
		  con=ds.getConnection();
		  return con;
	  }
  
	public int insert(EmployeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		con=getPooledConnection();
		//create preparedStatement obj
		ps=con.prepareStatement(INSERT_QUERY);
		//set param values
		ps.setString(1, bo.getDate());
		ps.setInt(2, bo.getPartnerId());
		ps.setInt(3,bo.getReceiptNo());
		ps.setInt(4,bo.getBranchCode());
		ps.setInt(5,bo.getGstAmt());
		//execute the query
		result=ps.executeUpdate();
		con.close();
		ps.close();
	return result;
	}

}
