import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(double balance, double deficit) {
        super("Balance: " + balance + ", Deficit: " + deficit);
    }
}

class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(balance, amount - balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

class VoterRegistration {
    void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age below 18. Registration not allowed.");
        }
        System.out.println("Age valid. Registration successful.");
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter balance: ");
            double bal = sc.nextDouble();
            BankAccount acc = new BankAccount(bal);

            System.out.print("Enter withdraw amount: ");
            double amt = sc.nextDouble();
            acc.withdraw(amt);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.print("Enter age for voter registration: ");
        int age = sc.nextInt();
        try {
            new VoterRegistration().validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
