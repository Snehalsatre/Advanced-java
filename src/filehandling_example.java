import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class filehandling_example {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the text to write:");
		String text = sc.nextLine();
		String fileName = "two.txt";
		
		try (FileWriter obj = new FileWriter(fileName)){
			 obj.append(text);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
