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

        //Матрица четкости
        int[][] kernel = {{0, -1, 0}, {-1, 5, -1}, {0, -1, 0}};
        //Матрица размытия
//        int[][] kernel = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int div = getDiv(kernel);
        int offset = 0;

        final int COLORS_COUNT_IN_RGB = 3;
        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        int[] pixels = new int[kernel.length * kernel[0].length * COLORS_COUNT_IN_RGB];

        final int RED_COMPONENT_INDEX = 0;
        final int GREEN_COMPONENT_INDEX = 1;
        final int BLUE_COMPONENT_INDEX = 2;

        for (int y = 0; y < height; y++) {
            if (y >= height - kernel.length) {
                break;
            }
            for (int x = 0; x < width; x++) {
                if (x >= width - kernel[0].length) {
                    break;
                }
                int[] newPixels = raster.getPixels(x, y, kernel.length, kernel[0].length, pixels).clone();
                int[][] redComponentMatrix = getComponentMatrix(newPixels, kernel.length, RED_COMPONENT_INDEX);
                int[][] greenComponentMatrix = getComponentMatrix(newPixels, kernel.length, GREEN_COMPONENT_INDEX);
                int[][] blueComponentMatrix = getComponentMatrix(newPixels, kernel.length, BLUE_COMPONENT_INDEX);

                raster.getPixel(x + 1, y + 1, pixel);
                pixel[0] = getModifiedComponent(redComponentMatrix, kernel, div, offset);
                pixel[1] = getModifiedComponent(greenComponentMatrix, kernel, div, offset);
                pixel[2] = getModifiedComponent(blueComponentMatrix, kernel, div, offset);
                raster.setPixel(x, y, pixel);
            }
        }
        ImageIO.write(image, "png", new File("out.png"));
    }

    private static int getModifiedComponent(int[][] componentMatrix, int[][] kernel, int div, int offset) {
        int sum = 0;
        for (int i = 0; i < componentMatrix.length; i++) {
            for (int j = 0; j < componentMatrix[0].length; j++) {
                componentMatrix[i][j] *= kernel[i][j];
                sum += componentMatrix[i][j];
            }
        }
        return sat((sum / div) + offset);
    }

    private static int[][] getComponentMatrix(int[] pixels, int kernelLength, int componentIndex) {
        int[][] componentMatrix = new int[kernelLength][kernelLength];

        int count = componentIndex;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                componentMatrix[i][j] = pixels[count];
                count += 3;
            }
        }
        return componentMatrix;
    }

    private static int sat(int component) {
        final int MIN = 0;
        final int MAX = 255;

        if (component < MIN) {
            return MIN;
        }
        if (component > MAX) {
            return MAX;
        }
        return component;
    }

    private static int getDiv(int[][] kernel) {
        int div = 0;
        for (int[] value : kernel) {
            for (int j = 0; j < kernel[0].length; j++) {
                div += value[j];
            }
        }
        return div;
    }
}