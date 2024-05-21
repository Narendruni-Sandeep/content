package com.nkxgen.servlets;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
public class SimpleServlet extends HttpServlet {
  protected void doGet( HttpServletRequest request, HttpServletResponse 	response) throws ServletException, IOException {
       doPost(request, response); 
  } 
  protected void doPost( HttpServletRequest request, HttpServletResponse   	response) throws ServletException, IOException { 
		//write some out to client
		response.getWriter().write("<HTML>");
		response.getWriter().write("Welcome to Servlets"); 
		response.getWriter().write("</HTML>");  
  } 
}
