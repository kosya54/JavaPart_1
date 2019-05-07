package Completed.lesson6.HomeWork;

public class Overload {
    public static void main(String[] args) {
        byte paramByte = 100;
        System.out.printf("Под переменную типа byte нужно %d байт.%n", getTypeSize(paramByte));

        short paramShort = 30000;
        System.out.printf("Под переменную типа short нужно %d байта.%n", getTypeSize(paramShort));

        int paramInt = 214000;
        System.out.printf("Под переменную типа int нужно %d байта.%n", getTypeSize(paramInt));

        long paramLong = 9900000L;
        System.out.printf("Под переменную типа long нужно %d байтов.%n", getTypeSize(paramLong));

        float paramFloat = 31.59f;
        System.out.printf("Под переменную типа float нужно %d байта.%n", getTypeSize(paramFloat));

        double paramDouble = 11.511;
        System.out.printf("Под переменную типа double нужно %d байтов.", getTypeSize(paramDouble));
    }

    private static int getTypeSize(byte param) {
        return 1;
    }

    private static int getTypeSize(short param) {
        return 2;
    }

    private static int getTypeSize(int param) {
        return 4;
    }

    private static int getTypeSize(long param) {
        return 8;
    }

    private static int getTypeSize(float param) {
        return 4;
    }

    private static int getTypeSize(double param) {
        return 8;
    }
}