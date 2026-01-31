package StreamAPI;
import java.util.ArrayList;
public class EvenSum {
    public static void main(String[] args) {
       
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(51);
        numbers.add(45);
        numbers.add(34);
        numbers.add(30);

        int sum = 0;    
        for (int num : numbers) {
            
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}
