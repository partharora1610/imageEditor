import java.awt.image.BufferedImage;
import java.awt.Color;

public class GetPixels {

    public int getWidth(BufferedImage inputImage) {
        return inputImage.getWidth();
    }

    public int getHeight(BufferedImage inputImage) {
        return inputImage.getHeight();
    }

    // This method just returns the rhb value that sit at a particular index in the 2D matrix
    // we can access the rgb value and then modify the rgb value to get the desired result...
    public int[] getRGB(BufferedImage inputImage, int x, int y) {
        Color color = new Color(inputImage.getRGB(x, y));
        int[] rgb = new int[3];
        rgb[0] = color.getRed();
        rgb[1] = color.getGreen();
        rgb[2] = color.getBlue();
        return rgb;
    }
}

