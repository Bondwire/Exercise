package zjava.konstruktory;



public class Main01 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(1,5);
        calc.minus(7,4);
        calc.multiply(3,3);
        calc.divide(8,4);
        calc.printOperations();
        calc.clearOperations();

        System.out.println();
        System.out.println("Po wyczyszczeniu:");
        calc.printOperations();
    }
}