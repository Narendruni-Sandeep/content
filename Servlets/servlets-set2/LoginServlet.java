package com.nkxgen.servlets;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
public class LoginServlet extends HttpServlet {

  protected void doPost( HttpServletRequest request, HttpServletResponse   	response) throws ServletException, IOException { 


		String username,gpwd,apwd;
		Connection conn=null;
		PreparedStatement ps=null;
		String qry,cs;
		ResultSet rst;
		PrintWriter pw=null;
		int nr;
		HttpSession hs=null;
  		RequestDispatcher rd=null;
	try{ 

		//get request dispatcher pointer for login
       rd=request.getRequestDispatcher("store"); 

		//read the inputs
		username =request.getParameter("username");
		gpwd =request.getParameter("pwd");

		//get the Print Writer
		pw=response.getWriter();

		//register the driver   
	   Class.forName("org.postgresql.Driver");       
		
		//connect to the database    
		cs = "jdbc:postgresql://localhost:5433/postgres?user=postgres&password=abc1234$";
		conn = DriverManager.getConnection(cs);
           
		//create prepared statement
	   qry="select pwd from users where username=?";
       ps = conn.prepareStatement(qry);
	   
		//pass the arguments
	   ps.setString(1,username);

	   rst=ps.executeQuery();
	   
		//get session
		hs=request.getSession(true);

		//write some out to client
		pw.write("<HTML>");

		if (rst.next()){	
			apwd=rst.getString("pwd");
			if (gpwd.equals(apwd)){
				hs.setAttribute("LOGGEDIN","YES");
				//pw.write("<h4>Congratulations "+username+"! Your Login is sucessfull</h4>");
				rd.include(request, response);  

			}else{
				hs.setAttribute("LOGGEDIN","NO");
 				pw.write("<h4>Sorry "+username+"! Your Password is wrong</h4>");
			}
		}else{
				hs.setAttribute("LOGGEDIN","NO");
				pw.write("<h4>Sorry "+username+"! Your Username is wrong</h4>");
		}

	   conn.close();

	}catch(ClassNotFoundException cex){
		System.out.println(cex.getMessage()); 
	}catch(SQLException sqex){
		System.out.println(sqex.getMessage()); 
	}finally{
		response.getWriter().write("</HTML>");  
	}

  } 
  protected void doGet( HttpServletRequest request, HttpServletResponse   	response) throws ServletException, IOException { 
			doPost(request,response);
	}

}
