package Entities;

import java.time.LocalDate;

public class Student extends User {
    public Student(String userName, Role role, String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        super(userName, role, firstName, lastName, dateOfBirth, address);
    }
}
