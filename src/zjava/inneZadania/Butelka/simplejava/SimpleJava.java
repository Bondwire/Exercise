package zjava.inneZadania.Butelka.simplejava;

import java.util.Arrays;

public class SimpleJava {

    public static void main(String[] args) {

        try{
            String[] transactions;
            transactions = new String[10];

            for(int i = 0; i < transactions.length; i++){
                transactions[i] = "transaction - "+Integer.toString(i);
            }

            System.out.println(Arrays.toString(transactions));

        }catch(Exception exc){
            System.out.println(exc.getMessage());
            System.out.println(Arrays.toString(exc.getStackTrace()));
        }
    }

}