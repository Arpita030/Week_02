package banking_system;


import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("baba123", "Arshii", 90000, 3.5));
        accounts.add(new CurrentAccount("box234", "Arpita", 120000, 10000));

        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Calculated Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
                loanable.applyForLoan(50000);
            }

            System.out.println();
        }
    }
}
