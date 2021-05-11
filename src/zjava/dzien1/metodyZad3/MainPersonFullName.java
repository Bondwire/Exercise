package zjava.dzien1.metodyZad3;

import zjava.dzien1.metodyZad2.Person;

public class MainPersonFullName {

    public static void main(String[] args) {
        Person a = new Person();

        a.setSurname("Kowalska");
        a.setAge(23);
        a.setName("Anna");
        a.setGender("pani");

        System.out.println(a.getSurname() + a.getName());
        System.out.println(a.getName());
        System.out.println(a.getGender());

    }

}
