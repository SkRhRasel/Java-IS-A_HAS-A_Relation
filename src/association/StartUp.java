package association;

import java.util.ArrayList;

public class StartUp {

    public static void main(String[] args) {
        Student s= new Student("Himel","005");
        ArrayList<Course>courses = new ArrayList<>();

        Address address = new Address("1216","mirpur 01");
        s.setAddress(address);
        //System.out.println(s.toString());

        Department department = new Department("CSE","1001");

        s.setDepartment(department);

        Course course1 = new Course("101","Java");
        Course course2 = new Course("102","C++");
        Course course3 = new Course("103","C");
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        s.setCourses(courses);

        System.out.println(s.toString());

    }
}
