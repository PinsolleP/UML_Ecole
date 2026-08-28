package Entities;

public interface UserInterface {
    /**
     * Authorize return true if as permission return false if not
     * @param nameAuthorization
     * @return
     */
    boolean authorize(Permission nameAuthorization);
}
