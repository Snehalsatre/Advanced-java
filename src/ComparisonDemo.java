import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparisonDemo {
	public static void main(String[]args) {
		
		
		
		Student s1 = new Student(301,"snehal",49.00);
		Student s2 = new Student(201,"anushka",79.00);
		Student s3 = new Student(601,"sakshi",37.00);
		Student s4 = new Student(401,"dipalii",99.00);
		
		ArrayList<Student> stud = new ArrayList<Student>();
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		stud.add(s4);
		
//		System.out.println("Before Sorting: ");
//		System.out.println(stud);
//		
//		System.out.println("After  Sorting: ");
//		Collections.sort(stud,new Student(0, null, 0));
//		System.out.println(stud);
		// Syntax fix: Corrected the parenthesis in System.out::println
       
		
//		System.out.println("Students data having greater than 50% marks:");
//		stud.stream()
//          .filter(a->a.getPercentage()>=50.0)
//          .forEach(System.out::println);
		
		List<String> names = stud.stream().map(s -> s.getName().substring(0, 1).toUpperCase() + s.getName().substring(1).toLowerCase()).collect(Collectors.toList());
		System.out.println("Formatted Names: " + names);
	}
}
