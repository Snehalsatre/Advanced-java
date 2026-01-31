import java.util.Scanner;

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully");
        System.out.println("Current balance: " + balance);
    }

    void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance! Cannot withdraw.");
        }
        balance = balance - amount;
        System.out.println("Amount withdrawn successfully");
        System.out.println("Current balance: " + balance);
    }
}

public class BankingApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000); // initial balance

        try {
            System.out.print("Enter deposit amount: ");
            double d = sc.nextDouble();
            account.deposit(d);

            System.out.print("Enter withdrawal amount: ");
            double w = sc.nextDouble();
            account.withdraw(w);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
