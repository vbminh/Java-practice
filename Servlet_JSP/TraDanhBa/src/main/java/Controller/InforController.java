package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BO.InforBO;
import Model.bean.Information;

public class InforController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public InforController() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		
		String maTB = req.getParameter("matb");
		String tenTB = req.getParameter("tentb");
		String sDT = req.getParameter("sdt");
		String diaChi = req.getParameter("diachi");
		
		InforBO inforBO = new InforBO();
		
		try {
			Information list = inforBO.getInformation(maTB, tenTB, sDT, diaChi);
			req.setAttribute("information", list);
			RequestDispatcher dis = req.getRequestDispatcher("Result.jsp");
			dis.forward(req, resp);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
