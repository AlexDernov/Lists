package list;

import java.util.*;

public class School {
    private Map<Integer, Student> students = new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }

    public void addStudent(Student newStudent) {
        students.put(newStudent.getStudentId(), newStudent);

    }

    public void removeStudentById(int id) {
        students.remove(id);

    }

    public List<Course> getCoursesByStudentId(int id) {
        return students.get(id).getCourses();
    }

    public Student findStudentById(int id) {
        return students.get(id);
    }

    @Override
    public String toString() {
        return "School{" + "students=" + students + '}';
    }
}
