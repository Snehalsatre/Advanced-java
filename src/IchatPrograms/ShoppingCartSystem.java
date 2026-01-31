package IchatPrograms;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

class Item {
    int itemId;
    String itemName;
    double itemPrice;

    Item(int itemId, String itemName, double itemPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
}


public class ShoppingCartSystem {

    public static void main(String[] args) {

        Map<Integer, Item> cart = new HashMap<>();

        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.println("\n1.Add Item  2.Remove Item  3.View Cart  4.Exit");
                System.out.print("Enter choice: ");

                int choice;
                try {
                    choice = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid number.");
                    sc.next();
                    continue;
                }

                if (choice == 4) {
                    System.out.println("Thank you for shopping!");
                    break;
                }

                switch (choice) {

                    case 1: 
                        System.out.print("Enter Item ID: ");
                        int id = sc.nextInt();

                       
                        if (cart.containsKey(id)) {
                            System.out.println("Item ID already exists. Use a unique ID.");
                            break;
                        }

                        System.out.print("Enter Item Name: ");
                        String name = sc.next();

                        System.out.print("Enter Item Price: ");
                        double price = sc.nextDouble();

                       
                        if (price <= 0) {
                            System.out.println("Price must be a positive value.");
                            break;
                        }

                        cart.put(id, new Item(id, name, price));
                        System.out.println("Item added successfully.");
                        break;

                    case 2: 
                        System.out.print("Enter Item ID to remove: ");
                        int removeId = sc.nextInt();

                        if (cart.containsKey(removeId)) {
                            cart.remove(removeId);
                            System.out.println("Item removed successfully.");
                        } else {
                            System.out.println("Item ID not found.");
                        }
                        break;

                    case 3: 
                        if (cart.isEmpty()) {
                            System.out.println("Cart is empty.");
                        } else {
                            System.out.println("\n--- Cart Items ---");
                            for (Item item : cart.values()) {
                                System.out.println(
                                        "ID: " + item.itemId +
                                        ", Name: " + item.itemName +
                                        ", Price: " + item.itemPrice
                                );
                            }
                        }
                        break;

                    default:
                        System.out.println("Invalid menu choice.");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type. Program terminated safely.");
        }
    }
}
