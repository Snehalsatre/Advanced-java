
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
public class image_reading {

	public static void main(String[] args) {
		
		try {
			
		// Step 1: Create File object
        File imageFile = new File("img.jpg");

        // Step 2: Read image from file
        BufferedImage image = ImageIO.read(imageFile);

        // Step 3: Access image properties
        int width = image.getWidth();
        int height = image.getHeight();

        System.out.println("Image read successfully!");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);

    } catch (IOException e) {
        System.out.println("Error: Image file not found or cannot be read.");
    }
		

	}

}