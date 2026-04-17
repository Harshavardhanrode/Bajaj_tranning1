public class Address {
    private String buildingNo;
    private String area;
    private String city;
    private String state;

    public Address(){
        this.buildingNo = "";
        this.area = "";
        this.city = "";
        this.state = "";
    }

    public Address(String buildingNo, String area, String city, String state) {

        this.buildingNo = buildingNo;
        this.area = area;
        this.city = city;
        this.state = state;
    }
}
