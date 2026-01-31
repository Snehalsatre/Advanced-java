package StreamAPI;
import java.util.ArrayList;
import java.util.Comparator;

public class GuestManager {
    public static void main(String[] args) {
        // 1. Initialize the guest list
        ArrayList<String> guests = new ArrayList<>();
        guests.add("Snehal");
        guests.add("Om");
        guests.add("jaya");
        guests.add("Anushka");
        guests.add("jay");
        guests.add("Shravani");

        // 2. Remove guests whose names start with "J" using removeIf
        // The lambda (name -> name.startsWith("J")) is a Predicate
        guests.removeIf(name -> name.startsWith("j"));

        // 3. Sort the remaining names in reverse alphabetical order
        // We use Comparator.reverseOrder() or a custom lambda (a, b) -> b.compareTo(a)
        guests.sort((a, b) -> b.compareTo(a));

        // 4. Print the final list
        System.out.println("Final Guest List (Reverse Alphabetical, No 'J' names):");
        guests.forEach(name -> System.out.println(name));
    }
}