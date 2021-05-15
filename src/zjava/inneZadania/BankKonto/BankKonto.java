package zjava.inneZadania.BankKonto;

public class BankKonto {
    private int number;
    private double cash;

    BankKonto(double amount) {
        this.cash = amount;
    }

    double getCash() {
        return cash;
    }

    void depositCash(double amount) {
        this.cash = cash + amount;
    }

    double withdrawCash(double amount) {
        double value = 0;
        if (amount < 0)
            if (cash > amount) {
                cash = cash - amount;
                value = amount;
            } else {
                value = cash;
                cash = 0;
            }
        return value;
    }

    String printInfo() {
        return "Nr konta:" + number + "środki na koncie zostały pobrane" + cash;
    }

    public static void main(String[] args) {
        
    }
}


//twórz klasę BankAccount, która ma spełniać następujące wymogi:
//
//Mieć prywatne atrybuty:
//number - atrybut ten powinien trzymać numer identyfikacyjny konta (dla uproszczenia możemy założyć że numerem konta może być dowolna liczba całkowita),
//cash - atrybut określający ilość pieniędzy na koncie. Ma to być liczba zmiennoprzecinkowa. Atrybut cash powinien być zawsze nastawiany na 0 dla nowo tworzonego konta.
//Posiadać konstruktor przyjmujący tylko numer konta.
//Posiadać gettery do atrybutów number i cash, ale NIE posiadać do nich setterów
// (nie chcemy żeby raz stworzone konto mogło zmienić swój numer, a do atrybutu cash dodamy specjalne funkcje modyfikujące jego wartość).
//Posiadać metodę void depositCash(amount) której rolą będzie zwiększenie wartości atrybutu cash o podaną wartość. Pamiętaj o sprawdzeniu czy podana wartość jest:
//Większa od 0
//Posiadać metodę double withdrawCash(amount) której rolą będzie zmniejszenie wartości atrybutu cash
// o podaną wartość. Metoda ta powinna zwracać ilość wypłaconych pieniędzy. Dla uproszczenia zakładamy że ilość pieniędzy na koncie nie może zejść
// poniżej 0, np. jeżeli z konta na którym jest 300zł próbujemy wypłacić 500zł to metoda zwróci nam tylko 300zł. Pamiętaj o sprawdzeniu czy podana wartość jest:
//Większa od 0
//Posiadać metodę String printInfo() nie przyjmującą żadnych parametrów. Metoda ta ma zwracać informację o numerze konta i jego stanie.