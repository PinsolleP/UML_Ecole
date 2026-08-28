package Entities;

import java.time.LocalDate;

public class Director extends User {
    public Director(String userName, String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        super(userName, Role.DIRECTOR, firstName, lastName, dateOfBirth, address);
    }

    @Override
    public boolean authorize(Permission nameAuthorization) {
        switch (nameAuthorization){
            default:
                return false;
        }
    }
}
