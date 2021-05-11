package zjava.dzien1.atrybuty;

//W pliku Main02.java, w metodzie main, utwórz obiekt klasy AccessModifier o nazwie testAttribute,
//a następnie ustaw i wyświetl wszystkie wartości, które są możliwe do ustawienia.

//Utwórz klasę AccessModifier dodaj w niej atrybuty:
//
//atrybut o nazwie publicAttribute z modyfikatorem public,
//atrybut o nazwie privateAttribute z modyfikatorem private,
//atrybut o nazwie protectedAttribute z modyfikatorem protected.
//W pliku Main01.java umieść w metodzie main kod, który:
//
//Utworzy obiekt klasy AccessModifier i przypisze go do zmiennej testAttribute.
//Sprawdź które z atrybutów klasy AccessModifier są dostępne.

public class Main02_atrybuty {
    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.publicAttribute = "public";
        testAttribute.protectedAttribute = "protected";
       //testAttribute.privateAttribute = "prywatny";
        System.out.println(testAttribute.publicAttribute);
        System.out.println(testAttribute.protectedAttribute);
        System.out.println(testAttribute);

    }
}
