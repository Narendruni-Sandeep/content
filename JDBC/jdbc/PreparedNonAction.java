import java.sql.*;
class PreparedNonAction{
     public static void main(String args[]){
		Connection conn=null;
		PreparedStatement ps=null;
		String qry,cs;
		int nr;
	try{ 

		//register the driver   
	   Class.forName("org.postgresql.Driver");       
		
		//connect to the database    
		cs = "jdbc:postgresql://localhost:5433/postgres?user=postgres&password=abc1234$";
		conn = DriverManager.getConnection(cs);
           
		//create prepared statement
	   qry="insert into dept values(?,?,?)";
       ps = conn.prepareStatement(qry);
	   
		//pass the arguments
	   ps.setInt(1,70);
	   ps.setString(2,"PRESALES");
	   ps.setString(3,"BANGALORE");
	   nr=ps.executeUpdate();
	   System.out.println("New Record has been inserted");
	   
		conn.close();
	}catch(ClassNotFoundException cex){
		System.out.println(cex.getMessage()); 
	}catch(SQLException sqex){
		System.out.println(sqex.getMessage()); 
	}
  }
}
