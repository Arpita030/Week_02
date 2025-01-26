package employee_management_system;

abstract class Employee implements Department {
    private String employeeID;
    private String name;
    private double baseSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    Employee( String employeeID,String name,double baseSalary){
        this.employeeID=employeeID;
        this.name=name;
        this.baseSalary=baseSalary;
    }

    abstract double calculateSalary();

    void displayDetails(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Employee salary: "+baseSalary);
        System.out.println();
    }

}
