package lesson9.HomeWork;

public class ToUpperCase {
    public static void main(String[] args) {
        String[] array = new String[]{"Приветствую тебя, пустынный уголок,",
                "Приют спокойствия, трудов и вдохновенья,",
                "Где льется дней моих невидимый поток",
                "На лоне счастья и забвенья.",
                "Я твой: я променял порочный двор цирцей,",
                "Роскошные пиры, забавы, заблужденья",
                "На мирный шум дубров, на тишину полей,",
                "На праздность вольную, подругу размышленья."};

        toUpperCase(array);

        for (String value : array) {
            System.out.println(value);
        }
    }

    private static void toUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }
}
