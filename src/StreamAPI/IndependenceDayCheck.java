package StreamAPI;


import java.time.Month;
import java.time.MonthDay;

public class IndependenceDayCheck {
    public static void main(String[] args) {
        // 1. Get today's Month and Day
        MonthDay today = MonthDay.now();
        
        // 2. Create a MonthDay object for Independence Day (August 15th)
        MonthDay independenceDay = MonthDay.of(Month.AUGUST, 15);
        
        System.out.println("Today is: " + today);
        System.out.println("Independence Day is: " + independenceDay);
        System.out.println("--------------------------------------");

        // 3. Check if today IS Independence Day
        if (today.equals(independenceDay)) {
            System.out.println("Happy Independence Day! Today is 15th August.");
        } 
        // 4. Use isBefore() to check if it's coming or already passed
        else if (today.isBefore(independenceDay)) {
            System.out.println("Independence day is yet to come this year.");
        } 
        else {
            System.out.println("Independence day was already celebrated this year.");
        }
    }
}
