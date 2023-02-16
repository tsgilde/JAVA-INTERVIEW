import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        // Write a method that accepts one int array and reverse it
        // method is void method, so you need to reverse argument array in place

        int[] inputArray = {7, 2, 5, 6};
        System.out.println(Arrays.toString(inputArray)); // [7, 2, 5, 6]
        revArray(inputArray);
        System.out.println(Arrays.toString(inputArray)); // [6, 5, 2, 7]

        inputArray = new int[] {};
        System.out.println(Arrays.toString(inputArray));
        revArray(inputArray);
        System.out.println(Arrays.toString(inputArray));

        //inputArray = null;
        //System.out.println(Arrays.toString(inputArray));
        //revArray(inputArray);
        //System.out.println(Arrays.toString(inputArray));

        // 1. I will be using two pointers one for the end and one for start of the array
        // 2. Then I will iterate over the half of the array and keep swapping end with start

        // Reverse argument array and return it as new array
        int[] inputArrayTwo = {1, 2, 3};
        int[] revArray = getRevArray(inputArrayTwo);

        System.out.println(Arrays.toString(inputArrayTwo));
        System.out.println(Arrays.toString(revArray));
    }

    public static void revArray(int[] arr) {
        int end = arr.length - 1;

        for (int start = 0; start < arr.length / 2; start++) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            end--;
        }
    }

    public static int[] getRevArray(int[] arr) {
        int[] revResArray = new int[arr.length];

        int start = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revResArray[start++] = arr[i];
        }

        return revResArray;
    }
}