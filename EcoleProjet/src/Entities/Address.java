package Entities;

public class Address {
    private final String street;
    private final String city;
    private final String postCode;

    /*
        Constructor
     */
    public Address(String street, String city, String postCode) {
        this.street = street;
        this.city = city;
        this.postCode = postCode;
    }

    /*
        ToString
     */
    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
