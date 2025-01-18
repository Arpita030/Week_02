public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void modifySalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary.");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "IT", 50000.0);
        employee1.displayEmployeeDetails();
        employee1.modifySalary(55000.0);
        System.out.println("Updated Salary: " + employee1.salary);
        System.out.println();

        Manager manager1 = new Manager(102, "HR", 70000.0, 5);
        manager1.displayEmployeeDetails();
        manager1.displayManagerDetails();
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        System.out.println("Team Size: " + teamSize);
    }
}