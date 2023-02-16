public class Swap {
    public static void main(String[] args) {
        int j = 15;
        int i = 10;

        // Swap values of i and j without creating any extra variable
        i = i + j; // 10 + 15 = 25
        j = i - j; // 25 - 15 = 10
        i = i - j; // 25 - 10 = 15

        System.out.println("i: " + i); // 15
        System.out.println("j: " + j); // 10
    }
}