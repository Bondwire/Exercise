package zjava.dzien1.pracaDomowa;

public class Book {
    private int id;
    private String title;
    private boolean available;
    private Author author;

    public Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }


}






//Stwórz klasę Book, która ma spełniać następujące wymogi:
//
//Mieć prywatne atrybuty:
//id - atrybut typu int ten powinien trzymać numer identyfikacyjny książki,
//title - atrybut typu String określający imię pracownika,
//available - atrybut typu boolean określający czy książka jest możliwa do wypożyczenia, z domyślną wartością ustawioną na true, książka może być wypożyczona, lub np. w renowacji - ma wtedy atrybut określony na false.
//author - atrybut typu Author,
//additionalAuthors - tablica obiektów klasy Author.
//Posiadać konstruktor przyjmujący id, title.
//Posiadać konstruktor przyjmujący id, title, obiekt klasy Author.
//Posiadać konstruktor przyjmujący id, title, obiekt klasy Author, tablicę obiektów klasy Author.
//Posiadać gettery do wszystkich pól.
//Posiadać settery do wszystkich pól.