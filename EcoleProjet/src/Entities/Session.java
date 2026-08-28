package Entities;

import utils.Input;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Session {
    private User currentUser;

    /*
        Constructor
     */
    public void authenticate(Scanner scanner) {
        System.out.println("Entrez le pseudo");
        String pseudo = scanner.next();
        System.out.println("Entrez le mot de passe");
        String password = scanner.next();
        authenticate(pseudo, password);
    }

    /*
        Public Method
    */

    /**
     * set the user if he can find to the username and password
     * @param userName
     * @param password
     */
    public void authenticate(String userName, String password){
        currentUser = School.instance.tryLogin(userName, password);
    }

    /**
     * Disconnect the current user of the session
     */
    public void disconnect(){
        currentUser = null;
    }

    /**
     * Create a new Director
     * @param scanner
     */
    public void createANewDirector(Scanner scanner, Random random){
        if(currentUser == null){
            System.out.println("Vous devez être authentifié pour réaliser ceci");
            return;
        }
        if(currentUser.authorize(Permission.CREATE_A_DIRECTOR)){
            if(School.instance.getDirector() == null) {
                System.out.println("Entrez le pseudo");
                boolean pseudoExist = true;
                String pseudo = "";
                while (pseudoExist){
                    pseudo = scanner.next();
                    if(School.instance.findUsername(pseudo)){
                        System.out.println("Ce pseudo existe déjà veuillez reesayer");
                    }
                    else{
                        pseudoExist = false;
                    }
                }
                System.out.println("Entrez le prénom");
                String firstName = scanner.next();
                System.out.println("Entrez le nom de famille");
                String lastName = scanner.next();
                Director director = new Director(pseudo, firstName, lastName, Input.inputDate(scanner,"Entrez la date de naissance"), null, random);
                School.instance.setDirector(director);
                System.out.println(director);
            }
            else {
                System.out.println("Impossible de créer un directeur il existe déjà");
            }
        }
        else {
            System.out.println("Vous n'avez pas l'autorisation pour creer un directeur");
        }
    }

    /*
        Getter
     */
    public User getCurrentUser() {
        return currentUser;
    }
}
