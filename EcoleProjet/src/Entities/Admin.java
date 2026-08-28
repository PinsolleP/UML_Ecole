package Entities;

import java.time.LocalDate;

public class Admin extends User {
    // =========================
    // CONSTRUCTEURS
    // =========================

    /**
     * @param userName
     * @param password
     * @param firstName
     * @param lastName
     * @param dateOfBirth
     * @param address
     */
    public Admin(String userName, String password, String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        super(userName, password, Role.ADMIN, firstName, lastName, dateOfBirth, address);
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
            case CREATE_A_DIRECTOR:
                return true;
            default:
                return false;
        }
    }
}
