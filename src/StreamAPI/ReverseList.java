package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
      
        List<String> items = new ArrayList<>(Arrays.asList("Snehal", "Anushka", "Sakshi", "Satre"));

        System.out.println("Original List: " + items);

      
        Collections.reverse(items);

        System.out.println("Reversed List: " + items);
    }
}