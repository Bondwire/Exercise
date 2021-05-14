package zjava.dzien1.pracaDomowa;

public class Author {
    private double id;
    private String firstName;
    private String lastName;
    private String pseudonim;

    public Author(double id, String firstName, String lastName, String pseudonim) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pseudonim = pseudonim;
    }

    public Author() {

    }

    public static void main(String[] args) {
        Author autor1 = new Author();
        autor1.lastName = "Rej";
        autor1.firstName = "Mikołaj";
        autor1.pseudonim = "nie posiaada";
        autor1.id = 3;

        Author[] additionalAuthors = new Author[3];
        additionalAuthors [0] = new Author();
        additionalAuthors [1] = new Author();
        additionalAuthors [2] = new Author();

        additionalAuthors [0].lastName = "Prus";
        additionalAuthors [1].firstName = "Bolesław";
    }
    public void setId(double id) {
        this.id = id; }
    public void setFirstName(String firstName) {
        this.firstName = firstName; }
    public void setLastName(String lastName) {
        this.pseudonim = pseudonim; }

    public String getId() {
        return ("name :" + this.id); }
    public String getFirstName() {
        return ("surname :" + this.firstName); }
    public String getLastName() {
        return ("gender :" + this.lastName); }
    public String getPseudonim() {
        return ("age :" + this.pseudonim); }
    }


