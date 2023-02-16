
public class StrPalindrome {
    public static void main(String[] args) {
        // Create method that accepts one String argument
        // and returns true if it is palindrome otherwise false
        // Palindrome is a string that reads the same backward
        // and forward
        System.out.println(isPal("anna")); // true
        System.out.println(isPal("apple")); // false
        System.out.println(isPal("civic")); //true
        System.out.println(isPal("a")); //true
        System.out.println(isPal("")); //true
        System.out.println("---");
        System.out.println(isPalTwo("anna")); // true
        System.out.println(isPalTwo("apple")); // false
        System.out.println(isPalTwo("civic")); //true
        System.out.println(isPalTwo("a")); //true
        System.out.println(isPalTwo("")); //true
    }

    public static boolean isPal(String str) {
        // reverse str
        StringBuilder revSb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            revSb.append(str.charAt(i));
        }

        // compare reversed str with original str
        return revSb.toString().equals(str);
    }

    //  0134
    // "anna"
    // "apple"
    public static boolean isPalTwo(String str) {
        int end = str.length() - 1;
        for (int start = 0; start < str.length() / 2; start++) {
            char sChar = str.charAt(start);
            char eChar = str.charAt(end);
            if (sChar != eChar) {
                return false;
            }
            end--;
        }
        return true;
    }
}