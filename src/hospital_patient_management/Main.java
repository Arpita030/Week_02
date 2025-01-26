package hospital_patient_management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void processPatients(List<Patient> patients) {
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord medicalRecord = (MedicalRecord) patient;
                System.out.println("Medical Records: " + medicalRecord.viewRecords());
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient("P001", "Anshu", 23, 3, 3000);
        inPatient.addRecord("Diagnosed with pneumonia.");
        inPatient.addRecord("Prescribed antibiotics.");
        patients.add(inPatient);

        OutPatient outPatient = new OutPatient("P002", "Akshu", 21, 500);
        outPatient.addRecord("Routine check-up.");
        patients.add(outPatient);

        processPatients(patients);
    }
}
