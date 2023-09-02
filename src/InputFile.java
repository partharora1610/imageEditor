import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InputFile {
    // This method just takes path of the image checks if the image with that name exist and then
    // reads that file using the try and catch block in case the tasks fails to read image.
    public BufferedImage inputFile() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the image file name: ");
        String fileName = scanner.nextLine();

        File imageFile = new File("assets//" + fileName);

        if (!imageFile.exists()) {
            System.out.println("File not found: " + fileName);
            scanner.close();
            return null;
        }
        System.out.println("Image file found: " + fileName);

        BufferedImage inputImage = null;
        try {
            inputImage = ImageIO.read(imageFile);
        } catch (IOException e) {
            System.out.println("Error reading image file: " + fileName);
            // return null;
        }

        System.out.println("Image file read: " + fileName);
        return inputImage;

    }
}
