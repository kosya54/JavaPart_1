package CourseWork.Apartments;

final class Building {
    private static final int APARTMENTS_PER_PORCH = 4;
    private int totalFloors;
    private int totalPorches;
    private int requiredApartment;

    Building(int totalFloors, int totalPorches, int requiredApartment) {
        this.totalFloors = totalFloors;
        this.totalPorches = totalPorches;
        this.requiredApartment = requiredApartment;
    }

    void showApartment() {
        int totalApartments = this.totalFloors * (this.totalPorches * Building.APARTMENTS_PER_PORCH);

        if (this.requiredApartment > totalApartments) {
            System.out.printf("Квартиры с номером %d в здании нет.", this.requiredApartment);
        } else {
            int[] apartment = this.findApartment();

            System.out.printf("Квартира %d находится в %d подъезде %d этажа%n", apartment[2], apartment[1], apartment[0]);
            System.out.printf("Квартира на лестничной площадке %s%n", this.getApartmentPosition(apartment[3]));
        }
    }

    private int[] findApartment() {
        int apartmentNumber = 1;

        for (int floorNumber = 1; floorNumber <= this.totalFloors; floorNumber++) {
            for (int porchNumber = 1; porchNumber <= this.totalPorches; porchNumber++) {
                for (int apartmentPosition = 1; apartmentPosition <= Building.APARTMENTS_PER_PORCH; apartmentPosition++, apartmentNumber++) {

                    if (apartmentNumber == this.requiredApartment) {
                        return new int[]{floorNumber, porchNumber, apartmentNumber, apartmentPosition};
                    }
                }
            }
        }
        return new int[]{};
    }

    private String getApartmentPosition(int apartmentPosition) {
        switch (apartmentPosition) {
            case 1:
                return "ближняя слева";
            case 2:
                return "дальняя слева";
            case 3:
                return "дальняя справа";
            case 4:
                return "ближняя справа";
        }
        return "";
    }
}