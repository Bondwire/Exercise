package zjava.inneZadania.Butelka;

import java.util.Arrays;

public class Array {


    public static void main(String[] args) {

    }

    public Integer[] addElementUsingPureJava(Integer[] srcArray, int elementToAdd) {
        Integer[] destArray = new Integer[srcArray.length+1];

        for(int i = 0; i < srcArray.length; i++) {
            destArray[i] = srcArray[i];
        }

        destArray[destArray.length - 1] = elementToAdd;
        return destArray;
    }

}
