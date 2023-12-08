package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        School newSchool = new School();
        //System.out.println(newSchool.students);
        // List<> students = new ArrayList<>();

        newSchool.addStudent(new Student("Max", "Mustermann", 764565));
        newSchool.addStudent(new Student("John", "Lux", 76895));
        newSchool.addStudent(new Student("Tom", "Müller", 764245));
        System.out.println(newSchool);


        System.out.println(newSchool.findStudentById(76895));
      newSchool.removeStudentById(76895);
        System.out.println(newSchool);


    }
}
