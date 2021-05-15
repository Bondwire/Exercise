package zjava.inneZadania.Atrybyty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class porównywanieAtrybutow {
    public String name;
    public double price;
    public String author;
    public int catalogNumber;

    public String toString() {
        return "This is my Book";
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("podaj cennę dla ksiązki book1.price");
        System.out.println("podaj cene książki");

        porównywanieAtrybutow book1 = new porównywanieAtrybutow();
        book1.name = "Rok 1984";
        book1.price = Double.parseDouble(br.readLine());
        System.out.println("podaj cennę dla ksiązki book1.price");
        book1.author = "Prus";
      //  System.out.println("podaj autora");
        book1.catalogNumber = 12;

        porównywanieAtrybutow book2 = new porównywanieAtrybutow();
        book2.name = "Rok 1984";
        book2.price = Double.parseDouble(br.readLine());
        System.out.println("podaj cene książki");
        book2.author = "Prus";
      //  System.out.println("podaj autora");
        book2.catalogNumber = 12;

        if (book1.price == book2.price && book1.author == book2.author)
            System.out.println("są takie same ");
        else
            System.out.println("nie są takie same ");
        //    if(cat.equals(dog))
        //         System.out.println("cat1 jest równy dog2");
        //   else
        //         System.out.println("cat1 jest różny od dog1");
    }
}
