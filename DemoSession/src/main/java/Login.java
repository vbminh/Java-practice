import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public Login() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();
		
		HttpSession session = req.getSession();
		
		UserInfo loginedInfo = new UserInfo("Vu Minh", "Viet Nam", 5);
		
		session.setAttribute("User_Key", loginedInfo);
		
		out.println("<!doctype html public \"-//w3c//dtd html 4.0 "
				+ "transitional//en\">");
		out.println("<html>");
		out.println("<head>\n<meta charset=\"UTF-8\">");
		out.println("<title>Login</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 align = \"center\">Welcome to my website</h1>");
		out.println("<a href='UserInfoServlet' style=\"text-decoration: none;\">&emsp;View user infomation</a>");
		out.println("</body>\n</html>");
	}
}
