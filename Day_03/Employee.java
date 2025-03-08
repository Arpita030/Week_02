class Employee {
    private static String companyName = "Capgemini";
    private String name;
    private int id;
    private String designation;
    private static int TotalEmployees = 0;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        TotalEmployees++;
    }

    void displayemployeeDetail() {
        if (this instanceof Employee) {
            System.out.println("Name of employee  " +name);
            System.out.println("id of employee  " +id);
            System.out.println("designation of employee  " +designation);
            System.out.println();
        } else {
            System.out.println("please enter valid details");
        }
    }

    static void displayTotalEmployees() {
        System.out.println("Total number of employees " + TotalEmployees);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Arpita", 13, "Manager");
        Employee employee2 = new Employee("Ansh", 12, "Intern");

        employee.displayemployeeDetail();
        employee2.displayemployeeDetail();

    }
}