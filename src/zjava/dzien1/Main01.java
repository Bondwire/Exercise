package zjava.dzien1;

public class Main01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        if(cat1.equals(dog1))
            System.out.println("cat1 jest równy dog2");
        else
            System.out.println("cat1 jest różny od dog1");

    }
}
