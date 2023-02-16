public class StaticKeyword {
    public static void main(String[] args) {
        // What's the output from this program and why?
        // What's static keyword in Java?
        // Static members are class variables. They don't belong to each object and they are shared among all objects of this class.
        // The correct way of using it is by class name

        Person john = new Person();
        john.name = "John";
        john.age = 35;
        Person.address = "101 Main St";

        System.out.println(john.name); // John
        System.out.println(john.age); // 35
        System.out.println(Person.address); // 101 Main St

        Person alex = new Person();
        System.out.println(alex.name); // null
        System.out.println(alex.age); // 0
        System.out.println(Person.address); // 101 Main St

        // Default values
        // Object  - null
        // Numeric - 0
        // Boolean - false
    }
}

class Person {
    public String name;
    public int age;
    public static String address;
}