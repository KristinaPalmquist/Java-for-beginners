
package tutorials.basic;

public class Loops {

    public static void main(String[] args) {
        // whileLoop();
        //doWhileLoop();
        forLoop();
    }

    static void whileLoop() {
        int counter = 5;
        while (counter< 10) {
            counter++;
            System.out.println(counter);
        }
    }

    static void doWhileLoop() {
        int counter = 10;
        do {
            counter++;
            System.out.println(counter);
        } while (counter < 10);
    }

    static void forLoop() {
        // initialization; condition; increment/decrement
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
