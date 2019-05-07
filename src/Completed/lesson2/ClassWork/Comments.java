package Completed.lesson2.ClassWork;

/**
 * Что то, где то, как то ...
 *
 */
public class Comments {
    public static void main(String[] args) {
        int radius = 10;
        System.out.println("Радиус = " + radius);
        System.out.println("Площадь круга = " + getAreaCircle(radius));
        System.out.println("Длина окружности = " + getLengthCircle(radius));

        int area = 200;
        System.out.println(System.lineSeparator() + "Площадь = " + area);
        System.out.println("Радиус круга = " + getRadiusCircle(area));

        int angle = 60;
        System.out.println(System.lineSeparator() + "Радиус = " + radius + System.lineSeparator() + "Угол = " + angle);
        System.out.println("Площадь сектора = " + getSectorArea(radius, angle));
    }
    //TODO: Сделать отдельный класс с этими методами
    // Эта функция возвращает площадь круга
    private static double getAreaCircle(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    // Эта функция возвращает длину окружности
    private static double getLengthCircle(int radius) {
        return (2 * Math.PI * radius);
    }
    // Эта функция возвращает радиус окружности
    private static double getRadiusCircle(int area) {
        return Math.sqrt(area / Math.PI);
    }
    // Эта функция возвращает площадь сектора окружности
    private static double getSectorArea(int radius, int angle) {
        return ((Math.PI * Math.pow(radius, 2)) * (double)angle / 360);
    }
  /*
  private static void showCircle() {}
  */
}