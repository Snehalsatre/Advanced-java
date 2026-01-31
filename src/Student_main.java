import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Student_main {
		public static void main(String [] args)
		{
			//serialization_exmaple s = new serialization_exmaple("Snehal",56,90.00);
			try {
				
				FileInputStream fobj = new  FileInputStream("Student.txt");
				ObjectInputStream oos = new ObjectInputStream(fobj);
				//oos.writeObject(s);
				
				serialization_exmaple s1=(serialization_exmaple) oos.readObject();
				System.out.println("Roll no:"+s1.rollno);
				System.out.println("Name :"+s1.name);
				System.out.println("Percentage :"+s1.percentage);
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
