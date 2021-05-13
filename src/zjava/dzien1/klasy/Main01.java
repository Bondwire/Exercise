package zjava.dzien1.klasy;

//utwórz obiekt klasy Cat i przypisz do zmiennej cat,
//utwórz obiekt klasy Dog i przypisz do zmiennej dog,
//spróbuj porównać oba te obiekty za pomocą instrukcji if, zaobserwuj jaki wystąpi błąd.

public class Main01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        if(cat.equals(dog))
            System.out.println("cat1 jest równy dog2");
        else
            System.out.println("cat1 jest różny od dog1");

    }
}
