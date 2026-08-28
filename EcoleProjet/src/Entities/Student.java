package Entities;

import java.time.LocalDate;
import java.util.Random;

public class Student extends User {
    // =========================
    // CONSTRUCTEURS
    // =========================
    public Student(String userName, String firstName, String lastName, LocalDate dateOfBirth, Address address, Random random) {
        super(userName, Role.STUDENT, firstName, lastName, dateOfBirth, address, random);
    }

    // =========================
    // METHODES PUBLIQUES
    // =========================
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
