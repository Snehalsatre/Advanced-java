package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class classString {
	
	static  boolean checkPrime(int n)
	{
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			return false;
		}
		return true;
	}
	
	public static void main(String[]  args) {
		List<Integer> l1 = new ArrayList<>();
//		l1.add(10);
//		l1.add(56);
//		l1.add(37);
//		l1.add(75);
//		l1.add(33);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of inputs u want:");
		int b = sc.nextInt();
		System.out.println("Enter the input 5 numbers :");
		for(int i=1;i<=b;i++) {
			int a=sc.nextInt();
			l1.add(a);
			
		}
		
		//System.out.println(l1);
		
		//l1.stream().filter(n->n%2==0).forEach(System.out::println);
		// Syntax fix: Corrected the parenthesis in System.out::println
        l1.stream()
          .filter(classString::checkPrime)
          .forEach(System.out::println);

	
	}
	
	
	
}
