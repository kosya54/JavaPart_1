package CourseWork;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Blur {
    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("image.jpg"));
        WritableRaster raster = image.getRaster();

        int width = raster.getWidth();
        int height = raster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;
//        int[] pixel = new int[COLORS_COUNT_IN_RGB];
//        double[][] blurMatrix = {{1 / 9, 1 / 9, 1 / 9}, {1 / 9, 1 / 9, 1 / 9}, {1 / 9, 1 / 9, 1 / 9}};
        double[][] blurMatrix = {{0.2, 0.3, 0.4}, {0.2, 0.3, 0.4}, {0.2, 0.3, 0.4}};
        int[] array = new int[blurMatrix.length * blurMatrix[0].length * COLORS_COUNT_IN_RGB];

        int y = 0;
        int x = 0;

        while (y < height - 2 && x < width - 2) {
            int[][] matrix = convertArrayToMatrix(raster.getPixels(x, y, blurMatrix[0].length, blurMatrix.length, array), blurMatrix[0].length, blurMatrix.length);
            double[][] result = myltiplyMatrix(blurMatrix, matrix);
            double[] arr = convertMatrixToArray(result);
            System.out.println(arr.length);
           raster.setPixels(x, y, 9, 9, arr);

            System.out.println();

            y += 3;
            x += 3;
        }

        ImageIO.write(image, "png", new File("out.png"));
    }

    private static int[][] convertArrayToMatrix(int[] array, int width, int height) {
        int[][] matrix = new int[height][width];
        int count = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = array[count];
                ++count;
            }
        }
        return matrix;
    }

    private static double[] convertMatrixToArray(double[][] matrix) {
        int arrayLength = matrix.length * matrix[0].length;
        double[] result = new double[arrayLength];

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[count] = matrix[i][j];
            }
        }
        return result;
    }

    private static double[][] myltiplyMatrix(double[][] matrix1, int[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return result;
    }

}

/*        for (int y = 2; y < height; ++y) {
            for (int x = 0; x < width; ++x) {
                System.out.println(Arrays.toString(raster.getPixel(x, y, pixel)));

                int result = (int) (0.3 * pixel[0] + 0.59 * pixel[1] + 0.11 * pixel[2]);
                for (int k = 0; k < pixel.length; ++k) {
                    pixel[k] = result;
                }
                raster.setPixel(x, y, pixel);
                break;
            }
            break;
        } */