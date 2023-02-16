public class StringPool {
    public static void main(String[] args) {
        String str = "apple";
        String strOne = "apple";
        String strTwo = new String("apple");

        System.out.println(str == strOne); // true
        System.out.println(str == strTwo); // false
        System.out.println(str.endsWith(strTwo)); // true

        // What's the output of this program and why?
        // Line 7: When we have two similar string values created
        //         without new keyword, java will utilize String Pool
        //         that will reuse the same objects

        // Line 8: When we create with new keyword we are not using
        //         StringPool

        // Line 9: equals compares the content
    }
}