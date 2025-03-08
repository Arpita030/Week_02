class BankAccount {
    static String bankName = "State of Bank of India";
    static int totalAccount = 0;

    private final int accountNumber;
    private String accountHolderName;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccount++;
    }

    static int getTotalAccounts() {
        return totalAccount;
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid account instance.");
        }
    }

    public static void main(String[] args) {
        // Create new accounts
        BankAccount account1 = new BankAccount("Alice", 1001);
        BankAccount account2 = new BankAccount("Bob", 1002);

        // Display account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Display total accounts
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}