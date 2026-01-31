import java.io.File;
import java.util.Scanner;

public class custom_exceptionlab3 {
    public static void main(String[] args) {
        // Specify the file name
        File myFile = new File("data.txt");

        try {
            checkFile(myFile);
            System.out.println("File is not empty. Proceeding with reading...");
            
            // Code to read file would go here
            
        } catch (Exception e) {
            // This catches the exception thrown by our method
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkFile(File file) throws Exception {
        // 1. Check if the file exists first
        if (!file.exists()) {
            throw new Exception("File not found.");
        }

        // 2. Check if the file length is 0 bytes
        if (file.length() == 0) {
            throw new Exception("The file is empty!");
        }
    }
}