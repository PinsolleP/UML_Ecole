package Entities;

import java.util.Scanner;

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

    public Address(Scanner scanner){
        String inputStreet;
        String inputCity;
        String inputPostCode;

        System.out.println("Entrez le nom de la rue");
        do {
            inputStreet = scanner.nextLine();
        } while (inputStreet.isEmpty());
        this.street = inputStreet;

        System.out.println("Entrez le nom de la ville");
        do {
            inputCity = scanner.nextLine();
        } while (inputCity.isEmpty());
        this.city = inputCity;

        System.out.println("Entrez le code postale");
        do{
            inputPostCode = scanner.nextLine();
        } while (inputPostCode.isEmpty());
        this.postCode = inputPostCode;

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
