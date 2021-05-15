package zjava.inneZadania.Butelka;


public class InitArray {
    private double StanKonta;


    public static void main(String[] args) {
        InitArray przelewy = new InitArray();


        int ARRAY_LENGTH = 10; // Deklaracja stałej
        int[] array = new int[ARRAY_LENGTH]; // Utworzenie tablicy

        // Obliczenie wartości dla każdego elementu tablicy
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        }

        System.out.printf("%s%10s%n", "Indeks", "Wartość"); // Nagłówki kolumn

        // Wyświetl wartości poszczególnych elementów tablicy
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%6d%10d%n", counter, array[counter]);
        }
    }
}