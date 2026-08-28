package Entities;

import java.time.LocalDate;
import java.util.Random;

public class Teacher extends User {
    /*
        Constructor
     */
    public Teacher(String userName, String firstName, String lastName, LocalDate dateOfBirth, Address address, Random random) {
        super(userName, Role.TEACHER, firstName, lastName, dateOfBirth, address, random);
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
