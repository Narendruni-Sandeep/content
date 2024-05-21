import java.sql.*;
class BatchExecuteEx{
    public static void main(String args[]){
		Connection conn=null;
		PreparedStatement pstmt=null;
		String qry,cs;
		int nr;
	try{

		//register the driver   
	   Class.forName("org.postgresql.Driver");       
		
		//connect to the database    
		cs = "jdbc:postgresql://localhost:5433/postgres?user=postgres&password=abc1234$";
		conn = DriverManager.getConnection(cs);

		// Create SQL statement
		String SQL = "INSERT INTO Emp(empno, ename, job, sal,deptno) " + "VALUES(?, ?, ?, ?, ?)";

		// Create PrepareStatement object
		pstmt = conn.prepareStatement(SQL);

		//Set auto-commit to false
		conn.setAutoCommit(false);

		// Set the variables
		pstmt.setInt( 1, 7991 );
		pstmt.setString( 2, "Madhav" );
		pstmt.setString( 3, "Tester" );
		pstmt.setInt( 4, 3999 );
		pstmt.setInt( 5, 10 );

		// Add it to the batch
		pstmt.addBatch();

		// Set the variables
		pstmt.setInt( 1, 7992 );
		pstmt.setString( 2, "Latha" );
		pstmt.setString( 3, "admin" );
		pstmt.setInt( 4, 2999 );
		pstmt.setInt( 5, 20 );

		// Add it to the batch
		pstmt.addBatch();

		//Create an int[] to hold returned values
		int[] count = pstmt.executeBatch();

		//Explicitly commit statements to apply changes
		conn.commit();


       System.out.println("No of records inserted "+count[0]);
	   
		//close the connection
		conn.close();

	}catch(ClassNotFoundException ex){
		System.out.println("Invalid Driver"); 
	}catch(SQLException sqex){
		System.out.println(sqex.getMessage());
    }
  }
}
