package StreamAPI;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public  class TestMain implements  TestInterface {
	//lambda function 
	public static void main(String [] args) {
		
		//lambda types
		//predicate checks if the condition met or not 
		Predicate<String> isLongEnough = s -> s.length() > 5;
		System.out.println(isLongEnough.test("Hello"));      // false
        System.out.println(isLongEnough.test("JavaProgramming")); // true
		
        //consumer
     // Lambda that prints a string in uppercase
        Consumer<String> printer = s -> System.out.println(s.toUpperCase());
        printer.accept("hello world"); // Output: HELLO WORLD
        
        //supplier
     // Lambda that provides the current date and time
        Supplier<LocalDateTime> dateSupplier = () -> LocalDateTime.now();
        System.out.println("Current Time: " + dateSupplier.get());
		
        
        //function
     // Lambda that takes a String and returns its length (Integer)
        Function<String, Integer> stringLength = s -> s.length();
        Integer length = stringLength.apply("Gemini");
        System.out.println("Length is: " + length); // Output: 6
		
	}
		//Addition
//		TestInterface str= (a,b)->a+b;
//		int result = str.add(10,20);
//		System.out.print(result);
		
		//square root
//		TestInterface str = (a)->a*a;
//		int b = str.square(10);
//		System.out.println(b);
		
		//Even numbers from 1 to 50
//		System.out.println("Even numbers from 1 to 50 : ");
//		TestInterface even = ()->{
//			for(int i =1;i<=50;i++) {
//				if(i%2==0) {
//					System.out.println(i);
//				}
//			}
//			return 0;
//		};
//		even.printEven();
		
		//odd no from 1 to 50
//		System.out.println("Odd Numbers from 1 to 50:");
//		TestInterface odd=()->{
//			for(int i=1;i<=50;i++) {
//				if(i%2!=0) {
//					System.out.println(i);
//				}
//			}
//			return 0;
//		};
//		odd.printOdd();
//		
//	}
	
	


//predicate
//supplier
//consumer
//functions
	
}
