public class App {
    // comment for main method
    // main is the point of entry for the program
    public static void main(String[] args) throws Exception {
        HelloWorld myhello = new HelloWorld();
        String greeting = myhello.sayHello("Kristina");
        System.out.println(greeting);
    }
}
