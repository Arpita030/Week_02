import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;

    // Constructor
    public Patient(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                '}';
    }
}

// Doctor class
class Doctor {
    private String name;
    private List<Patient> patients;

    // Constructor
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr. " + name + " is consulting patient: " + patient.getName());
        } else {
            System.out.println("Dr. " + name + " has no record of patient: " + patient.getName());
        }
    }

    public void listPatients() {
        System.out.println("Dr. " + name + "'s Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to add a patient
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to display all doctors
    public void displayDoctors() {
        System.out.println("Hospital: " + name + " Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("Dr. " + doctor);
        }
    }

    // Method to display all patients
    public void displayPatients() {
        System.out.println("Hospital: " + name + " Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doctor1 = new Doctor("Smith");
        Doctor doctor2 = new Doctor("Johnson");

        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");
        Patient patient3 = new Patient("Charlie");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        // Establish consultations
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);

        doctor2.addPatient(patient2);
        doctor2.addPatient(patient3);

        // Perform consultations
        doctor1.consult(patient1);
        doctor1.consult(patient3);

        doctor2.consult(patient2);
        doctor2.consult(patient1);

        // List all patients of each doctor
        System.out.println();
        doctor1.listPatients();
        System.out.println();
        doctor2.listPatients();
    }
}
