class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid Patient Object");
        }
    }

    public static void updateHospitalName(String newHospitalName) {
        hospitalName = newHospitalName;
        System.out.println("Updated Hospital Name: " + hospitalName);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(101, "Alice", 25, "Fever");
        Patient p2 = new Patient(102, "Bob", 40, "Diabetes");

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();

        System.out.println();
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());

        System.out.println();
        Patient.updateHospitalName("Metro General Hospital");

        System.out.println();
        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
    }
}
