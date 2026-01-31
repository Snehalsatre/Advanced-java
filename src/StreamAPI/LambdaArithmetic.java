package StreamAPI;
public class LambdaArithmetic {

    @FunctionalInterface
    interface ArithmeticOperation {
        double calculate(double a, double b);
    }
    public static void main(String[] args) {
        double num1 = 33.33;
        double num2 = 50.0;
  
        ArithmeticOperation addition = (a, b) -> a + b;
        ArithmeticOperation subtraction = (a, b) -> a - b;
        ArithmeticOperation multiplication = (a, b) -> a * b;
        ArithmeticOperation division = (a, b) -> {
            if (b == 0) return 0; 
            return a / b;
        };     
        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("----------------------------");
        System.out.println("Addition:       " + addition.calculate(num1, num2));
        System.out.println("Subtraction:    " + subtraction.calculate(num1, num2));
        System.out.println("Multiplication: " + multiplication.calculate(num1, num2));
        System.out.println("Division:       " + division.calculate(num1, num2));
    }
}