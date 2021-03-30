package com.nt.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.DTO.EmployeeDTO;
import com.nt.Service.EmployeeMgmtService;
import com.nt.Service.EmployeeMgmtServiceImpl;
import com.nt.VO.EmployeeVO;

@WebServlet("/controller")
public class MainControllerTest extends HttpServlet {

	private EmployeeMgmtService service;
	@Override
	public void init()  {
		service=new EmployeeMgmtServiceImpl();
			}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String date,partnerId,receiptNo,branchCode,gstAmt;
		PrintWriter pw=null;
		EmployeeVO vo=null;
		EmployeeDTO dto=null;
		String resultMsg=null;
		//get print writer objec
		pw=res.getWriter();
		res.setContentType("text/html");
		//read form data
		date=req.getParameter("date");
		partnerId=req.getParameter("partnerId");
		receiptNo=req.getParameter("receiptNo");
		branchCode=req.getParameter("branchCode");
		gstAmt=req.getParameter("gstAmt");
		//store the data VO class object
		vo=new EmployeeVO();
		vo.setDate(date);
		vo.setPartnerId(partnerId);
		vo.setReceiptNo(receiptNo);
		vo.setBranchCode(branchCode);
		vo.setGstAmt(gstAmt);
		//convert the data Vo class to DTO class object
		dto=new EmployeeDTO();
		//dto.setEname(vo.getEname());
		dto.setDate(vo.getDate());
		dto.setPartnerId(Integer.parseInt(vo.getPartnerId()));
		dto.setReceiptNo(Integer.parseInt(vo.getReceiptNo()));
		dto.setBranchCode(Integer.parseInt(vo.getBranchCode()));
		dto.setGstAmt(Integer.parseInt(vo.getGstAmt()));
		
		try {
			//use service class
			resultMsg=service.registration(dto);
			//pw.println("<h1 style='color:red;'text-align:center'>"+resultMsg+"</h1>" );
			//res.sendRedirect("Employee.html'");
		}
		catch(Exception e) {
			e.printStackTrace();
			pw.println("<h1 style='color:red;text-align:center'>Internal Problem--Try Again</h1>");
		}
		pw.println("<br><a href='Employee.html'>home</a>");
		//close stream
		pw.close();
		
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
		
	}
	@Override
	public void destroy() {
	service=null;
	}
		

	

}
