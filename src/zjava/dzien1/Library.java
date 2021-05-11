package zjava.dzien1;

//automatycznie uruchamia psvm
//sout

public class Library {
    public static void main(String[] args) {
        System.out.println("elooo siema");
        //zadzialalo ni trezeba refactor rename jak w nazwie packge java
        Book ksiazka = new Book();
        Book krzyzacy = new Book();

        //int nie wymaga new

        //te obiety powinny mieć wartości nie tutaaj tylko w book - bo jest bałagan
        ksiazka.author = "Rej";
    //    krzyzacy.price = 50;
    //    krzyzacy.catalogNumber = 1; jest prywatny - nie jest public tylkko static,
        ksiazka.price = -100;

        String a = krzyzacy.author;
        String b = ksiazka.name;
        double cena = krzyzacy.price;
        double c = ksiazka.price;

        System.out.println(cena);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
