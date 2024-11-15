package Presentation;

public class HeapApp {

    public static void main(String[] args) {

        Person person = new Person("Vusal", 22);

        System.out.println("name: " + person.getName());
        System.out.println("age: " + person.getAge());
    }
}

class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

