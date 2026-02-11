package tutorials.basic;

public class ClassesAndObjects {

    public static void main(String[] args) {
        Person john = new Person("John");
        Person jane = new Person("Jane");
        john.setAge(30);
        jane.setAge(25);

        john.sayHelloTo(jane);
        jane.sayHelloTo(john);

        System.out.println(john.toString());
       
        // System.out.println(john.name + " is " + john.age + " years old.");

        Person[] people = {john, jane};
        for (Person person : people) {
            System.out.println(person.toString());
        }
        
    }
}
