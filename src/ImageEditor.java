import java.awt.image.BufferedImage;



public class ImageEditor {
    public void run() {
        BufferedImage inputImage = new InputFile().inputFile();

        if (inputImage != null) {
            int filterInput = new FilterInput().filterInput();
            BufferedImage outputImage = new Filters().applyFilters(inputImage, filterInput);
            System.out.println(outputImage);
            new OutputImage().outputImage(outputImage);
        }

    }
}
