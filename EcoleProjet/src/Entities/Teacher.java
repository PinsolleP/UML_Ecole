package Entities;

import java.time.LocalDate;
import java.util.Random;
import java.util.ArrayList;

/**
 * Représente un enseignant de l'école.
 * 
 * Un enseignant possède les informations communes à un utilisateur et peut être
 * affecté à plusieurs cours.
 */
public class Teacher extends User {
	private ArrayList<Course> courses;
    
    // =========================
    // CONSTRUCTEURS
    // =========================
	/**
	 * Construit un enseignant avec ses informations personnelles.
	 *
	 * @param userName    nom d'utilisateur
	 * @param firstName   prénom
	 * @param lastName    nom de famille
	 * @param dateOfBirth date de naissance
	 * @param address     adresse de l'enseignant
	 */
	public Teacher(String userName, String firstName, String lastName, LocalDate dateOfBirth, Address address) {
		super(userName, Role.TEACHER, firstName, lastName, dateOfBirth, address);
		this.courses = new ArrayList<>();
	}


    // =========================
    // METHODES PUBLIQUES
    // =========================

	/**
	 * Ajoute un cours à la liste des cours affectés à l'enseignant.
	 *
	 * @param course cours à ajouter
	 */
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	/**
	 * Retourne la liste des élèves inscrits aux cours de l'enseignant.
	 * 
	 * Les élèves présents dans plusieurs cours ne sont ajoutés qu'une seule fois.
	 *
	 * @return la liste des élèves de l'enseignant
	 */
	public ArrayList<Student> getStudents() {

		ArrayList<Student> students = new ArrayList<>();

		for (Course course : courses) {
			for (Student student : course.getStudents()) {
				if (!students.contains(student)) {
					students.add(student);
				}
			}
		}

		return students;
	}

	/**
	 * Authorize return true if as permission return false if not
	 * 
	 * @param nameAuthorization
	 * @return
	 */
	@Override
	public boolean authorize(Permission nameAuthorization) {
		switch (nameAuthorization) {
		default:
			return false;
		}
	}
    /**
     * Authorize return true if as permission return false if not
     * @param nameAuthorization
     * @return
     */
    @Override
    public boolean authorize(Permission nameAuthorization) {
        switch (nameAuthorization){
            default:
                return false;
        }
    }

    // =========================
    // GETTER
    // =========================
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
}
