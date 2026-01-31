package TasksOfAnudeep;

import java.util.HashSet;
import java.util.Set;

class Employee {
    int employeeID;
    String employeeName;

  
    public Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return this.employeeID == other.employeeID;
    }

    
    @Override
    public String toString() {
        return "Employee{ID=" + employeeID + ", Name='" + employeeName + "'}";
    }
}
public class Main {
    public static void main(String[] args) {
     
        Set<Employee> set = new HashSet<>();
      
        Employee e1 = new Employee(101, "Snehal");
        Employee e2 = new Employee(102, "Anushka");
        Employee e3 = new Employee(103, "Sakshi");

        set.add(e1);
        set.add(e2);
        set.add(e3);       
        Employee e4 = new Employee(101, "Duplicate Snehal");
        boolean isAdded = set.add(e4);
        System.out.println("Was duplicate employee with ID 101 added? " + isAdded);
        System.out.println("\nList of all employees in the HashSet:");
        for (Employee e : set) {
            System.out.println(e);
        }
    }
}