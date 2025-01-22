import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int studentId;
    private List<Subject> subjects;
    private GradeCalculator gradeCalculator;

    // Constructor
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.subjects = new ArrayList<>();
        this.gradeCalculator = new GradeCalculator();
    }

    // Add Subject to the student
    public void setSubject(Subject subject) {
        subjects.add(subject);
    }

    // Set grade using GradeCalculator
    public void setGrade(GradeCalculator gradeCalculator) {
        this.gradeCalculator = gradeCalculator;
    }

    // Display student details and grades
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Subjects and Grades:");
        for (Subject subject : subjects) {
            char grade = gradeCalculator.calculateGrade(subject);
            System.out.println(
                    "Subject: " + subject.getSubjectName() + ", Marks: " + subject.getMarks() + ", Grade: " + grade);
        }
    }
}

class Subject {
    private String subjectName;
    private int marks;

    // Constructor
    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    // Getters and Setters
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

class GradeCalculator {
    private char grade;

    // Method to calculate grade based on marks
    public char calculateGrade(Subject subject) {
        int marks = subject.getMarks();
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public char getGrade() {
        return grade;
    }
}

class SchoolResults {
    public static void main(String[] args) {
        // Create Subjects
        Subject math = new Subject("Mathematics", 85);
        Subject science = new Subject("Science", 92);
        Subject english = new Subject("English", 76);

        // Create Student
        Student student = new Student("Alice", 101);

        // Add Subjects to the student
        student.setSubject(math);
        student.setSubject(science);
        student.setSubject(english);

        // Display student details
        student.displayStudentDetails();
    }
}
