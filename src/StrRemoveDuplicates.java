import java.util.LinkedHashSet;
import java.util.Set;

public class StrRemoveDuplicates {
    public static void main(String[] args) {
        // Write a method that will accept one String argument
        // return it without any duplicates

        System.out.println(removeDup("hello")); // helo
        System.out.println(removeDup("aaa")); // a
        System.out.println(removeDup("aaabba")); // ab
        System.out.println(removeDup("abc")); // abc
        System.out.println("---");

        System.out.println(removeDupTwo("hello")); // helo
        System.out.println(removeDupTwo("aaa")); // a
        System.out.println(removeDupTwo("aaabba")); // ab
        System.out.println(removeDupTwo("abc")); // abc
    }


    public static String removeDup(String str) {
        // load to set to remove duplicates
        Set<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        // get from the set as string and return it
        StringBuilder sbResult = new StringBuilder();
        for (char el : set) {
            sbResult.append(el);
        }
        return sbResult.toString();
    }

    public static String removeDupTwo(String str) {
        StringBuilder result = new StringBuilder();

        // loop over str
        for (char ch : str.toCharArray()) {

            // if result doesn't contain the char add otherwise do nothing
            if (!result.toString().contains(String.valueOf(ch))) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}