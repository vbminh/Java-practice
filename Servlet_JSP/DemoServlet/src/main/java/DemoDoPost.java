import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoDoPost extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		String title = "Demo doPost() method uses Form";
		
		out.println("<!doctype html public \"-//w3c//dtd html 4.0 "
				+ "transitional//en\">");
		out.println("<html>");
		out.println("<head>\n<meta charset=\"UTF-8\">");
		out.println("<title>" + title + "</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 align = \"center\">" + title + "</h1>");
		out.println("<ul>");
		out.println("<li><b>First Name</b>: " + req.getParameter("firstName"));
		out.println("<li><b>Last Name</b>: " + req.getParameter("lastName"));
		out.println("</ul>\n</body>\n</html>");
	}
}
