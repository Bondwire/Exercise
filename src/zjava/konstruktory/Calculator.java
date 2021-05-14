package zjava.konstruktory;

import java.util.Arrays;

public class Calculator {

    private String[] operations; // Konstruktor ma nie przyjmować żadnych danych. Każdy nowo stworzony obiekt powinien mieć tablicę String,

    public Calculator() {
        this.operations = new String[0];
    }

    private void addToOperations(String operation) {
        // najpierw dodajemy w tablicy krotkę żeby wpisać do niej operację
        // robimy kopie tablicy o rozmiarze o jeden większym niż aktualna
        this.operations = Arrays.copyOf(this.operations, this.operations.length + 1);
        // w ostatnią komórkę tablicy wstawiamy operację
        this.operations[this.operations.length - 1] = operation;

    }

    public double add(double num1, double num2) {
        double result = num1 + num2;
        String operation = "dodawanie " + num1 + " to " + num2 + " got " + result;
        addToOperations(operation);
        return result;
    }

    public double minus(double num1, double num2) {
        double result = num1 - num2;
        String operation = "odejmowanie " + num1 + " to " + num2 + " got " + result;
        addToOperations(operation);
        return result;
    }

    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        String operation = "mnożenie " + num1 + " to " + num2 + " got " + result;
        addToOperations(operation);
        return result;
    }

    public double divide(double num1, double num2) {
        if (num1 == 0) {
            System.out.println("nie dzielimy przez 0 ");
        }
        if (num1 == 0) {
            System.out.println("nie dzielimy przez 0 ");
        }
        double result = num1 / num2;
        String operation = "dzielenie " + num1 + " to " + num2 + " got " + result;
        addToOperations(operation);
        return result;
    }
    public void printOperations() {
        // tak nie piszemy
//        for (int i=0; i<operations.length; i++) {
//            System.out.println(this.operations[i]);
//        }

        for (String s : this.operations) {
            System.out.println(s);
        }
    }

    public void clearOperations() {
        this.operations = new String[0];
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(1,5);
        calc.minus(7,4);
        calc.multiply(3,9);
        calc.divide(8,4);
        calc.printOperations();
        calc.clearOperations();

        System.out.println();
        System.out.println("Po wyczyszczeniu:");
        calc.printOperations();
    }
}




//Stwórz klasę Calculator. Konstruktor ma nie przyjmować żadnych danych. Każdy nowo stworzony obiekt powinien mieć tablicę String,
// w której będzie trzymać historię ostatnich operacji (stwórz ją w konstruktorze – z początkowym rozmiarem 0). Następnie dodaj do klasy następujące metody:
//
//add(num1, num2) – metoda ma dodać do siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "added num1 to num2 got result".
//multiply(num1, num2) – metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis:
// "multiplied num1 with num2 got result".
//subtract(num1, num2) – metoda ma odjąć od siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis:
// "subtracted num1 from num2 got result".
//divide(num1, num2) – metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis:
// "divided num1 by num2 got result". Pamiętaj, że nie można dzielić przez zero.
//printOperations() – metoda ma wypisać wszystkie zapamiętane operacje.
//clearOperations() – metoda ma wyczyścić wszystkie zapamiętane operacje.
//Możesz dopisać metodę pomocniczą, która będzie dodawała wpis na liście operacji oraz zwiększała rozmiar tablicy przez kopiowanie.
//
//Pamiętaj o używaniu this w odpowiednich miejscach. Stwórz kilka kalkulatorów i przetestuj ich działanie.