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

    /**
     * Find a User by userName and password and if it doesn't exist return null
     * @param username
     * @param password
     * @return
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

    /**
     * Search if the username is already assigned to a User
     * @param username
     * @return
     */
    public boolean findUsername(String username){
        ArrayList<User> allUser = getAllUser();
        for(User user: allUser){
            if (user.userName.equals(username)){
                return true;
            }
        }
        return false;
    }

    /**
     * Return the list of all the User students + director + teacher + admin
     * @return
     */
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

    public void addDirector(Director director){
        if ( this.director == null){
            this.director = director;
        }else{
            System.out.println("Un directeur est déjà associé a cette école.");
        }
    }

    public void addStudent (Student student){
        students.add(student);
    }

    public void addTeacher (Teacher teacher){
        teachers.add(teacher);
    }

    public void addCourse (Course course){
        courses.add(course);
    }

    public void updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getUserName().equals(student.getUserName())) {
                students.set(i, student);
                return;
            }
        }
    }

    public void updateTeacher(Teacher teacher) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getUserName().equals(teacher.getUserName())) {
                teachers.set(i, teacher);
                return;
            }
        }
    }

    public void updateCourse(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(course.getCourseId())) {
                courses.set(i, course);
                return;
            }
        }
    }

    public void deleteTeacher(Teacher teacher) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getUserName().equals(teacher.getUserName())) {
                teachers.remove(i);
                return;
            }
        }
    }

    public void deleteStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getUserName().equals(student.getUserName())) {
                students.remove(i);
                return;
            }
        }
    }

    public void deleteCourse(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(course.getCourseId())) {
                courses.remove(i);
                return;
            }
        }
    }

    public void addStudentToCourse (Student student, Course course){
        if (!course.getStudentsAttendingCourse().contains(student)){
            course.addStudent(student);
        }else{
            System.out.println("L'étudiant est déjà inscrit à ce cours.");
        }
    }

    public void addTeacherToCourse (Teacher teacher, Course course){
        if (course.getTeacher()== null) {
            course.setTeacher(teacher);
        }else{
            System.out.println("Un enseignant est déjà affecté à ce cours.");
        }
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
