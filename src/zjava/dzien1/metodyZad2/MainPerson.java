package zjava.dzien1.metodyZad2;

public class MainPerson {
    public static void main(String[] args) {
        Person a = new Person();

        a.setSurname("Kowalska");
        a.setAge(23);
        a.setName("Anna");
        a.setGender("pani");
        a.setIncreaseAge();

        System.out.println(a.getSurname());
        System.out.println(a.getName());
        System.out.println(a.getGender());
        System.out.println(a.getage());
        System.out.println(a.getGetFullName());
        System.out.println(a.getIncreaseAge());
    }

}
