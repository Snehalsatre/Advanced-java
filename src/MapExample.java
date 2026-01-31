import java.util.*;


public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> inventory = new HashMap<>();

        inventory.put(101, "Apples");
        inventory.put(102, "Bananas");
        inventory.put(103, "Oranges");
        
        System.out.println("HashMap (randomly): " + inventory);


        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(500, "Zebra");
        treeMap.put(100, "Apple");
        treeMap.put(300, "Mango");

        System.out.println("TreeMap (Sorted by ID): " + treeMap);
        
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(50, "Zebra");
        linkedHashMap.put(10, "Apple");
        linkedHashMap.put(30, "Mango");
        
        System.out.println("LinkedHashMap (Order of adding): " + linkedHashMap);
        
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "Java");
        table.put(2, "Python");
        System.out.println("Hashtable: " + table);
    }

}