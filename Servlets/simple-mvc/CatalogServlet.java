package com.nkxgen.mvc;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;
public class CatalogServlet extends HttpServlet {

  protected void doGet( HttpServletRequest request, HttpServletResponse   	response) throws ServletException, IOException { 

		RequestDispatcher rd=null;

	try{ 


		//call dAL
		ProductDAL pdal=new ProductDAL();
		
		//get Products list
		List<Product> pl=pdal.getAllProducts();

		//set the plist to the request
		request.setAttribute("prods",pl);

		//get the request dispatcher pointer
		rd=request.getRequestDispatcher("/catalog.jsp");
	
		rd.forward(request,response);
		

	}catch(Exception ex){
		System.out.println(ex.getMessage()); 
	}

  } 
}
