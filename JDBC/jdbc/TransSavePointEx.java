import java.sql.*;
public class TransSavePointEx { 
  public static void main(String args[]) {
	Connection conn=null;
	Statement st=null;
	Savepoint sp;
	String cs;

    try{

	//register the driver   
	Class.forName("org.postgresql.Driver");       
		
	//connect to the database    
	cs = "jdbc:postgresql://localhost:5433/postgres?user=postgres&password=abc1234$";
	conn = DriverManager.getConnection(cs);

	//switch off auto commit feature 
	conn.setAutoCommit(false);        

	//create statement
	st=conn.createStatement();       
	int nr1=st.executeUpdate("update emp set sal=sal+3000 where empno="+args[0]);
	System.out.println("No of records updated "+nr1);

	sp=conn.setSavepoint("sp1");
	int nr2=st.executeUpdate("update emp set sal=sal+2000 where empno="+args[1]);	
	System.out.println("No of records updated "+nr2);		

	//rollback till savepoint
	conn.rollback(sp);
	System.out.println("Last statement has been rolledback :"+nr2+" no of updations are reversed");
	
	//commit the transaction
	conn.commit();

	//close the connection
	conn.close();

	}catch(Exception ex){
		System.out.println(ex.getMessage());
	}
  }    
}
