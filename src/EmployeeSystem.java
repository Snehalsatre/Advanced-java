import java.util.*;

public class EmployeeSystem {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(103, "Snehal", 89000));
        list.add(new Employee(101, "Anushka", 99000));
        list.add(new Employee(102, "Sakshi", 67000));

        // --- PREFERENCE 1: Default Sort using Comparable ---
        Collections.sort(list); 
        System.out.println("Sorted by ID (Default):");
        list.forEach(System.out::println);

        // --- PREFERENCE 2: Flexible Sort using Comparator (Salary High to Low) ---
        // We use a Lambda here - no need for a separate class!
        list.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        
        System.out.println("\nSorted by Salary (High to Low):");
        list.forEach(System.out::println);
    }
}