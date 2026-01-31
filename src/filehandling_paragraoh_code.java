import java.io.File; 
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedWriter;

public class filehandling_paragraoh_code { 
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the text to write:"); 
		
		FileWriter fileName = new FileWriter("two.txt");
	
  try (BufferedWriter obj = new BufferedWriter((fileName))){
	  String text;  
	  while(!(text=sc.nextLine()).equals("END")) {
	  obj.write(text);
	  }
	  }catch(Exception e)
  {
		  e.printStackTrace();
}
  }
}
