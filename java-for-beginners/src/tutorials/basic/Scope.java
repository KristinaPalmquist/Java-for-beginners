package tutorials.basic;

public class Scope {
    // class variable
    static int x;

    public static void main(String[] args) {
        x = 5;
        System.out.println(x);
        doSomething();
        System.out.println(x);
    }

    static void doSomething() {
        x = 10;
    }

    static void doSomethingLocally() {
        // local variable
        int y = 100;
    }
}
