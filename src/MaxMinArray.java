import java.util.Arrays;

public class MaxMinArray {
    public static void main(String[] args) {
        // create a method that accepts one int array
        // method returns the biggest element from array
        // ex:
        System.out.println(max(new int[] {4, 5, 99, 8, 1, 2})); // 99
        System.out.println(max(new int[] {5, 5, 4, 3, 2})); // 5
        System.out.println(max(new int[] {1, 1, 1})); // 1
        System.out.println("---");
        System.out.println(min(new int[] {4, 5, 99, 8, 1, 2})); // 1
        System.out.println(min(new int[] {5, 5, 4, 3, 2})); // 2
        System.out.println(min(new int[] {1, 1, 1})); // 1
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int element : arr) {
            if (max < element) {
                max = element;
            }
        }

        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }
}
