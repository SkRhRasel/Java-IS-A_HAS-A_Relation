package association;

import java.util.ArrayList;

public class Student {
   private String stuName;
   private String stId;
   private Address address;
   private Department department;
   private ArrayList<Course> courses;

    public Student(String stuName, String stId) {
        this.stuName = stuName;
        this.stId = stId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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
                "stuName='" + stuName + '\'' +
                ", stId='" + stId + '\'' +
                ", address=" + address +
                ", department=" + department +
                ", courses=" + courses +
                '}';
    }
}
