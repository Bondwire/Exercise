package zjava.dzien1.metodyZad1;
// klasa Produkt z atrybutem name
public class Product {
    private String name;


    public void setName(String name) {
        this.name = name;
// metody zwracające set oraz get Name uwaga Name się zrobiło z dużej litery po SET
    }

    public String getName() {
        return ("name wynosi :" + this.name);
    }

}

//Utwórz klasę Product, dodaj w niej atrybut name.
//
//Dodaj metody setName (ustawiającą name) oraz getName (zwracającą name).
