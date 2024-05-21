import java.sql.*;
class ScrollableUpdatable{
     public static void main(String args[]){
		Connection conn=null;
		Statement st=null;
		String qry,qr2,qr3,cs;
		ResultSet rst;

	try{ 
		//register the driver   
	    Class.forName("org.postgresql.Driver");       
		
		//connect to the database    
		cs = "jdbc:postgresql://localhost:5433/postgres?user=postgres&password=abc1234$";
		conn = DriverManager.getConnection(cs);
           
		st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        qry="select deptno,dname,loc from dept";
        rst=st.executeQuery(qry);
	   
		rst.next();
	   
		//insert a new row
	    rst.moveToInsertRow();
	    rst.updateInt("deptno",60);
	    rst.updateString("dname","TechSupport");
	    rst.updateString("loc","AMARAVATI");
	    rst.insertRow();
	    System.out.println("New Record has been inserted");
	   
		//update a row
	    rst.absolute(4);
	    rst.updateString("loc","CHENNAI");
	    rst.updateRow();
	    System.out.println("Record has been Updated");
		
		//delete a row
	    rst.absolute(5);
	    rst.deleteRow();
	    System.out.println("Record has been deleted");
	    
		rst.close();
	    conn.close();
	}catch(ClassNotFoundException cex){
		System.out.println(cex.getMessage()); 
	}catch(SQLException sqex){
		System.out.println(sqex.getMessage()); 
	}
    }
}