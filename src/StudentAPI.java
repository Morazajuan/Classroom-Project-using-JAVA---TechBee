import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentAPI {
	 
	private void sendSQL(String sql) {

	     // TODO Auto-generated method stub
		    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		    final String DB_URL = "jdbc:mysql://studentdb.cybgruj8w4kc.us-east-1.rds.amazonaws.com:3306/studentDB";
		    final String USER = "juan";
		    final String PASS = "IAMsecure";
		    
		    Connection conn = null;
		    
		    try {
		    	Class.forName("com.mysql.jdbc.Driver");
		    	System.out.println("Connecting to database...");
		    	
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				
			      System.out.println("Creating table in given database...");
			      Statement stmt = conn.createStatement();
//			     
//			      String sql2 = "CREATE TABLE testTable " + 
//			                   "(studentID INTEGER not NULL, " +
//			                   " firstName VARCHAR(255), " + 
//			                   " lastName VARCHAR(255), " + 
//			                   " email VARCHAR(255);"; 		     		      
//	 
//			    String sql = "INSERT INTO `testTable` (`AccountID`,`firstName`,`lastName`,`age`) VALUES ( 3,'Juan','C',21);";

			      stmt.executeUpdate(sql);
			      System.out.println("Created table in given database...");
				
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
	}

	public void addStudent(JavaSDETStudent student) {
	      String sql = "INSERT INTO `testTable` (`studentID`,`firstName`,`lastName`,`email`) VALUES ( "
	      + student.getStudentID()
	      +",'"+student.getName() 
	      +"','"+student.getLastname() 
	      +"','"+student.getEmail() 
	      + "');";
	      
	      System.out.println("query:");
	      System.out.println(sql);
		sendSQL(sql);
	}

}
