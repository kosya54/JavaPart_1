package CourseWork;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {
    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("image.jpg"));
        WritableRaster raster = image.getRaster();

        int width = raster.getWidth();
        int height = raster.getHeight();

        double[][] kernelArray = {{0.1111, 0.1111, 0.1111}, {0.1111, 0.1111, 0.1111}, {0.1111, 0.1111, 0.1111}};

        final int COLORS_COUNT_IN_RGB = 3;
        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        int[] inputPixels = new int[kernelArray.length * kernelArray[0].length * COLORS_COUNT_IN_RGB];

        for (int y = 0; y < height; y++) {
            if (y >= height - kernelArray.length) {
                break;
            }
            for (int x = 0; x < width; x++) {
                if (x >= width - kernelArray.length) {
                    break;
                }
                int[] outputPixels = raster.getPixels(x, y, kernelArray.length, kernelArray.length, inputPixels).clone();

                int[][] redPixels = getComponentMatrix(outputPixels, kernelArray.length, kernelArray[0].length, 0);
                int red = getBlurredPixel(redPixels, kernelArray);

                int[][] greenPixels = getComponentMatrix(outputPixels, kernelArray.length, kernelArray[0].length, 1);
                int green = getBlurredPixel(greenPixels, kernelArray);

                int[][] bluePixels = getComponentMatrix(outputPixels, kernelArray.length, kernelArray[0].length, 2);
                int blue = getBlurredPixel(bluePixels, kernelArray);

                raster.getPixel(x + 1, y + 1, pixel);
                pixel[0] = red;
                pixel[1] = green;
                pixel[2] = blue;
                raster.setPixel(x + 1, y + 1, pixel);
            }
        }
        ImageIO.write(image, "png", new File("out.png"));
    }

    private static int[][] getComponentMatrix(int[] array, int width, int height, int index) {
        int[][] matrix = new int[height][width];
        int count = index;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = array[count];
                count += 3;
            }
        }
        return matrix;
    }

    private static int getBlurredPixel(int[][] matrix, double[][] kernelArray) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] *= kernelArray[i][j];
                sum += matrix[i][j];
            }
        }
        return sat(sum);
    }

    private static int sat(int number) {
        final int MIN = 0;
        final int MAX = 255;

        if (number < MIN) {
            return MIN;
        }
        if (number > MAX) {
            return MAX;
        }
        return number;
    }
}