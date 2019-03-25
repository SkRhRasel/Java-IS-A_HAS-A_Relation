package HasARelationAssociation;

public class Address {
    private  String houseNo;
    private  String roadNo;
    private  String city;
    private  String zipCode;
    private  String phoneNo;
    private  String emailAddress;

    public Address(String houseNo, String roadNo, String city, String zipCode, String phoneNo, String emailAddress) {
        this.houseNo = houseNo;
        this.roadNo = roadNo;
        this.city = city;
        this.zipCode = zipCode;
        this.phoneNo = phoneNo;
        this.emailAddress = emailAddress;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getRoadNo() {
        return roadNo;
    }

    public void setRoadNo(String roadNo) {
        this.roadNo = roadNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", roadNo='" + roadNo + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
