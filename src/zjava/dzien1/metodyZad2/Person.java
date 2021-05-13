package zjava.dzien1.metodyZad2;

public class Person {

    private String surname;
    private int age = 1;
    private String gender;
    private String name;
    private String getFullName;
    public int increaseAge;

    public void setGetFullName(String złączenie_imienia_i_nazwiska) {
        this.getFullName = złączenie_imienia_i_nazwiska;
    }

    public String getGetFullName() {
        return ("imię i nazwisko: " + this.name + " " + this.surname);
    }

    public void setName(String name) {
        this.name = name; }
    public void setGender(String gender) {
        this.gender = gender; }
    public void setSurname(String surname) {
        this.surname = surname; }
    public void setAge(int age) {
        this.age = age; }
    public void setIncreaseAge() {
        this.age += 1;
    }
    public String getName() {
        return ("name :" + this.name); }
    public String getSurname() {
        return ("surname :" + this.surname); }
    public String getGender() {
        return ("gender :" + this.gender); }
    public String getage() {
        return ("age :" + this.age); }
    public String getIncreaseAge() {
        return ("++ age:" + this.increaseAge);
    }
}

