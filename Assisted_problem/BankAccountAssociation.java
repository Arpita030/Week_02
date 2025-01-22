import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, String accountType, double initialDeposit) {
        Account newAccount = new Account(this, accountType, initialDeposit);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName() + " at " + this.name);
    }

    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Account balances for " + name + ":");
        for (Account account : accounts) {
            System.out.println(account.getAccountType() + ": $" + account.getBalance());
        }
    }
}

// Account Class
class Account {
    private Bank bank;
    private String accountType;
    private double balance;

    // Constructor
    public Account(Bank bank, String accountType, double balance) {
        this.bank = bank;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountAssociation {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank.openAccount(customer1, "Savings", 1000.00);
        bank.openAccount(customer1, "Checking", 500.00);
        bank.openAccount(customer2, "Savings", 2000.00);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}
