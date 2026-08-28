package Entities;

import java.time.LocalDate;

public class Student extends User {
    public Student(String userName, String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        super(userName, Role.STUDENT, firstName, lastName, dateOfBirth, address);
    }

    @Override
    public boolean authorize(Permission nameAuthorization) {
        switch (nameAuthorization){
            default:
                return false;
        }
    }
}
