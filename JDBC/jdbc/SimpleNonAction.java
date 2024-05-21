import java.sql.*;
class SimpleNonAction{
    public static void main(String args[]){
		Connection conn=null;
		Statement st=null;
		String qry,cs;
		int nr;
	try{

		//register the driver   
	   Class.forName("org.postgresql.Driver");       
		
		//connect to the database    
		cs = "jdbc:postgresql://localhost:5433/postgres?user=postgres&password=abc1234$";
		conn = DriverManager.getConnection(cs);

		//create SQL non action statement
       st = conn.createStatement();
       qry="insert into dept values(51,'IT','VIZAG')";
       nr=st.executeUpdate(qry);

       System.out.println("No of records inserted "+nr);
	   
		//close the connection
		conn.close();
	}catch(ClassNotFoundException ex){
		System.out.println("Invalid Driver"); 
	}catch(SQLException sqex){
		System.out.println(sqex.getMessage());
    }
  }
}
