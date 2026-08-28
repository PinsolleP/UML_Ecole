package Entities;

public class Session {
    private User currentUser;

    public void authenticate(String userName, String password){
        currentUser = School.instance.tryLogin(userName, password);
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
}
