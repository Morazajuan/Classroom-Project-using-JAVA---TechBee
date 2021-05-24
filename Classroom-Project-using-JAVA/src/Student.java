//Create Student class with the following attributes
//   - Name , lastname, PhoneNumber, SSN, GPA, StudentID(Every Student Should have unique ID), Email Address
//   - Use Encapsulation to restrict user from entering invalid data for each attribute

import java.util.Scanner;

public class Student {

    private String name = "unnamed";
    private String lastname = "unnamed";
    private String phoneNumber = "0123456789";
    private int SSN = 123456789;
    private double GPA = 0.0;
    private int studentID = 123456789;
    private String email = "a@b.com";
    Scanner scanner = new Scanner(System.in);


    private void Student (){
        setName();
        setLastname();
        setPhoneNumber();
        setSSN();
        setStudentID();
        setEmail();

    }
    //prints string enter

    //Setters
    public void setName() {

        System.out.print("Please enter Student Name: ");
        String str = scanner.nextLine();
        this.name = str;
    }

    public void setLastname() {
        System.out.print("\nPlease enter Student lastname: ");

        String str = scanner.nextLine();
        this.lastname = str;
    }

    public void setPhoneNumber( ) {
        System.out.print("\nPlease enter Student phone number: ");

        String str = scanner.nextLine();
        this.phoneNumber = phoneNumber;
    }

    public void setSSN() {
        System.out.print("\nPlease enter Student SSN: ");

        String str = scanner.nextLine();
        this.SSN = Integer.parseInt(str);
    }

    public void setGPA( ) {
        System.out.print("\nPlease enter Student GPA: ");

        String str = scanner.nextLine();
        this.GPA =  Double.parseDouble(str);
    }

    public void setStudentID(  ) {
        System.out.print("\nPlease enter Student ID: ");

        String str = scanner.nextLine();
        this.studentID = Integer.parseInt(str);
    }

    public void setEmail( ) {
        System.out.print("\nPlease enter Student email: ");

        String str = scanner.nextLine();
        this.email = str;
    }


    //Getters
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSSN() {
        return SSN;
    }

    public double getGPA() {
        return GPA;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getEmail() {
        return email;
    }
}
