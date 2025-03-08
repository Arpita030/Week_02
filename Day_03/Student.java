class Student {
    private static String universityName = "Lovely Professional University"; // Corrected static variable
    private String name;
    private final int rollNumber; // Corrected naming for rollNumber
    private String grade;
    private static int numberOfStudents = 0; // Made static for tracking total students

    // Constructor
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        numberOfStudents++; // Corrected increment
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll number of student: " + rollNumber);
        System.out.println("Name of student: " + name);
        System.out.println("Grade of student: " + grade);
    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }

    // Static method to display total students
    static void displayTotalStudents() {
        System.out.println("Total number of students: " + numberOfStudents);
    }

    // Static method to update university name
    static void updateUniversityName(String newUniversityName) {
        universityName = newUniversityName;
        System.out.println("Updated University Name: " + universityName);
    }

    // Main method
    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student(1, "Alice", "A");
        Student s2 = new Student(2, "Bob", "B");

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();

        System.out.println();
        Student.displayTotalStudents();

        Student.updateUniversityName("XYZ University");

        System.out.println();
        s1.updateGrade("A+");
        s1.displayDetails();
    }
}
