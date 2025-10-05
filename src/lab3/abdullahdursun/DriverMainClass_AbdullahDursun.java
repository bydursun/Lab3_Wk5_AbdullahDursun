package lab3.abdullahdursun;

import java.util.Scanner;

public class DriverMainClass_AbdullahDursun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // === Run 1 ===
        System.out.println("=== Run 1 ===");
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        BankAccount_AD account1 = new BankAccount_AD(accountNumber, 1500);
        System.out.println("Bank Account created with initial balance: $1500.00");

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account1.deposit(depositAmount);
        System.out.printf("New balance after depositing $%.2f: $%.2f%n", depositAmount, account1.getBalance());

        // === Run 2 ===
        System.out.println("\n=== Run 2 ===");
        System.out.print("Enter withdrawal amount (e.g., 600): ");
        double withdraw1 = sc.nextDouble();
        account1.withdraw(withdraw1);
        System.out.printf("New balance after withdrawing $%.2f: $%.2f%n", withdraw1, account1.getBalance());

        // === Run 3 ===
        System.out.println("\n=== Run 3 ===");
        System.out.print("Enter withdrawal amount (e.g., 2500): ");
        double withdraw2 = sc.nextDouble();
        try {
            account1.withdraw(withdraw2);
            System.out.printf("New balance after withdrawing $%.2f: $%.2f%n", withdraw2, account1.getBalance());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // === Run 4 (SavingsAccount Demonstration) ===
        System.out.println("\n=== Run 4: SavingsAccount Test ===");
        sc.nextLine(); // clear leftover newline
        System.out.print("Enter Savings Account Number: ");
        String savingsAccNo = sc.nextLine();

        SavingsAccount_AD savings = new SavingsAccount_AD(savingsAccNo, 100);
        System.out.println("SavingsAccount created with initial balance: $100.00");

        System.out.print("Enter withdrawal amount (try more than 50, e.g., 70): ");
        double savingsWithdraw = sc.nextDouble();

        try {
            savings.withdraw(savingsWithdraw);
            System.out.printf("Withdrawal successful! New balance: $%.2f%n", savings.getBalance());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.printf("Final Savings balance: $%.2f%n", savings.getBalance());

        sc.close();
    }
}
