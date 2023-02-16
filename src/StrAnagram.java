import java.util.Arrays;

public class StrAnagram {
    public static void main(String[] args) {
        // Create a method that will check if two strings
        // are anagram or not
        // Anagram is when all the chars exist in another string
        // both way, but the order is not matter.

        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("triangle", "integral")); // true
        System.out.println(isAnagram("hello", "apple")); // false
        System.out.println(isAnagram("abc", "abe")); // false
        System.out.println(isAnagram("abc", "abce")); // false
        System.out.println("---");

        System.out.println(isAnagramTwo("listen", "silent")); // true
        System.out.println(isAnagramTwo("triangle", "integral")); // true
        System.out.println(isAnagramTwo("hello", "apple")); // false
        System.out.println(isAnagramTwo("abc", "abe")); // false
        System.out.println(isAnagramTwo("abc", "abce")); // false
    }

    public static boolean isAnagram(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            return false;
        }
        char[] arrOne = strOne.toCharArray();
        char[] arrTwo = strTwo.toCharArray();
        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);
        return Arrays.equals(arrOne, arrTwo);
    }

    public static boolean isAnagramTwo(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            return false;
        }
        char[] arrOne = strOne.toCharArray();
        char[] arrTwo = strTwo.toCharArray();
        sortChar(arrOne);
        sortChar(arrTwo);
        return Arrays.equals(arrOne, arrTwo);
    }

    public static void sortChar(char[] arr) {
        int swapCounter = -1;

        while (swapCounter != 0) {
            swapCounter = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    char tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapCounter++;
                }
            }
        }
    }
}