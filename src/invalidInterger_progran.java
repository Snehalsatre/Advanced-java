import java.util.Scanner;
import java.util.InputMismatchException;

public class invalidInterger_progran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter an integer: ");
        
        try {
            int userNumber = scanner.nextInt();
            System.out.println("Success! You entered: " + userNumber);
        } catch (InputMismatchException e) {
            System.err.println("Error: That is not a valid integer.");
        } finally {
            scanner.close();
        }
    }
}