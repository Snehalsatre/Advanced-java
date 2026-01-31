import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class readBinaryFile {
	public static void main(String[]args) throws IOException
	{
		String filename = "img.jpg";
		File f = new File(filename);
		
		try {
			FileInputStream fi = new FileInputStream(f);
			int bytes;
			int bytesCount = 0;
			 //byte[] buffer = new byte[1024];
			
			while((bytes = fi.read())!=-1) {
				System.out.println(bytes);
				bytesCount++;
			}
			System.out.println("File size:"+bytesCount+"bytes");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
} 
