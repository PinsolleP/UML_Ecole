package Entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
    private String courseId;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Student> studentsAttendingCourse;

    /*
        Constructor
     */
    public Course(String courseId, String name, LocalDate startDate, LocalDate endDate) {
        this.courseId = courseId;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /*
        Getter and setter
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

    public ArrayList<Student> getStudentsAttendingCourse() {
        return studentsAttendingCourse;
    }

    public void addStudentsAttendingCourse(Student studentAttendingCourse) {
        this.studentsAttendingCourse.add(studentAttendingCourse);
    }
}
