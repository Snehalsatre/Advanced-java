package IchatPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bobj = new BufferedReader(new FileReader("src/IchatPrograms/Numbers.txt"));
			String line;
			while((line=bobj.readLine())!=null) {
				try {
					int n = Integer.parseInt(line);
					System.out.println(n);
				}catch(NumberFormatException e){
					System.out.println("Skipping Non integer value: "+line);
				}
			}
			bobj.close();
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
