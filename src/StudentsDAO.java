
import java.util.ArrayList;
import java.util.Scanner;

public class StudentsDAO {

	ArrayList<JavaSDETStudent> JAVASDETclassRoom = new ArrayList<>();
	private JavaSDETStudent newStudent;
	private StudentImpl student;
	StudentsDAO(){
		System.out.println("Welcome to JAVA SDET Class");
		student = new StudentImpl();
	}
	
	//CREATE New Student --> ADD
	public void addNewStudent() 
	{
		newStudent = new JavaSDETStudent();
		student.addStudent(newStudent);
		JAVASDETclassRoom.add(newStudent);
	}
	
	//READ Students
	public void displayStudents() 
	{
		student.showStudents();
	}

	
	//UPDATE Students
	public void updateStudent() {
		System.out.print("Type id of student to update: ");
		 Scanner scanner = new Scanner(System.in);
	        String str ="";
            str = scanner.nextLine();

    		newStudent = new JavaSDETStudent();

            student.updateStudent(Integer.parseInt(str),newStudent);
		
	}
	
	//DELETE Students
	public void removeStudent() {
		System.out.print("Type id of student to REMOVE: ");
		 Scanner scanner = new Scanner(System.in);
	        String str ="";
           str = scanner.nextLine();
        student.removeStudent(Integer.parseInt(str));

	}
	
}