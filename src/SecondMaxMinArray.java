import java.util.Arrays;

public class SecondMaxMinArray {
    public static void main(String[] args) {
        // Create a method that accepts int array
        // and returns the second-biggest element

        int secondMax = secondMax(new int[] {1, 2, 3, 4});
        System.out.println(secondMax); // 3

        secondMax = secondMax(new int[] {1, 2, 4, 4});
        System.out.println(secondMax); // 2

        System.out.println("---");
        secondMax = secondMax(new int[] {9});
        System.out.println(secondMax); // 9

        secondMax = secondMax(new int[] {4, 4, 4, 4});
        System.out.println(secondMax); // 4
    }

    // 1. Find max and save the value
    // 2. Find second max by ignoring the saved max
    public static int secondMax(int[] arr) {
        // find the max
        int max = arr[0];
        for (int el : arr) {
            if (max < el) {
                max = el;
            }
        }

        // find the second max by ignoring the max
        int secondMax = Integer.MIN_VALUE;
        for (int el : arr) {
            if (secondMax < el && el != max) {
                secondMax = el;
            }
        }

        // if there is no second max (single element or all elements are same)
        if (secondMax == Integer.MIN_VALUE) {
            return max;
        }

        return secondMax;
    }

    // 1. Find max and save the value
    // 2. Find second max by ignoring the saved max
    public static int secondMin(int[] arr) {
        // find the max
        int min = arr[0];
        for (int el : arr) {
            if (min > el) {
                min = el;
            }
        }

        // find the second max by ignoring the max
        int secondMax = Integer.MAX_VALUE;
        for (int el : arr) {
            if (secondMax > el && el != min) {
                secondMax = el;
            }
        }

        // if there is no second max (single element or all elements are same)
        if (secondMax == Integer.MAX_VALUE) {
            return min;
        }

        return secondMax;
    }

}