package zjava.inneZadania.Butelka;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Butelka {
    double ilelitrów;

    Butelka(double ilelitrów) {
        this.ilelitrów = ilelitrów;
    }
    double getIlelitrów()
    {
        return ilelitrów;
    }
    void wlej(double ilosc)
    {
        this.ilelitrów += ilosc;
    }
    void wylej (double ilosc)
    {
        this.ilelitrów -= ilosc;

    }


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Butelka[] butelka = new Butelka[3];

        butelka[0] = new Butelka(0);


        butelka[0].wlej(5);
        butelka[0].wylej(0);

        System.out.println(butelka[0].getIlelitrów());


    }
}
