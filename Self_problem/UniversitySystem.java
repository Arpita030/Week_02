import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String departmentName;
    private List<Faculty> faculties;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayFaculties() {
        System.out.println("Department: " + departmentName);
        System.out.println("Faculties:");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getName());
        }
    }
}

class University {
    private String universityName;
    private List<Department> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDepartments() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department department : departments) {
            System.out.println("- " + department.getDepartmentName());
        }
    }

    public void deleteUniversity() {
        System.out.println("Deleting University: " + universityName);
        departments.clear();
        System.out.println("All departments deleted.");
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        // Create faculties
        Faculty faculty1 = new Faculty("Dr. Alice");
        Faculty faculty2 = new Faculty("Dr. Bob");
        Faculty faculty3 = new Faculty("Dr. Charlie");

        // Create departments
        Department csDepartment = new Department("Computer Science");
        Department mathDepartment = new Department("Mathematics");

        // Add faculties to departments
        csDepartment.addFaculty(faculty1);
        csDepartment.addFaculty(faculty2);
        mathDepartment.addFaculty(faculty3);

        // Create university
        University university = new University("Tech Valley University");

        // Add departments to university
        university.addDepartment(csDepartment);
        university.addDepartment(mathDepartment);

        // Display university structure
        university.displayDepartments();
        csDepartment.displayFaculties();
        mathDepartment.displayFaculties();

        // Delete university
        university.deleteUniversity();

        // Attempt to display departments after deletion
        university.displayDepartments();
    }
}
