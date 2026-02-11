package tutorials.basic;

public class AccessModifiers {
     public static void main(String[] args) {
        // Most restrictive to least restrictive: private, default (package-private), protected, public

        //private int x = 10; // private variable - can only be accessed within this class
        //public int y = 20; // default (package-private) variable - can be accessed only within the package
    }

    public void doSomethingPublic() {
        // public visibility - can be accessed from anywhere in the program as long as the class is accessible
        System.out.println("This is a public method.");
    }

    private void doSomethingPrivate() {
        // private visibility - can only be accessed within this class
        System.out.println("This is a private method.");
    }

    protected void doSomethingProtected() {
        // protected visibility - can be accessed within the package and by subclasses
        System.out.println("This is a protected method.");
    }

    void doSomethingDefault() {
        // default (package-private) visibility - can be accessed only within the package
        System.out.println("This is a default (package-private) method.");
    }
}

