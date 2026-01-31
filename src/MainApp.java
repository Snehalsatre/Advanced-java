import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // --- Banking Section ---
        BankAccount account = new BankAccount();
        System.out.print("Enter withdrawal amount: ");
        double amount = input.nextDouble();

        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.err.println("BANK ERROR: " + e.getMessage());
        }

        System.out.println("-----------------------------------");

        // --- Voter Section ---
        VoterRegistration voter = new VoterRegistration();
        System.out.print("Enter age for registration: ");
        int age = input.nextInt();

        try {
            voter.validateAge(age);
        } catch (InvalidAgeException e) {
            System.err.println("VOTER ERROR: " + e.getMessage());
        }

        input.close();
        System.out.println("Program Closed.");
    }
}