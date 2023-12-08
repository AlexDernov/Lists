package list;

import java.util.ArrayList;
import java.util.List;

public class School {
   private List<Student> students = new ArrayList<>();
    public void addStudent(Student newStudent){
        students.add(newStudent);
    }
    public void removeStudentById(int id){
        students.remove(findStudentById(id));
    }
    public List<Course> studentsCourseById(int id){
        Student student = findStudentById(id);
        return student.getNewCourse();
    }

    public Student findStudentById(int id){
        for(Student student : students) {
            if(student.getStudentId() == id){
                return student;
            }

        }return null;
    }

    @Override
    public String toString() {
        return "School:\n" +
                "students=" + students +
                '\n';
    }
}
