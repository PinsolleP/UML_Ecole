import Entities.Admin;
import Entities.School;
import Entities.Session;
import Entities.User;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("admin", "admin", "admin", "admin", null, null);
        School school = new School(admin);
        Session session = new Session();
        System.out.println("Que souhaitez vous faire ?");
        choice(session.getCurrentUser());
    }

    public static void choice(User user){
        // Affichage des choix
        if(user == null) {
            System.out.println("1- Authentification");
        }
        else {
            switch (user.getRole()) {
                case ADMIN:
                    System.out.println("1- Creer un nouveau Directeur");
                    break;
                case DIRECTOR:
                    System.out.println("...");
                    break;
                case STUDENT:
                    System.out.println("1- Voir mes cours");
                    break;
                case TEACHER:
                    System.out.println("1- Voir mes éleves");
                    break;
            }
        }

        // input

        // traitement resultat
    }
}
