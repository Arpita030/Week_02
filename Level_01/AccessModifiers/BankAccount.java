public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "Chandu", 1000.0);
        account1.displayAccountDetails();
        account1.setBalance(1500.0);
        System.out.println("Updated Balance: " + account1.getBalance());
        System.out.println();

        SavingsAccount savingsAccount1 = new SavingsAccount("789101", "Hari", 2000.0, 0.03);
        savingsAccount1.displayAccountDetails();
        savingsAccount1.displaySavingsAccountDetails();
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccountDetails() {
        System.out.println("Interest Rate: " + interestRate);
    }
}