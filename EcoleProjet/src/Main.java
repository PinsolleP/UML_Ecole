import Entities.Admin;
import Entities.School;
import Entities.Session;
import Entities.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("admin", "admin", "admin", "admin", null, null);
        new School(admin);
        Session session = new Session();
        boolean sessionIsOn = true;
        while (sessionIsOn) {
            System.out.println("Que souhaitez vous faire ?");
            choice(scanner, session);
        }
        scanner.close();
    }

    public static void choice(Scanner scanner, Session session){
        User user = session.getCurrentUser();
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
        int choice = scanner.nextInt();
        // traitement resultat
        if(user == null) {
            switch (choice) {
                case 1:
                    session.authenticate(scanner);
                    break;
                default:
                    System.out.println("Choix invalide");
                    break;
            }
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
    }
}
