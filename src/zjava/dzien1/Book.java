package zjava.dzien1;
//package
//klaa z duzej
//zjava.dzien2
//klasa ma nnazwe pliku - koniecznie

public class Book {
    public String name = "Ogniem i mieczem";
    public double price = 40;
    public String author = "Sienkiewicz";
    protected int catalogNumber = 10;

    public String toString() {
        return "This is my Book";
    }
        public void printInfo(){
            String bookInfo = this.author + " " + this.name;
            System.out.println(bookInfo);
        }
    }

