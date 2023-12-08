import health.Medication;
import health.Pharmacy;
import list.School;
import list.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        School newSchool = new School();
//        //System.out.println(newSchool.students);
//        // List<> students = new ArrayList<>();
//
//        newSchool.addStudent(new Student("Max", "Mustermann", 764565));
//        newSchool.addStudent(new Student("John", "Lux", 76895));
//        newSchool.addStudent(new Student("Tom", "Müller", 764245));
//        System.out.println(newSchool);
//
//
//        System.out.println(newSchool.findStudentById(76895));
//        newSchool.removeStudentById(76895);
//        System.out.println(newSchool);


        Pharmacy ourPharmacy = new Pharmacy();

        Medication ibu = new Medication("Ibu", 5, true);
        Medication aspirin = new Medication("Aspirin", 10, true);

        ourPharmacy.save(ibu);
        ourPharmacy.save(aspirin);

        ourPharmacy.printAllMedication();
    }
}
