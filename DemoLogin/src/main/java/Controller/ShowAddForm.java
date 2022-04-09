package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Bean.Account;
import Model.DAO.AccountDAO;

public class ShowAddForm extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String address  = req.getParameter("address");
		String phone = req.getParameter("phone");
		
		if(username == null || username.equals("") || password == null || password.equals("") ||
			name == null || name.equals("") || age == null || age.equals("") ||
			address == null || address.equals("") || phone == null || phone.equals("")) {
			String error = "you must enter all field";
			req.setAttribute("error", error);
			RequestDispatcher dis = this.getServletContext().getRequestDispatcher("/AddAccount.jsp");
			dis.forward(req, resp);
		}
		else {
			Account account = new Account(username, password, name, Integer.parseInt(age), address, phone);
			AccountDAO.addAccount(account);
			req.setAttribute("account", account);
			RequestDispatcher dis = this.getServletContext().getRequestDispatcher("/Information.jsp");
			dis.forward(req, resp);
		}
	}
	
}
