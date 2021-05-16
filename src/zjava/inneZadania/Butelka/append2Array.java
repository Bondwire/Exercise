package zjava.inneZadania.Butelka;

import java.util.Arrays;

public class append2Array {

    public static <T> T[] append2Array(T[] elements, T element)
    {
        T[] newArray = Arrays.copyOf(elements, elements.length + 1);
        newArray[elements.length] = element;

        return newArray;
    }

    public static void main(String[] args) {
        String[] numbers = new String[]{"one", "two", "three"};
        System.out.println(Arrays.toString(numbers));
        numbers = append2Array(numbers, "four");
        System.out.println(Arrays.toString(numbers));
    }
}


