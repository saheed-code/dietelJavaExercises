package snacks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayReverse {
    public static int[] newArrayReverse(int[] array){
        int[] newArray = new int[array.length -1];
        for(int i = array.length - 1; i >= 0; i--){
            newArray[array.length - i -1] = array[i];
        }
        return newArray;
    }

    public static int[] subReverse(int[] array){
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i -1] = temp;
        }
        return array;
    }
    public static int[] subReverseWithLambda(int[] array){
        IntStream.range(0, array.length / 2).forEach(i -> {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        });
        return array;
    }

    public static int[] whileReverse (int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }

    public static int[] anotherForLoopReverse (int[] array){
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static int[] nestedForLoopReverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static int[] recursiveReverse(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        } else {
            int[] reversedArray = new int[array.length];
            reversedArray[0] = array[array.length - 1];
            int[] subArray = Arrays.copyOfRange(array, 0, array.length - 1);
            int[] reversedSubArray = recursiveReverse(subArray);
            System.arraycopy(reversedSubArray, 0, reversedArray, 1, reversedSubArray.length);
            return reversedArray;
        }
    }

    public static void main(String[] args) {
        int[] reverse = subReverse(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(reverse));

        System.out.println(Arrays.toString(whileReverse(new int[]{1, 2, 3, 4, 5})));
    }
}
