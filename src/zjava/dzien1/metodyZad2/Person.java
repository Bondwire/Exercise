package zjava.dzien1.metodyZad2;

public class Person {

    private String surname;
    private int age;
    private String gender;
    private String name;

    public void setName(String name) {
        this.name = name;

    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void increaseAge(int i) {
        this.age += i;
    }

    public String getName() {
        return ("name :" + this.name);
    }

    public String getSurname() {
        return ("surname :" + this.surname);
    }

    public String getGender() {
        return ("gender :" + this.gender);
    }

    public String getage() {
        return ("age :" + this.age);
    }
}

