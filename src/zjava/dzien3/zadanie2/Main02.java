package zjava.dzien3.zadanie2;

//Zadanie 2
//W pliku Main02.java umieszczony został program powodujący rzucenie wyjątku.
//
//uruchom program i zaobserwuj jaki wyjątek został rzucony,
//dodaj do kodu obsługę odpowiedniego wyjątku i uruchom ponownie program,
//zwróć uwagę czy jest to wyjątek kontrolowany, czy niekontrolowany i dlaczego.

public class Main02 {
    public static void main(String[] args) {
        int[] tab = {  5, 1, 6, 7, 8 } ;
        System.out.println(tab[21]);

        try {
            System.out.println(tab[1]);
            System.out.println(tab[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny indeks");
        }
    }
}