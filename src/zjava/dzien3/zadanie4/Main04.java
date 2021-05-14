package zjava.dzien3.zadanie4;

//Zadanie 4
//W pliku Main04.java znajduje się program z obsługą dwóch wyjątków.
//
//uruchom program i zaobserwuj jaki wyjątek został zwrócony,
//usuń komentarz i popraw kod tak, aby dodatkowy wyjątek z komentarza był poprawnie obsługiwany,
//uruchom ponownie program i zaobserwuj jaki wyjątek został zwrócony?

public class Main04 {
    public static void main(String[] args) {
        int a = 1, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Exception");
        }
//        catch (ArithmeticException c) {
//            System.out.println("Arithmetic Exception: You can't divide by 0");
//        }
    }
}