package HasARelationAssociation;

import java.util.ArrayList;

public class Student {
    private String  studentName;
    private String  studentID;
    private int  studentAge;
    private Address  studentAddress;
    private Department studentDepartment;
    private ArrayList<Course>courses;

    public Student(String studentName, String studentID, int studentAge) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentAge = studentAge;
    }

    public Student() {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Department getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(Department studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID='" + studentID + '\'' +
                ", studentAge=" + studentAge +
                ", studentAddress=" + studentAddress +
                ", studentDepartment=" + studentDepartment +
                ", courses=" + courses +
                '}';
    }


}

