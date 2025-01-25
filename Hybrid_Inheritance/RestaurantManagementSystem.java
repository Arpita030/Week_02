package HybridInheritance;

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Prepare meals, manage the kitchen, and ensure food quality.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialty: " + specialty);
    }
}

class Waiter extends Person implements Worker {
    private int tableAssigned;
    public Waiter(String name, int id, int tableAssigned) {
        super(name, id);
        this.tableAssigned = tableAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Serve customers, take orders, and ensure table cleanliness.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Table Assigned: " + tableAssigned);
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Ansh Brar", 101, "Chinese");
        System.out.println("Chef Details:");
        chef.displayDetails();
        chef.performDuties();
        System.out.println();

        Waiter waiter = new Waiter("Rocky", 202, 3);
        System.out.println("Waiter Details:");
        waiter.displayDetails();
        waiter.performDuties();
    }
}