import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


/*
1. Create a new repo in git for ClassRoom Project
2. Create Student class with the following attributes
   - Name , LastName, PhoneNumber, SSN, GPA, StudentID(Every Student Should have unique ID), Email Address
   - Use Encapsulation to restrict user from entering invalid data for each attribute
3. Create a UI class
   - Create object of Student class and ask user about adding data (Scanner Class) to test your program
   - Allow only 10 students in a class
4. Implement methods to AddNew Student, Remove Student, Update Student Information by Student ID, List All Students in Class
Bonus: Add error handling
5. Submit your project
* */
public class Main {
    public static void main(String[] args) {

	    
	    Scanner scanner = new Scanner(System.in);
        String str ="";
        
    	StudentsDAO thisClass = new StudentsDAO();

        do {
            System.out.print("***************\n" +
                    "Options:\n" +
                    "1: See students in classroom\n" +
                    "2: Add student\n" +
                    "3: remove student\n" +
                    "4: update Student\n"+
                    "e: exit program\n"+
                    "***************\n" );

            str = scanner.nextLine();
            if(str.equals("1")){//see students
        		thisClass.displayStudents();
            }else if(str.equals("2")){//add student
        		thisClass.addNewStudent();
            }else if(str.equals("3")){//remove students
            	thisClass.removeStudent();
            }else if(str.equals("4")){//update student
                thisClass.updateStudent();     
            }else if(str.equals("e")){//exit program
                System.out.print("exiting...");
            }else{
                System.out.print("Option not allowed.");
            }

        }while (!str.equals("e") );

    }
}
