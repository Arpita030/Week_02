import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name + ", Role: " + role);
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(String employeeName, String role) {
        employees.add(new Employee(employeeName, role));
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + name);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            employee.displayEmployeeInfo();
        }
    }

    public void clearEmployees() {
        employees.clear();
        System.out.println("All employees in the " + name + " department have been removed.");
    }
}

class Company {
    private String name;
    private List<Department> departments;

    // Constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public Department getDepartment(String departmentName) {
        for (Department dept : departments) {
            if (dept.getName().equalsIgnoreCase(departmentName)) {
                return dept;
            }
        }
        return null;
    }

    public void displayCompanyInfo() {
        System.out.println("Company: " + name);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartmentInfo();
        }
    }

    public void closeCompany() {
        System.out.println("Closing company: " + name);
        for (Department department : departments) {
            department.clearEmployees();
        }
        departments.clear();
        System.out.println("All departments and employees have been removed.");
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Company company = new Company("Tech Innovators Inc.");

        company.addDepartment("IT");
        company.addDepartment("HR");

        Department itDepartment = company.getDepartment("IT");
        if (itDepartment != null) {
            itDepartment.addEmployee("Alice", "Software Engineer");
            itDepartment.addEmployee("Bob", "System Administrator");
        }

        Department hrDepartment = company.getDepartment("HR");
        if (hrDepartment != null) {
            hrDepartment.addEmployee("Charlie", "Recruiter");
            hrDepartment.addEmployee("Diana", "HR Manager");
        }

        company.displayCompanyInfo();

        company.closeCompany();
    }
}
