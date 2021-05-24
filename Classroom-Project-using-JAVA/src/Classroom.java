import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {


//    private Student[] studentArr = new Student[10];

    private ArrayList <Student> studentArr = new ArrayList<Student>();
    private int count = 0;
    Scanner scanner = new Scanner(System.in);

    private String classroomName = "";

    Classroom(){

        setClassroomName();

    }
    public void setClassroomName (){
        System.out.print("Enter the name of this classroom: ");
        String str = scanner.nextLine();
        classroomName  = str;
    }
    public void addStudent(){
        if(count <10){

            studentArr.add(new Student());
            count++;
            System.out.println("Class size: " + count);

        }else{
            System.out.print("Class room is full");
        }
    }

    public void printStudents(){
        System.out.println(classroomName +" Class members: "  );
        System.out.println("Size: "+studentArr.size());

        int count = 1;
        for(Student s : studentArr){


                System.out.println(count+": " + s.getName());
                count++;
        }
    }


    public void removeStudent(){

        System.out.print("Enter index of student to be REMOVED: ");
        String str = scanner.nextLine();

        if(Integer.parseInt(str) <= studentArr.size() && Integer.parseInt(str)  > 0){
            try {

                studentArr.remove(Integer.parseInt(str)-1);
                System.out.print("Student " + str + " was successfully removed!");

            }catch (NumberFormatException  e){
                System.out.print("Student was not able to removed ");

                System.out.print(e);
            }}
        else{
            System.out.println("Out of bounds");
        }
    }

    public void updateStudent(){
        System.out.print("Enter index of student to be UPDATED: ");
        String str = scanner.nextLine();
        if(Integer.parseInt(str) <= studentArr.size() && Integer.parseInt(str)  > 0){
            try {

                studentArr.remove(Integer.parseInt(str)-1);
                System.out.print("Enter new data for student:");

                addStudent();
                System.out.print("Student " + str + " was successfully updated!");

            }catch (NumberFormatException  e){
                System.out.print("Student was not able to removed ");

                System.out.print(e);
            }}
        else{
            System.out.println("Out of bounds");
        }
    }

}
