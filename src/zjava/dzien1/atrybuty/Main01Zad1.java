package zjava.dzien1.atrybuty;

//Utwórz klasę AccessModifier dodaj w niej atrybuty:
//
//atrybut o nazwie publicAttribute z modyfikatorem public,
//atrybut o nazwie privateAttribute z modyfikatorem private,
//atrybut o nazwie protectedAttribute z modyfikatorem protected.
//W pliku Main01.java umieść w metodzie main kod, który:
//
//Utworzy obiekt klasy AccessModifier i przypisze go do zmiennej testAttribute.
//Sprawdź które z atrybutów klasy AccessModifier są dostępne.

public class Main01Zad1 {

    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.publicAttribute = "public";
        testAttribute.protectedAttribute = "protected";
        //testAttribute.privateAttribute = "x"; nie da się go stąd ustawić;
        System.out.println(testAttribute.protectedAttribute);
    }
}
