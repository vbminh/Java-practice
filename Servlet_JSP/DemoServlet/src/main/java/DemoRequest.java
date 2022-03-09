import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoRequest extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		String title = "Demo Request";
		
		out.println("<!doctype html public \"-//w3c//dtd html 4.0 "
				+ "transitional//en\">");
		out.println("<html>");
		out.println("<head>\n<meta charset=\"UTF-8\">");
		out.println("<title>" + title + "</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 align = \"center\">" + title + "</h1>");
		out.println("<table width=\"600px\" border=\"1\" align=\"center\">");
		out.println("<tr>\n<th width=\"100px\">Header Name</th>");
		out.println("<th width=\"500px\">Header Values</th>");
		out.println("</tr>");
		
		Enumeration<String> headerNames = req.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			out.println("<tr><td>" + headerName + "</td>");
			String headerValue = req.getHeader(headerName);
			out.println("<td>" + headerValue + "</td>\n</tr>");
		}
		out.println("</table>\n</body>\n</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
