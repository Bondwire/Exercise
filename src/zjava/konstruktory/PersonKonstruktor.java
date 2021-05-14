package zjava.konstruktory;

public class PersonKonstruktor {
        private String name;
        private String surname;

    public PersonKonstruktor(String name, String surname, double age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public PersonKonstruktor(String name, double age) {
        this.name = name;
        this.age = age;
    }

    private double age;

    public PersonKonstruktor(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    private String gender;
}
