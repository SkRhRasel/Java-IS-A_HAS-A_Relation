package association;

public class Address {
    private String zipcode;
    private String village;

    public Address(String zipcode, String village) {
        this.zipcode = zipcode;
        this.village = village;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipcode='" + zipcode + '\'' +
                ", village='" + village + '\'' +
                '}';
    }
}
