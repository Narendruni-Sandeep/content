import java.sql.*;
class InvokeProcedure{
     public static void main(String args[]){
		Connection conn=null;
		CallableStatement cst=null;
		String cs;
	try{ 
		//register the driver   
	   Class.forName("org.postgresql.Driver");       
		
		//connect to the database    
		cs = "jdbc:postgresql://localhost:5433/postgres?user=postgres&password=abc1234$";
		conn = DriverManager.getConnection(cs);

       cst=conn.prepareCall("{CALL newdept(?,?,?)}");
	   
		//pass the arguments
	   cst.setInt(1,80);
	   cst.setString(2,"SUPPORT");
	   cst.setString(3,"HYD");
	   
		//execute 
		cst.execute();
	   System.out.println("New Record has been inserted");
	
		//close the conne
	   conn.close();
	}catch(ClassNotFoundException cex){
		System.out.println(cex.getMessage()); 
	}catch(SQLException sqex){
		System.out.println(sqex.getMessage()); 
	}
    }
}
