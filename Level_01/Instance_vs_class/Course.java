public class Course {
    // Instance Variables
    private String courseName;
    private int duration; // in hours
    private double fee;

    // Class Variable
    private static String instituteName = "Tech Institute"; // Shared across all courses

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class Method to update institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main Method
    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("Java Programming", 40, 500);
        Course course2 = new Course("Data Science", 60, 1000);
        Course course3 = new Course("Web Development", 30, 300);

        // Displaying course details
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();
        course3.displayCourseDetails();
        System.out.println();

        // Updating institute name
        Course.updateInstituteName("Advanced Tech Academy");

        // Displaying updated course details
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();
        course3.displayCourseDetails();
    }
}
