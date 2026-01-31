package StreamAPI;

import java.util.function.UnaryOperator;

public class StringLambda {
    public static void main(String[] args) {
        String input = "Anushka Satpute";

        UnaryOperator<String> toUpper = str -> str.toUpperCase();

        UnaryOperator<String> toLower = str -> str.toLowerCase();
  
        UnaryOperator<String> reverse = str -> new StringBuilder(str).reverse().toString();

        System.out.println("Original String :  " + input);
        System.out.println("String After Uppercase : " + toUpper.apply(input));
        System.out.println("String After Lowercase: " + toLower.apply(input));
        System.out.println("String After Reversed:  " + reverse.apply(input));
    }
}