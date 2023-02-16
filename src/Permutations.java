public class Permutations {
    public static void main(String args[]) {
        printPermutations(0, "ABC");
    }

    public static void printPermutations(int fixed, String str) {
        // base case
        char[] chr = str.toCharArray();
        if (fixed == str.length())
            System.out.println(str);
        // swap
        for (int i = fixed; i < str.length(); i++) {
            char ch = chr[i];
            chr[i] = chr[fixed];
            chr[fixed] = ch;
            printPermutations(fixed + 1, new String(chr)); // recursive call
        }
    }
}