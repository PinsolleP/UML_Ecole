package Entities;

import java.time.LocalDate;

public class Director extends User {
    public Director(String userName, Role role, String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        super(userName, role, firstName, lastName, dateOfBirth, address);
    }

    @Override
    public boolean authorize(Permission nameAuthorization) {
        switch (nameAuthorization){
            default:
                return false;
        }
    }
}
