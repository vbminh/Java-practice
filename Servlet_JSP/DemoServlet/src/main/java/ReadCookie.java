import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadCookie extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = null;
		Cookie[] cookies = null;
		
		cookies= req.getCookies();
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		String title = "Demo Setting Cookie";
		
		out.println("<!doctype html public \"-//w3c//dtd html 4.0 "
				+ "transitional//en\">");
		out.println("<html>");
		out.println("<head>\n<meta charset=\"UTF-8\">");
		out.println("<title>" + title + "</title>");
		out.println("</head>");
		out.println("<body>");
		if(cookies != null) {
			out.println("<h2>Found Cookie Name and Value</h2>");
			for(Cookie item : cookies) {
				cookie = item;
				out.print("Name: " + cookie.getName() + ", ");
				out.print("Value: " + cookie.getValue() + "<br>");
			}
		}
		else
			out.println("<h2>No Cookie founds</h2>");
		
		out.println("</body>\n</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
