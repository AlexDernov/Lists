package health;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    Map<String, Medication> medications = new HashMap<>();

    public int getCount() {
        return medications.size();
    }

    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        return medications.get(medicationName);
    }

    public void printAllMedication() {
        System.out.println("Print Medications Map");
        System.out.println(medications.toString());
        System.out.println("Print toString() Output");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Pharmacy{" + "medications=" + medications + '}';
    }

    public void delete(String medicationName) {
        medications.remove(medicationName);
    }
}
