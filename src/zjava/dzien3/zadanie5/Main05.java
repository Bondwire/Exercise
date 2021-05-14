package zjava.dzien3.zadanie5;

public class Main05 {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("ere");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }
}