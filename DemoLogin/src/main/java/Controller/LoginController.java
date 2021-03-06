package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.BO.AccountBO;
import Model.Bean.Account;
import reCaptcha.Verify;

public class LoginController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	protected static Account account;

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
		
		String error = null;
		AccountBO accountBO = null;
		
		String gvalid = req.getParameter("g-recaptcha-response");
		boolean valid = Verify.verify(gvalid);
		
		if(checkValid(username, password)) {
			accountBO = new AccountBO();
			
			if(valid == true ) {
				if(accountBO.checkLogin(username, password)) {	
					account = accountBO.getAccount(username);
					req.setAttribute("account", account);
					RequestDispatcher dis = this.getServletContext().getRequestDispatcher("/Home.jsp");
					dis.forward(req, resp);
				}
				else {
					error = "Username or password invalid!";
					req.setAttribute("ErrorString", error);
					RequestDispatcher dis = this.getServletContext().getRequestDispatcher("/Login.jsp");
					dis.forward(req, resp);
				}
			}
			else {
				error ="ReCaptcha invalid!";
				req.setAttribute("ErrorString", error);
				RequestDispatcher dis = this.getServletContext().getRequestDispatcher("/Login.jsp");
				dis.forward(req, resp);
			}
		}
		else {
			error ="Username or password cannot be blank";
			req.setAttribute("ErrorString", error);
			RequestDispatcher dis = this.getServletContext().getRequestDispatcher("/Login.jsp");
			dis.forward(req, resp);
		}
	}
	
	public boolean checkValid(String username, String password) {
		if(username == null || username == "")
			return false;
		if(password == null || password == "")
			return false;
		
		return true;
	}
}