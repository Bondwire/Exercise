package zjava.inneZadania.Metody;

public class IncreaseNumberTest {
    private int age;

    public String toString() {
        return "wypisz";
    }

        public static void main (String[]args){
            IncreaseNumberTest dodanieliczby = new IncreaseNumberTest();
            int age = 10;
            int increaseAge;

            increaseAge = age + 1;
            System.out.println(increaseAge);
            System.out.println(age++);
            System.out.println(++age);
            System.out.println("liczba to" + " " + dodanieliczby + " " + increaseAge + " " + age);
        }
    }

