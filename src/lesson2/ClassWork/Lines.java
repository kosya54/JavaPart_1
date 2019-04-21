package lesson2.ClassWork;

public class Lines {
    public static void main(String[] args) {
        System.out.println("Вариант №1:");
        printLinesVersion1();

        System.out.printf("%nВариант №2:%n");
        printLinesVersion2();

        System.out.printf("%nПечать даты и пути:%n");
        printDateAndPathToString();

        System.out.println("Печать результат:");
        printResult();
    }

    private static void printLinesVersion1() {
        String someString = "Здесь Пушкин погребен; он с музой молодою,\n" +
                            "С любовью леностью провел веселый век,\n" +
                            "Не делал доброго однако ж был душою,\n" +
                            "Ей-богу добрый человек.";
        String[] arraySomeString = someString.split(", ");

        for (String string: arraySomeString) {
            System.out.println(string);
        }
    }

    private static void printLinesVersion2() {
        System.out.println("Здесь Пушкин погребен; он с музой молодою," + System.lineSeparator() + "С любовью, леностью провел веселый век," + System.lineSeparator() + "Не делал доброго, однако ж был душою," + System.lineSeparator() + "Ей-богу, добрый человек.");
    }

    private static void printDateAndPathToString() {
        System.out.println("\"30\" августа 2014г." + System.lineSeparator() + "C:\\Windows\\System32\\Drivers\\etc\\hosts" + System.lineSeparator());
    }

    private static void printResult() {
        System.out.println("Результат = " + (14-10));
    }
}