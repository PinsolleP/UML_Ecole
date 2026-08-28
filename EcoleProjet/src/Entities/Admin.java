package Entities;

import java.time.LocalDate;

public class Admin extends User {
    public Admin(String userName, String password, String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        super(userName, password, Role.ADMIN, firstName, lastName, dateOfBirth, address);
    }

    @Override
    public boolean authorize(Permission nameAuthorization) {
        switch (nameAuthorization){
            case CREATE_A_DIRECTOR:
                return true;
            default:
                return false;
        }
    }
}
