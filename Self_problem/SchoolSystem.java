import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this); // Maintain bidirectional relationship
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewEnrolledCourses() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void displayAllStudents() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Green Valley High");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Enroll students in courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);

        // Display all students in the school
        school.displayAllStudents();

        // Display enrolled courses for each student
        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();

        // Display enrolled students for each course
        course1.displayEnrolledStudents();
        course2.displayEnrolledStudents();
    }
}
