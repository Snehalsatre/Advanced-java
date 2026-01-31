import java.io.*;
import java.util.Scanner;

public class FileCreateWriteRead {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // 1. User enters data
        System.out.println("Enter paragraph (type END to stop):");
        BufferedWriter bw = new BufferedWriter(new FileWriter("userfile.txt"));

        while (true) {
            String data = sc.nextLine();
            if (data.equals("END")) break;
            bw.write(data);
            bw.newLine();
        }
        bw.close();

        // 2. Read file name from user
        System.out.print("Enter file name to read: ");
        String fname = sc.nextLine();

        // 3. Read and display file content
        BufferedReader br = new BufferedReader(new FileReader(fname));
        String line;
        System.out.println("\nFile contents:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
