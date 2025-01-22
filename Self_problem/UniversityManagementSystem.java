import java.util.ArrayList;
import java.util.List;

class Professor {
    private String professorName;
    private Course assignedCourse;

    // constructer to initialize professor
    public Professor(String professorName) {
        this.professorName = professorName;
    }

    // method to display professor detils
    public void displayProfessor() {
        System.out.println("Professor name - " + professorName);
        assignedCourse.displayCourse();
    }

    // method to get professor name
    public String getName() {
        return professorName;
    }
}

class Course {
    private String courseName;
    private Professor professor;
    private List<Student> studentsList;

    // constructer to initialize object
    public Course(String courseName) {
        this.courseName = courseName;
        this.studentsList = new ArrayList<>();
    }

    // method to add student in course
    public void addStudent(Student student) {
        studentsList.add(student);
    }

    // method to assign professor in course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // method to display students enroll inn course
    public void displayStudentDetials() {
        this.displayCourse();
        for (Student student : studentsList) {
            student.displayStudent();
        }
    }

    // method to display course details
    public void displayCourse() {
        System.out.println("\ncourse name - " + courseName +
                "\ncourse professer - " + professor.getName());
    }
}

class Student {
    private String studentName;
    private int rollNumber;
    private List<Course> coursesList;

    // constructer to initialize student
    public Student(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        coursesList = new ArrayList<>();
    }

    // method to display student details
    public void displayStudent() {
        System.out.println("Student name - " + studentName +
                "\nStudent roll number - " + rollNumber);
    }

    // method to display courese in which students enroll
    public void displayCourseDetails() {
        this.displayStudent();
        for (Course course : coursesList) {
            course.displayCourse();
        }
    }

    // method to enroll in course
    public void enrollCourse(Course course) {
        coursesList.add(course);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // create object of professor
        Professor sumitProfessor = new Professor("Dr. Sumit Vashishth");
        Professor vivekProfessor = new Professor("Dr. Vivek Sharma");
        Professor aadharshProfessor = new Professor("Dr. Aadarsh verma");

        // create object of course class
        Course oopCourse = new Course("Object Oriented Programming");
        Course dbmsCourse = new Course("Dababase Managment System");
        Course cnCourse = new Course("Computer Network");

        // create object of student class
        Student rajveerStudent = new Student("Rajveer Kajle", 88);
        Student darshanStudent = new Student("Darshan Yadav", 34);
        Student adityaStudent = new Student("Aditya", 7);

        // object communicatin between professor and course
        cnCourse.assignProfessor(sumitProfessor);
        dbmsCourse.assignProfessor(vivekProfessor);
        oopCourse.assignProfessor(aadharshProfessor);

        // object communicatin between course and student
        rajveerStudent.enrollCourse(cnCourse);
        rajveerStudent.enrollCourse(oopCourse);
        darshanStudent.enrollCourse(oopCourse);
        darshanStudent.enrollCourse(dbmsCourse);
        adityaStudent.enrollCourse(dbmsCourse);
        adityaStudent.enrollCourse(cnCourse);

        cnCourse.addStudent(rajveerStudent);
        oopCourse.addStudent(rajveerStudent);
        cnCourse.addStudent(adityaStudent);
        dbmsCourse.addStudent(adityaStudent);
        dbmsCourse.addStudent(darshanStudent);
        oopCourse.addStudent(darshanStudent);

        // display course details
        cnCourse.displayStudentDetials();
        oopCourse.displayStudentDetials();
        dbmsCourse.displayStudentDetials();
    }
}
