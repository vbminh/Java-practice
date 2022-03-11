import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/userinfo"})
public class UserInfoServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public UserInfoServlet() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();
		
		HttpSession session = req.getSession();
		
		UserInfo loginedinfo = (UserInfo) session.getAttribute("User_Key");
		
		Date createTime = new Date(session.getCreationTime());
		Date lastAccessTime = new Date(session.getLastAccessedTime());
		
		if(loginedinfo == null) {
			resp.sendRedirect(this.getServletContext().getContextPath() + "/Login");
			return;
		}
			
		out.println("<!doctype html public \"-//w3c//dtd html 4.0 "
				+ "transitional//en\">");
		out.println("<html>");
		out.println("<head>\n<meta charset=\"UTF-8\">");
		out.println("<title>UserInfo</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 align = \"center\">User Information</h1>");
		out.println("Id: " + session.getId());
		out.println("<br>Username: " + loginedinfo.getUserName());
		out.println("<br>Country: " + loginedinfo.getCountry());
		out.println("<br>Post: " + loginedinfo.getPost());
		out.println("<br>Creat time: " + createTime);
		out.println("<br>Last accessed time: " + lastAccessTime);
		out.println("</body>\n</html>");
		
	}
}
