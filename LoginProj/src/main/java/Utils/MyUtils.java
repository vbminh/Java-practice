package Utils;

import java.sql.Connection;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Account;

public class MyUtils {
	public static void storeConnection(ServletRequest req, Connection conn) {
		req.setAttribute("ATTRIBUTE_FOR_CONNECTION", conn);
	}
	
	public static Connection getConnection(ServletRequest req) {
		Connection conn = (Connection)req.getAttribute("ATTRIBUTE_FOR_CONNECTION");
		return conn;
	}
	
	public static void storeLoginedUser(HttpSession sesion, Account account) {
		sesion.setAttribute("acount", account);
	}
	
	public static Account getLoginedUser(HttpSession session) {
		Account account = (Account)session.getAttribute("account");
		return account;
	}
	
	public static void storeUserCookie(HttpServletResponse resp, Account account) {
		System.out.println("Store user cookie");
		
		Cookie cookieForUsername = new Cookie("COOKIE_FOR_USERNAME", account.getUsername());
		cookieForUsername.setMaxAge(24*3600);
		resp.addCookie(cookieForUsername);
	}
	
	public static String getUsernameInCookie(HttpServletRequest req) {
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(Cookie item : cookies) {
				if("COOKIE_FOR_USERNAME".equals(item.getName()))
					return item.getValue();
			}
		}
		return null;
	}
	
	public static void deleteCookie(HttpServletResponse resp) {
		Cookie delCookie = new Cookie("COOKIE_FOR_USERNAME", null);
		delCookie.setMaxAge(0);
		resp.addCookie(delCookie);
	}
}
