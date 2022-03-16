package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Account;

public class LoginController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		Account account = new Account();
		account.setUsername(username);
		account.setPassword(password);
		req.setAttribute("account", account);
		try {
			boolean checkAccount = account.checkAccount();
			
			if(checkAccount) {
				RequestDispatcher rd = req.getRequestDispatcher("LoginSuccess.jsp");
				rd.forward(req, resp);
			}
			else {
				RequestDispatcher rd = req.getRequestDispatcher("LoginError.jsp");
				rd.forward(req, resp);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
			
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}
