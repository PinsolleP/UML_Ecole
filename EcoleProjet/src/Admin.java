import java.time.LocalDate;
import java.util.ArrayList;

public class Admin extends User{
    public Admin(String userName, String password, Role role, String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        super(userName, password, role, firstName, lastName, dateOfBirth, address);
    }
}
