package banking_system;

public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Applied for: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return overdraftLimit;
    }
}
