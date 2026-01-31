package IchatPrograms;

import java.util.HashMap;
import java.util.Scanner;

class Employee{
	int employeeID;
	String emplyeeName;
	double employeeSalary;
	
	Employee(int employeeID,String emplyeeName,	double employeeSalary){
		this.employeeID = employeeID;
		this.emplyeeName =emplyeeName ;
		this.employeeSalary = employeeSalary;
	}
}

public class EmployeeDatabase{
	public static void main(String[]args) {
		HashMap<Integer,Employee>employeeMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n1.Add  2.Update   3. Delete   4.Exit");
		System.out.println("Enter Choice: ");
		int choice = scanner.nextInt();
		
		if(choice == 4)break;
		
		System.out.println("Enter Employee ID");
		int id =  scanner.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Enter Name:");
			String name = scanner.next();
			System.out.println("Enter Salary: ");
			double salary = scanner.nextDouble();
			employeeMap.put(id, new Employee(id,name,salary));
			System.out.println("Employee Added!");
			break;
			
			
		case 2: 
            if (employeeMap.containsKey(id)) {
            	
            	System.out.print("Enter New Name: ");
                String newName= scanner.next();
                employeeMap.get(id).emplyeeName = newName;
                
                System.out.print("Enter New Salary: ");
                double newSalary = scanner.nextDouble();
                employeeMap.get(id).employeeSalary = newSalary;
                
                System.out.println("Employee Updated");
            } else {
                System.out.println("Employee Not Found");
            }
            break;

        case 3: 
            if (employeeMap.remove(id) != null) {
                System.out.println("Employee Deleted");
            } else {
                System.out.println("Employee Not Found");
            }
            break;
            
        default:
        	System.out.println("Invalid Choice");
			
		}
		}
		scanner.close();
	}
}