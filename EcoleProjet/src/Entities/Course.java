package Entities;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Représente un cours de l'école.
 * Un cours possède une période et une liste d'élèves inscrits.
 */
public class Course {
    private String courseId;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Student> students;

    /*
        Constructor
     */
    /**
     * Construit un cours avec son identifiant, son nom et sa période.
     * La liste des élèves inscrits est initialisée vide.
     *
     * @param courseId identifiant du cours
     * @param name nom du cours
     * @param startDate date de début du cours
     * @param endDate date de fin du cours
     */
    public Course(String courseId, String name, LocalDate startDate, LocalDate endDate) {
        this.courseId = courseId;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.students = new ArrayList<>();
    }

    /*
        Getters and setters
     */
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    /*
     * Public method
     */
    
    /**
     * Ajoute un élève au cours.
     *
     * @param student élève à ajouter
     */
    public void addStudent(Student student) {
        this.students.add(student);
    }
}
