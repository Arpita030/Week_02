package employee_management_system;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("E101", "Manish", 50000));
        employees.add(new PartTimeEmployee("E102", "Arpita", 0, 20, 250));

        employees.get(0).assignDepartment("Development");
        employees.get(1).assignDepartment("Testing");

        for (Employee emp : employees) {
            emp.displayDetails();
            emp.getDepartmentDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());
            System.out.println();
        }
    }
}
