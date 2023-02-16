public class ReverseWords {
    public static void main(String[] args) {
        // Write the method that accepts string and returns string with
        // reversed words
        // ex:
        // revWords("I love java"); // java love I
        // revWords("hello world"); // world hello

        // 1. Split by " " and get array of words
        // 2. Read from back of the array and add to result string with space

        System.out.println(revWords("I love java"));
        System.out.println(revWords("hello world"));
        System.out.println(revWords("apple"));
    }

    public static String revWords(String str) {
        StringBuilder result = new StringBuilder();

        // "I love java" -> ["I", "love", "java"]
        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}