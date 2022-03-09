import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoReadParams extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		String title = "Demo Read All Form Parameters";
		
		out.println("<!doctype html public \"-//w3c//dtd html 4.0 "
				+ "transitional//en\">");
		out.println("<html>");
		out.println("<head>\n<meta charset=\"UTF-8\">");
		out.println("<title>" + title + "</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 align = \"center\">" + title + "</h1>");
		out.println("<table width=\"400px\" border=\"1\" align=\"center\">");
		out.println("<tr>\n<th>Param Name</th>");
		out.println("<th>Param Values</th>");
		out.println("</tr>");
		
		Enumeration<String> paramNames = req.getParameterNames();
		while(paramNames.hasMoreElements()) {
			String paramName = paramNames.nextElement();
			out.println("<tr><td>" + paramName + "</td>\n<td>");
			String[] paramValues = req.getParameterValues(paramName);
			
			if(paramValues.length == 1) {
				String paramValue = paramValues[0];
				if(paramValue.length() == 0) 
					out.println("<i>No Value</i>");
				else
					out.println(paramValue);
			}
			else {
				out.println("<ul>");
				for(int i = 0; i < paramValues.length; i++) {
					out.println("<li>" + paramValues[i]);
				}
				out.println("</ul>");
			}
		}
		out.println("</tr>\n</table>\n</body>\n</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
