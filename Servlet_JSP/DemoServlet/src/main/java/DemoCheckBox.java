import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoCheckBox extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		String title = "Demo CheckBox Action";
		
		out.println("<!doctype html public \"-//w3c//dtd html 4.0 "
				+ "transitional//en\">");
		out.println("<html>");
		out.println("<head>\n<meta charset=\"UTF-8\">");
		out.println("<title>" + title + "</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 align = \"center\">" + title + "</h1>");
		out.println("<ul>");
		out.println("<li><b>Toán:</b>" + req.getParameter("toan") + "</li>");
		out.println("<li><b>Lý:</b></li>" + req.getParameter("ly") + "</li>");
		out.println("<li><b>Hóa:</b></li>" + req.getParameter("hoa") + "</li>");
		out.println("</ul>\n</body>\n</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
