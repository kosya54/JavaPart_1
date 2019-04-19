package CourseWork.Apartments;

public final class Building {
    private static final int APARTMENTS_PER_PORCH = 4;
    private int totalFloors;
    private int totalPorches;
    private int requiredApartment;
    private int[][][] apartments;

    public Building(int totalFloors, int totalPorches, int requiredApartment) {
        this.totalFloors = totalFloors;
        this.totalPorches = totalPorches;
        this.requiredApartment = requiredApartment;
        this.apartments = new int[this.totalFloors][this.totalPorches][Building.APARTMENTS_PER_PORCH];
    }

    protected int[] findApartment() {
        int apartmentNumber = 1;

        for (int i = 0, floorNumber = 1; i < this.totalFloors; i++, floorNumber++) {
            for (int j = 0, porchNumber = 1; j < this.totalPorches; j++, porchNumber++) {
                for (int f = 0; f < Building.APARTMENTS_PER_PORCH; f++, apartmentNumber++) {
                    this.apartments[i][j][f] = apartmentNumber;

                    if (apartmentNumber == this.requiredApartment) {
                        //Return floor number -> porch number -> apartment number -> apartment position ->
                        return new int[] {floorNumber, porchNumber, apartmentNumber, f};
                    }
                }
            }
        }
        return new int[] {};
    }

    protected String getApartmentPosition(int apartmentPosition) {
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