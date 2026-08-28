package Entities;

import java.util.ArrayList;
import java.util.List;

public class School {
    public static School instance;
    Admin admin;
    Director director;
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;
    ArrayList<Course> courses;

    /*
        Constructor
     */
    public School(Admin admin) {
        this.admin = admin;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
        instance = this;
    }

    /*
        Public Method
     */
    public User tryLogin(String username, String password){
        ArrayList<User> allUser = getAllUser();
        for(User user: allUser){
            if (user.userName.equals(username) && user.password.equals(password)){
                System.out.println("Compte trouvé");
                return user;
            }
        }
        System.out.println("Compte introuvable");
        return null;
    }

    public ArrayList<User> getAllUser(){
        ArrayList<User> listUsers = new ArrayList<User>();
        listUsers.addAll(students);
        listUsers.addAll(teachers);
        if(admin != null) {
            listUsers.add(admin);
        }
        if(director != null) {
            listUsers.add(director);
        }
        return listUsers;
    }


    /*
        Getter et setter
     */
    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
