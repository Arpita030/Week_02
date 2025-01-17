class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {

        System.out.println("Balance: " + balance);
    }

}

public class ATM {
    public static void main(String[] args) {
        String str = "Arpita";
        int accountHolder = 123456;
        int accountNumber = 10000;
        BankAccount b1 = new BankAccount(str, accountHolder, accountNumber);
        System.out.println("Account Name: " + str);
        System.out.println("Account accountNumber: " + accountNumber);
        System.out.println("Account accountHolder: " + accountHolder);
        b1.display();
        b1.deposit(5000);
        b1.display();
        b1.withdraw(2000);
        b1.display();
        b1.withdraw(20000);
        b1.display();
    }
}