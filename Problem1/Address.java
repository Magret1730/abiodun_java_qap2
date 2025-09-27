package abiodun_java_qap2.Problem1;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
