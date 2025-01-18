public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! Please enter a value between 0.0 and 10.0.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", 8.5);
        student1.displayStudentDetails();
        student1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + student1.getCGPA());
        System.out.println();

        PostgraduateStudent pgStudent1 = new PostgraduateStudent(102, "Bob", 9.2, "Artificial Intelligence");
        pgStudent1.displayStudentDetails();
        pgStudent1.displayPostgraduateDetails();
    }
}

class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Research Topic: " + researchTopic);
    }
}