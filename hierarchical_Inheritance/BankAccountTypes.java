package Hierarchical;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int maturityPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 5500.0, 2.5);
        savingsAccount.displayAccountType();
        savingsAccount.displayAccountDetails();
        System.out.println();

        CheckingAccount checkingAccount = new CheckingAccount("CA67890", 3050.0, 1000.0);
        checkingAccount.displayAccountType();
        checkingAccount.displayAccountDetails();
        System.out.println();

        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD11223", 15000.0, 12);
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayAccountDetails();
    }
}