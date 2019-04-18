package CourseWork;

import java.util.Scanner;
import java.util.Locale;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter number of floor: ");
        int floor = scanner.nextInt();

        System.out.println("Enter number of porch: ");
        int porch = scanner.nextInt();

/*        System.out.println("Enter apartment number: ");
        int apartment = scanner.nextInt();
*/
        int apartmentPerFloor = porch * 4;
        int totalApartment = apartmentPerFloor * floor;

        int[][][] apartments = new int[floor][porch][4];
        int apartmentNumber = 1;

        for (int i = 0, floorNumber = 1; i < floor; i++, floorNumber++) {
            for (int j = 0, porchNumber = 1; j < porch; j++, porchNumber++) {
                for (int f = 0; f < 4; f++, apartmentNumber++) {
                    System.out.printf("Этаж: %d Подъезд: %d Квартира: %d%n", floorNumber, porchNumber, apartmentNumber);
                    apartments[i][j][f] = apartmentNumber;

                }
            }
        }



/*        for (int[][] floorN: apartments) {
            for (int[]) {

            }
        } */

/*    for (int numFloor = 1; numFloor <= floor; numFloor++, apartmentPerFloor += apartmentPerFloor) {
      if (apartment < apartmentPerFloor) {
        System.out.printf("Apartment number: %d%n Floor: %d%n", apartment, numFloor);
        break;
      }
    } */


//    System.out.printf("Floor: %d%n Porch: %d%n Apartment per floor: %d%n Total apartment: %d%n", floor, porch, apartmentPerFloor, totalApartment);
    }
//  private static int apartment() {}
}