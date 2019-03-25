package association;

public class Department {
    private  String dptName;
    private String bNumber;

    public Department(String dptName, String bNumber) {
        this.dptName = dptName;
        this.bNumber = bNumber;
    }

    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName;
    }

    public String getbNumber() {
        return bNumber;
    }

    public void setbNumber(String bNumber) {
        this.bNumber = bNumber;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dptName='" + dptName + '\'' +
                ", bNumber='" + bNumber + '\'' +
                '}';
    }
}
