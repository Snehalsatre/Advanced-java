package StreamAPI;

import java.util.LinkedList;
import java.util.Queue;

public class HotPotato {
    public static void main(String[] args) {
        String[] playerNames = {"Snehal", "Anushka", "Anuu", "Snehuu", "SakhiiS"};
        int passes = 3;

        String winner = simulateGame(playerNames, passes);
        System.out.println("The winner is: " + winner);
    }
    public static String simulateGame(String[] names, int num) {
        Queue<String> queue = new LinkedList<>();
        for (String name : names) {
            queue.add(name);
        }
        System.out.println("Starting Game with: " + queue);
        System.out.println("Music stops every " + num + " passes.\n");
        while (queue.size() > 1) {
            for (int i = 0; i < num; i++) {
                String playerPassing = queue.poll();
                queue.add(playerPassing);
            }
            String eliminated = queue.poll();
            System.out.println(eliminated + " is out! Remaining: " + queue);
        }

        return queue.poll();
    }
}