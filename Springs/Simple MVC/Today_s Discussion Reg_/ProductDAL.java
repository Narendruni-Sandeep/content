package com.nkxgen.mvc;
import java.sql.*;
import java.util.*;
public class ProductDAL{

	public List<Product> getAllProducts(){

		String pname,pfile;
		int pno,stk;
		double price;

		Connection conn=null;
		Statement st=null;
		ResultSet rst=null;
		String qry,cs,ls;

		ArrayList<Product> plist=null;

	try{ 

		//register the driver   
	        Class.forName("org.postgresql.Driver");       
		
		//connect to the database    
		cs = "jdbc:postgresql://localhost:5433/postgres?user=postgres&password=abc1234$";
		conn = DriverManager.getConnection(cs);
           
		//create prepared statement
	   qry="select * from products";
           st = conn.createStatement();
	   
	   rst=st.executeQuery(qry);

		//create the empty list	
		plist=new ArrayList<Product>();

	   //read all products
		while (rst.next()){
			
			//read each record
			pno=rst.getInt("prod_id");
			pname=rst.getString("pname");
			price=rst.getDouble("price");
			stk=rst.getInt("stock");
			pfile=rst.getString("pfile");

			//create product and add to the list
			Product p=new Product();
			p.setProductNo(pno);
			p.setProductName(pname);
			p.setPrice(price);
			p.setStock(stk);
			p.setPFile(pfile);

			//add prod to lst
			plist.add(p);


		}
 	
		rst.close();
	   conn.close();

	}catch(ClassNotFoundException cex){
		System.out.println(cex.getMessage()); 
	}catch(SQLException sqex){
		System.out.println(sqex.getMessage()); 
	}

	return plist;
  }
}