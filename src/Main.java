import java.util.*;


class IllegalArgument extends Exception {

    public IllegalArgument() {
       System.out.println("IllegalArgument error");
    }
}
public class Main
{
    
    static int acceptInteger(String input) throws IllegalArgument {

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            // Throw custom checked exception
            throw new IllegalArgument();
        }
    }
    
    
    
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String userInput = sc.nextLine();

        try {
            
            int number = acceptInteger(userInput);
            System.out.println("Valid integer entered: " + number);
        } catch (IllegalArgument e) {
            System.out.println(e.getMessage());
        }
	}
}