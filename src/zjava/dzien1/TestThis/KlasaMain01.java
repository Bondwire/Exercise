package zjava.dzien1.TestThis;

public class KlasaMain01 {
    public static void main(String[] args) {
        KlasaMain02 b = new KlasaMain02();
        b.setPercentage(444.5);
        b.setIBU("12323123213213");

        // nie możemy wydrukować bo zmienne są prywatne
        System.out.println(b.getIBU());
       // System.out.println(b);
    }


    }

