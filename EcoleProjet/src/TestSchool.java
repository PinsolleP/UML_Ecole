import java.time.LocalDate;

public class TestSchool {
    public static void main(String[] args) {
        Admin admin = new Admin("admin", "test", Role.ADMIN, "Admin", "Admin", null, null);
        School school = new School(admin);
    }
}
