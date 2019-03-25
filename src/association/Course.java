package association;

public class Course {

    private String numberofC;
    private String name;

    public Course(String numberofC, String name) {
        this.numberofC = numberofC;
        this.name = name;
    }

    public String getNumberofC() {
        return numberofC;
    }

    public void setNumberofC(String numberofC) {
        this.numberofC = numberofC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "numberofC='" + numberofC + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
