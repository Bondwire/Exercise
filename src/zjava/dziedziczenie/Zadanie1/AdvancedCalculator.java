package zjava.dziedziczenie.Zadanie1;

import zjava.konstruktory.Calculator;

import java.util.Arrays;

public class AdvancedCalculator extends Calculator {

    private String[] operations; // Konstruktor ma nie przyjmować żadnych danych. Każdy nowo stworzony obiekt powinien mieć tablicę String,

    public AdvancedCalculator() {
        this.operations = new String[0];
    }

    private void addToOperations(String operation) {
        // najpierw dodajemy w tablicy krotkę żeby wpisać do niej operację
        // robimy kopie tablicy o rozmiarze o jeden większym niż aktualna
        this.operations = Arrays.copyOf(this.operations, this.operations.length + 1);
        // w ostatnią komórkę tablicy wstawiamy operację
        this.operations[this.operations.length - 1] = operation;

    }

    public double potegowanie (double num1, double num2) {
        double result = (int)Math.pow(num1, num2);
        String operation = "potegowanie" + num1 + " to " + num2 + " got " + result;
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