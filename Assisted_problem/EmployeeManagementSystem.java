package  AssistedProblem;
class Employee {
    String name;
    int id;
    int salary;

    void setDetail(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void task() {
        System.out.println("Every employee has different tasks.");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(int teamSize, String name, int id, int salary) {
        super.setDetail(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void task() {
        System.out.println(name + " manages the team!");
        System.out.println(name + "'s team size is: " + teamSize);
        System.out.println();
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String programmingLanguage, String name, int id, int salary) {
        super.setDetail(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void task() {
        System.out.println(name + " develops applications!");
        System.out.println(name + "'s programming language is: " + programmingLanguage);
        System.out.println();
    }
}

class Intern extends Employee {
    int duration;

    Intern(int duration, String name, int id, int salary) {
        super.setDetail(name, id, salary);
        this.duration = duration;
    }

    @Override
    void task() {
        System.out.println(name + " is here for a short time!");
        System.out.println(name + "'s duration here is: " + duration + " months");
        System.out.println();
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager = new Manager(15, "Ansh", 101, 180000);
        Developer developer = new Developer("Java", "Jaspreet", 102, 80000);
        Intern intern = new Intern(3, "Aksh", 103, 0);

        System.out.println("Manager Details:");
        manager.displayDetails();
        manager.task();

        System.out.println("Developer Details:");
        developer.displayDetails();
        developer.task();

        System.out.println("Intern Details:");
        intern.displayDetails();
        intern.task();
    }
}
