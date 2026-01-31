import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.RandomAccessFile;
import java.io.IOException;

public class nio_javaExample {
    public static void main(String[] args) {
        try (RandomAccessFile aFile = new RandomAccessFile("userfile.txt", "r");
             FileChannel inChannel = aFile.getChannel()) {

            // Create a buffer (bucket) with a capacity of 1024 bytes
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            // Read from the channel into the buffer
            while (inChannel.read(buffer) != -1) {
                
                // 1. Flip the buffer from 'writing mode' to 'reading mode'
                buffer.flip();

                // 2. Read from the buffer (fast memory access)
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }

                // 3. Clear the buffer so it's ready to be filled again
                buffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}