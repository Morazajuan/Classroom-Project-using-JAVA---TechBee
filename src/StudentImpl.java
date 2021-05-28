import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentImpl {
	 
	private void sendSQL(String sql, String option) {

	     // TODO Auto-generated method stub
		    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		    final String DB_URL = "jdbc:mysql://studentdb.cybgruj8w4kc.us-east-1.rds.amazonaws.com:3306/studentDB";
		    final String USER = "juan";
		    final String PASS = "IAMsecure";
		    
		    Connection conn = null;
		    if(option.equals("add")) {
		    	try {
			    	Class.forName("com.mysql.jdbc.Driver");
			    	System.out.println("Connecting to database...");
			    	
					conn = DriverManager.getConnection(DB_URL,USER,PASS);
					
 				      Statement stmt = conn.createStatement();
 				     System.out.println("running sql query to add student...");

				      stmt.executeUpdate(sql);
 					
				} catch (SQLException | ClassNotFoundException e) {
					e.printStackTrace();
				}
		    }else if(option.equals("show")) {
		    	
		    	try {
			    	Class.forName("com.mysql.jdbc.Driver");
			    	System.out.println("Connecting to database...");
			    	
					conn = DriverManager.getConnection(DB_URL,USER,PASS);
					
					 Statement stmt = conn.createStatement();
			         ResultSet rs = stmt.executeQuery("SELECT * FROM studentDB.testTable");

			         System.out.println("ID		Name		Lastname		Email");
			         while (rs.next()) {
			            int id = rs.getInt("studentID");
			            String name = rs.getString("firstName");
			            String lastname = rs.getString("lastName");
			            String email = rs.getString("email");
			            
			            System.out.println (id+"		"+name+"		"+lastname+"			"+email	);
			   
			         }
					
				} catch (SQLException | ClassNotFoundException e) {
					e.printStackTrace();
				}
		    }else if(option.equals("update") || option.equals("remove")) {
		    	try {
			    	Class.forName("com.mysql.jdbc.Driver");
			    	
			    	System.out.println("Ruaning sql: "+ sql);
			    	
					conn = DriverManager.getConnection(DB_URL,USER,PASS);
					
					 
			         Statement stmt = conn.createStatement();
				     stmt.executeUpdate(sql);
					
				} catch (SQLException | ClassNotFoundException e) {
					e.printStackTrace();
				}
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
		sendSQL(sql, "add");
	}
	
	public void showStudents() {
		String sql = "";
		sendSQL(sql, "show");

	}

	public void updateStudent(int id, JavaSDETStudent newStudent) {

		String sql = "UPDATE testTable SET "
				+ "firstName = '"+newStudent.getName() 
				+"', lastName= '"+ newStudent.getLastname() 
				+"', email= '"+ newStudent.getEmail() 
				+"' WHERE studentID = "+ id +";";
		
		sendSQL( sql,"update");
	}

	public void removeStudent(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM testTable WHERE studentID="+id+";";
		System.out.println(sql);
		sendSQL(sql, "remove");
	}

}
