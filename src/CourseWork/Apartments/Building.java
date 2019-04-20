package CourseWork.Apartments;

final class Building {
    private static final int APARTMENTS_PER_PORCH = 4;
    private int totalFloors;
    private int totalPorches;
    private int requiredApartment;
    private int totalApartments;

    Building(int totalFloors, int totalPorches, int requiredApartment) {
        this.totalFloors = totalFloors;
        this.totalPorches = totalPorches;
        this.requiredApartment = requiredApartment;
        this.totalApartments = this.totalFloors * (this.totalPorches * Building.APARTMENTS_PER_PORCH);
    }

    void showApartment() {
        if (this.requiredApartment > this.totalApartments) {
            System.out.printf("Квартиры с номером %d в здании с нет.", this.requiredApartment);
        } else {
            int[] apartment = this.findApartment();

            System.out.printf("Квартира %d находится в %d подъезде %d этажа%n", apartment[2], apartment[1], apartment[0]);
            System.out.printf("Квартира на лестничной площадке %s%n", this.getApartmentPosition(apartment[3]));
        }
    }

    private int[] findApartment() {
        int apartmentNumber = 1;
        int[][][] apartments = new int[this.totalFloors][this.totalPorches][Building.APARTMENTS_PER_PORCH];

        for (int i = 0, floorNumber = 1; i < this.totalFloors; i++, floorNumber++) {
            for (int j = 0, porchNumber = 1; j < this.totalPorches; j++, porchNumber++) {
                for (int apartmentPosition = 0; apartmentPosition < Building.APARTMENTS_PER_PORCH; apartmentPosition++, apartmentNumber++) {
                    apartments[i][j][apartmentPosition] = apartmentNumber;

                    if (apartmentNumber == this.requiredApartment) {
                        //Return floor number -> porch number -> apartment number -> apartment position
                        return new int[]{floorNumber, porchNumber, apartmentNumber, apartmentPosition};
                    }
                }
            }
        }
        return new int[]{};
    }

    private String getApartmentPosition(int apartmentPosition) {
        switch (apartmentPosition) {
            case 0:
                return "ближняя слева";
            case 1:
                return "дальняя слева";
            case 2:
                return "дальняя справа";
            case 3:
                return "ближняя справа";
        }
        return "";
    }
}