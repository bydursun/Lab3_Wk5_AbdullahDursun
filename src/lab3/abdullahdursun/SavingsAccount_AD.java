package lab3.abdullahdursun;

public class SavingsAccount_AD extends BankAccount_AD {

    public SavingsAccount_AD(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be positive.");
        }
        double projectedBalance = balance - amount;
        if (projectedBalance < 50) {
            throw new IllegalStateException("Savings balance cannot go below $50!");
        }
        super.withdraw(amount);
    }
}
