import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NMaxMinArray {
    public static void main(String[] args) {
//        System.out.println(maxN(new int[] {1, 2, 3}, 2)); // 2
//        System.out.println(maxN(new int[] {1, 2, 3}, 1)); // 3
//        System.out.println(maxN(new int[] {1, 2, 3}, 3)); // 1
//        System.out.println(maxN(new int[] {3, 2, 5, 6, 7}, 2)); // 6
//        System.out.println(maxN(new int[] {3, 2, 5, 6, 7}, 4)); // 3
//    }
//
//    /**
//     * maxN([1, 2, 3], 2)       -> 2
//     * maxN([1, 2, 3], 1)       -> 3
//     * maxN([1, 2, 3], 3)       -> 1
//     * maxN([3, 2, 5, 6, 7], 2) -> 6
//     * maxN([3, 2, 5, 6, 7], 4) -> 3
//     */
//    public static int maxN(int[] arr, int n) {
//        Arrays.sort(arr);
//        return arr[arr.length - n];
        System.out.println(maxN(new int[] {1, 2, 3}, 2)); // 2
        System.out.println(maxN(new int[] {1, 2, 3}, 1)); // 3
        System.out.println(maxN(new int[] {1, 2, 3}, 3)); // 1
        System.out.println(maxN(new int[] {3, 2, 5, 6, 7}, 2)); // 6
        System.out.println(maxN(new int[] {3, 2, 5, 6, 7}, 4)); // 3
        System.out.println("---");

        System.out.println(maxNTwo(new int[] {3, 2, 5, 6, 7}, 2)); // 6
        System.out.println(maxNTwo(new int[] {3, 2, 5, 6, 7}, 4)); // 3
        System.out.println(maxNTwo(new int[] {7, 7, 7, 7, 7}, 4)); // 7
        System.out.println(maxNTwo(new int[] {7}, 1)); // 7
        // System.out.println(maxNTwo(new int[] {7}, 2)); //
    }

    /**
     * maxN([1, 2, 3], 2)       -> 2
     * maxN([1, 2, 3], 1)       -> 3
     * maxN([1, 2, 3], 3)       -> 1
     * maxN([3, 2, 5, 6, 7], 2) -> 6
     * maxN([3, 2, 5, 6, 7], 4) -> 3
     */
    public static int maxN(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[arr.length - n];
    }

    public static int maxNTwo(int[] arr, int n) {
        if (arr.length < n) {
            throw new IllegalArgumentException("n should be within the range of arr");
        }

        List<Integer> maxNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;

            for (int el : arr) {
                if (max < el && !maxNumbers.contains(el)) {
                    max = el;
                }
            }

            if (max != Integer.MIN_VALUE) {
                maxNumbers.add(max);
            }
        }

        return maxNumbers.get(maxNumbers.size() - 1);
    }
}