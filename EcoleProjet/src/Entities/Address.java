package Entities;

public class Address {
    // =========================
    // ATTRIBUTS
    // =========================
    private final String street;
    private final String city;
    private final String postCode;

    // =========================
    // CONSTRUCTEURS
    // =========================

    /**
     * @param street
     * @param city
     * @param postCode
     */
    public Address(String street, String city, String postCode) {
        this.street = street;
        this.city = city;
        this.postCode = postCode;
    }

    // =========================
    // TO_STRING
    // =========================
    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
