import java.io.FileInputStream;
import java.io.IOException;

public class io_javaPackage {
    public static void main(String[] args) {
        // FileInputStream reads data as a stream of bytes
        try (FileInputStream fis = new FileInputStream("userfile.txt")) {
            int byteData;
            
            // read() returns the next byte of data, or -1 if the end of file is reached
            while ((byteData = fis.read()) != -1) {
                // We process each byte individually as it arrives
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}