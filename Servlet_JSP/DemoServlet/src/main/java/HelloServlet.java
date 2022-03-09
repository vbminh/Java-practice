import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {
   
   private static final long serialVersionUID = 1L;
   private String message;
   
   public HelloServlet() {
   }

   public void init() throws ServletException {
	   message = "Hello everyone, I'm Minh";
   }
   
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		   throws ServletException, IOException {
       
	   response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       out.println("<h1>" + message + "</h1>");
   }

   @Override
   protected void doPost(HttpServletRequest request,
           HttpServletResponse response) throws ServletException, IOException {
       this.doGet(request, response);
   }

   public void destroy() {
	   
   }
}