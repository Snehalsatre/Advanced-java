
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class list_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student s1 = new Student(101,"ABC",90.00);
//		Student s2 = new Student(102,"XYZ",99.00);
//		Student s3 = new Student(103,"PQR",89.00);
		
		//ArrayList<Student> fruits = new ArrayList<Student> ();
		//LinkedList<Student> fruits = new LinkedList<Student> ();
		//Stack<Student> fruits = new Stack<Student> ();
		PriorityQueue<Integer> fruits = new PriorityQueue<Integer> ();

		
		
		fruits.add(10);
		fruits.add(20);
		fruits.add(30);
		fruits.add(40);
		
//		fruits.push(s1);
//		fruits.push(s2);
//		fruits.push(s3);
		
//		
//		System.out.println("Before removing the object:");
//		System.out.println(fruits);
//		
//		System.out.println("\n After removing the object:");
//		//fruits.remove(s3);
//		fruits.pop();
//		System.out.println(fruits);
//		
//		System.out.println(" \nlinked list: ");		
//		for(Student i : fruits)
//		System.out.println (i);
		
		System.out.println(fruits.poll());
		System.out.println(fruits.poll());
		System.out.println(fruits.poll());
		System.out.println(fruits.poll());
		
		
		}
		
		
	}