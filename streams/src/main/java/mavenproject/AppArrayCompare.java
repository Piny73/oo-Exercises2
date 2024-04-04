package mavenproject;

import java.util.Arrays;

public class AppArrayCompare {

    public static <T> boolean compare_Arrays(T[] array1, T[] array2) {

        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,5};
        Integer[] arr2 = {1,2,4,5};
        System.out.println("Elementi dei due Array:");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("\nCompare arr1 and arr2: " + compare_Arrays(arr1, arr2));
    }
}
