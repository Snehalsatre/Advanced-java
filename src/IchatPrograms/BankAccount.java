package IchatPrograms;

import java.util.Scanner;

public class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void performTransaction(double amount) throws InsufficientFundsException {
        if (amount  > balance) {
            throw new InsufficientFundsException("Insufficient balance. Transaction cancelled.");
        }
        balance +=  amount; 
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        BankAccount account = new BankAccount(sc.nextDouble());

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter amount (positive=deposit, negative=withdraw): ");
            double amt = sc.nextDouble();

            try {
                account.performTransaction(amt);
                System.out.println("Transaction successful. Balance: " + account.balance);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
                System.out.println("Balance remains: " + account.balance);
            }
        }
        sc.close();
    }
}
