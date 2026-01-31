import java.util.*;

class Employeee implements Comparable<Employeee> {
    int id;
    String name;
    double salary;

    public Employeee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Default sorting logic: Ascending by ID
    @Override
    public int compareTo(Employeee other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Salary: " + salary;
    }
}