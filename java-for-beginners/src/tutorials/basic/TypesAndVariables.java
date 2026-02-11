package tutorials.basic;

public class TypesAndVariables {

    public static void main(String[] args) {
        int number;
        number = 5;
        number = 10;
        number = number + 1;
        number += 1;
        System.out.println("Number: " + number);

        int numb2 = 7;
        System.out.println(numb2 + number);
        System.out.println("New number: " + numb2 + number);
        System.out.println("New number: " + (numb2 + number));

        double x = 2.5;
        x = number;
        System.out.println(x);

        String hello = "Hello World!";
        System.out.println(hello);
        hello = "Hello ";
        String name = "Kristina";
        System.out.println(hello + name);
    }
}
