package Entities;

import java.time.LocalDate;

public class Teacher extends User {
    /*
        Constructor
     */
    public Teacher(String userName, String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        super(userName, Role.TEACHER, firstName, lastName, dateOfBirth, address);
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
