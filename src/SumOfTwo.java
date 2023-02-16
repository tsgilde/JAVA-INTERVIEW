import java.util.Arrays;

public class SumOfTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfTwo(new int[] {1, 2, 3, 5}, 4))); // [1, 3]
        System.out.println(Arrays.toString(sumOfTwo(new int[] {7, 7, 4, 3, 8}, 7))); // [4, 3]
        System.out.println(Arrays.toString(sumOfTwo(new int[] {1, 4, 3, 2}, 5))); // [1, 4]
    }

    /**
     * //
     * sumOfTwo([1, 2, 3, 5], 4) -> [1, 3]
     * sumOfTwo([7, 7, 4, 3, 8], 7) -> [4, 3]
     * sumOfTwo([1, 4, 3, 2], 5) -> [1, 4]
     */
    public static int[] sumOfTwo(int[] numArr, int target) {
        for (int i = 0; i < numArr.length; i++) {

            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] + numArr[j] == target) {
                    return new int[] {numArr[i], numArr[j]};
                }
            }

        }
        return new int[] {-1, -1};
    }
}