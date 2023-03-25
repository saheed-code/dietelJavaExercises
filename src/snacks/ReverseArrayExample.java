package snacks;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayExample {
    public static void main(String[] args) {
        // create an array
        Integer[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Original array: " + Arrays.toString(array));

        // reverse the array
        Collections.reverse(Arrays.asList(array));
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}
