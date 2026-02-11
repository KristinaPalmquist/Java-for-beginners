package overriding;

public class Subclass extends Base {
    public static void main(String[] args) {
        Subclass s = new Subclass();
        
    }

    public Subclass() {
        sayHello();
    }

   public void sayHello() {
       super.sayHello();
       System.out.println("Hello from the Subclass!");
     }

}
