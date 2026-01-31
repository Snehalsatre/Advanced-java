import java.util.*;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.TreeSet;
//import java.util.LinkedHashSet;

public class SetExample {
	public static void main(String[] args) {
        // 1. HashSet: Unordered, very fast
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Grapes");
        hashSet.add("Banana");
        hashSet.add("Papaya");
        hashSet.add("Apple"); // Duplicate, won't be added
        System.out.println("HashSet (Unordered): " + hashSet);

        // 2. TreeSet: Sorted automatically
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        System.out.println("TreeSet (Sorted): " + treeSet); // [10, 30, 50]
        
       
        Set<String> linkedhashset = new LinkedHashSet<>();
        

        // Adding elements
        linkedhashset.add("Mango");
        linkedhashset.add("Banana");
        linkedhashset.add("Orange");
        linkedhashset.add("Mango"); // This duplicate is ignored

        // The order is preserved exactly as inserted
        System.out.println("LinkedHashSet: " + linkedhashset);
        
    }

}

