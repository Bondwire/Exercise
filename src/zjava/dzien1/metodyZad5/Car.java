package zjava.dzien1.metodyZad5;

public class Car {
    private String brand;
    private String model;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return this.model + " " + this.price;
    }


//W pliku Main01.java umieść w metodzie main kod, który utworzy obiekt klasy Person o nazwie person
// , a następnie ustawi za pomocą wcześniej utworzonych metod wszystkie atrybuty klasy.

    public static void main(String[] args) {
        Car auto = new Car();
        auto.setModel("Ford");
        //auto.setPrice("200000.00"); // dlaczego nie wypisze double
        System.out.println(auto.getModel());
        System.out.println(auto.getPrice());
    }
}