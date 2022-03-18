package Filter;

import java.io.IOException;
import java.sql.Connection;
import java.util.Collection;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import ConnectSQL.ConnectionUtils;
import Utils.MyUtils;
@WebFilter(filterName = "jdbcFilter", urlPatterns = {"/*"})
public class JDBCFilter implements Filter{
	
	public JDBCFilter() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
	
	@Override
	public void destroy() {
	}
	
	private boolean needJDBC(HttpServletRequest req) {
		System.out.println("JDBC Filter");
		
		String servletPath = req.getServletPath();
		String pathInfo = req.getPathInfo();
		String urlPattern = servletPath;
		
		if(pathInfo != null) {
			urlPattern = servletPath + "/*";
		}
		
		Map<String, ? extends ServletRegistration> map = req.getServletContext().getServletRegistrations();
		
		Collection<? extends ServletRegistration> values = map.values();
		for(ServletRegistration sr : values) {
			Collection<String> mapping = sr.getMappings();
			if(mapping.contains(urlPattern))
				return true;
		}
		return false;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		
		if(this.needJDBC(req)) {
			System.out.println("Open Connection for: " + req.getServletPath());
			
			Connection conn = null;
			try {
				conn = ConnectionUtils.getConnection();
				conn.setAutoCommit(false);
				MyUtils.storeConnection(req, conn);
				chain.doFilter(req, response);
				conn.commit();
			}
			catch (Exception e) {
				e.printStackTrace();
				ConnectionUtils.rollbackQuietly(conn);
				throw new ServletException();
			}
			finally {
				ConnectionUtils.closeQuietly(conn);
			}
		}
		else
			chain.doFilter(request, response);
	} 
	
}
