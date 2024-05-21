package com.nkxgen.servlets;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
public class StoreServlet extends HttpServlet {

  protected void doGet( HttpServletRequest request, HttpServletResponse   	response) throws ServletException, IOException { 


		String pname,pfile;
		int pno,stk;
		double price;

		Connection conn=null;
		Statement st=null;
		ResultSet rst=null;
		String qry,cs,ls;
		int nr;
		PrintWriter pw=null;

		HttpSession hs=null;
  		RequestDispatcher rd=null;

	try{ 

		//get request dispatcher pointer for login
       rd=request.getRequestDispatcher("/login.html");  

		//get session and session variable
		hs=request.getSession(true);
		ls=(String)hs.getAttribute("LOGGEDIN");
		if (ls==null)
			rd.include(request, response);
		else{
			if (!ls.equals("YES"))
				rd.include(request, response);
		}

		//register the driver   
	   Class.forName("org.postgresql.Driver");       
		
		//connect to the database    
		cs = "jdbc:postgresql://localhost:5433/postgres?user=postgres&password=abc1234$";
		conn = DriverManager.getConnection(cs);
           
		//create prepared statement
	   qry="select * from products";
       st = conn.createStatement();
	   
	   rst=st.executeQuery(qry);

		//get the Print Writer
		pw=response.getWriter();
	   
		//create table header
		pw.write("<HTML>");
	   pw.write("<h2> List of Products</h2>");
	   pw.write("<a href=http://localhost:8080/cartlst> Cart List</a>"); 
   		pw.write("<table border=1><tr><th>Product No</th><th>Product Name</th><th>Price</th><th>Stock</th><th>Logo</th></tr>"); 

	   //read all products
		while (rst.next()){
			
			//read each record
			pno=rst.getInt("prod_id");
			pname=rst.getString("pname");
			price=rst.getDouble("price");
			stk=rst.getInt("stock");
			pfile=rst.getString("pfile");

			//print the records
			pw.write("<form action=http://localhost:8080/addtocart><tr>");
   			pw.write("<td>"+pno+"</td>");
			pw.write("<td>"+pname+"</td>");
			pw.write("<td>"+price+"</td>");
			pw.write("<td>"+stk+ "</td>");
			pw.write("<td><img src='"+pfile+"' ></img></td>");
			pw.write("<td><input type=hidden name=product value="+pname+"/></td>");
			pw.write("<td><input type=submit name=baddcart value='Add to Cart' ></td>");
			pw.write("</tr></form>");
		}
		//close the table
	    pw.write("</table>"); 
 
	   conn.close();

	}catch(ClassNotFoundException cex){
		System.out.println(cex.getMessage()); 
	}catch(SQLException sqex){
		System.out.println(sqex.getMessage()); 
	}finally{

		response.getWriter().write("</HTML>");  
	}

  } 
}
