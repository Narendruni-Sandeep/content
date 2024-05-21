package com.nkxgen.servlets;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

//servlet class
public class EmpListServlet extends HttpServlet {

  protected void doGet( HttpServletRequest request, HttpServletResponse   	response) throws ServletException, IOException { 

		//variables to hold empmdata
		String ename,job;
		int eno;
	    double sal;

		Connection conn=null;
		Statement st=null;
		ResultSet rst=null;
		String qry,cs;
		PrintWriter pw=null;
	try{ 

		//register the driver   
	   Class.forName("org.postgresql.Driver");       
		
		//connect to the database    
		cs = "jdbc:postgresql://localhost:5433/postgres?user=postgres&password=abc1234$";
		conn = DriverManager.getConnection(cs);
           
		//create prepared statement
	   qry="select empno,ename,job,sal from emp";
       st = conn.createStatement();
	   
	   rst=st.executeQuery(qry);

		//get the Print Writer
		pw=response.getWriter();
	   
		//create table header
		pw.write("<HTML>");
	   pw.write("<h2> List of Employees</h2>"); 
   		pw.write("<table border=1><tr><th>Empno</th><th>Emp Name</th><th>Job</th><th>Sal</th></tr>"); 

	   //read all employees
		while (rst.next()){
			
			//read each record
			eno=rst.getInt(1);
			ename=rst.getString(2);
			job=rst.getString(3);
			sal=rst.getDouble(4);

			//print the records
   			pw.write("<tr><td>"+eno+"</td><td>"+ename+"</td><td>"+job+"</td><td>"+sal+"</td></tr>"); 

		}
		//close the table
	    pw.write("</table>"); 

	   conn.close();

	}catch(ClassNotFoundException cex){
		pw.write(cex.getMessage()); 
	}catch(SQLException sqex){
		pw.write(sqex.getMessage()); 
	}finally{
		pw.write("</HTML>");  
	}

  } 
}
