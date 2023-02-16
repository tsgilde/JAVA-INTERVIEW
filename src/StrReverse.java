public class StrReverse {
    public static void main(String[] args) {
        // Create a method that one string argument
        // and returns reverse version of it

        System.out.println(reverseStr("hello")); // olleh
        System.out.println(reverseStr("apple")); // elppa
        System.out.println(reverseStr("a")); // a
        System.out.println(reverseStr("")); //
        System.out.println(reverseStr(null)); // null

        // 1. Clarify the requirement
        // 2. Discuss your approach
        // 3. Start coding and try to explain your steps while coding
        // 4. Ask if test cases needed

        // StringBuilder vs StringBuffer
    }

    public static String reverseStr(String str) {
        if (str == null) {
            return str;
        }

        StringBuilder revRes = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            revRes.append(str.charAt(i));
        }

        return revRes.toString();

    }
}
