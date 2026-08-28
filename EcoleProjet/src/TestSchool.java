import Entities.Admin;
import Entities.Role;
import Entities.School;

public class TestSchool {
    public static void main(String[] args) {
        Admin admin = new Admin("admin", "test", Role.ADMIN, "Entities.Admin", "Entities.Admin", null, null);
        School school = new School(admin);
    }
}
