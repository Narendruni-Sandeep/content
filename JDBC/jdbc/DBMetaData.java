import java.sql.*;
public class DBMetaData{
public static void main(String a[]){
       Connection conn=null;
		Statement st=null;
		String q,cs;
	try{
		//register the driver   
	   Class.forName("org.postgresql.Driver");       
		
		//connect to the database    
		cs = "jdbc:postgresql://localhost:5433/postgres?user=postgres&password=abc1234$";
		conn = DriverManager.getConnection(cs);

		DatabaseMetaData dm=conn.getMetaData();
		System.out.println("DATABASE NAME:"+dm.getDatabaseProductName());
		System.out.println("DATABASE VERSION:"+dm.getDatabaseProductVersion());
		System.out.println("DRIVER NAME:"+dm.getDriverName());
		System.out.println("DRIVER VERSION:"+dm.getDriverVersion());
		conn.close();

	}catch(Exception ex){
		System.out.println(ex.getMessage());
	}
  }
}
