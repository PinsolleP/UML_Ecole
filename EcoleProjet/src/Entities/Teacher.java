package Entities;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Représente un enseignant de l'école.
 * 
 * Un enseignant possède les informations communes à un utilisateur et peut être
 * affecté à plusieurs cours.
 */
public class Teacher extends User {

	private ArrayList<Course> courses;
	/*
	 * Constructor
	 */

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

	/*
	 * Getter
	 */
	
	public ArrayList<Course> getCourses() {
		return courses;
	}

	/*
	 * Public Method
	 */

	/**
	 * Ajoute un cours à la liste des cours affectés à l'enseignant.
	 *
	 * @param course cours à ajouter
	 */
	public void addCourse(Course course) {
		courses.add(course);
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
}
