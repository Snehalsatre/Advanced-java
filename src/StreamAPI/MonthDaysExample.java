package StreamAPI;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthDaysExample {
    public static void main(String[] args) {
        System.out.println("Month Name      | Days");
        System.out.println("-----------------------");

        // Iterate through all constants in the Month enum
        for (Month month : Month.values()) {
            
            // 1. Get the name of the month (e.g., JANUARY)
            String name = month.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            
            // 2. Get the number of days (passing false for leap year)
            int days = month.length(false);
            
            // 3. Print the formatted output
            System.out.printf("%-15s | %d%n", name, days);
        }
    }
}
