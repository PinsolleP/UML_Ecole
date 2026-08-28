package Entities;

import java.time.LocalDate;
import java.util.Random;

public abstract class User implements UserInterface {
    String userName;
    String password;
    Role role;
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    Address address;

    /*
        Constructor
     */
    public User(String userName, String password, Role role, String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public User(String userName, Role role, String firstName, String lastName, LocalDate dateOfBirth, Address address, Random random) {
        this.userName = userName;
        this.password = generateRandomPass(8, random);
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    /*
        Public Method
     */
    public String generateRandomPass(int numberOfCharacters, Random random){
        StringBuilder randomPass = new StringBuilder();
        for (int current = 0; current < numberOfCharacters; current++) {
            randomPass.append((char)('a'+random.nextInt(26)));
        }
        return randomPass.toString();
    }

    /*
        Getter and Setter
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Entities.User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                '}';
    }
}
