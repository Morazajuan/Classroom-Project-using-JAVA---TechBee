//Create Student class with the following attributes
//   - Name , lastname, PhoneNumber, SSN, GPA, StudentID(Every Student Should have unique ID), Email Address
//   - Use Encapsulation to restrict user from entering invalid data for each attribute

public class Student {
    private String name = "unnamed";



    private String lastname = "unnamed";
    private String phoneNumber = "0123456789";
    private int SSN = 123456789;
    private double GPA = 0.0;
    private int studentID = 123456789;
    private String email = "a@b.com";

    //Setters
    public void setName(String name) {

        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setEmail(String email) {
        this.email = email;
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
