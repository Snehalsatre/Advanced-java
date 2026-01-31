package StreamAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
       
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
       
        String formattedDate = now.format(formatter);

        System.out.println("After Formatting: " + formattedDate);
    }
}