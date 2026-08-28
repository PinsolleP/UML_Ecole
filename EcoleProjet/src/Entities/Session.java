package Entities;

import java.util.Locale;
import java.util.Scanner;

public class Session {
    private User currentUser;

    public void authenticate(String userName, String password){
        currentUser = School.instance.tryLogin(userName, password);
    }

    public void authenticate(Scanner scanner) {
        System.out.println("Entrez le pseudo");
        String pseudo = scanner.next();
        System.out.println("Entrez le mot de passe");
        String password = scanner.next();
        authenticate(pseudo, password);
    }

    public void createANewDirector(){
        if(currentUser == null){
            System.out.println("Vous devez être authentifié pour réaliser ceci");
            return;
        }
        if(currentUser.authorize(Permission.CREATE_A_DIRECTOR)){
            System.out.println("Creation d'un directeur");
        }
        else {
            System.out.println("Vous n'avez pas l'autorisation pour creer un directeur");
        }
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
