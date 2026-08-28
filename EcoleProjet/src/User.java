import java.time.LocalDate;

public abstract class User {
    String userName;
    String password;
    Role role;
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    Address address;
}
