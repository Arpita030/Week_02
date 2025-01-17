class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", id: " + id + ", salary: " + salary);

    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee ed = new Employee("Arpita", 13, 3000);
        ed.displayDetails();
    }
}