import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class demo_for_filehandling {
	
	public static void main(String [] args)
	{
		String fileName = "Two.html";
		File obj = new File(fileName);
		
//		if(obj.exists()) {
//			System.out.print("File is already exists!");
//		}
//		else {
//			try {
//				obj.createNewFile();
//				System.out.print("File created!");
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//			}
		try (FileWriter objj = new FileWriter(fileName,true)){
			 objj.write("<h1>"+"Hello htmlllllll"+"</h1>");;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
	}
}
