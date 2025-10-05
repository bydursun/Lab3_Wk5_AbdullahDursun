package lab3.abdullahdursun;

public class BankAccount_AD {
    private final String accountNumber;
    protected double balance;

    public BankAccount_AD(String accountNumber, double balance) {
        if (accountNumber == null || !accountNumber.matches("\\d{4,}")) {
            throw new IllegalArgumentException("Account number must be 4 or more digits.");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.printf("Deposited $%.2f. New balance: $%.2f%n", amount, balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be positive.");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds!");
        }
        balance -= amount;
        System.out.printf("Withdrew $%.2f. Remaining balance: $%.2f%n", amount, balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
