package com.nkxgen.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class AddToCartServlet extends HttpServlet{

   public void doGet(HttpServletRequest rq,HttpServletResponse rs) throws ServletException,IOException{

	HttpSession hs=null;
	ArrayList<String> cart=null;
	PrintWriter pw=null;
	String pn;
	try{

	 //capture the product submitted to the cart
	 pn=rq.getParameter("product");

	 //get the pointer of session
	 hs=rq.getSession(true);

	 //get the pointer of cart
	 cart=(ArrayList)hs.getAttribute("scart");
	 
	 if (cart==null){
		//if it is first time create it
		cart=new ArrayList<String>();
 	 }

	 //add the selected product to the cart
    cart.add(pn);

	 //overwrite the cart on session varable
	 hs.setAttribute("scart",cart);

	 pw=rs.getWriter();

	 pw.write("<h2>Product has been added to the cart</h2>");

	 }catch(Exception ex){

	 }

   }
}




