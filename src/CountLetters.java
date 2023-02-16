import java.util.LinkedHashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {
        // Write a method that accepts String as argument
        // and return map with key as each char and value as count
        // ex: "hello" -> {h=1, e=1, l=2, o=1}
        // "aaabbbc" -> {a=3, b=3, c=1}
        // "aaabbbc" -> "a3b3c1"

        System.out.println(countLetters("hello")); // {h=1, e=1, l=2, o=1}
        System.out.println(countLetters("aaabbbc")); // {a=3, b=3, c=1}
        System.out.println(countLetters("abc")); // {a=1, b=1, c=1}
        System.out.println("---");

        System.out.println(countLettersStr("hello")); // h1e1l2o1
        System.out.println(countLettersStr("aaabbbc")); // a3b3c1
        System.out.println(countLettersStr("abc")); // a1b1c1

    }

    public static Map<Character, Integer> countLetters(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            // if key(char) is in the map, it means we got this char before
            if (map.containsKey(ch)) {
                // get old value and put to the map with +1
                int value = map.get(ch);
                map.put(ch, value + 1);
            } else {
                // we are getting this char first time, put into the map with 1
                map.put(ch, 1);
            }
        }

        return map;
    }

    public static String countLettersStr(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            // if key(char) is in the map, it means we got this char before
            if (map.containsKey(ch)) {
                // get old value and put to the map with +1
                int value = map.get(ch);
                map.put(ch, value + 1);
            } else {
                // we are getting this char first time, put into the map with 1
                map.put(ch, 1);
            }
        }

        // {h=1, e=1, l=2, o=1} -> h1e1l2o1
        // How do iterate over the map?
        StringBuilder result = new StringBuilder();
        for(char key : map.keySet()) {
            int value = map.get(key);
            result.append(key).append(value);
        }
        return result.toString();
    }
}
