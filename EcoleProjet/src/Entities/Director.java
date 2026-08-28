package Entities;

import java.time.LocalDate;
import java.util.Random;

public class Director extends User {

    private School school;
    // =========================
    // CONSTRUCTEURS
    // =========================

    /**
     * @param userName
     * @param firstName
     * @param lastName
     * @param dateOfBirth
     * @param address
     * @param random
     */
    public Director(String userName, String firstName, String lastName, LocalDate dateOfBirth, Address address, Random random) {
        super(userName, Role.DIRECTOR, firstName, lastName, dateOfBirth, address, random);
    }

    // =========================
    // METHODES PUBLIQUES
    // =========================
    /**
     * Authorize return true if as permission return false if not
     *
     * @param nameAuthorization
     * @return
     */
    @Override
    public boolean authorize(Permission nameAuthorization) {
        switch (nameAuthorization) {
            case CREATE_STUDENT:
            case UPDATE_STUDENT:
            case DELETE_STUDENT:

            case CREATE_TEACHER:
            case UPDATE_TEACHER:
            case DELETE_TEACHER:

            case CREATE_COURSE:
            case UPDATE_COURSE:
            case DELETE_COURSE:

            case REGISTER_STUDENT_TO_COURSE:
            case REGISTER_TEACHER_TO_COURSE:
                return true;

            default:
                return false;
        }
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void createStudent(Student student) {
        school.addStudent(student);
    }

    public void createTeacher(Teacher teacher) {
        school.addTeacher(teacher);
    }

    public void createCourse(Course course) {
        school.addCourse(course);
    }

    public void updateTeacher(Teacher teacher){
        school.updateTeacher(teacher);
    }

    public void updateStudent(Student student){
        school.updateStudent(student);
    }

    public void updateCourse(Course course){
        school.updateCourse(course);
    }

    public void deleteStudent(Student student){
        school.deleteStudent(student);
    }

    public void deleteTeacher(Teacher teacher){
        school.deleteTeacher(teacher);
    }

    public void deleteCourse(Course course){
        school.deleteCourse(course);
    }

    public void registerStudentToCourse(Student student, Course course){
        school.addStudentToCourse(student, course);
    }

    public void registerTeacherToCourse(Teacher teacher, Course course){
        school.addTeacherToCourse(teacher, course);
    }
}
