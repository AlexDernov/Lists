package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public Student(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.courses = new ArrayList<>();

    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, studentId, courses);
    }

    @Override
    public String toString() {
        return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", studentId=" + studentId + ", courses=" + courses + '}';
    }

    public int getStudentId() {
        return studentId;
    }
}