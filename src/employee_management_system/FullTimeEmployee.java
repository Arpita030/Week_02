package employee_management_system;

public class FullTimeEmployee extends Employee {

    private String department;

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = calculateSalary();
    }

    private double salary;
    public FullTimeEmployee(String employeeID,String name,double baseSalary) {
        super(employeeID,name,baseSalary);
    }

    @Override
    double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String department) {
        this.department=department;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Full-Time Employee Department: "+department);
    }
}
