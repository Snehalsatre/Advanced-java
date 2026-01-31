import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class total_characters {

    public static void main(String[] args) {
        String filePath = "two.txt"; 
        int characterCount = 0;

        try (FileReader reader = new FileReader(filePath)) {
            int ch;
           
            System.out.println("Reading file content character by character:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
                
                characterCount++;
            }
            System.out.println("Total number of characters: " + characterCount);

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file was not found.");
        } catch (IOException e) {
            System.err.println("Error: An error occurred while reading the file.");
        }
    }
}