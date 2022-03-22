package Filter;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import Model.Account;
import Utils.DBUtils;
import Utils.MyUtils;

@WebFilter(filterName = "cookieFilter", urlPatterns = {"/*"})
public class CookieFilter implements Filter{
	public CookieFilter() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = (HttpSession)req.getSession();
		Account account = MyUtils.getLoginedUser(session);
		
		if(account != null) {
			session.setAttribute("COOKIE_CHECK", "CHECK");
			chain.doFilter(request, response);
			return;
		}
		
		Connection conn = MyUtils.getConnection(req);
		
		String check = (String) session.getAttribute("COOKIE_CHECK");
		if(check == null && conn != null) {
			String username = MyUtils.getUsernameInCookie(req);
			try {
				Account acc = DBUtils.findUser(conn, username);
				MyUtils.storeLoginedUser(session, acc);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			session.setAttribute("COOKIE_CHECK", "CHECK");
		}
		chain.doFilter(request, response);
//ádfaf
	}
	
	
}
