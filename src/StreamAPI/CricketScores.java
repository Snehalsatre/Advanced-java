package StreamAPI;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketScores {
    public static void main(String[] args) {
     
        Map<String, Integer> scoreboard = new HashMap<>();

        scoreboard.put("Sachin Tendulkar", 200); 
        scoreboard.put("Rohit Sharma", 264);
        scoreboard.put("Kane Williamson", 108);
        scoreboard.put("Steve Smith", 144);
        scoreboard.put("Virat Kohli", 122);
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the batsman name to search: ");
        String searchName = scanner.nextLine();
    
        if (scoreboard.containsKey(searchName)) {
          
            int score = scoreboard.get(searchName);
            System.out.println(searchName + "'s High Score is: " + score);
        } else {
            System.out.println("Error: Batsman '" + searchName + "' not found in our records.");
        }

        scanner.close();
    }
}