package Hierarchical;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void displayRole() {
        System.out.println("Role: General Person");
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Anshi Patel", 29, "Mathematics");
        teacher.displayRole();
        teacher.displayDetails();
        System.out.println();

        Student student = new Student("Akshat Goutam", 17, "10th Grade");
        student.displayRole();
        student.displayDetails();
        System.out.println();

        Staff staff = new Staff("Riya Chandanan", 29, "Administration");
        staff.displayRole();
        staff.displayDetails();
    }
}

