public class NumberPalindrome {
    public static void main(String[] args) {
        // Create method that accepts one int argument
        // and returns true if it is palindrome otherwise false
        // Palindrome is an int that reads the same backward
        // and forward


        System.out.println(isNumPal(121)); // true
        System.out.println(isNumPal(123)); // false
        System.out.println(isNumPal(12344321)); // true
        System.out.println("---");
        System.out.println(isNumPal(0)); // true
        System.out.println(isNumPal(-121)); // true
        System.out.println(isNumPal(-123)); // false
        System.out.println(isNumPal(1)); // true
    }

    public static boolean isNumPal(int num) {
        // num % 10 -> gets most right number
        // num / 10 -> removes most right number
        // num * 10 + value -> to append the value to number
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int rightMost = num % 10; // get right most from num
            reversed = reversed * 10 + rightMost; // append right most to reverse variable
            num = num / 10; // remove right most from num
        }

        System.out.println("original: " + original);
        System.out.println("reversed: " + reversed);

        // compare reversed and original
        return original == reversed;
    }
}
