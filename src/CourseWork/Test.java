package CourseWork;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        final int COLORS_COUNT_IN_RGB = 3;
        double[][] kernelArray = {{0.1111, 0.1111, 0.1111}, {0.1111, 0.1111, 0.1111}, {0.1111, 0.1111, 0.1111}};
        System.out.println(kernelArray.length * kernelArray[0].length * COLORS_COUNT_IN_RGB);
    }
}
