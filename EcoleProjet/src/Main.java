import Entities.Admin;
import Entities.School;
import Entities.Session;
import Entities.User;
import utils.Input;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("admin", "admin", "admin", "admin", null, null);
        new School(admin);
        Session session = new Session();
        boolean sessionIsOn = true;
        while (sessionIsOn) {
            sessionIsOn = choice(scanner, session, random);
        }
        scanner.close();
    }

    public static boolean choice(Scanner scanner, Session session, Random random){
        User user = session.getCurrentUser();
        // Affichage des choix
        System.out.println("Que souhaitez vous faire ?");
        System.out.println("q- Quitter le programme");
        if(user == null) {
            System.out.println("1- Authentification");
        }
        else {
            switch (user.getRole()) {
                case ADMIN:
                    System.out.println("1- Creer un nouveau Directeur");
                    System.out.println("2- Déconnection");
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
        Integer choice = Input.inputIntegerBetween(scanner, "Entrez votre choix",1, Integer.MAX_VALUE);
        if(choice == null){
            return false;
        }

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
                    switch (choice){
                        case 1:
                            session.createANewDirector(scanner, random);
                            break;
                        case 2:
                            System.out.println("Deconnection");
                            session.disconnect();
                            break;
                    }
                    break;
                case DIRECTOR:
                    break;
                case STUDENT:
                    break;
                case TEACHER:
                    break;
            }
        }
        return true;
    }
}
