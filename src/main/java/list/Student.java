package list;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    List<Course> newCourse;

    public List<Course> getNewCourse() {
        return newCourse;
    }

    public void setNewCourse(List<Course> newCourse) {
        this.newCourse = newCourse;
    }

    public Student(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.newCourse = new ArrayList<>();

    }

    public void addCourse(Course course) {
        newCourse.add(course);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student:\n" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId=" + studentId +
                '\n';
    }
}