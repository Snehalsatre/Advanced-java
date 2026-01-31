import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Default sorting by ID
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %-10s | Salary: $%.2f", id, name, salary);
    }
}