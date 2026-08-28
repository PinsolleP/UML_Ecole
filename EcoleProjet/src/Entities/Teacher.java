package Entities;

import java.time.LocalDate;

public class Teacher extends User {
    public Teacher(String userName, String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        super(userName, Role.TEACHER, firstName, lastName, dateOfBirth, address);
    }

    @Override
    public boolean authorize(Permission nameAuthorization) {
        switch (nameAuthorization){
            default:
                return false;
        }
    }
}
