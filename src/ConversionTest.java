import java.util.Scanner;

public class ConversionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press Enter (type nothing) to trigger a Null Exception: ");
        
        String input = sc.nextLine();

        // If user input is empty, we force it to be null
        if (input.isEmpty()) {
            input = null; 
        }

        try {
            // Passing a 'null' to parseInt triggers the NullPointerException
            int num = Integer.parseInt(input); 
            System.out.println("Result: " + num);
        } catch (NullPointerException e) {
            System.err.println("SUCCESS: You triggered the NullPointerException!");
        } catch (NumberFormatException e) {
            System.err.println("Error: That was a format issue, not a null issue.");
        }
    }
}