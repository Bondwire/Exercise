package zjava.dzien1.atrybuty;


//Utwórz klasę Person, dodaj w niej atrybuty:
//
//name,
//surname,
//age,
//gender (typu char).
//Wszystkie atrybuty mają być publiczne i mają mieć ustawione wartości domyślne.
//
//W pliku Main03.java, w metodzie main, utwórz obiekt klasy Person o nazwie person,
//a następnie wyświetl kolejno atrybuty klasy (name, surname, age, gender).



public class Main03_klasa_Person_4pola {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.surname);
        System.out.println(person.name);
        System.out.println(person.gender);
        System.out.println(person.age);


    }
}
