package HasARelationAssociation;

public class Department {
    private String deptName;
    private String deptBuilding;

    public Department(String deptName, String deptBuilding) {
        this.deptName = deptName;
        this.deptBuilding = deptBuilding;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptBuilding() {
        return deptBuilding;
    }

    public void setDeptBuilding(String deptBuilding) {
        this.deptBuilding = deptBuilding;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", deptBuilding='" + deptBuilding + '\'' +
                '}';
    }
}
