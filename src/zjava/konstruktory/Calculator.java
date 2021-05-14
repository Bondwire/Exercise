package zjava.konstruktory;

public class Calculator {

    private String[] operations; // Konstruktor ma nie przyjmować żadnych danych. Każdy nowo stworzony obiekt powinien mieć tablicę String,

    

    public double add(double num1, double num2) {
        double result = num1 + num2;
        String operations = "added" + num1 + "to" + num2 + "got + result";

        return result;
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