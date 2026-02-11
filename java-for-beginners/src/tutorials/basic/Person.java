package tutorials.basic;

public class Person {
    String name; // instance variable
    static String lastname = "Larson";
    int age;

    // Constructor
    public Person(String name) {
        this.name = name;
        System.out.println("Person created.");
    }

    public String getName() {
        return name;
    }

    public static String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }
    
    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public String toString() {
        return this.name + " " + lastname + " is " + this.age + " years old.";
    }

    public void sayHelloTo(Person other) {
        System.out.println(getName() + " says hello to " + other.getName());
    }

}
