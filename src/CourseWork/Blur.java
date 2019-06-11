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
        
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        WritableRaster outputImageRaster = outputImage.getRaster();
        
        //Матрица четкости
//        int[][] kernel = {{0, -1, 0}, {-1, 5, -1}, {0, -1, 0}};
        //Матрица размытия
        double[][] kernel = {{1.0/9.0, 1.0/9.0, 1.0/9.0}, {1.0/9.0, 1.0/9.0, 1.0/9.0}, {1.0/9.0, 1.0/9.0, 1.0/9.0}};
        
        final int COLORS_COUNT_IN_RGB = 3;
        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        int[] pixels = new int[kernel.length * kernel[0].length * COLORS_COUNT_IN_RGB];

        final int RED_COMPONENT_INDEX = 0;
        final int GREEN_COMPONENT_INDEX = 1;
        final int BLUE_COMPONENT_INDEX = 2;
        
        for (int y = 0; y <= height - kernel.length; y++) {
            for (int x = 0; x <= width - kernel[0].length; x++) {
                raster.getPixels(x, y, kernel.length, kernel[0].length, pixels);
              
                int[][] redComponentMatrix = getComponentMatrix(pixels, kernel.length, RED_COMPONENT_INDEX);
                int[][] greenComponentMatrix = getComponentMatrix(pixels, kernel.length, GREEN_COMPONENT_INDEX);
                int[][] blueComponentMatrix = getComponentMatrix(pixels, kernel.length, BLUE_COMPONENT_INDEX);

                outputImageRaster.getPixel(x + 1, y + 1, pixel);
                pixel[0] = getModifiedComponent(redComponentMatrix, kernel);
                pixel[1] = getModifiedComponent(greenComponentMatrix, kernel);
                pixel[2] = getModifiedComponent(blueComponentMatrix, kernel);
                outputImageRaster.setPixel(x + 1, y + 1, pixel);
            }
        }
        ImageIO.write(outputImage, "png", new File("out.png"));
    }

    private static int getModifiedComponent(int[][] componentMatrix, int[][] kernel) {
        int sum = 0;
        for (int i = 0; i < componentMatrix.length; i++) {
            for (int j = 0; j < componentMatrix[0].length; j++) {
                componentMatrix[i][j] *= kernel[i][j];
                sum += componentMatrix[i][j];
            }
        }
        return sat(sum);
    }
    
    private static int getModifiedComponent(int[][] componentMatrix, double[][] kernel) {
        int sum = 0;
        for (int i = 0; i < componentMatrix.length; i++) {
            for (int j = 0; j < componentMatrix[0].length; j++) {
                componentMatrix[i][j] *= kernel[i][j];
                sum += componentMatrix[i][j];
            }
        }
        return sat(sum);
    }

    private static int[][] getComponentMatrix(int[] pixels, int kernelLength, int componentIndex) {
        int[][] componentMatrix = new int[kernelLength][kernelLength];

        int count = componentIndex;
        for (int i = 0; i < kernelLength; i++) {
            for (int j = 0; j < kernelLength; j++) {
                componentMatrix[i][j] = pixels[count];
                count += kernelLength;
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
}
