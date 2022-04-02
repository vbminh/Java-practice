package Model.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BO.AccountBO;
import Model.Bean.Account;

public class LoginController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("UTF-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		AccountBO accountBO = new AccountBO();
		if(accountBO.checkLogin(username, password)) {
			Account account = accountBO.getAccount(username);
			req.setAttribute("account", account);
			RequestDispatcher dis = this.getServletContext().getRequestDispatcher("/Information.jsp");
			dis.forward(req, resp);
		}
	}
}
