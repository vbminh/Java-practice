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
		
		String error = "a";
		boolean valid;
		AccountBO accountBO = new AccountBO();
		
		if(accountBO.checkLogin(username, password)) {	
			String gvalid = req.getParameter("g-recaptcha-response");
			valid = Verify.verify(gvalid);
			System.out.println(valid + "--" + gvalid);
			Account account = accountBO.getAccount(username);
			req.setAttribute("account", account);
			RequestDispatcher dis = this.getServletContext().getRequestDispatcher("/Information.jsp");
			dis.forward(req, resp);
		}
		else {
			error = "username or password invalid!";
			req.setAttribute("ErrorString", error);
			RequestDispatcher dis = this.getServletContext().getRequestDispatcher("/Login.jsp");
			dis.forward(req, resp);
		}
			 
			
	}
}