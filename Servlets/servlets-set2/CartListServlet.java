package com.nkxgen.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class CartListServlet extends HttpServlet{

   public void doGet(HttpServletRequest rq,HttpServletResponse rs) throws ServletException,IOException{

	HttpSession hs=null;
	ArrayList<String> cart=null;
	PrintWriter pw=null;
	String pn;
	try{

	 //get the pointer of session
	 hs=rq.getSession(true);

	 //get the pointer of cart
	 cart=(ArrayList)hs.getAttribute("scart");
	 
	 pw=rs.getWriter();

     pw.write("<H1> My Cart</H1>");
	 //check if anything in the cart
	 if (cart==null){
		 pw.write("<H2> Cart is empty</H2>");

 	 }else{

		//iterate the cart items
		for(String p:cart){
			pw.write("<h4>"+p+"</h4></br>");
		}

	 }


	 }catch(Exception ex){

	 }

   }
}




