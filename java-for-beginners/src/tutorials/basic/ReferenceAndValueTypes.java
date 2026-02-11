package tutorials.basic;

public class ReferenceAndValueTypes {
    public static void main(String[] args) {
        // Value Types:
        // byte, short, int, long, float, double, char, boolean
        // only passes the value, not the reference to the memory location
        int x = 5;
        int y = addOneTo(x);
        System.out.println(x);
        System.out.println(y);

        // Reference Types:
        // Objects, Arrays
        // passes the reference to the memory location, not the value itself
        Person john = new Person("John"); // created in memory
        john.setAge(30); // modifies the object in memory
        celebrateBirthday(john); // modifies the object in memory
        System.out.println(john.getName() + " is " + john.getAge() + " years old.");
    }

    private static void celebrateBirthday(Person john) {
        john.setAge(john.getAge() + 1); // modifies the object in memory
    }

    static int addOneTo(int number) {
        return number + 1;
    }
}
