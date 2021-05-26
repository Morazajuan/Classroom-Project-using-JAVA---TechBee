
import java.util.ArrayList;

public class StudentsDAO {

	ArrayList<JavaSDETStudent> JAVASDETclassRoom = new ArrayList<>();
	
	StudentsDAO(){
		System.out.println("Welcome to JAVA SDET Class");
	}
	
	//CREATE New Student --> ADD
	public void addNewStudent() 
	{
		JavaSDETStudent newStudent = new JavaSDETStudent();
		
		StudentAPI student = new StudentAPI();
		student.addStudent(newStudent);
		
		JAVASDETclassRoom.add(newStudent);
	}
	
	//READ Students
	public void displayStudents() 
	{
		for(JavaSDETStudent arrayItem : JAVASDETclassRoom) {
			System.out.println("*************************************");
			System.out.println("Student Name: " + arrayItem.getName());
			System.out.println("Student LastName: " + arrayItem.getLastname());
			System.out.println("Student Email Address: " + arrayItem.getEmail());
			System.out.println("Student Phone Number: " + arrayItem.getPhoneNumber());
			System.out.println("*************************************");
			System.out.println();
		}
	}
	
	public void displayStudents(String name) 
	{
		for(JavaSDETStudent arrayItem : JAVASDETclassRoom) {
			if (arrayItem.getName() == name)
			{
				System.out.println("Arraylist Item - " + arrayItem.getName());
			}
		}
	}
	
	//UPDATE Students
	
	//DELETE Students
}