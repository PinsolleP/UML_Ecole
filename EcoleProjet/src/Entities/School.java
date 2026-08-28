package Entities;

import java.util.ArrayList;

public class School {
    Admin admin;
    Director director;
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;
    ArrayList<Course> courses;

    public School(Admin admin) {
        this.admin = admin;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

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
