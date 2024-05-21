package com.nkxgen.filters;
import java.io.IOException;  
import java.io.PrintWriter;  
import jakarta.servlet.*;  
import jakarta.servlet.http.*;  
  
public class AuthenticateFilter implements Filter{  
  
	public void init(FilterConfig arg) throws ServletException {}  
      
	public void doFilter(ServletRequest req, ServletResponse resp,  
        FilterChain chain) throws IOException, ServletException {  
          
		String ls;

		//get session and request dispatcher
		HttpSession hs=null;
  		RequestDispatcher rd=req.getRequestDispatcher("error403.html");

		//get session and session variable
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		hs=request.getSession(true);

		ls=(String)hs.getAttribute("LOGGEDIN");

		if (ls==null){

			//redirect to error page
			rd.forward(req, resp);
			response.sendError(HttpServletResponse.SC_FORBIDDEN);

		}else{
			if (!ls.equals("YES")){

				//redirect to error page
				rd.forward(req, resp);
				response.sendError(HttpServletResponse.SC_FORBIDDEN);

			}
		}

       //sends request to next resource  
 		chain.doFilter(req, resp);

	}  

    public void destroy() {}  
}  