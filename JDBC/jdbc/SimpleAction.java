import java.sql.*;
class SimpleAction{
     public static void main(String args[]){
		Connection conn=null;
		Statement st=null;
		String qry,eno,enm,job,cs;
		ResultSet rst;
	
	try{ 
		//register the driver   
	   Class.forName("org.postgresql.Driver");       
		
		//connect to the database    
		cs = "jdbc:postgresql://localhost:5433/postgres?user=postgres&password=abc1234$";
		conn = DriverManager.getConnection(cs);

		//create SQL action statement
       st = conn.createStatement();
       qry="select * from emp";
       
		//execute Query
		rst=st.executeQuery(qry);

		//iterate through resultset
	   while(rst.next()){
			eno=rst.getString(1);
			enm=rst.getString("ename");
			job=rst.getString("job");
			System.out.println(eno + " :: "+ enm +" :: "+job);
	   }

		//close the resultset and connection
	   rst.close();
	   conn.close();

	}
       catch(Exception ex){
		System.out.println("Failed to connect to db or process statement"); 
	}
  }
}
