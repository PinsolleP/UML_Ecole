package Entities;

import java.time.LocalDate;

public class Director extends User {
    /*
        Constructor
     */
    public Director(String userName, String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        super(userName, Role.DIRECTOR, firstName, lastName, dateOfBirth, address);
    }

    /*
        Public Method
     */
    /**
     * Authorize return true if as permission return false if not
     * @param nameAuthorization
     * @return
     */
    @Override
    public boolean authorize(Permission nameAuthorization) {
        switch (nameAuthorization){
            default:
                return false;
        }
    }
}
