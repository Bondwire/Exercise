package zjava.dzien1.metodyZad2;

public class MainPerson {
    public static void main(String[] args) {
        Person a = new Person();

        a.setSurname("Kowalska");
        a.setAge(23);
        a.setName("Anna");
        a.setGender("pani");

        System.out.println(a.getSurname());
        System.out.println(a.getName());
        System.out.println(a.getGender());

    }

}
